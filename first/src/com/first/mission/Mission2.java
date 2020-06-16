package com.first.mission;

import java.util.Scanner;

public class Mission2 {
	//스캐너로 정수값 입력.
	//홀수면 홀수입니다. 짝수면 짝수입니다 출력.
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오.");
		int num = scan.nextInt(); //입력값을 받아야 하므로 오른쪽부터 실행된다.
		if(num%2 ==0) {
			System.out.println ("짝수입니다." );
		}
		if(num%2> 0) {
			System.out.println ("홀수입니다." );
		}
	}
}
