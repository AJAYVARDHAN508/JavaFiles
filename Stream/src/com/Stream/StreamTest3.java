package com.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest3 {
	public static void main(String[] args) {
		
	List<Integer> list= new ArrayList<Integer>();	
	list.add(1);
	list.add(3);
	list.add(4);
	list.add(8);
	list.add(9);
	
	List<Integer> list2 = list.stream().filter((a)->{
		if(a%2==1) return true;
		else return false;
		
	}).collect(Collectors.toList());
	list2.forEach((a)->{
		System.out.println(a);
	});
	}

}
