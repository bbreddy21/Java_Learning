package com.simplilearn.collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedArrayListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> cities = new LinkedList<>();
		cities.add("Agra");
		cities.add("Chennai");
		cities.add("Bangalore");
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("kolkatta");
		cities.add("Bangalore");
		//cities.add(null);
		// ArrayList maintains order and duplicates
		System.out.println(cities);
		System.out.println(cities.size());
		Collections.sort(cities);
		System.out.println(cities);

	}

}
