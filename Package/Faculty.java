package Package;

import java.util.Date;

public class Faculty {

	public String name = "";
	public Date dateOfCreation = null;
	public String officeAdress = "";
	public Employee dean = null;

	public double age() {
		throw new UnsupportedOperationException();
	}

	public void changeOfficeAdress(String newOfficeAdress) {
		throw new UnsupportedOperationException();
	}

	public Faculty(Employee dean, String name, Date dateOfCreation, String officeAdress) {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}

}