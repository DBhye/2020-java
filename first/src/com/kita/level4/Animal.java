package com.kita.level4;

public class Animal extends Object /*(Animal 클래스의 부모)*/{
	private String name;
	private String type; //포유류,조류,어류
	
	
	
	//public Animal() {}
	//기본 생성자
	
	public Animal(String name, String type) {
		this.name = name;
		this.type = type;
		System.out.printf("이름은 %s 종은  %s", name,type);
	}
	
	void crying() {
		System.out.println("울다~");
	}
	
	void eat() {
		System.out.println("먹다~");
	}
	
	
	void whoAmI() {
		System.out.printf("나는 %s 입니다.\n",name);
	}
}
