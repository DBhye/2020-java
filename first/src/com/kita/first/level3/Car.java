package com.kita.first.level3;

public class Car /*extends Objects 생략되어있다*/{
	String name;
	String color;
	int cc;
	
	/*
	public Car() {//기본 생성자
		//1. 이름이 클래스명이랑 똑같다. 
		//2. return 타입이 없다.
	System.out.println("Car 기본 생성자!");
	}
	*/
	/*
	public Car(String name, String color, int cc) {
		super(); // 내 부모의 기본 생성자 호출
		this.name = name; //this.name이 아니라 name으로 쓰면 가장 가까운 지역변수를 사용
		this.color = color; //this.을 쓰면 주솟값.name이 된다.(전역변수 또는 메소드호출)
		this.cc = cc;}
		*/
	
	
	//super는 부모
	//this는 나의 주소값
	
	public void introduceMyCar() {
		System.out.printf("%s의 컬러는 %s 이고 %dcc 이다.",name, color, cc );
	}


	public Car(String name, String color, int cc) {
		super(); //부모의 기본생성자 호출 ,super 위에 아무것도 적을 수 없다.
		this.name = name;
		this.color = color;
		this.cc = cc;
	} //소스-제너레이트 유징 필즈 누르면 자동복사
	
	public Car(String name) {
		this(name,"검은색",3000); //내가 가지고있는 멤버필드 호출..나 자신의 주솟값
	
	}
}

