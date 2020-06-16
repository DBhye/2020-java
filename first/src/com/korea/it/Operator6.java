package com.korea.it;

public class Operator6 {
	public static void main(String[] args) {
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		String str3 = str2;
		
		
		
		// 주소값 = 해당 객체를 가리킨다. 위의 경우 같은주소값을 가진다.
		// 새로운 객체 = 새로운 주소값을 가진다.
		//System.out.println(str1 == str2);
		// 문자열 비교는 이렇게 하면 안된다! 
		// 문자열 비교는 다음과같이 한다.
		System.out.println(str1.equals(str2));
		//equals라는 메소드를 통해서만 값을 비교해야한다.
		System.out.println("안녕".equals(str1));
		
	}

}
