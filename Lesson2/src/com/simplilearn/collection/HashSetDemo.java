package com.simplilearn.collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HashSet is implementation list
        //No Duplicates and No insertion Order
		//Only 1 Null allowed
		HashSet<String> cities = new HashSet<>();
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
