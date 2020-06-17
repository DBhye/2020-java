package com.kita.first.revel2;

public class NamedLoop {

	public static void main(String[] args) {

		Parent: 
		for (int i = 0; i < 5; i++) {
				for (int z = 0; z < 20; z++) {
					if (z == 15) {
						break Parent; // for문 자체를 끝내버린다.
					// continue Parent;
				}
				System.out.printf("%d - %d\n", i, z);
			}
		}
	}
}
