package com.first.mission;
import java.util.Scanner;
public class Mission5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력해 주세요: (0~100)");
		int score = scan.nextInt();
		
		if(score>100) {
			System.out.print("잘 못 입력하였습니다.");
		}
		else if(100>=score && score>=97){
			System.out.print("A+ 입니다.");
		}
		else if(score>=94 && 96>=score) {
			System.out.print("A 입니다.");
		}
		else if(score>=93){
			System.out.print("A- 입니다.");
		}
		else if(score>=87){
			System.out.print("B+ 입니다.");
		}
		else if (score>=84 && 86>=score) {
			System.out.print("B 입니다.");
		}
		else if(score>=83){
			System.out.print("B- 입니다.");
		}
		else if(score>=77){
			System.out.print("C+ 입니다.");
		}
		else if(score>=74 && 76>=score) {
			System.out.print("C 입니다.");
		}
		else if(score>=73){
			System.out.print("C- 입니다.");
		} else{
			System.out.print("D 입니다.");
		}
		
	}
}