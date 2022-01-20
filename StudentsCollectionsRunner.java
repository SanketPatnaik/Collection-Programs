package com.in28minutes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {
	@Override
	public int compare(Student student2, Student student1) {
		return Integer.compare(student1.getId(), student2.getId());
	}

}

public class StudentsCollectionsRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student("Neetu", 3), new Student("Liza", 2), new Student("Shona", 1));

		ArrayList<Student> studentsAl = new ArrayList<>(students);

		Collections.sort(studentsAl);
		System.out.println("Ascending " + studentsAl);

		Collections.sort(studentsAl, new DescendingStudentComparator());
		System.out.println("Descending " + studentsAl);

		studentsAl.sort(new DescendingStudentComparator());
		System.out.println("DescendingStudentComparator " + studentsAl);

	}

}
