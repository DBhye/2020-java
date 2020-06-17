package com.first.mission;

import java.util.Scanner;

public class BreakMission1 {

	public static void main(String[] args) {
		final int LEN = 3;

		int[] rArr = new int[LEN];
		int[] myArr = new int[LEN];
		for (int i = 0; i < rArr.length; i++) {
			rArr[i] = (int) (Math.random() * 9 + 1);
			for (int z = 0; z < i; z++) {
				if (rArr[i] == rArr[z]) {
					i--;
					break;
				}
			}
		}
		while (true) {
			int s = 0;
			int b = 0;
			for (int z = 0; z < myArr.length; z++) {
				Scanner scan = new Scanner(System.in);
				System.out.print("숫자를 입력해주세요:(1~9)");
				myArr[z] = scan.nextInt();
				for (int k = 0; k < myArr.length; k++) {
					if (myArr[z] == rArr[k]) {
						if (z == k) {
							s++;
						} else {
							b++;
						}
					}
				}
			}
			System.out.printf("s: %d b:%d o:%d", s, b, LEN - s - b);
			if (s == 3) {
				break;
			}

		}
	}
}

//s:자리 숫자 모두 같음
//b: 자리는 다르지만 숫자는 같음
//다른것은 모두 out

//System.out.print("숫자입력");
//for(int i=0; i<arr.length; i++){
// myArr[i] = scan.nextInt; } 이렇게도 가능.