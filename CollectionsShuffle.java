package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsShuffle {
	/*
	 * Collections.shuffle(list)
	 * shuffles the list elements 
	 */

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		Collections.shuffle(list);
		list.forEach(System.out::print);
		System.out.println();
		Collections.shuffle(list);
		list.forEach(System.out::print);
		System.out.println();
		Collections.shuffle(list);
		list.forEach(System.out::print);
		System.out.println();
		Collections.shuffle(list);
		list.forEach(System.out::print);
	      	}
		
	}
