package com.kita.first.revel2;
import java.util.Arrays;
public class ArrCopy {

	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 7, 10,55};
		int[] arr2 = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			arr2[i]=arr[i];
		} //값을 복사해주는 메소드 //
		
	/* int [] arr2 =arr;  주소값 복사 - 그냥 값이 아니라  주소값까지 같아져!*/
	/* arr2[2] = 66; 을 하면 둘다 {2, 4, 6, 7, 10, 55};로 출력된다.*/	
		System.out.println( arr == arr2);
		System.out.println("arr2 : " + Arrays.toString(arr));
		System.out.println("arr2 : " + Arrays.toString(arr2));
		}
	}


