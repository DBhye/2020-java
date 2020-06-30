package com.first.level6;
//추상메소드
//타입으로서 부모역할만 하겠다.
//객체화를 원하지않는다!!(예시:animal)
public abstract class Playy {

	public abstract void play();
	//추상메소드만 있으면 인터페이스!!
	//객체화하지않으려면 위의 부분을 삭제하면된다
	//추상메소드가 없어도 abstract붙일수 있다.
	//추상메소드가 하나라도 있으면 abstract 붙여야한다.
	//abstract == 나를 상속하시오!
	//추상메소드는 강제로 오버라이딩!!!
	//실수를 줄이기위해서 사용한다.
	public void stop() {
		System.out.println("재생을 멈췄다.");
	}
}

class CDPlayer extends Playy {
	@Override
	public void play() {
		System.out.println("CD를 재생합니다.");
	}
}

class DVDPlayer extends Playy {
	@Override
	public void play() {
		System.out.println("DVD를 재생합니다.");
	}
}