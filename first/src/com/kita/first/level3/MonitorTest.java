package com.kita.first.level3;

public class MonitorTest {

	public static void main(String[] args) {
		Monitor m1 = new Monitor();
		Monitor m2 = new Monitor();
		
		m1.brand = "삼성";
		m1.inch = 30;
		m1.printInfo();
		//static 붙으면 값이 하나밖에 저장이 안된다.
		Monitor.brand = "LG"; //클래스명.변수는 무조건 static이라고 보면된다.
		m2.inch = 35;
		m2.printInfo();
		m1.printInfo();
	}

}
