package com.simplilearn.strings;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		System.out.println("s1==s2" + (s1 == s2));
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println("s3==s4" + (s3 == s4));
		System.out.println("s3==s4" + (s3.equals(s4)));
		System.out.println("****String Methods***");
		System.out.println(s3.replace('h', 'z'));
		System.out.println(s3);
		System.out.println(s3.charAt(3));
		System.out.println(s3.length());
		System.out.println(s3.trim());
		System.out.println(s3.concat("World"));
		System.out.println(s3);
		System.out.println(s3.toUpperCase());
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.isEmpty());
		String s5 = "Happy learning World";
		System.out.println(s5.substring(0, 5));

	}

}
