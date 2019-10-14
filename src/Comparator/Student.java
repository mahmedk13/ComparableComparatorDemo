package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student  {
	int rollno;  
	String name;  
	int age;  
	
	Student(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	} 
	
	/*
	 public static void main(String[] args) {
	 
		
	
	
	Comparator<Student> c = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {

			if(o1.rollno==o2.rollno) {
				return 0;
			}else if(o1.rollno<o2.rollno) {
				return 1;
			}else {
				return -1;
			}
		}

	};
	
	Student s1 = new Student(1, "Hasnain", 3);
	Student s2 = new Student(3, "Sanjida", 32);
	Student s3 = new Student(2, "Maroof", 31);
	List<Student> list = new ArrayList<Student>();
	list.add(s1);
	list.add(s2);
	list.add(s3);
	
	
	Collections.sort(list, c);


	for(Student s: list) {
		System.out.println(s.rollno+" "+s.name+" "+s.age);
	}
	}
	*/

}
