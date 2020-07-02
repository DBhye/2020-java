package com.first.level8;
import java.lang.ClassNotFoundException;
public class TryCatchTest {

	public static void main(String[] args) {
		meth();
	

		//meth2();
		
		System.out.println("dddd");
		int a=div(10, 2);
		System.out.println("a : " + a);
	}
	//public static int div(int n1, int n2) throws Exception {
		//return n1/ n2; //만약 실행되면 결과값 리턴,예외가 뜨면 에러구문 catch 실행
	//}
	
	
	//meth2 메소드를 실행하여 오류가 나면 괄호 안을 실행한다.
	public static void meth2() throws Exception /*ClassNotFoundException*/ 
	{
		Class.forName("dsddd");
	} 
	
	public static int div(int n1, int n2) {
		try {
			return n1/n2;
		} catch(Exception e) {
			return 0;
		}
	}
	

	public static void meth() {
		int result = 2;
		try { // 예외가 실행될것같은 실행문을 넣는다
			//result = 10 / 0;
			
		/*	if(result % 2 == 0) {
				return; //return 하면 원래 메소드가 바로 종료되지만
				//finally는 무조건!!실행된다.
			}*/
			Class.forName("");
		}/* catch(SQLException e) {
			
		}*/ catch(ClassNotFoundException e) {
			//모든 에러를 다 잡을 수 있는 부모같은 에러
		}
		
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("예외가 발생");
		} finally { // 무조건 실행
			System.out.println("finally");

		}
		System.out.println("result :" + result);
		System.out.println("종료!");

	}

}
