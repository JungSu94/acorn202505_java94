package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass07 {
	public static void main(String[] args) {
		//새로운 파일을 만들어서 문자열을 기록하는 예제를 만들고자 한다.
		//파일에 저장할 문자열
		String msg="""
			안녕하세요
			반갑습니다
			어쩌구... 저쩌구...
		""";
		File f=new File("memo.txt");
		try {
			//만일 해당 파일이 존재하지 않으면
			if(!f.exists()) {
				//새로 만들기
				f.createNewFile();
				System.out.println("memo.txt 파일을 만들었습니다.");
			}
			//파일에 문자열을 출력하는 기능을 가지고 있는 객체 생성
			var fw=new FileWriter(f, true);
			
			fw.append(msg);// append() 메소드를 이용해서 문자열 출력하기
			fw.flush();
			fw.close();
			System.out.println("memo.txt 파일에 문자열을 기록 했습니다");
			
		} catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}
