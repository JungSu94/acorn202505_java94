package test.frame;

import java.awt.BorderLayout;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MemoFrame extends JFrame{
	
	//필요한 필드 정의하기
	JTextArea ta=new JTextArea();
	//현재 열린 파일 객체를 저장할 필드
	File openedFile;
	
	//생성자
	public MemoFrame(String title) {
		super(title);
		//메뉴바
		JMenuBar mb=new JMenuBar();
		//메뉴
		JMenu menu=new JMenu("File");
		//메뉴아이템
		JMenuItem newItem=new JMenuItem("New");
		JMenuItem openItem=new JMenuItem("Open");
		JMenuItem saveItem=new JMenuItem("Save");
		JMenuItem saveAsItem=new JMenuItem("Save As");
		
		//처음에 저장기능은 disable 된 상태로 만든다
		saveItem.setEnabled(false);
		saveAsItem.setEnabled(false);
		
		//메뉴에 메뉴 아이템을 순서대로 추가
		menu.add(newItem);
		menu.add(openItem);
		menu.add(saveItem);
		menu.add(saveAsItem);
		//메뉴를 메뉴바에 추가
		mb.add(menu);
		//프레임의 메소드를 이용해서 메뉴바를 추가하기
		setJMenuBar(mb);
		//레이아웃 설정
		setLayout(new BorderLayout());
		//스크롤 패널
		JScrollPane scp=new JScrollPane(ta);
		//프레임의 가운데 JScrollPane 을 배치하기
		add(scp, BorderLayout.CENTER);
		Font font=new Font("Serif", Font.PLAIN, 30);
		ta.setFont(font);
		ta.setVisible(false);//처음에는 JTextArea 를 안보이게 설정
		
		
		// New 를 눌렀을때
		newItem.addActionListener((e)->{
			ta.setVisible(true);
			//프레임의 제목 바꾸기
			setTitle("제목 없음");
			saveAsItem.setEnabled(true);
		});
		
		//Save As 를 눌렀을때
		saveAsItem.addActionListener((e)->{
			//파일 선택을 하게 해주는 객체 생성
			var fc=new JFileChooser();
			//파일을 저장하게 하는 다이얼로그 띄우기
			int result=fc.showSaveDialog(this);
			if(result == JFileChooser.APPROVE_OPTION) {
				//해당 File 객체를 얻어오기
				openedFile=fc.getSelectedFile();
				//프레임의 title 로 파일명을 출력
				setTitle(openedFile.getName());
				//실제로 해당 파일 만들기
				try {
					openedFile.createNewFile();
				}catch (IOException e1) {
					e1.printStackTrace();
				}
				//파일에 저장하는 메소드 호출
				saveToFile();
			}
		});
	
		openItem.addActionListener((e)->{
			JFileChooser fc = new JFileChooser(); 
			int result = fc.showOpenDialog(this);
			 if (result == JFileChooser.APPROVE_OPTION) {
			     openedFile = fc.getSelectedFile();
			     setTitle(openedFile.getName());
			     try (var fr = new FileReader(openedFile);
			          var br = new BufferedReader(fr)) {
			         StringBuilder sb = new StringBuilder();
			         String line;
			         while ((line = br.readLine()) != null) {
			             sb.append(line).append("\n");
			         }
			         ta.setText(sb.toString());
			         ta.setVisible(true);
			         saveItem.setEnabled(true);
			         saveAsItem.setEnabled(true);
			     } catch (IOException ex) {
			         ex.printStackTrace();
			         JOptionPane.showMessageDialog(this, "파일을 읽는 중 오류가 발생했습니다");
			     }
			 }
		});
		
		saveItem.addActionListener((e) -> {
		    if (openedFile != null) {
		        saveToFile();
		    } else {
		        saveAsItem.doClick();  // 파일 없으면 Save As 기능 실행
		    }
		});
	
	} 
	//현재까지 JTextArea 에 입력한 내용을 읽어와서 openedFile에 저장하는 메소드
	public void saveToFile() {
		//JTextArea 에 입력한 문자열을 읽어와서
		String memo=ta.getText();
		//FileWriter 객체를 이용해서 openedFile 객체에 문자열이 저장되도록 한다.
		try(
			var fw=new FileWriter(openedFile);	
		){
			fw.append(memo);
			fw.flush();
			JOptionPane.showMessageDialog(this, "저장했습니다");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		MemoFrame f=new MemoFrame("메모장");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
