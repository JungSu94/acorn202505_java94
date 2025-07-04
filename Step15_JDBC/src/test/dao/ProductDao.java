package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.ProductDto;
import test.util.DBConnector;

	public class ProductDao {
		
		//회원번호를 이용해서 회원 1명의 정보를 리턴하는 메소드
		public ProductDto getByNum(int num) {
			ProductDto dto=null;
			//필요한 객체를 담을 지역변수를 미리 만든다
			Connection conn=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			try {
				conn=new DBConnector().getConn();
				//실행할 sql문
				String sql="""
						SELECT region, product
						FROM local
						WHERE num=?
						""";
				pstmt=conn.prepareStatement(sql);
				//? 에 값 바인딩
				pstmt.setInt(1, num);
				//select 문 실행하고 결과를 ResultSet 으로 받아온다
				rs=pstmt.executeQuery();
				//반복문 돌면서 ResultSet 에 담긴 데이터를 추출해서 어떤 객체에 담는다
				while(rs.next()) {
					dto=new ProductDto();
					dto.setNum(num);
					dto.setRegion(rs.getString("region"));
					dto.setProduct(rs.getString("product"));
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(rs!=null)rs.close();
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				}catch(Exception e) {					
				}
			}
			return dto;
		}
	
	
	//회원 전체 목록을 select 해서 List 에 담아서 리턴하는 메소드
	public List<ProductDto> selectAll() {	
		//회원정보를 누적시킬 ArrayList 객체 미리 준비하기
		List<ProductDto> list=new ArrayList<>();
		
		//필요한 객체를 담을 지역변수를 미리 만든다
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=new DBConnector().getConn();
			//실행할 sql문
			String sql="""
					SELECT num, region, product
					FROM local
					ORDER BY num ASC
				""";
			pstmt=conn.prepareStatement(sql);
			//? 에 값 바인딩
			
			//select 문 실행하고 결과를 ResultSet 으로 받아온다
			rs=pstmt.executeQuery();
			//반복문 돌면서 ResultSet 에 담긴 데이터를 추출해서 어떤 객체에 담는다
			while(rs.next()) {
				ProductDto dto=new ProductDto();
				dto.setNum(rs.getInt("num"));
				dto.setRegion(rs.getString("region"));
				dto.setProduct(rs.getString("product"));
				//회원 한명의 정보가 담긴 새로운 MemberDto 객체의 참조값을 List 에 누적시키기
				list.add(dto);
			}
		}catch(Exception e) {
				e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {
				
			}
		}
				return list;
	}

	//회원 한명의 정보를 DB에서 수정하고 성공여부를 리턴하는 메소드
	public boolean update(ProductDto dto) {
		Connection conn=null;
			PreparedStatement pstmt=null;
			//변화된 row 의 갯수를 담을 변수 선언하고 0으로 초기화
			int rowCount=0;
			try {
				conn=new DBConnector().getConn();
				String sql="""
							UPDATE local
							SET region=?, product=?
							WHERE num=?
			""";
				pstmt=conn.prepareStatement(sql);
				// ? 에 순서대로 필요한 값 바인딩
				pstmt.setString(1, dto.getRegion());
				pstmt.setString(2, dto.getProduct());
				pstmt.setInt(3, dto.getNum());
				
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
		

	
	
	public boolean deleteByNum(int num) {
		Connection conn=null;
			PreparedStatement pstmt=null;
			//변화된 row 의 갯수를 담을 변수 선언하고 0으로 초기화
			int rowCount=0;
			try {
				conn=new DBConnector().getConn();
				String sql="""
						DELETE FROM local
						WHERE num=?		
					""";
				pstmt=conn.prepareStatement(sql);
				// ? 에 순서대로 필요한 값 바인딩
				pstmt.setInt(1, num);
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
		
		
		
		
	
	
	//회원 한명의 정보를 DB에 저장하고 성공여부를 리턴하는 메소드
	public boolean insert(ProductDto dto) {
		Connection conn=null;
			PreparedStatement pstmt=null;
			//변화된 row 의 갯수를 담을 변수 선언하고 0으로 초기화
			int rowCount=0;
			try {
				conn=new DBConnector().getConn();
				String sql="""
						INSERT INTO local
						(num, region, product)
						VALUES(local_seq.NEXTVAL, ?, ?)
				
				""";
				pstmt=conn.prepareStatement(sql);
				// ? 에 순서대로 필요한 값 바인딩
				pstmt.setString(1, dto.getRegion());
				pstmt.setString(2, dto.getProduct());
				
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
		
		
	}



