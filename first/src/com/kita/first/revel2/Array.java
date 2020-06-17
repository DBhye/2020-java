package com.kita.first.revel2;

public class Array {
	public static void main (String[] args) {
		//변수 선언을 줄이기 위해 사용한다.
		//for문과 사용하면 좋다.
		int[] arr = new int[4]; //배열은 레퍼런스 변수이다. new는 객체화 시킨다.
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;	// 각 방에 값을 넣는다.
		char[] arr2 = new char[20]; //20개의 메모리 할당
		float[] arr3 = new float[10]; 
		String[] arr4 = new String[200]; //문자열을 저장함 
		//각 방의 주소값(int, float 등등..)은 기본값 false(0)을 가지고있다.
		//대문자로 시작하는 자료형(String)의 배열은 모든 방은 주소값이 없다(null)
		//이배열에 접근하기 위한 arr4는 주소값이 있다.
		arr4[0] = "dd"; //값을 넣으면 주소값이 생기게된다.
		int[] arr5 = {10, 20, 30, 40}; //방을 만들고 값을 바로 저장함.
		int[] arr6 = arr5;
		System.out.println(arr5);
		System.out.println(arr6); //같은 주소값을 가지게된다. = 같은 객체에 접근할 수 있다.
		
		System.out.println(arr[0]);
		//----------------------------------------------------------------------------
		
				
		int[] arr7 = new int [50];
		
		//arr7 = null; 할당된 메모리를 날릴 수 있다.
		//51번째 방을 만들고 싶으면 arr7을 복사하는 배열을 새로 만들고 51번째 방에 값을 할당해주면 된다.
		
		
		for(int i=0; i<arr7.length; i++) {	//.은 속성값이다.
			arr7[i] = 5;					//반복문에 값을 넣는것은 따로 해주는 것이 좋다. [분리해서 만든다.]
		}									//메소드를 만들 때 사용성을 높이기위해!
		for(int i=0; i<arr7.length; i++) {
			System.out.println(i + ": " + arr7[i]);
		}
		
		
	}

}
