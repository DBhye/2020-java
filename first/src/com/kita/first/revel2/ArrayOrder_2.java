package com.kita.first.revel2;

//버블정렬
public class ArrayOrder_2 {
	public static void main(String[] args) {
		int temp = 0;
		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19 };
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}for(int i=0;i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		
	}
}
}
