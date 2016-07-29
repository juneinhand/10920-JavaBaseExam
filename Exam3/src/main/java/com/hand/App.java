package com.hand;

import java.io.InputStream;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int year, month, day;
		int days = 0;
		int dayCount = 0;
		Scanner sc;
		boolean isTrue = false;
		do {
			isTrue = false;

			System.out.print("请输入日期：");

			Scanner scs = new Scanner(System.in);
			String input = scs.nextLine();
			sc = new Scanner(input).useDelimiter("\\s*-\\s*");
			year = sc.nextInt();
			month = sc.nextInt();
			day = sc.nextInt();
			sc.close();

			if (year <= 0 || month <= 0 || month > 12 || day <= 0 || day > 31) {
				System.out.println("输入错误，请重新输入！");
				isTrue = true;
			}
		} while (isTrue);
		for (int i = 0; i < month; i++) {
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 2:
				if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
					days = 29;
				} else {
					days = 28;
				}
				break;
			}
			dayCount += days;
		}
		System.out.println(year + "年" + month + "月" + day + "日是这一年的第"
				+ (dayCount + day) + "天。");
	}

}
