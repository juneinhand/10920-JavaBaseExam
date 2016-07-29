package com.hand;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 50; i++) {
			Random r = new Random();
			int sum = r.nextInt(100) + 1;
			list.add(sum);
		}

		for (Integer s : list) {
			System.out.println("随机生成50 个小于100 的数,分别为:");
			System.out.print(s+" ");
		}
		
		
		
	}
}
