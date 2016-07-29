package com.hand;

import java.util.Vector;

import java.math.*;
import java.util.*;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {

		int x = 0;
		Vector v = new Vector();
		for (int i = 101; i <= 200; i++) {
			boolean b = true;
			double m = Math.sqrt(i);
			for (int j = 2; j < Math.sqrt(i); j++) {
				if (i % j == 0) {
					b = false;
					break;
				}
			}
			if (b == true) {
				x++;
				v.add(i);
			}
		}
		System.out.print("101到200中间有 " + x + "个素数，");
		System.out.println("分别是:" + v);

	}
}
