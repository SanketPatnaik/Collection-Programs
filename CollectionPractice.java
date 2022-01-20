package com.in28minutes.JspidersQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionPractice {

	List<Integer> list = List.of(88, 98, 78, 44, 12, 32, 92, 64, 48);
	ArrayList<Integer> numbers = new ArrayList<>(list);

	public void copyOrCloneAnArraylist() {
		ArrayList<Integer> numbers2 = new ArrayList<>();
		System.out.println(numbers);
		System.out.println(numbers2);
		for (Integer i : numbers) {
			numbers2.add(i);
		}
		System.out.println(numbers);
		System.out.println(numbers2);
	}

	public boolean findIfArrayListContainsList() {
		if (numbers.containsAll(list)) {
			return true;
		}
		return false;
	}

	public void copyArrayListToArray(int... num) {
		for (Integer i = 0 ; i < numbers.size() ; i++) {
			num[i] = numbers.get(i);
		}
		System.out.println(Arrays.toString(num));

		for (Integer number : num) {
			System.out.print(number + " ");
		}
}

public void shuffleElemetsInArrayList() {
	Collections.shuffle(numbers);
	System.out.println(numbers);
}

public void swapTwoElemetsInAnArrayList() {
	List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6);
	ArrayList<Integer> numbers = new ArrayList<>(list1);
	for (Integer i = 0; i < numbers.size() - 1; i += 2) {
		Collections.swap(numbers, i, i + 1);
	}
	System.out.println(numbers);
	}

	public void copyLinkedListToArray(int... nums) {
		LinkedList<Integer> numbers = new LinkedList<>(list);
		for (Integer i = 0; i < numbers.size(); i++) {
			nums[i] = numbers.get(i);
		}
		for (Integer num : nums) {
			System.out.print(num + " ");
		}

	}

	public void getSubListFromLinkedList() {
		LinkedList<Integer> numbers = new LinkedList<>(list);
		System.out.println(numbers.subList(1, 8));
	}

}
