package com.UserDefinedObject;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
	public static void main(String[] args) {
		Student std1 = new Student (1,"Slokam1",65,"mba",23);
		Student std2 = new Student (2,"Slokam2",75,"mba",22);
		Student std3 = new Student (3,"Slokam3",85,"mba",24);
		Student std4 = new Student (4,"Slokam4",95,"mba",25);
		Student std5 = new Student (5,"Slokam5",55,"mba",26);
		
		List<Student> stdList = new ArrayList<Student>();
		stdList.add(std1);
		stdList.add(std2);
		stdList.add(std3);
		stdList.add(std4);
		stdList.add(std5);
		
		/*stdList.stream().filter((m)->{
			if(m.getMarks()>=65) return true;
			else  return false;
		}).filter((a)->{
			if(a.getAge()>=23) return true;
			else return false;
		}).forEach((d)->{
			System.out.println(d.getId()+","+d.getName()+","+d.getMarks()+","+d.getQual()+","+d.getAge());
		});*/
		stdList.stream().map((b)->{
			if(b.getMarks()<55) {
				b.setStatus("fail");
			}
			else if(b.getMarks()>=55 & b.getMarks()<95) {
				 b.setStatus("pass");
			}
			return b;
		}).forEach((b)->{
			System.out.println(b.getId()+","+b.getStatus()+","+b.getName()+","+b.getMarks()+","+b.getQual()+","+b.getAge());
		});
	}

}
