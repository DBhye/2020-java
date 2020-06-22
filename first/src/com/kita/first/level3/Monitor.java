package com.kita.first.level3;

public class Monitor {
	static String brand; 
	int inch;
	
	void printInfo() {
		System.out.printf("brand: %s, inch: %d\n", this.brand, this.inch);
	}
	
	static void printBrand() {
		System.out.println(brand);
	}
	
	void printInch() {
		System.out.println(inch); //static이 안붙은 멤버필드는 static이 없는 메소드에서 쓸 수 있다.
								// static이 안붙은 멤버필드는 static이 있는 메소드에서 쓸 수 없다.
	}							 //static이 붙은 멤버필드는 static 있는/없는 메소드에서 모두 쓸 수 있다.
								//멤버필드 사용안하고 파라미터만 사용하는 경우에는 static을 무조건 붙이고 사용하자.
								//static 멤버필드를 만드는 순간 모든 메모리가 같은 주솟값을 가지게된다.
}								// static메소드는 값을 찍고(아직 null)메소드를 실행해버리므로 객체를 선언하여 변수를 입력받아야 하는 경우에는 부적합하다.
