package com.nt.lamda;

import java.util.ArrayList;

public class ForEach1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add("ramiii");
		al.add("mohan");
		al.add("sohan");
		al.add("anshika");
		al.add("khan");
		System.out.println(al);
		System.out.println("=================");
		al.forEach(System.out::println);
		System.out.println("==============");
		
		al.forEach((n)->{
			System.out.println(n);
		});
		

	}

}
