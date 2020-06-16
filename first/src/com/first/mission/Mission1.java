package com.first.mission;

public class Mission1 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 3;
		float result = (float)n1/n2;
		// float result = n1/n2; 로하면 int형 정수값3 을 실수형으로 바꾸었기때문에
		// 3.0 이라는 값이 출력된다.
		System.out.println(result);
		System.out.printf("%.1f",result);
		//결과를 변수에 담아주고, 그 변수를 콘솔에 찍으면 3.333333
	}

}
