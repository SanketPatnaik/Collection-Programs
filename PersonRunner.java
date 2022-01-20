package com.in28minutes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonRunner {

	public static void main(String[] args) {
		Person p1 = new Person("Neetu", 25);
		Person p2 = new Person("Liza", 24);
		Person p3 = new Person("Sush", 23);
		Person p4 = new Person("Pari", 26);

		List list = List.of(p1, p2, p3, p4);

		ArrayList a = new ArrayList(list);

		System.out.println(a);

		Collections.sort(a);

		System.out.println(a);

		Collections.sort(a, Collections.reverseOrder());

		System.out.println(a);

	}

}
