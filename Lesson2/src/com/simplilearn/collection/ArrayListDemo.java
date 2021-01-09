package com.simplilearn.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instantiated an Array List
		//To Retrieve fast use Array List , to manipulate elements use LinkedArrayList
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Agra");
		cities.add("Chennai");
		cities.add("Bangalore");
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("kolkatta");
		cities.add("Bangalore");
		//cities.add(null);
		// ArrayList maintains order of Insertion and accepts duplicates
		System.out.println("****Using default ****");
		System.out.println(cities);
		System.out.println(cities.size());
		Collections.sort(cities);
		System.out.println("****After Sorting****");
		System.out.println(cities);
		// remove,size,set(index,value),get(1),indexof(),lastindexof(),Arrays.aslist()
		// using for each loop
		System.out.println("****************");
		System.out.println("Using For Loop");
		for (String city : cities) {
			System.out.println(city);
		}
		System.out.println("****************");
		System.out.println("using iterator which gives sorted list");
		Iterator<String> iterator = cities.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		ListIterator<String> iterator2 = cities.listIterator();
		System.out.println("****************");
		// Printing the iterated value
		System.out.println("\nUsing ListIterator:\n");
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

	}

}
