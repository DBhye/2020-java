package com.first.level7;


public class Unit {
	public final String NAME;
	public  final int MAX_HP;
	//final은 값을 입력해줘야한다!! (변하지 않는 값이 된다.)
	public int current_hp;
	
	public Unit(String name, int max_hp) {
		this.NAME = name;
		this.MAX_HP = max_hp;
		this.current_hp= max_hp;
	} //값을 받는 곳.
	
	//기본생성자가 생성되지 않는다. 기본생성자는 다음과 같다.
	// public Unit() {
	//super();//}
	public int getCurrent_hp() {
		return current_hp;
	}

	
	
	public void getDamage(int damage) {
		current_hp -= damage;
	}
	
	
	public void move(int x, int y) {
		System.out.printf("x:%d, y:%d 좌표로 이동\n",x,y);
	}


}
