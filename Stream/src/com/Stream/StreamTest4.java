package com.Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamTest4 {
	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(1);
		list.add(88);
		list.add(4);
		list.add(8);
		list.add(20);
		
		boolean s = list.stream().anyMatch((b)->{
			if(b%2==1)return true;
			else return false;
		});
		System.out.println(s);

		boolean s2 = list.stream().allMatch((c)->{
			if(c%2==0)return true;
			else return false;
		});
		System.out.println(s2);
	}
	
	

}
