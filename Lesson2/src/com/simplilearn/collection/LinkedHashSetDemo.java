package com.simplilearn.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> cities = new LinkedHashSet<>();
		cities.add("Agra");
		cities.add("Chennai");
		cities.add("Bangalore");
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("kolkatta");
		cities.add("Bangalore");
		cities.add(null);
		cities.add(null);
		cities.add(null);
		System.out.println(cities);

	}

}
