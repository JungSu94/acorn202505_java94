package test.frame03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 *  Graphic User Interface 를 만들수 있는 클래스 설계하기
 *  
 *  1. JFrame 클래스를 상속받는다.
 *  2. 생성자에서 필요한 초기화 작업을 한다.
 *  3. main() 메소드에서 이클래스로 객체를 생성하면 프레임(window)가 만들어진다
 */

public class MyFrame2 extends JFrame implements ActionListener {
	//생성자
	public MyFrame2() {
		//프레임의 제목 설정
		this.setTitle("나의 프레임");
		//프레임의 위치와 크기 설정 setBounds(x, y, width, height)
		this.setBounds(100, 100, 500, 500);
		//종료(X) 버튼을 눌렀을때 프로세스(app) 전체가 종료 되도록 한다
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(3);
		//레이아웃 매니저 객체 생성
		FlowLayout layout=new FlowLayout(FlowLayout.CENTER);
		//프레임의 레이아웃 매니저 설정
		setLayout(layout);
		//JButton 객체 생성
		JButton btn1=new JButton("추가");
		JButton btn2=new JButton("수정");
		JButton btn3=new JButton("삭제");
		//버튼에 ActionCommand 부여하기
		btn1.setActionCommand("insert");
		btn2.setActionCommand("update");
		btn3.setActionCommand("delete");
		
		//프레임의 add() 메소드 호출하면서 JButton 객체의 참조값을 전달하면 프레임에 버튼이 배치된다.
		add(btn1);
		add(btn2);
		add(btn3);
		
		//하나의 액션 리스너를 여러개의 버튼에 등록하기
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		//화면상에 실제 보이도록 한다.
				setVisible(true);
			
		}
		
			
	
	//main 메소드 만들기
	public static void main(String[] args) {
		new MyFrame2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼을 눌렀네.. 그런데 어떤 버튼을 눌렀을까?");
		//Component 에 설정된 ActionCommand 를 읽어온다.
		String cmd=e.getActionCommand();	
		if(cmd.equals("insert")) {
			System.out.println("추가합니다");
		}else if(cmd.equals("update")) {
			System.out.println("수정합니다");
		}else if(cmd.equals("delete")) {
			System.out.println("삭제합니다");
		}
	}
}
