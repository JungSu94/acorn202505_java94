package test.main;

import test.mypac.MemberDto;
import test.mypac.MemberInfo;

public class MainClass06 {
	public static void main(String[] args) {
		MemberDto dto1=new MemberDto();
		dto1.setNum(1);
		dto1.setName("김구라");
		dto1.setAddr("노량진");
		
		MemberDto dto2=new MemberDto(2, "해골", "행신동");
		MemberDto dto3=new MemberDto(3, "원숭이", "동물원");
		
		//위에서 생성한 MemberDto 객체의 참조값 3개를 순서대로 배열에 담아 보세요.
		
		MemberDto[] members= {dto1, dto2, dto3};
		
		MemberDto[] members2 = {null, null, null};
		members2[0]=dto1;
		members2[1]=dto2;
		members2[2]=dto3;
				
		MemberDto[] members3 = new MemberDto[3];
		members3[0]=dto1;
		members3[1]=dto2;
		members3[2]=dto3;
	
		members[1].getNum(); // 2
		members[1].getName(); // "해골"
		members[1].getAddr(); // "행신동" 
		
	}
	
}
