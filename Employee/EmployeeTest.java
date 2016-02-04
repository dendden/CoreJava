import java.time.*;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Alex Matveenko",13400.00,2014,8,15);
		staff[1] = new Employee("Ira Kostogryz",12200.80,2012,02,19);
		staff[2] = new Employee("Pavel Breslavsky",18143.67,2015,11,9);
		
		for ( Employee e : staff ) {
			e.raiseSalary(5);
		}
		
		for ( Employee e : staff ) {
			System.out.println(e.displayProfile());
		}
	}
}

class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String aName, double aSalary, int year, int month, int day) {
		name = aName;
		salary = aSalary;
		hireDay = LocalDate.of(year,month,day);
	}
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public LocalDate getHireDay() {
		return hireDay;
	}
	
	public void raiseSalary(double percent) {
		double raise = salary * (percent / 100);
		salary += raise;
		salary = Math.round(salary*100) / 100.00;
	}
	
	public String displayProfile() {
		return "name: " + name + " // salary: " + salary + " // date hired: " + hireDay.toString(); 
	}
}
