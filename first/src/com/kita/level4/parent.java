package com.kita.level4;

public class parent {
	//부모의 메소드를 쓸 수 있게 상속받는다.
	//아래쪽(자식) 클래스로 갈수록 메소드가 많아질 수 밖에 없다.
	//상하관계만 가능하다.(형제관계 불가능)
	//레퍼런스 변수에서 형변환이 가능한 것은 상속밖에 없다.
	// 힙 메모리에 object가 만들어지고 그다음에 자식인 animal이 만들어진다.
	// animal의 자식클래스인 bird가 만들어진다.
	// @Override  //오버라이딩 할땐 넣는 습관을 들인다.부모중에 똑같은 이름의 메소드를 가짐.
	//생성자를 통해 값을 넣으면 상수처럼 사용할 수 있다.
	//다중상속이 되지않는다.
}
