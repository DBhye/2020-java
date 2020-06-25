package com.first.baseball;
import java.util.Arrays;
public class Baseball {
	private int[] rArr;
	
	public Baseball(int num) {
		init(num);
	}
	
	void init(int num) {
	
	rArr = new int [num];
	setRandom();
	} 
	
	 private void setRandom() {
		
		 int rVal = (int) (Math.random() * 1 + 9);
		 for(int i=0; i<rArr.length; i++) {
			 rArr[i]=rVal;
			 
			 for(int z=0; z<rArr.length-1; z++) {
				 if(rArr[i]==rArr[z]) {
					 i--;
					 break;
				 }
			 }
		 }
		 
		 System.out.println(Arrays.toString(rArr));
	 }
	 
	 
	 public int get(int idx) {
		 return rArr[idx];
	 }
}
