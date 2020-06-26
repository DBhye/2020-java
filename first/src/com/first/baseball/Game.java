package com.first.baseball;

public class Game {

	public static void main(String[] args) {
		
			int gameCnt = 3;
			Baseball ball = new Baseball(gameCnt);
			MyBall myBall = new MyBall(gameCnt);
			
			do {
				myBall.setNumbers();
			} while(Checker.check(gameCnt, ball, myBall));
			//while true일때 반복하므로 return s!=3 이면 true 이므로
			// 실행문을 계속 반복하게 된다.
			System.out.println("게임 종료!");

		}

	}
