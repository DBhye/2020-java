package com.kita.level4;

public class ValueTest2 {

	public static void main(String[] args) {
		String str = new String("안녕");
		System.out.println(str);

		System.out.println();

		Value val = new Value(2);
		System.out.println(val);
		//str은 String으로 받고, object는 주솟값을 받는다.
		//println 콘솔에 찍는 것이 목적이다.
		//println - 오버로딩 되어있음(오브젝트는 주솟값이 나오도록 오버로딩)
		//출력하면 알아서 "안녕"으로 나오지만(string이라서) obj는 주솟값으로 출력된다.
		//println을 실행하면 다음과 같은 두가지가 실행된다.!!
		String strVal = String.valueOf(val);
		//Valueof는 return이 있다.(return이 목적!!)
		String strVal2 = strVal.toString();
		//toStiring을 수정해주면 println에서 출력되는 내용을 바꿀 수 있다.
		// 이 메소드는 모든 메소드에 있다.
		// ==오브젝트에서 상속받았다.
	}
	//클래스에 final 붙이면 상속불가!!
	//메소드에 final 붙이면 오버라이딩불가!!(프리즈) 
	//(String은 final이 붙어있는 메소드)
	//static은 변수랑 메소드 앞에만 붙일 수 있다.
		
}
	
