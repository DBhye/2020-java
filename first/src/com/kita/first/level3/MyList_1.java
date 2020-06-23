package com.kita.first.level3;
import java.util.Arrays;

public class MyList_1 {
	public static void main(String[] args) {
		MyList_2 list = new MyList_2();
		list.add(10); 
		list.add(15); 
		list.add(20); 
		list.add(40); 
		
		int len = list.size();
		int val = list.get(1);
		val = list.get(0);
		list.remove();
		list.remove();
	}
		
	
	
}

class MyList_2{
	
	private int[] arr;
	
	 MyList_2() {
	 init();
	 }
	 
	 private void init() {
	 arr = new int[0];
	 }
	
	void add(int num) {
		int[] temp = new int[arr.length+1];
		// 임시 배열에 자리/방(인덱스)을 만들어준다.
		for(int i=0; i<arr.length; i++ ) {
			temp[i]= arr[i];
		// arr[]에 존재하는 모든 값을 그대로 임시 배열 temp에 넣어준다.
		}	
		temp[arr.length] = num; //temp[arr의 마지막 인덱스번호+1]에 num이라는 값을 넣어줌  
		arr=temp; //배열 temp를 arr에 옮긴다. 
	}
	public int size() {
		return arr.length;
	}
	
	public int get(int num) {
		return arr[num];
	}
	void remove() {
		int[] temp = new int[arr.length-1];
		//임시 배열에 자리/방(arr보다 작은 방)을 만들어준다. arr길이가 3이면 길이 2인 temp가 생성
		for(int i=0; i<arr.length-1; i++) {
			temp[i] = arr[i];
		// 	for 에서 arr배열의 인덱스길이가 3이면 temp의 인덱스는 [0], [1] 까지만 증가하면 된다.
			//arr 값을 옮겨도 작은 방인 temp에 값을 다 넣어주지 못한다.
		} arr=temp; //temp라는 배열을 다시 arr로 넣어준다.
		System.out.println(Arrays.toString(arr));
 } 
}