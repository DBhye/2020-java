package com.kita.level4;

public class Sparrow extends Bird {
	public Sparrow() {
		super("참새");
	}
	
	/*
	@Override
	void crying() {
		Animal ani = new Animal();
		ani.crying();
	} 이렇게는 하지 않는 것이 좋다.이미상속받아왔으므로 재정의를 할 필요가 없다.
	이미 bird에서 울다를 짹짹으로 바꿔서 오버라이딩 했는데 여기서 다시 짹짹으로 재정의를 하는 것.*/
	
}
