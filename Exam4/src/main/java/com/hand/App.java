package com.hand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		Map<Integer, ArrayList<Integer>> map2 = new HashMap<Integer, ArrayList<Integer>>();
		for (int i = 0; i < 50; i++) {

			int sum = (int) (100 * Math.random());
			list.add(sum);

		}

		System.out.println("随机生成50 个小于100 的数,分别为:");
		int count = 0;
		for (Integer s1 : list) {
			count++;
			int a = s1 / 10;
			ArrayList<Integer> ss = map2.get(a);
			if (null == ss) {

				ArrayList<Integer> list2 = new ArrayList<Integer>();

				list2.add(s1);

				map2.put(a, list2);
			} else {
				ss.add(s1);
			}
			if (count != 50) {
				System.out.print(s1 + ",");
			} else {
				System.out.print(s1);
			}
		}

		System.out.print("\nMap中的数据为：{");
		Iterator<Entry<Integer, ArrayList<Integer>>> it2 = map2.entrySet()
				.iterator();

		while (it2.hasNext()) {
			Entry<Integer, ArrayList<Integer>> entry = it2.next();

			if (it2.hasNext())
				System.out
						.print(entry.getKey() + "=>" + entry.getValue() + ",");
			else
				System.out.print(entry.getKey() + "=>" + entry.getValue());
		}
		System.out.print("}");
		System.out.print("\n排序后的Map为：{");
		Iterator<Entry<Integer, ArrayList<Integer>>> it = map2.entrySet()
				.iterator();
		while (it.hasNext()) {
			Entry<Integer, ArrayList<Integer>> entry = it.next();
			entry.getValue().sort(null);
			if (it.hasNext())
				System.out
						.print(entry.getKey() + "=>" + entry.getValue() + ",");
			else
				System.out.print(entry.getKey() + "=>" + entry.getValue());

		}
		System.out.print("}");

	}
}
