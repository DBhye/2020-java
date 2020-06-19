package com.kita.first.revel2;

import java.util.Arrays;

public class ArrCopy2 {

	public static void main(String[] args) {
		int[] arr = {2,4,6,7,10,55};
		
		int[] arr2 = copyArr(arr);
		int[] arr3 = copyArr(arr); 
		System.out.println(arr == arr2);
		System.out.println(arr == arr3);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr2 : " + Arrays.toString(arr2));
		System.out.println("arr3 : " + Arrays.toString(arr3));
		
	}
	public static int[] copyArr(int[] numArr) {
		int[] arr2 = new int[numArr.length];
		for(int i=0; i<numArr.length; i++) {
			arr2[i]=numArr[i];
		}return arr2; //배열에 값을 리턴해주는 메소드를 만든 것이다.
	}
}
