package com.kita.first.level3;

import java.util.Arrays;

public class MyListTest { //파일이름과 똑같은 클래스만 public을 붙일 수 있다!!
	public static void main(String[] args) {
		MyList list = new MyList ();
		//기본생성자가 호출되었다.
		list.add(10); 
		list.add(15); 
		//변수는 한개의 값만 저장. 레퍼런스변수(주솟값)
		
		
		
	}
}
class MyList {
	int[] arr = new int[0]; // 전역변수
	/*void add(int num) {
		int a = num;
	}*/
	
	void add(int num) {
		int[] temp =new int[arr.length+1];
		
		for(int i=0; i<arr.length;i++) {
			temp[i]=arr[i];
		}
		
		temp[arr.length] = num;
		arr = temp;
		System.out.println(Arrays.toString(arr));
	} 

	
}