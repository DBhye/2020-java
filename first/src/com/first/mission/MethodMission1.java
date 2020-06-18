package com.first.mission;

public class MethodMission1 {

	public static void main(String[] args) {
		guguDan(5);
		guguDan(2); // 똑같은 메소드 여러번 만들 수 있는 기법 =오버로딩
						

		guguDan(4, 7); //재귀함수를 사용하는 방법이다.

	}

	public static void guguDan(int sDan, int eDan) {
		for(int i=sDan; i<=eDan; i++) {
			guguDan(i);
		}
	}

	public static void guguDan(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
		System.out.println();
	}

}
