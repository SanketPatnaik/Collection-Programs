package com.in28minutes.collections;

import java.util.Comparator;

public class Employee {
	String name;
	int salary;
	int eid;

	public Employee() {

	}

	public Employee(String name, int salary, int eid) {
		this.name = name;
		this.salary = salary;
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "Name is : " + name + " Salary is :" + salary + " Eid is :" + eid;
	}

	public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.name.compareTo(e2.name);
		}
	};

	public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.salary - e2.salary;
		}
	};
	public static Comparator<Employee> eidComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.eid - e2.eid;
		}
	};
}

