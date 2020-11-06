package com.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamTest {
	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(52);
		list.add(4);
		list.add(7);
		list.add(9);
		list.add(-1);
		list.add(90);
		
		Collections.sort(list);
		long v= list.stream()
				.filter( (a)->{
			if(a %2==0) {
				System.out.println(a);
				return true;	
			}	
		 return false;
					
		})
				.count();
		System.out.println("total num are ::"+v);
	}

}
