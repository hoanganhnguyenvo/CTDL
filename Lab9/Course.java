package Lab9;

import java.util.List;

public class Course {

	private int id;
	private String title;
	private String type;
	private List<Student> students;
	private String lecturer;

	public Course(int id, String title, String type, List<Student> students, String lecturer) {
		this.id = id;
		this.title = title;
		this.type = type;
		this.students = students;
		this.lecturer = lecturer;
	}

	// Constructor and other methods

	// Getter methods
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getType() {
		return type;
	}

	public List<Student> getStudents() {
		return students;
	}

	public String getLecturer() {
		return lecturer;
	}
}
