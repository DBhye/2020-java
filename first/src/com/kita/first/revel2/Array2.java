package com.kita.first.revel2;
// 2차원 배열
public class Array2 {
	public static void main(String[] args) {
		int[][] arr = new int [2][3];
		
		int[][] arr2 = { //자식은 두개, arr2[0]의 길이는 3
				{10, 20, 30},
				{15, 16, 17, 14},
		};
		
		int[][][] arr3 = new int [3][4][5]; // 3차원 배열
		System.out.println(arr.length); //2가 출력된다.
		System.out.println(arr2[0].length);
		System.out.println(arr2[1].length);
		
		for(int i=0; i<arr2.length; i++) {
			for(int z=0; z<arr2[i].length; z++) {
				System.out.print(arr2[i][z] + ",");
			}
		}System.out.println();
	}
}
// 1차원 배열은 1열로 가로로 생성된다.
