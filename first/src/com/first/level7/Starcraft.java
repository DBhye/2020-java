package com.first.level7;

public class Starcraft {

	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		
		System.out.println(m1);
		//마린,현재 hp: 50
		
		
		m1.attack(m2);
		m1.attack(m2);
		m2.attack(m2);
		
		System.out.println("m1:" + m1);
		System.out.println("m2:" + m2);
	
	}

	
	
}
		
	