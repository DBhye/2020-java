package com.kita.first.level3;

import java.util.Arrays;

public class List {

	public static void main(String[] args) {
		 int[] arr = {1, 2, 3};
		//리터럴 값은 4만 사용할 수 있고
		
		int[] temp =new int[4]; 
		
		for(int i=0;i<arr.length+1;i++) {
			temp[i]=arr[i];
			
			
		}
		temp[arr.length]=4;
		arr=temp;
		
		System.out.println(Arrays.toString(arr));

	}

}
