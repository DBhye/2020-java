package com.kita.first.revel2;
//선택정렬
public class ArrayOrder_1 {
	public static void main(String[] args) {
		int[] arr = { 45, 33, 15, 22, 13, 46 };
		// 처음값과 뒤의 값들을 하나씩 비교하여 가장 작은 값의 인덱스를 찾는다.
		// 1회전후에는 {13, 33, 15, 22, 45, 46}
		// i가리키는 값보다 제일 작은 값을 찾아와(인덱스 번호) 자리를 바꾸는 것이다.
		int least; //인덱스값
		for (int i = 0; i < arr.length - 1; i++) {
			least = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[least] > arr[j]) {
					least = j;

				}

			}
			if (least != i) {
				int temp = arr[least];
				arr[least] = arr[i];
				arr[i] = temp;
			}
		}
		for (int val : arr) {
			System.out.print(val + ", ");
		}
	}
}
