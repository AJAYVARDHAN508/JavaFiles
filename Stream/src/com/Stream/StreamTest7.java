package com.Stream;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest7 {
	public static void main(String[] args) {
		List<Integer>list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		
		  try {
			  Files .lines(Paths.get("F:\\Java Txt//abc7.txt")) .map(s -> s.trim())
		 .filter(s -> s.startsWith("")) .forEach(System.out::println); }
		  catch(Exception e) { e.printStackTrace(); }
		 
		try {

		List<String> strList =	Files.lines(Paths.get("F:\\Java Txt//abc7.txt")).filter((s) -> {
				String values[] = s.split(",");
				if (Integer.parseInt(values[2]) > 13)
					return true;
				else
					return false;
			}).filter(
			  (s)->{		
				  String values[] = s.split(",");
				  if(Integer.parseInt(values[3])>10) 
					  return true;
				  else return false;
			  }
			).filter((s)->{
				return list.contains(Integer.parseInt(s.split(",")[0]));
			}).
			sorted((a1,a2)->{
				
				Integer i1 = Integer.parseInt(a1.split(",")[3]);
				Integer i2 = Integer.parseInt(a2.split(",")[3]);
				return i2.compareTo(i1);
			}).
			collect(Collectors.toList());

		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * boolean s =list.stream().anyMatch((v)->{ if(v%2==1) return true; else return
		 * false; });
		 * 
		 * 
		 * boolean s2 =list.stream().allMatch((v)->{ if(v%2==0) return true; else return
		 * false; }); System.out.println(s); System.out.println(s2);
		 */

	}

	}


