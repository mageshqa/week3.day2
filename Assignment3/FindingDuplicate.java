package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindingDuplicate {

	public static void main(String[] args) {

		int[] array = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int count = 0;

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> temp = new ArrayList<Integer>();

		for (Integer i : array) {
			list.add(i);

		}

		System.out.println(list);

		Collections.sort(list);

		System.out.println(list);

		for (int j = 0; j < list.size() - 1; j++) {

			for (int k = j + 1; k < list.size() - 1; k++) {

				if (list.get(j) == list.get(k)) {
					count++;
					temp.add(list.get(j));
				}

			}

		}

		System.out.println("Duplicate values are " + temp);
		System.out.println(count);

	}

}
