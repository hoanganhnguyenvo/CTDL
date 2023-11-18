package Lab9;

import java.util.List;

public class Book extends Publication {
	private String field;
	private List<Chapter> chapters;

	// Constructor
	public Book(String title, int numberOfPages, int year, String author, double price, String field,
			List<Chapter> chapters) {
		super(title, numberOfPages, year, author, price);
		this.field = field;
		this.chapters = chapters;
	}

	// Getter methods
	public String getField() {
		return field;
	}

	public List<Chapter> getChapters() {
		return chapters;
	}

	// Method to determine the type of publication (override)
	@Override
	public String determinePublicationType() {
		return "Book";
	}
}
