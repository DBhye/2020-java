package com.kita.first.level3;

public class CalcTest {

	public static void main(String[] args) {
		System.out.println(Calc.sum(10, 20)); //30
		Calc.sum(10,20); //혼자 바로 찍어내는 형태는 void일 확률이 매우 높다.
		
		Calc calc1 = new Calc();
		calc1.n1 = 20;
		calc1.n2 = 30;
		
		System.out.println(calc1.sum()); //앞뒤로 뭔가 있다=void 일 수가 없다.
	}

}
