package com.UserDefinedObject;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CityTest {
	public static void main(String[] args) {
		City city = new City();
		try {
			  Files .lines(Paths.get("F:\\Java Txt//cities.txt"))
		 .filter((s)->{
			String[] str= s.split(",");
			if(str[9].trim().equalsIgnoreCase("WA"))return true;
			else return false;
		 }).forEach((p)->{
			 System.out.println(p);
		 });
		}catch(Exception e) { 
			e.printStackTrace(); }
		
    }
}


