package com.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class StreamTest5 {
	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(8);
		list.add(9);
		
		Stream<Integer> stream = list.stream();
		Stream<Integer> s = stream.distinct();
		stream=s.filter((d)->{
			if(d%2==1)return true;
			else return false;
		});
		stream.forEach((i)->{
			System.out.println(i);
			
		});
			
	}

}
