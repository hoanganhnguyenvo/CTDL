package Lab9;

public class Publication {
	private String title;
	private int numberOfPages;
	private int year;
	private String author;
	private double price;

	// Constructor
	public Publication(String title, int numberOfPages, int year, String author, double price) {
		this.title = title;
		this.numberOfPages = numberOfPages;
		this.year = year;
		this.author = author;
		this.price = price;
	}

	// Getter methods
	public String getTitle() {
		return title;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public int getYear() {
		return year;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	// Method to determine the type of publication
	public String determinePublicationType() {
		return "Publication";
	}

}
