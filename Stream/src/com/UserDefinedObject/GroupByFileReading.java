package com.UserDefinedObject;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFileReading {
	public static void main(String[] args) {
		try {
			
			Map<String,List<String>> map = Files.lines(Paths.get("F:\\Java Txt\\cities.txt"))
					.collect(Collectors.groupingBy(
					(a)->{
				return a.split(",")[9].trim();
			},
					Collectors.mapping((a)->{
						return a.split(",")[8].trim();
					},Collectors.toList())
		));
		System.out.println(map);
		} catch(Exception e) {
			e.printStackTrace();	
		}
	}
}
		
		
		
	


