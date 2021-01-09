package com.simplilearn.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		String input = "Regular Expression";
		String pattern = "[a-zA-Z]+";
        
		 Pattern p = Pattern.compile(pattern);
		 Matcher m = p.matcher(input);
		 while(m.find()) {
			 System.out.print(input.substring(m.start(),m.end()));
		 }
	
	
	List<String> emails = new ArrayList<String>();
	emails.add("user@domain.com");
	emails.add("user@domain.co.in");
	emails.add("user1@domain.com");
	emails.add("user.name@domain.com");
	emails.add("user#@domain.co.in");
	emails.add("user@domaincom");
	 
	//Invalid emails
	emails.add("user#domain.com");
	emails.add("@yahoo.com");
	 
	String regex = "^(.+)@(.+)$";
	 
	Pattern pattern1 = Pattern.compile(regex);
	 
	for(String email : emails){
	    Matcher matcher = pattern1.matcher(email);
	    System.out.println(email +" : "+ matcher.matches());
	}
	
	}
}
