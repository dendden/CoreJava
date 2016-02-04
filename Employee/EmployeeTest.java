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
	private static int nextID = 1;
	
	private int id;
	private final String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String aName, double aSalary, int year, int month, int day) {
		id = nextID;
		name = aName;
		salary = aSalary;
		hireDay = LocalDate.of(year,month,day);
		nextID += 1;
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
		String profile = String.format("ID: %05d // name: %s // salary: %.2f // date hired: %s",
				this.id, this.name, this.salary, this.hireDay.toString());
		return profile;
	}
}
