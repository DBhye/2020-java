package com.first.mission;
import java.util.Scanner;

public class Misssion5_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요: (0~100)");
		int score = scan.nextInt();
		scan.close();
		
		if(score > 100 || score < 0) {
			System.out.println("잘 못 입력하였습니다.");
			
		} else if(score < 70) {
			System.out.print("D");
			
		} else if(score < 80) {
			System.out.print("C");
			
		} else if(score < 90) {
			System.out.print("B");
			
		} else {
			System.out.print("A");
		}
		
		if(score == 100) {
			System.out.print("+");
		} else if(score >= 70){
			int mod = score % 10;
			
			if(mod >= 7) {
				System.out.print("+");	
			} else if(mod <= 3) {
				System.out.print("-");
			}
		}
		
	}

}
