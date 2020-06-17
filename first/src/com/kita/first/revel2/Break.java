package com.kita.first.revel2;

public class Break {
	public static void main(String[] args) {
		for(int i = 0;i<10; i++ ) {
			for(int z=0; z<3; z++) {
				
				
				for(int e=0; e<3; e++) {
					if(z==3) { break; }
					System.out.printf("%d - %d - %d\n",z,i,e);
				}
				
			}
		}
			}
			
}
