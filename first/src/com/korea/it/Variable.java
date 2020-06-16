package com.korea.it;

public class Variable {
	public static void main(String[] args) {
		//변수란? 값을 저장할 수 있는 공간 //
		char v1; //문자형 //
		v1 = 'A';
		System.out.println(v1);
		System.out.println('A');
		// 문자는 홑따옴표이다. //
		
		// char v1; 변수선언은 한번만 해야한다. //
		v1 = 'B';
		System.out.println(v1);
		
		byte v2; //메모리를 작게 사용하므로 속도가 빠르다 //
		short v3;
		int v4; 
		/* 4바이트 
		cpu가 처리하는 단위도 4바이트이기 때문에 속도가 가장 빠르다. */
		long v5; 
		
		v2 = 127;
		v3 = 540;
		v4 = 30;
		v5 = 50;
		System.out.println();
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		
		
		
		float v6; //실수형 4바이트 속도가 중요할때 사용.//
			//실수형 8바이트 정확도가 중요할 때 사용.//
		// 더블을 플롯으로 형변환 //
		v6 = (float)10.1;
		v6 = 10.1f;
		System.out.println(v6);
		v6= 10.1F;
		System.out.println(v6);
		
		double v7;
		v7 = 10.1;
		
		System.out.println();
		v6 = (float)v7;
		System.out.println(v7);
	
		
		boolean v8;	//참 거짓//
		System.out.println();
		v8 = true;
		System.out.println(v8);
		v8 = false;
		System.out.println(v8);
		
		
		/*이외에는 레퍼런스 변수이다.*/
		String r1= "안녕하세요.";
		// 자체가 주솟값이다. 메소드가 된다.//
		
		System.out.println(r1);
		
		}
}