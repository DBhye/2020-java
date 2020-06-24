package com.kita.first.level3;
import java.util.Arrays;

public class MyList_1 {
	public static void main(String[] args) {
		MyList_2 list = new MyList_2();
		list.add(10); 
		list.add(15); 
		list.add(20); 
		list.add(1,1200);
		
		int delVal = list.remove(); //마지막 값 지우고, 지우는 값 리턴!
		
		MyArrays.print(list); 
		
		//바로 찍으면 void 형일 확률이 매우 높다!
		System.out.print(delVal);
		int len = list.size();
		int val = list.get(1);
		val = list.get(0);
		list.remove();
		list.remove();
		
		String str = MyArrays.toString(list);
		
	}
		
	
	
}

class MyList_2{
	
	private int[] arr;
	
	 MyList_2() {
	 init();
	 }
	 
	 private void init() {
	 arr = new int[0];
	 }
	
	void add(int num) {
		int[] temp = new int[arr.length+1];
		// 임시 배열에 자리/방(인덱스)을 만들어준다.
		for(int i=0; i<arr.length; i++ ) {
			temp[i]= arr[i];
		// arr[]에 존재하는 모든 값을 그대로 임시 배열 temp에 넣어준다.
		}	
		temp[arr.length] = num; //temp[arr의 마지막 인덱스번호+1]에 num이라는 값을 넣어줌  
		arr=temp; //배열 temp를 arr에 옮긴다. 
	}
	public int size() {
		return arr.length;
	}
	
	public int get(int idx) {
		return arr[idx];
	}
	/*
	void remove() {
		int[] temp = new int[arr.length-1];
		//임시 배열에 자리/방(arr보다 작은 방)을 만들어준다. arr길이가 3이면 길이 2인 temp가 생성
		for(int i=0; i<arr.length-1; i++) {
			temp[i] = arr[i];
		// 	for 에서 arr배열의 인덱스길이가 3이면 temp의 인덱스는 [0], [1] 까지만 증가하면 된다.
			//arr 값을 옮겨도 작은 방인 temp에 값을 다 넣어주지 못한다.
		} arr=temp; //temp라는 배열을 다시 arr로 넣어준다.
		System.out.println(Arrays.toString(arr));
 } */
	/*
	void add(int a, int b) {
		
		int[] temp = new int[arr.length+1];
		for(int i=0; i<arr.length; i++) {
			if(i<a) {
				temp[i]=arr[i];
			}else {
				temp[i+1] = arr[i];
			}
			
		} temp[a] = b;
		arr=temp;
		System.out.println(Arrays.toString(arr));
	}*/
	void add(int idx, int num) {
		int[] temp = new int[arr.length + 1];
		for(int i=0; i<arr.length; i++) {
			temp[(i < idx) ? i : i+1] = arr[i];
		}
		temp[idx] = num;
		arr=temp;
	}
	/*
	int remove() {
		int[] temp = new int[arr.length-1];
		int num= arr[arr.length-1];
		for(int i=0; i<arr.length-1; i++) {
			temp[i] = arr[i];
	}arr=temp;
	
	return num;
	
	}
	*/
	int remove(int idx) {
		int[] temp = new int [arr.length -1];
		for(int i=0; i<temp.length; i++) {
			if(i< idx) {
				temp[i] = arr[i];
			}else {
				temp[i] = arr[i+1];
			}
		}int delVal = arr[idx];
		arr = temp;
		return delVal;
	}
	int remove() {
		return remove(arr.length -1);
		// 인덱스 번호를 몰라도 remove를 실행할수 있도록 만든다.
	}
	
	
	
}

class MyArrays {
	static void print(MyList_2 list) {
		int[] temp = new int [list.size()];
		for(int i =0;i<list.size(); i++) {
			temp[i]=list.get(i);
		System.out.printf(i<list.size() - 1 ? "%d, " : "%d]", list.get(i));
		} //삼항식에서 temp의 인덱스 번호가 마지막 배열의 값과 같아지면 %d]를 출력하도록 한다.
		//마지막 배열이 출력되고 난 뒤 쉼표가 출력되지 않도록 한다.
	}
	static String toString(MyList_2 list) {
		
		String str ="";
		for(int i=0; i<list.size(); i++) {
			if(i > 0) {str += ", "; }
			str+= list.get(i);
		
		}//return "[" + str + "]";
		return String.format("[%s]",str);
	}//printf는 콘솔에 바로 때려박는 것/ format은 문자열로 반환해서 보여주는것
}