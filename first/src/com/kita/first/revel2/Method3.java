package com.kita.first.revel2;

public class Method3 {
		
	public static void main(String[] args) {
		sum(15, 10);
		int result = sum(30, 20); //=이있다는 것은 return 값이 있다. (값이 반환된다.)
		int result1 = minus(20,5);						//비 void 형은 대부분이 이런형태. void형은 자동으로 return이 들어간다.
		sum(30, 20); //저장 할 필요없으면 이렇게 해도 된다.
		System.out.println(result);	// ""+ 30 + 10 = "30" + "10"
		System.out.println(result1);
		//sum(); 이런 메소드도 있다. 
		
		
	}
	public static int sum(int n1, int n2) {
		return n1 + n2;						// 결과값만 돌려주는 메소드 - return이 꼭 있어야한다.!! 메소드가 종료.
	
		
	}
	public static int minus(int n1, int n2) {
		return n1 - n2;	
	}
}
