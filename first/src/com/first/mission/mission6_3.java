package com.first.mission;

public class mission6_3 {

	public static void main(String[] args) {
		for (int i = 26; i < 34; i++) {
			for (int z = 1; z < 10; z++) {
				int p= i-24;
				System.out.printf("%d * %d = %d\n", p, z, (p * z));	
			}
			System.out.println("--------------");
		}
	}

}
