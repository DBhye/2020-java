package com.kita.first.level3;

public class Object {

	public static void main(String[] args) {
		//객체는 속성과 메소드로 이루어져있다.
		// 객체를 만든다는 것은 틀을 만든다는 것이다.
		// 객체를 만들때 쓰는 키워드는 new 이다.
		// 레퍼런스 변수들은 객체의 주솟값을 담고 있다.
		//레퍼런스 변수끼리 비교는 주솟값 비교이다.
		// 대문자로 시작하는 타입들은 기본값이 null이다.(아무것도 안 가리키고 있다.)
		// 레퍼런스 변수 하나 안에 new로 객체를 만들면 객체의 주솟값을 각 방에 저장한다/
		//Tv[] tvArr = new Tv[3]의 경우 Tv[3] 배열의 방에 tvArr배열의 주솟값을 저장, 
		//생성자는  new 연산자를 통해서 인스턴스를 생성할 때 반드시 호출이 되고 제일 먼저 실행되는 일종의 메소드(하지만 메소드와는 다르다.)이다. 
		// 생성자는 인스턴스 변수(필드 값 등)를 초기화 시키는 역할을 한다. 
		// 클래스를 정의할 때 생성자를 생략하면 컴파일러가 자동적으로 기본 생성자(Default Constructor)를 생성
		// public Car(){ } // 이와같은 Default Constructor 자동 생성
		//Car car = new car(사용자 정의 생성자);
		// 사용자가 정의한 생성자가 있으면 Default 생성자를 더 이상 자동으로 만들어주지 않는다.
		// 생성자의 매개변수를 다르게 지정하여 정의하는 것을 생성자 오버로딩이라고 한다
		//리턴값이 필요한 메소드를 쓸 때는 비 void형으로 사용한다.
		// 리턴값이 필요한 메소드를 void형으로 사용하면 메소드의 사용의 확장성이 줄어든다.
		// 전역변수는 모든 메소드에서 쓸 수 있다.(멤버필드)
		//static이 붙으면 별개 (static 붙은 변수 =클래스 변수)
		// static 메소드 안에서 변수 접근하려면 '클래스명.' 으로 접근하면된다. 
		/*this.n1+n2 객체화 해야 사용할 수 있다.*/
		//객체지향은 최대한 업무를 분리해주는 것이 원칙이다. = 정리를 잘 해야한다.
		//패키지가 달라도 클래스에 접근하고 싶다면 import 시켜주고 static을 써주는 방법밖에 없다.
		/*private (접근지시어)/같은 클래스 안에서 / 외부에서 값을 넣을 수 있는 방법이없다.
		 * 값을 넣는 방법은 다음과같다/ 1.생성자를 통해서 넣는다. 2.setter(메소드)를 통해서 넣는다.
		 * 값을 빼는 방법은 다음과 같다./ getter(메소드)를 통해서 넣는다.
		 * default     /private + 같은 패키지 /
		 * protected   /default + 상속관계/
		 */
		//값을 넣고 (생성자를 통해서도 가능)빼는 것은 무조건 메소드를 통해서 해야한다. 
		//전역변수(멤버필드)와 지역변수의 이름이 같으므로 this를 넣어준다.
		//this.title = title 은 전역변수(멤버필드)에 값을 담아줘야 하므로 사용.
		// 리터럴값을 넣을 거면 (값이 정해져있다) 연산으로 리터럴 값을 넣지 않는게 좋다(1024*2*10같이 하는 것은 x)
		// setter와 기본생성자를 넣지않고 getter만 넣어서 상수를 받는 클래스를 만들 수 있다.
		// object는 자바에서 최상위 부분을 의미한다.(모든 객체는 object를 상속받는다.= object는 누구든지 상속받을 수 있다.)
		//int[] arr = new int[0]; int[] temp = new int[0]; 각각 다른 방의 주솟값을 가진다.
		// temp = arr // temp는 arr의 주솟값을 가리키게 된다.

		
	}

}
