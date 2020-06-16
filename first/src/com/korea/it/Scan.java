package com.korea.it;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("나이?");
		int age = scan.nextInt(); //입력값을 받아야 하므로 오른쪽부터 실행된다.
		System.out.println ("나이 : " + age);
		
		System.out.print("이름?");
		String name = scan.next();
		System.out.println("이름 : " + name);
		scan.close(); //닫아야 메모리를 효율적으로 활용할수있다.
	}

}
