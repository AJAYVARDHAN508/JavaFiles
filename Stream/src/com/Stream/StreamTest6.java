package com.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest6 {
	public static void main(String[] args) {
		Integer values[]= {4,1,22,7,8,99};
		List<Integer>list = Arrays.asList(values);
		
		List<Integer>list2 = Arrays.asList(new Integer[] {7,8,9,6,5,4});
		
		Integer[] v =list2.stream().map((a)->{
			return a/2;
		}).toArray(Integer[]::new);
		
	}

}
