package com.korea.it;
import java.util.Random;
public class Practice2_random {
	public static void main(String[] arg) {
			//랜덤값 뽑기
		double r = Math.random();
		//랜덤한 정수 값이 필요하다.
		// 0~15
		int rVal = (int)(r * 16);
		System.out.println(rVal);
		
		int rVal2 = (int)(Math.random() * 16);
		System.out.println(rVal2);
		//1~15
		int rVal3= (int)(Math.random()* 15 + 1);  //16
		System.out.println(rVal3);
		
		//30~50
		int rVal4= (int)(Math.random() * 21 + 30) ; //51
		System.out.println(rVal4);
		
		//46~77
		int rVal5=(int)(Math.random() * 32 + 46) ; //78
	}
}