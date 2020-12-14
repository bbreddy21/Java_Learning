package com.simplilearn.collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, Student> studentmap = new HashMap<>();
		Student student1 = new Student(1, "john", "chennai");
		Student student2 = new Student(2, "bbreddy", "bangalore");
		studentmap.put(1, student1);
		studentmap.put(2, student2);
		System.out.println(studentmap);
        Set<Entry<Integer, Student>> entries = studentmap.entrySet();
        for (Entry<Integer,Student>entry :entries) {
        	System.out.println("key : " + entry.getKey());
        	System.out.println("Value : " + entry.getValue());
        	
        }

	}

}
