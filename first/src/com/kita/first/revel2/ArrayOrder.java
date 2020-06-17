package com.kita.first.revel2;
//순차정렬
public class ArrayOrder {
	public static void main(String[] args) {
		int[] arr = { 75, 4, 15, 88 };
		int temp =0;

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
