package com.first.mission;

public class Mission9 {
	public static void main(String[] args) {

		int[] arr = new int[11];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 2;

		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum :" + sum);

		for (int i = 0; i < arr.length; i++) {
			
			if(i > 0) {
			System.out.print(", ");
			} System.out.print(arr[i]);
			
		}
		System.out.println(new int[100].length); 
	}
	// 배열을 선언해준 것이 아니므로
	//잠깐 데이터가 생성되었다가 주소값을 가지지는 못하고 휘발됨.
}
/*
for (int i = 0; i < arr.length; i++) {	
	System.out.print(arr[i]);
	if(i > arr.length-1) {
	System.out.print(", ");
	} 
	
*/

