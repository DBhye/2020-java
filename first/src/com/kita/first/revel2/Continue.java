package com.kita.first.revel2;

public class Continue {

	public static void main(String[] args) {
		for(int i = 0; i<20; i++) {
			if(i==5) { continue; }
			System.out.println(i);
			//5만 스킵되고 종료되지않고 끝까지 실행된다.
			//특정 구간만 실행되지 않기를 원할때
		}

	}

}
