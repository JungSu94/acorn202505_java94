package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 *  Java Database Connectivity (JDBC)
 *  
 *  - java 에서 DB 에 연결해서 INSERT, UPDATE, DELETE, SELECT 등의 작업을 할수가 있다.
 *  - 우리는 ORACLE Database 에 연결해서 이런 작업을 할 예정이다.
 *  - ORACLE 연결 driver 클래스가 있어야 연결이 가능하다
 */
public class MainClasstest1 {
	public static void main(String[] args) {
		//DB 에 접속해서 작업을 하려면 Connection 객체가 필요하다
		Connection conn=null;
		try {
			//오라클 드라이버 로딩 ( ojdbc...jar 파일이 있어야 아래의 코드가 동작한다)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속할 DB 의 정보 @아이피주소:port번호:db이름
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			//계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn=DriverManager.getConnection(url, "scott", "TIGER");
			//예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
			System.out.println("Oracle DB 접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//SELECT 작업을 위해서 필요한 객체를 담을 지역변수 미리 만들기
		PreparedStatement pstmt=null;
	
		try {
			//실행할 sql 문 미리 준비하기 (java10 부터 추가된 문법)
			String sql="INSERT INTO test1 (num, name, addr) VALUES (?, ?, ?)";
					pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 2);           
			pstmt.setString(2, "고릴라");      
			pstmt.setString(3, "강원도"); 
			
			int rowCount = pstmt.executeUpdate();
            System.out.println(rowCount + "개의 행이 삽입되었습니다.");
			
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
