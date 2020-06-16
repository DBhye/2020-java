package com.korea.it;

public class If {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		if(n1 > n2) {
			System.out.println("n1이 n2보다 크다.");
		} 
		else if(n1 == n2) {
			System.out.println("n1이 n2와 같다!!");
		}
		else {
			System.out.println("n1이 n2보다 크지 않다!!");
		}
		// if를 여러개 추가하면 하나씩 전부 실행하게 된다.
		// else는 if를 만족하지 않을 경우에 실행한다.
		// else if로 else에 조건을 추가할 수 있다.
		System.out.println("끝!!");
	}

}
