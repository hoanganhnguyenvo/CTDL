package Lab9;

import java.util.List;

public class Catalog {
	private List<Publication> publications;

    // Constructor
    public Catalog(List<Publication> publications) {
        this.publications = publications;
    }

    // Getter method
    public List<Publication> getPublications() {
        return publications;
    }
}
