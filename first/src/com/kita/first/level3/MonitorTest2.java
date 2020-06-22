package com.kita.first.level3;

public class MonitorTest2 {

	public static void main(String[] args) {
		Monitor.brand = "삼성";
		Monitor.printBrand();

	//	Monitor.printInfo(); static이 붙지않으면 객체화해서 호출해야한다.
	//static 안붙었다 ? 무조건 객체화 하고 호출!!!!!
	//객체마다 다른 값이 저장되길 원하면 static을 붙이면 안된다.
		//모든 객체가 같은 값을 가지길 원한다 = static 사용
		Monitor m1=new Monitor();
		m1.printInfo();
		
		int result = Integer.parseInt("11"); //static이 붙어있는 메소드이므로 바로 호출할 수 있다.
	}
	
	
	
}
