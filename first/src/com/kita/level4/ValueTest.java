package com.kita.level4;

public class ValueTest {
	public static void main(String[] args) {
		String str = new String("A");
		String str2 = new String("A");
		
		System.out.println("1: " + (str == str2));
		System.out.println("2: " + str.equals(str2));
	
	Value val1 = new Value(1);
	Value val2 = new Value(1);
	
	System.out.println("3: " + (val1 == val2));
	System.out.println("4: " + val1.equals(val2));
	}
	
	//equals를 쓸수있는 이유는 오브젝트로부터 상속받았기 때문.
	//String 비교에서 equals가 true인 이유는(원래는 주솟값 비교인데) 부모것을 쓰지않고 오버라이딩(재정의) 해서 쓰기 때문이다.
	
}
