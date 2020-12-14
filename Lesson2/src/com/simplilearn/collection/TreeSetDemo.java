package com.simplilearn.collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Tree Set maintains order and sorting,no null
		//Tree Set inserts and sorts so null not allowed
		TreeSet<String> cities = new TreeSet<>();
		cities.add("Agra");
		cities.add("Chennai");
		cities.add("Bangalore");
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("kolkatta");
		cities.add("Bangalore");
		//cities.add(null);
		//cities.add(null);
		//cities.add(null);
		System.out.println(cities);
		
	}

}
