package com.kita.first.revel2;

public class Method4 {

	public static void main(String[] args) {
		sum(4,5);
		sum(5,7,9);
		sum(1,2,3,4);
		sum(1,2,3,4,5);
	}
	
	public static void sum (int ...arr) { //Stiring 같이 넣고싶으면 arr 앞에 넣어야한다. 인자 갯수 상관없이 넣을 수 있다.
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum+= arr[i];
		}
		System.out.println("sum: " + sum);
	}

}
