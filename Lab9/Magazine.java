package Lab9;

public class Magazine extends Publication {
	private String magazineName;

    // Constructor
    public Magazine(String title, int numberOfPages, int year, String author, double price, String magazineName) {
        super(title, numberOfPages, year, author, price);
        this.magazineName = magazineName;
    }

    // Getter method
    public String getMagazineName() {
        return magazineName;
    }

    // Method to determine the type of publication (override)
    @Override
    public String determinePublicationType() {
        return "Magazine";
    }
}



