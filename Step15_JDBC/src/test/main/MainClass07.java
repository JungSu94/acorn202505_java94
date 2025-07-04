package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnector;

public class MainClass07 {
	
	//member 테이블에 회원 한명의 정보를 추가하는 메소드를 만든다고 생각해보자
	public static boolean insert(MemberDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		//변화된 row 의 갯수를 담을 변수 선언하고 0으로 초기화
		int rowCount=0;
		try {
			conn=new DBConnector().getConn();
			String sql="""
				INSERT INTO member
				(num, name, addr)
				VALUES(member_seq.NEXTVAL, ?, ?)
			""";
			pstmt=conn.prepareStatement(sql);
			// ? 에 순서대로 필요한 값 바인딩
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			//sql 문 실행하고 변화된(추가된, 수정된, 삭제된) row의 갯수 리턴받기
			rowCount=pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		//변화된 rowConut 값을 조사해서 작업의 성공 여부를 알아 낼수있다.
		if(rowCount>0) {
			return true; //작업 성공이라는 의미에서 true 리턴하기
		}else {
			return false;// 작업 실패라는 의미에서 false 리턴하기
		}
	}

	
	public static void main(String[] args) {
		//DB 에 추가할 회원의 정보라고 가정하자 (member table)
		String name="다무게";
		String addr="어디게";
		//회원의 이름과 주소를 MemberDto 객체에 담는다
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		//메소드 호출하면서 전달하고 작업의 성공여부를 리턴 받는다.
		boolean isSuccess=insert(dto);
		if(isSuccess) {
			System.out.println("성공이다!! 성공이니 다음작업은 이걸 해봐야겠군");
		}else {
			System.out.println("실패군요... 다른 동작을 다시 해봐야지...");
		}
	}
}