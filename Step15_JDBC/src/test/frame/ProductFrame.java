package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.ProductDao;
import test.dto.MemberDto;
import test.dto.ProductDto;


	public class ProductFrame extends JFrame {
		
		JTextField inputRegion, inputProduct;
		
		JTable table;
	
		DefaultTableModel model;
	
		ProductDao dao = new ProductDao();
	
		public ProductFrame() {
		
		setLayout(new BorderLayout());
		
		JLabel label1=new JLabel("지역");
		JLabel label2=new JLabel("특산품");
		
		inputRegion=new JTextField(10);
		inputProduct=new JTextField(10);
		
		JButton insertBtn=new JButton("저장");
		JButton deleteBtn=new JButton("삭제");
		JButton updateBtn=new JButton("수정");
		
		insertBtn.addActionListener((e)->{
			var region = inputRegion.getText();
			var product = inputProduct.getText();
			
			ProductDto dto=new ProductDto();
			dto.setRegion(region);
			dto.setProduct(product);
			
			
			boolean isSuccess = dao.insert(dto);	
			
			if (isSuccess) {
            	JOptionPane.showMessageDialog(this, "추가 했습니다");
            	
            } else {
                JOptionPane.showMessageDialog(this, "추가 실패!");
            }
		
		});
		deleteBtn.addActionListener((e)->{
			
			int selectedRow=table.getSelectedRow();
		
			if(selectedRow == -1) {
				JOptionPane.showMessageDialog(this, "삭제할 row 를 선택해 주세요!");
				return; 
			}
		
			int num = (int)model.getValueAt(selectedRow, 0);
			
			dao.deleteByNum(num);
			
		
			printProduct();
		});
		
		updateBtn.addActionListener((e)->{
			
			int selectedRow=table.getSelectedRow();
			
			if(selectedRow == -1) {
				JOptionPane.showMessageDialog(this, "수정할 row 를 선택해 주세요!");
				return; 
			}
			
			int num=(int)model.getValueAt(selectedRow, 0);
			ProductDto dto=dao.getByNum(num);
			
			var inputRegion=new JTextField(10);
			var inputProduct=new JTextField(10);
			JPanel editPanel=new JPanel();
			editPanel.add(new JLabel("지역:"));
			editPanel.add(inputRegion);
			editPanel.add(new JLabel("특산품:"));
			editPanel.add(inputProduct);
			
			inputRegion.setText(dto.getRegion());
			inputProduct.setText(dto.getProduct());
			
			int result = JOptionPane.showConfirmDialog(
					this,
					editPanel,
					num+" 번 특산품 수정",
					JOptionPane.OK_CANCEL_OPTION
			);
			
			System.out.println(result);
			
			if(result == JOptionPane.OK_OPTION) {
				
				String region=inputRegion.getText();
				String Product=inputProduct.getText();
				
				ProductDto newDto=new ProductDto();
				newDto.setNum(num);
				newDto.setRegion(region);
				newDto.setProduct(Product);
				boolean isSuccess=dao.update(newDto);
				if(isSuccess) {
					JOptionPane.showMessageDialog(this, "수정 성공!");
					printProduct();
				}else {
					JOptionPane.showMessageDialog(this, "수정 실패!");
				}
				
			}
		
		});
	
			
			JPanel panel=new JPanel();
			panel.add(label1);
			panel.add(inputRegion);
			panel.add(label2);
			panel.add(inputProduct);
			panel.add(insertBtn);
			panel.add(deleteBtn);
			panel.add(updateBtn);
			
			panel.setBackground(Color.GREEN);			
			add(panel, BorderLayout.NORTH);
						
			table=new JTable();
				
			String[] colNames= {"번호", "지역", "특산품"};
				
		
			model=new DefaultTableModel();						
			model.setColumnIdentifiers(colNames);
			model.setRowCount(0);
				
			
			table.setModel(model);			
			table.getTableHeader().setFont(new Font("Sans-serif", Font.BOLD, 18)); 
			table.setFont(new Font("Sans-serif", Font.PLAIN, 16));
			table.setRowHeight(25); 
			
			JScrollPane scroll=new JScrollPane(table);
				
			
			add(scroll, BorderLayout.CENTER);
		
			printProduct();
		}
			public void printProduct() {
				model.setRowCount(0);
				
				List<ProductDto> list = dao.selectAll();
				for (ProductDto tmp : list) {			
				Object[] row = { tmp.getNum(), tmp.getRegion(), tmp.getProduct() };
				model.addRow(row);
				}			
								
	}

	public static void main(String[] args) {
		ProductFrame f = new ProductFrame();
		f.setTitle("지역특산품");
		f.setBounds(100, 100, 800, 800);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);

	}
	}