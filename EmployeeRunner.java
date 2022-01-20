package com.in28minutes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeRunner {

	public static void main(String[] args) {
		Employee p1 = new Employee("Neetu", 25, 8);
		Employee p2 = new Employee("Liza", 24, 7);
		Employee p3 = new Employee("Sush", 23, 6);
		Employee p4 = new Employee("Pari", 26, 5);

		List list = List.of(p1, p2, p3, p4);
		ArrayList a = new ArrayList(list);

		System.out.println(a);

		System.out.println("Sorted by name");
		Collections.sort(a, Employee.nameComparator);
		for (Object o : a) {
			System.out.println(o);
		}
		System.out.println("===========================");

		System.out.println("Sorted by salary");
		Collections.sort(a, Employee.salaryComparator);
		for (Object o : a) {
			System.out.println(o);
		}
		System.out.println("===========================");

		System.out.println("Sorted by eid");
		Collections.sort(a, Employee.eidComparator);
		for (Object o : a) {
			System.out.println(o);
		}

	}

}
