package com.simplilearn.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		System.out.println(buffer.capacity());
         buffer.append("Heello");
         System.out.println(buffer.capacity());
         buffer.replace(1,1,"a");
         System.out.println(buffer);
         buffer.delete(2,2);
         System.out.println(buffer);
         //insert
         buffer.insert(4, "hh");
         System.out.println(buffer);
         buffer.reverse();
         System.out.println(buffer);
         //(old capacity *2) + 2
         
         System.out.println("*****String Builder ****");
         StringBuilder builder = new StringBuilder();
         builder.append("Welcome");
         System.out.println(builder);
         
	}

}
