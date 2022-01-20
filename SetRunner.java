package com.in28minutes.collections;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		Set<Character> characters1 = new LinkedHashSet<>(characters);
		Set<Character> characters2 = new TreeSet<>(characters);

		System.out.println(characters);
		System.out.println(characters1);
		System.out.println(characters2);

	}

}
