package Comparable;

public class Employee implements Comparable<Employee> {
	
	int empId;
	String empName;
	int empSalary;

	
	Employee(int empId, String empName, int empSalary){
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
		
		
	}
	@Override
	public int compareTo(Employee e) {
		if(empId == e.empId) {
			return 0;
		}else if(empId>e.empId) {
			return 1;
		}else {
			return -1;
		}
		
		
	}

}
