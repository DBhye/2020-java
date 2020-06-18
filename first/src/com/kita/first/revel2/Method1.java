package com.kita.first.revel2;

public class Method1 {
	//메소드를 만드는 곳 위치
	public static void main(String[] args /*바꿀 수 있는 것은 args 밖에없음!*/) {
		// void형이냐 or 비void형이냐에 따라 사용방법이 달라질 수 있다.
		//		 **void 부터 여기가 메소드의 선언부**
		// 중괄호 이후는 구현부라고 한다.
		//void: 리턴타입이라고 부른다.
		//메소드에서 소괄호는 매개변수, 파라미터라고 부른다.
		//중괄호 필수.
		//무조건 메소드는 동급이다. 메소드 안에 메소드를 선언/종속시킬 수 없다.(호출은 가능)
	
		Method1.sum(10, 15); //메소드를 호출했다.
		//같은 파일안에서는 sum으로만 적어서 호출할 수 있다.
		minus(20,5); //여기서 (20,5)는 인수,인자라고 부른다.
	}
	public static void sum(int n1, int n2/*매개변수의 갯수와 타입이 모두 맞아야 실행된다. */) {
		//매개변수는 외부로 부터 값을 불러온다.
		System.out.println(n1 + n2);
		return; //void를 쓰면 return을 쓰지않아도 자동적으로 적용된다.
	}
	public static void minus(int n1, int n2) /*메소드 안에서만 선언되는 매개변수명 =중복가능*/  {
		System.out.println(n1 - n2);
		
	}
	//자바의 레퍼런스 변수는 메모리 효율을 가져다준다 (8기가의 메소드를 쓰는데 8바이트의 레퍼런스 변수만 호출하여 사용.)
}
