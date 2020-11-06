package com.Groupex;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class GroupExample {
	public static void main(String[] args) {
		 List<String> list= Arrays.asList(new String[] {"a","b","cc","dd","ee","ascd","ascd","abc"});
			
			Map<String,Long>map = list.stream().collect(Collectors.groupingBy(String::toString, Collectors.counting()));
			System.out.println(map);
		
	}
	public static void main3(String[] args) {
		 List<String> list= Arrays.asList(new String[] {"a","b","cc","dd","ee","ascd","ascd","abc"});
			
			Map<Integer,Long>map = list.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
			System.out.println(map);
		
	}
	public static void main2(String[] args) {
        List<String> list= Arrays.asList(new String[] {"a","b","cc","dd","ee","ascd","ascd","abc"});
		
		Map<Integer,Set<String>>map = list.stream().collect(Collectors.groupingBy(String::length, TreeMap::new,Collectors.toSet()));
		System.out.println(map);
		
		
	}
	public static void main1(String[] args) {
		//based on the length
		List<String> list= Arrays.asList(new String[] {"a","b","cc","dd","ee","ascd","ascd"});
		
		Map<Integer,List<String>>map = list.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(map);
	}

}
