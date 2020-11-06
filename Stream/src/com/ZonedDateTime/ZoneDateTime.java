package com.ZonedDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTime {
	public static void main(String[] args) {
		ZonedDateTime date1 = ZonedDateTime.now();
		System.out.println(date1);
		
		ZoneId id = ZoneId.of("Asia/Calcutta");
		System.out.println(id);
		
	}		

}
