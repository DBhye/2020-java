package com.kita.level4;

public class ClassTest2 {
	// 다형성 메모!!!!
	public static void main(String[] args) {
		// 1.(상속관계에서)부모타입은 자식 객체 주소값을 저장할 수 있다.(가리킬 수 있다.)
		// (자기자신도 포함해서!!)

		ClassA clsA = new ClassB();
		// 타입은 ClassA지만 실제로는 ClassB의 객체이다.
		clsA.print(); // B가 실행된다.

		ClassB clsB = (ClassB) clsA;
		clsB.showMe();
		// 2.자식 '타입'은 부모 '객체' 주소값을 저장할 수 없다.(가리킬 수 없다.)
		// (헷갈리지 않기!!)

		// ClassB clsB = new ClassA();

		// 3. 타입은 메소드 호출 할 수 있나 없나만 결정!!!
		// (자기가 알고 있는 메소드만 호출 할 수 있다.)
		// 호출했을 때는 객체 기준으로 실행이 된다.

	}

}
