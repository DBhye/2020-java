package com.kita.first.revel2;

public class NormalVsRef {

	public static void main(String[] args) {
		int num = 10;
		System.out.println("befor num : " + num);
		changeVal(num);
		System.out.println("after num : " + num);
		
		int[] numArr = {10}; //배열도 레퍼런스 변수이다 (주소값을 저장한다.)
		System.out.println("before numArr[0] : " + numArr[0]);
		changeVal(numArr);
		System.out.println("after numArr[0] : " + numArr[0]);
	}

	public static void changeVal(int[] numArr) {
		numArr[0] = 30; //레퍼런스 변수
	}
	
	
	public static void changeVal (int num) {
		num = 30;
	}
	
	//위의 num과 아래의 메소드에서의 num 은 다른 값이다.
	
	
}
