package level3;

public class TvTest {

	public static void main(String[] args) {
		
		Tv tv1 = new Tv();  //오른쪽값을 복사하여 왼쪽에 준다.
		
		
		System.out.println("name : " + tv1.name);
		System.out.println("power: "+ tv1.power);
		System.out.println("channel : " + tv1.channel);
		
		System.out.println("-----------------");
		tv1.name = "삼성 Tv";
		System.out.println("name: " + tv1.name);
		tv1.changePower();
		System.out.println("power: "+ tv1.power);
		tv1.changePower();
		System.out.println("power: "+ tv1.power);
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		System.out.println("channel : " + tv1.channel);
		//Tv '타입'의 객체의 주솟값만 저장한다./주소값이 복사되어 왼쪽에 준다.
		//기본생성자 ()
		//레퍼런스 타입(대문자로 시작함)이라 주솟값만 저장할 수 있다.(100% Tv 객체) 
		//Tv tv1=null; //지역변수로 사용시 null값 대입해줘야한다.
	
	}						
	
	
	/*String str = new Tv(); 스트링 객체의 주솟값만 저장 */ 

}
