package com.kita.level4;

public class Bird extends Animal{
	void flying() {
		System.out.println("훨~훨~");
	}
	@Override  //오버라이딩 할땐 넣는 습관을 들인다. 부모중에 똑같은 이름의 메소드를 가짐.
	void crying() {
		super.crying(); //부모가 가진 메소드 호출하면서 내가가진 메소드도 사용.
		System.out.println("짹짹!");
	}
	
	protected Bird(String name) {
		super(name,"조류"); // super();는 기본생성자가 없을 때는 오류가 난다.
	}					//부모가 가지고 있는 생성자를 호출해서 오류가 나지 않도록한다.
}					//Bird bird2 = new Bird("기러기");에서 String만 입력해줬으므로
					//인자로 name만 사용하는 기본생성자를 생성해준다.
					//super(public Animal 부분)에 name과 type이 있으므로 
					//여기서는 name 다음에 문자열 ("")을 무조건 입력해준다.
