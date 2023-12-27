package Package;

import java.util.*;

public class Institute {

	public String name = "";
	public Date dateOfCreation = null;
	public String adress = "";
	public List<ResearchAssociate> researchAssociates = null;
	public Collection<ResearchAssociate> attribute = new ArrayList<>();
	public Collection<ResearchAssociate> attribute2 = new ArrayList<>();

	public double age() {
		throw new UnsupportedOperationException();
	}

	public void changeAdress(String newAdress) {
		throw new UnsupportedOperationException();
	}

	public void addResearchAssociate(ResearchAssociate researchAssociate) {
		throw new UnsupportedOperationException();
	}

	public Institute(String name, Date dateOfCreation, String adress) {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}

}