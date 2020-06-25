package com.first.baseball;

public class Game {

	public static void main(String[] args) {
		int gameCnt = 3;
		Baseball ball = new Baseball(gameCnt);

		int val = ball.get(0); // 0번째 인덱스 값 리턴
		
		
		
		MyBall myBall = new MyBall(gameCnt);
		
		
		
			myBall.setNumbers();
			
	
	}
}
