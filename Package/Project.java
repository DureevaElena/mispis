package Package;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {

	public String name = "";
	public Date start = null;
	public Date end = null;

	public List<String> reports = new ArrayList<>();

	public double duration() {
		throw new UnsupportedOperationException();
	}

	public void createReport(ResearchAssociate researchAssociate) {
		throw new UnsupportedOperationException();
	}

	public Project(String name, Date start, Date end) {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}

}