package com.korea.it;

public class Variable2 {

	public static void main(String[] args) {
		int num = 10; 
		
		int num2, num3 = 20;
		
		int num4, num5 = 20;
		
		// 변수명 주의사항 !
		//1. 소문자 시작!(가능한 카멜케이스 기법 사용) int myMaxHeight;
		//2. 특수기호는 _,$(달러)만 사용가능 - 특수기호로 시작해도 무방
		//3. 숫자로 시작하면 안된다.
		//4. 예약어(보라색) 사용금지!
		//5. 변수명에는 띄어쓰기 사용금지
		//6. 대소문자를 가린다. int aa 와 int AA 는 다르다.
		
		// 리터럴과 상수는 다르다.
		//상수는 한번 입력된 값을 바꿀 수 없다.
		final int NUM = 1_000_000;
		System.out.println(NUM);
		//7. 상수명은 무조건 전부 대문자, 구분은 언더바로 한다.
	
	}

}
