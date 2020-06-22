package com.kita.first.level3;

public class CarTest {

	public static void main(String[] args) {
		
		Car car1 = new Car("그랜져","검은색",3000);
		Car car2 = new Car("그랜져");
		Car car3= new Car("G80");
		
		car1.name = "소나타";
		
		
		car1.introduceMyCar();
		car2.introduceMyCar();
		car3.introduceMyCar();
	}
	
}
