package com.in28minutes.collections;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Maps {

	String str;

	public Maps(String str) {
		this.str = str;
	}

	public void countOccuranceOfEachCharacter() {
		LinkedHashMap<Character, Integer> occur = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			Integer count = occur.get(str.charAt(i));
			if (count == null) {
				occur.put(str.charAt(i), 1);
			} else {
				occur.put(str.charAt(i), count + 1);
			}
		}
		System.out.println(occur);
	}

	public void countOccuranceOfWord() {
		LinkedHashMap<String, Integer> occur = new LinkedHashMap<>();
		LinkedList<String> words = new LinkedList<>();
		int space = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals(" ")) {
				words.add(str.substring(space, i));
				space = i + 1;
			}
			else if (str.substring(i, i + 1).equals(".")) {
				words.add(str.substring(space, i));
				space = i + 1;
			}
		}
		for (int i = 0; i < words.size(); i++) {
			Integer occurance = occur.get(words.get(i));
			if (occurance == null) {
				occur.put(words.get(i), 1);
			} else {
				occur.put(words.get(i), occurance + 1);
			}
		}
		System.out.println(occur);
	}

	public boolean isAnagramOrNot(String str1, String str2) {
		char[] characters1 = str1.toCharArray();
		Arrays.sort(characters1);
		char[] characters2 = str2.toCharArray();
		Arrays.sort(characters2);
		if (Arrays.equals(characters1, characters2)) {
			return true;
		}
		return false;
	}

}
