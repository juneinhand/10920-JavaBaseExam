package com.hand;


import java.util.*;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {

		int x = 0;

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 101; i <= 200; i++) {
			boolean b = true;

			for (int j = 2; j < i - 1; j++) {
				if (i % j == 0) {
					b = false;
					break;
				}
			}
			if (b == true) {
				x++;
				list.add(i);
			}
		}
		System.out.print("101到200中间有 " + x + "个素数，");
		System.out.print("分别是:");
		int count = 0;
		for (Integer s : list) {
			count++;
			if (count != x)
				System.out.print(s + ",");
			else
				System.out.print(s);
		}
	}
}
