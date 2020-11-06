package com.LocalDateTime;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;

public class LocalDateTime {
	public static void main(String[] args) {
         LocalDate now = LocalDate.now();
         System.out.println(now);
         LocalTime now1 = LocalTime.now();  
         System.out.println(now1);
         LocalTime now3 = LocalTime.of(23, 22);
         System.out.println(now3);
       Duration now2 = Duration.ofHours(12);
       System.out.println(now2);
       MonthDay month = MonthDay.now();  
       LocalDate date = month.atYear(1994);  
       System.out.println(month);
       
         
	}

	

}
