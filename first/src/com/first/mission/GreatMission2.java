package com.first.mission;

import java.util.Scanner;

public class GreatMission2 {

	public static void main(String[] args) {
		// 사이다 500
		// 콜라 600
		/*
		 * 환타 700 마운틴듀 800 초코우유 400 바나나우유 400
		 */
		/*
		 * 음료이름 출력
		 */
		int menu = 6;
		String[] arr = new String[menu];
		arr[0] = "사이다";
		arr[1] = "콜라";
		arr[2] = "환타";
		arr[3] = "마운틴듀";
		arr[4] = "초코우유";
		arr[5] = "바나나우유";

		int[] won = { 500, 600, 700, 800, 400, 400 };

		System.out.print("1.사이다 500\n2.콜라 600\n3.환타 700\n4.마운틴듀 800\n5.초코우유 400\n6.바나나우유 400\n");

		while (true) {
			int select=0;
			Scanner scan = new Scanner(System.in);
			System.out.println("메뉴를 선택하세요(종료:0)");
			select = scan.nextInt();
			
			
			if (select > menu) {
				System.out.println("잘 못 입력하셨습니다.");
				continue;
			}
			else if (select == 0) {
				System.out.println("종료");
				break;
		
			}System.out.printf("%s %d원\n", arr[select - 1], won[select - 1]);
			
		}

	}
}
