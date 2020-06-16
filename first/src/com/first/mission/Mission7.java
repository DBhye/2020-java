package com.first.mission;

import java.util.Scanner;

public class Mission7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		while (true) { //무조건 실행
			
			System.out.print("숫자를 입력:(종료:0)");
			int num = scan.nextInt();
			if(num==0) {
				break;
			}
			sum = sum + num;
		}
		scan.close();
		System.out.println("합계 : "+ sum);
			
		}
		
	}


