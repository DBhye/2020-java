package com.korea.it;

public class Switch {

	public static void main(String[] args) {
		String num = "사";
		
		switch(num) {
		case "일":
			System.out.println("1이다");
			break;
			
		case "이": case"사":
			System.out.println("짝수이다");
			break;
			
		case "삼":
			System.out.println("3이다");
			break;
			
		default: System.out.println("1~3이 아니다!");
			break;
		}
	} //break를 만나기전까진 전부 실행시킨다.
	// 마지막 라인은 break가 없어도 무방하다.
	//문자열을 비교하는 경우에도 equals를 쓸 필요가 없다.
}
