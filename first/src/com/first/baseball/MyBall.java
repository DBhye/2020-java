package com.first.baseball;

import java.util.Scanner;

public class MyBall {
	private int[] myArr;
	private Scanner scan;

	public MyBall(int num) {
		init(num);
	}

	private void init(int num) {
		myArr = new int[num];
		scan = new Scanner(System.in);

	}

	public void setNumbers() {

		for (int i = 0; i < myArr.length; i++) {
			System.out.printf("숫자%d :", i + 1);
			String val = scan.nextLine();
			try {
				myArr[i] = Integer.parseInt(val);}
			catch(Exception e) {
				myArr[i] = 0; //에러가 날 때 0이 되도록 세팅해준다.
			}
			if (myArr[i] < 1 || myArr[i] > 9) {
				i--;
				System.out.println("1~9를 입력해주세요");
				continue;
			}
			for (int z = 0; z < i; z++) {
				if (myArr[i] == myArr[z]) {
					i--;
					System.out.print("중복된 숫자");
					break;
				}
			}

		}
		
	}
	
}
