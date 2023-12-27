package Package;

import java.util.Date;

public class Employee {

	public int ssNo = 0;
	public String name = "";
	public Date birthday = null;
	public String email = "";
	public int salary = 0;
	public int balance = 0;
	public static int counter = 0;

	public Employee() {
	}

	public double age() {
		throw new UnsupportedOperationException();
	}

	public void getSalary() {
		throw new UnsupportedOperationException();
	}

	public void changeSalary(int newSalary) {
		throw new UnsupportedOperationException();
	}

	public Employee(int ssNo, String name, Date birthday, String email, int salary) {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}

}