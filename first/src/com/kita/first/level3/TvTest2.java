package com.kita.first.level3;

public class TvTest2 {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		Tv tv2= tv1;		//같은 주솟값을 가리키게 된다.
		
		/*Tv tv1 = new Tv();
		 *Tv tv2 = new TV(); 이렇게 되면 1 1 이 출력됨.
		 */
		
		tv1.channelUp();
		tv1.channelUp();
		/*tv1=tv2 를 하면 두개의 주솟값이 복사되어 tv1으로 저장된다.
		  레퍼런스 변수는 주솟값만 저장한다. */
		//객체에 두 값을 담고 그 객체 하나만 리턴하면 두개의 값을 가져오게된다.
		
		System.out.println("tv1 channel : " + tv1.channel);
		System.out.println("tv2 channel : " + tv2.channel);
		
		//2
		//2 가 나온다.
		
		
	}

}
