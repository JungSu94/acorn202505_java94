package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.MemberDto;

public class MainClass05 {
	public static void main(String[] args) {
		//MemberDto 객체를 저장할수 있는 ArrayList 객체 생성
		//참조값을 List 인터페이스 type 으로 받아서 사용하는 경우가 많다.
		List<MemberDto> list= new ArrayList<>();
		//1번 회원의 정보
		MemberDto dto=new MemberDto();
		dto.setNum(1);
		dto.setName("김구라");
		dto.setAddr("노량진");
		
		//2번 회원의 정보
		MemberDto dto2=new MemberDto(2, "해골", "행신동");
		//3번 회원의 정보
		MemberDto dto3=new MemberDto(3, "원숭이", "동물원");
				
		//생성한 회원의 정보를 ArrayList 객체에 누적시키기
		list.add(dto);
		list.add(dto2);
		list.add(dto3);
		
		//확장 for 문
		for(MemberDto tmp:list) {
		String info = String.format("번호:%d, 이름:%s, 주소:%s", tmp.getNum(), tmp.getName(), tmp.getAddr());	
		//출력하기
			System.out.println(info);
		}
		System.out.println("-----------------");
		
		
		list.forEach((item)->{//함수에 전달되는 item은 MemberDto type이다
			String info = String.format("번호:%d, 이름:%s, 주소:%s", item.getNum(), item.getName(), item.getAddr());	
			
			System.out.println(info);
		});
	
	}
}
