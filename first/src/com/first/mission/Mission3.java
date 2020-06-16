package com.first.mission;

import java.util.Scanner;

public class Mission3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("성별을 입력해 주세요: ");

		String gender = scan.nextLine(); //nextLine으로 커서를 바로 옮겨지게 할수있다.//

		System.out.print("키를 입력해 주세요: ");

		int height = scan.nextInt();

		scan.close();

		if (gender.equals("남")) {
			if (height < 160) {
				System.out.println("평균 미만입니다.");

			}

			else if (height == 160) {
				System.out.println("평균입니다.");

			} else {
				System.out.println("평균 초과입니다.");
			}

		} else if("여".equals(gender)){

			if (height < 150) {
				System.out.println("평균 미만입니다.");

			}

			else if (height == 150) {
				System.out.println("평균입니다.");

			} else {
				System.out.println("평균 초과입니다.");

			}
			
		} else {
			System.out.println("성별을 잘 못 입력하셨습니다.");
		}
	}

}
//else를 내리지말고 코드짜기 //
