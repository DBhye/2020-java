package com.first.level5;

public class AnimalTest {
	public static void main(String[] args) {
		Animal ani = new Dog();
		ani.cry();
		ani = new Cat();
		ani.cry();
		//ani.sleep();
		//Animal에 sleep이 없기때문에 쓸 수 없다. 
		
		Cat cat = (Cat) ani;
		//ani라는 변수를 animal 타입에서 cat타입으로 형변환.
		cat.cry();
		cat.sleep();
		//Cat cat = ani;
	}
}
