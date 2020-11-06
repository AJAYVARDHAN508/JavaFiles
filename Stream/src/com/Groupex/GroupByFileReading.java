package com.Groupex;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByFileReading {
	public static void main(String[] args) {
		try {
			Map<String,List<String[]> > map = Files.lines(Paths.get("F:\\Java Txt\\cities.txt"))
					.collect(Collectors.groupingBy(
							 Function.identity(),
							 Collectors.mapping((v)->{
								 return v.split(",");
							 }, Collectors.toList())
							));
		  System.out.println(map);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main2(String[] args) {

		try {
			Map<String, List<String[]>> map = Files.lines(Paths.get("E:\\files\\cities.txt"))
					.collect(Collectors.groupingBy((s) -> {
						return s.split(",")[4].trim();
					}, Collectors.mapping((s) -> {
						String[] values = new String[2];
						values[0] = s.split(",")[8].trim();
						values[1] = s.split(",")[9].trim();
						return values;
					}, Collectors.toList())

					));

			Set<Entry<String, List<String[]>>> entryData = map.entrySet();
			entryData.forEach((e) -> {
				System.out.println("=======");
				System.out.println(e.getKey());
				for (String[] values : e.getValue()) {
					System.out.println(values[0] + "::" + values[1]);
				}
				System.out.println("=======");
			});

		} catch (Exception e) {

		}

	}

	public static void main1(String[] args) {
		try {

			Map<String, Long> map = Files.lines(Paths.get("E:\\files\\cities.txt"))
					.collect(Collectors.groupingBy((GroupByFileReading::getKey), Collectors.counting()));
			System.out.println(map);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main7(String[] args) {

		try {
			Map<String, List<String>> map = Files.lines(Paths.get("E:\\files\\cities.txt"))
					.collect(Collectors.groupingBy((a) -> {
						return a.split(",")[9].trim();
					}, Collectors.mapping((a) -> {
						return a.split(",")[8].trim();
					}, Collectors.toList())

					));

			System.out.println(map);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String getKey(String s) {
		return s.split(",")[9].trim();
	}



	}


