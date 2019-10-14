package Comparable;
import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		
	
	Employee e1 = new Employee(3, "Maroof", 3000);
	Employee e2 = new Employee(1, "Hasnain", 2000);
	Employee e3 = new Employee(2, "Sanjida", 1000);

	Employee[] arrEmp = {e1, e2, e3};
	
	Arrays.sort(arrEmp);

	for(Employee e: arrEmp) {
		System.out.println(e.empId+" "+e.empName+" "+e.empSalary);
	}
	}
	

}
