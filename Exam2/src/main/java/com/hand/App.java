package com.hand;

import java.util.Scanner;

/**
 * Hello world!
 * 
 */
public class App {

	public static void main(String[] args) {

		System.out.println("请输入工资：");
		Scanner scanner = new Scanner(System.in);
		double Money = scanner.nextInt();
		double Num = 0;
		double Temp = Money - 3500;

		if (Temp > 0) {
			if (Temp <= 1500) {
				Num = Temp * 0.03;
			} else if (Temp > 1500 && Temp <= 4500) {
				Temp = Temp - 1500;
				Num = 1500 * 0.03 + Temp * 0.1;
			} else if (Temp > 4500 && Temp <= 9000) {
				Temp = Temp - 4500;
				Num = 1500 * 0.03 + 3000 * 0.1 + Temp * 0.2;
			} else if (Temp > 9000 && Temp <= 35000) {
				Temp = Temp - 9000;
				Num = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + Temp * 0.25;
			} else if (Temp > 35000 && Temp <= 55000) {
				Temp = Temp - 35000;
				Num = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + 26000 * 0.25
						+ Temp * 0.3;
			} else if (Temp > 55000 && Temp <= 80000) {
				Temp = Temp - 55000;
				Num = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + 26000 * 0.25
						+ 20000 * 0.3 + Temp * 0.35;
			} else {
				Temp = Temp - 80000;
				Num = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + 26000 * 0.25
						+ 20000 * 0.3 + 25000 * 0.35 + Temp * 0.45;
			}
		}
		System.out.println("所需要缴纳的税费：");
		System.out.println(Num);

	}

}
