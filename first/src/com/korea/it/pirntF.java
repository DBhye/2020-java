package com.korea.it;

public class pirntF {
	
	public static void main(String[] args) {
		int age = 36;
		String name = "이혜영";
		float vision = 0.4f;
		char bloodType = 'O';
		System.out.print("나의 이름은 "+name+" 입니다.나의 나이는"+age + "입니다." +
		"나의 시력은"+ vision + "입니다. 나의 혈액형은" + bloodType + "입니다.");
		
		System.out.printf("나의 이름은 %s입니다. 나의 나이는 %d입니다. 나의 시력은 %.2f입니다. 나의 혈액형은 %c입니다.",
						name, age, vision, bloodType);
		//%s는 문자 그리고 전부다 %s로 처리해도 가능.
		//%3d는 정수 %,d는 천단위에 쉼표 
		//%f는 실수 f앞에 .2는 자릿수
		//%c는 캐릭터형(문자형식으로 출력)
		System.out.println();
		char v1= 'A';
		System.out.printf("%c : %d\n", v1, (int)v1);
		
		byte v2 = 66;
		System.out.printf("%c : %d\n", (char)v2, v2);
	}
}