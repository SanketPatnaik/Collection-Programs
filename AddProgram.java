package com.in28minutes.collections;

import java.util.ArrayList;
import java.util.List;

public class AddProgram {

	public static void main(String[] args) {
		List a = List.of(12, 20, 20, 100);
		ArrayList<Integer> a1 = new ArrayList<>(a);
		System.out.println(a);
		int c = (a1.get(2) + 300);
		System.out.println(c);

		List b = List.of(23, 345, 233, 100);
		ArrayList<Integer> b1 = new ArrayList<>(b);
		System.out.println(b);
		int d = (b1.get(1) + 100);
		System.out.println(d);

		List c = List.of(324, 345, 21442, 34, 342);
		ArrayList<Integer> c1 = new ArrayList<>(c);
		int sum = 0;
		for (Integer i : c1) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("Sum is : " + sum);
	}

}
