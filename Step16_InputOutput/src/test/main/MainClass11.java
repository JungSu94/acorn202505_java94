package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MainClass11 {
	public static void main(String[] args) {
		//문자열을 누적시킬 객체
		var sb=new StringBuffer();
		
		File f=new File("memo.txt");
		try {
			//파일로 부터 문자열을 읽어들일수 있는 객체 생성
			var fr=new FileReader(f);
			//좀더 좋은 
			var br=new BufferedReader(fr);
			//무한 루프 돌면서
			while(true) {
				//한줄씩 읽어낸다(1줄의 기준은 개행기호)
				String line=br.readLine();
				//더이상 읽은 line 이 없으면 반복문 탈출
				if(line==null)break;
				//읽은 문자열 출력하기
				sb.append(line);
				sb.append("\r\n");//개행기호
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		//StringBuffer 에 누적된 문자열을 String type 으로 얻어내기
		String result=sb.toString();
		System.out.println(result);

	}
}
