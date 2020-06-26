package com.kita.level4;

public class AnimalTest {
	public static void main (String[] args) {
		//Animal animal = new Animal();
		Bird bird= new Bird("참새");
		Bird bird2 = new Bird("기러기");
		Bird bird3 = new Bird("");
		//obj-animal 의 객체가 하나 생성된다.
		//obj-animal-bird의 객체가 하나 생성된다. (둘다 다른 주솟값.)
		//animal.crying();
		//bird.crying();
		//bird.flying();
		
		Sparrow sparrow = new Sparrow();
		sparrow.whoAmI();
		
		
	}
}
