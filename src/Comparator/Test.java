package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	
	

	public static void main(String[] args) {
		
		Student s1 = new Student(3, "Hasnain", 3);
		Student s2 = new Student(2, "Sanjida", 31);
		Student s3 = new Student(1, "Maroof", 32);
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		
		Collections.sort(list, new NameComparator());
		
		for(Student s: list) {
			System.out.println(s.rollno+" "+s.name+" "+s.age);
		}
		Collections.sort(list, new AgeComparator());
		for(Student s: list) {
			System.out.println(s.rollno+" "+s.name+" "+s.age);
		}

		
		
	}

}
