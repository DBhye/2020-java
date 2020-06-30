package com.first.level7;

public class Marine extends Unit implements AttackUnit {
							//클래스가 인터페이스를 상속받는 방법이다.
							//구현이라는 뜻이다.
	private int damage;
	
	
	public Marine() {
		super("마린",50);
		damage = 5;
	} //고정
	
	@Override
	public void attack(Unit u) {
		if(u == this) {return;}
		System.out.println("따다다다~");
		u.getDamage(damage);
		
			
	}
	//마린 클래스에는 AttackUnit인터페이스를 꼭 오버라이딩 해줘야한다!!
	@Override
	public String toString() {
		return String.format("%s,현재 hp: %d",super.NAME, super.getCurrent_hp());
	
	}
	
}
