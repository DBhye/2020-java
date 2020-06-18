package com.first.mission;

public class MethodMission2 {

	public static void main(String[] args) {
		/*
		 * printStar(6);
		 * 
		 * printStar(3);
		 * 
		 * printStarSquare(4);
		 * 
		 * pirntStarTriangel(5);
		 */

		printStarTriangleReverse(5);

	}

	public static void printStar(int num) {

		for (int i = 1; i <= num; i++) {
			System.out.print("*");

		}System.out.println();
	}

	public static void printStarSquare(int star) {
		for (int i = 1; i <= star; i++) {
			printStar(star);
		} 
		
	}

	public static void pirntStarTriangel(int star) {
		for (int i = 1; i <= star; i++) {
			System.out.println();
			printStar(i);
		}
	}

/*	public static void printStarTriangleReverse(int star) {
		for (int i = 1; i <= star; i++) {
			for (int z = star; z >i; z--) {
				System.out.print(" ");
				
			} printStar(i);
		}
	}*/
	
	public static void printStarTriangleReverse(int star) {
		for(int i=star-1; i>=0; i--) {
			printChar(' ', i);
			printStar(star-i);
		}
	}
	
	public static void printChar(char ch, int cnt) {
		for(int i=0; i<cnt; i++) {
			System.out.print(ch);
			
		}
	}
}


/*환경변수 설정 */
