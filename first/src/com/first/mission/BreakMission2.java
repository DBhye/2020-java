package com.first.mission;

public class BreakMission2 {

	public static void main(String[] args) {
		int LEN=3;
		int[] myarr= new int [LEN];
		int[] arr= new int [LEN];
		for(int i=0; 0<arr.length; i++) {
			arr[i] = (int) (Math.random() * 9 + 1);
			for(int z=0; z<i; z++) {
				if(arr[i] == arr[z]) {
					i--;
				}
			}
		}
	}

}
