package Lab9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Faculty {
	private String name;
	private String address;
	private List<Course> courses;
	

	public Faculty(String name, String address, List<Course> courses) {
		this.name = name;
		this.address = address;
		this.courses = courses;
	}

	// Constructor and other methods

	// Getter methods
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public List<Course> getCourses() {
		return courses;
	}

	// Task 1.1
	public Course getMaxPracticalCourse() {
		// Implementation to find and return the practical course with the most students
		// ...

		// Example placeholder code:
		Course maxPracticalCourse = courses.get(0);
		for (Course course : courses) {
			if (course.getType().equals("practical")
					&& course.getStudents().size() > maxPracticalCourse.getStudents().size()) {
				maxPracticalCourse = course;
			}
		}
		return maxPracticalCourse;
	}

	// Task 1.2
	public Map<Integer, List<Student>> groupStudentsByYear() {
		Map<Integer, List<Student>> studentsByYear = new HashMap<>();

		// Implementation to group students by year
		// ...

		// Example placeholder code:
		for (Course course : courses) {
			for (Student student : course.getStudents()) {
				int year = student.getYear();
				if (!studentsByYear.containsKey(year)) {
					studentsByYear.put(year, new ArrayList<>());
				}
				studentsByYear.get(year).add(student);
			}
		}
		return studentsByYear;
	}

	// Task 1.3
	public Set<Course> filterCourses(String type) {
		Set<Course> filteredCourses = new TreeSet<>(Comparator.comparingInt(c -> c.getStudents().size()).reversed());

		// Implementation to filter and sort courses by type and the number of students
		// ...

		// Example placeholder code:
		for (Course course : courses) {
			if (course.getType().equals(type)) {
				filteredCourses.add(course);
			}
		}
		return filteredCourses;
	}
}
