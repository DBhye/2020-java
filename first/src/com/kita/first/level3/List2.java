package com.kita.first.level3;

import java.util.ArrayList;

public class List2 {
	
	public static void main(String[] args) {
	/*	object obj = 1;
		obj = "aaa";
		obj = 1.1;
		System.out.println((float)obj + (float) obj);*/
		
		ArrayList<Integer> list = new ArrayList();
		list.add(1); 
		list.add(2);	//복사하고 늘려준다.
		list.add(3);
		list.add(10);
		
		
		list.add(2, 11); //2번째 자리에 11 삽입
		
		list.remove(list.size() - 1);
		list.remove(list.size() - 1); //마지막 값 삭제
		/*
		for(int i=0; i<list.size(); i++) {
			int val = (int)list.get(i);
			System.out.print(val + ", ");
			}
			System.out.println();
			int i = 0
			for(int val : list) {
			//System.out.print((int)val + ", ");
				System.out.printf("i: %d, %d /",i++,val);*/
		int value = list.get(2);
		System.out.println(value);
		
		for(Integer val : list) {
			System.out.print(val + ", ");
		
		
		}
	}

}
