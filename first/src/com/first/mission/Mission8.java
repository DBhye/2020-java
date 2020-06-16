package com.first.mission;

import java.util.Scanner;

public class Mission8 {
	public static void main(String[] args) {
		int min = 10;
		int max = 80;
		int rVal = (int) (Math.random() * (max - min + 1) + min);

		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("값 입력: ");
			int num = scan.nextInt();
			if (num > max) {
				System.out.println("잘 못 입력하였습니다.");
			}
			if (num > rVal) {
				System.out.println("DOWN");
			} else if (num < rVal) {
				System.out.println("UP");
			}  else {
				System.out.println("Great!!");
				break;
			}
		}
	}

}
