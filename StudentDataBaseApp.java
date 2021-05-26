import java.util.*;

// studentdatabaseapp uses the student.java class to create an arraylist of students with the qualities of a student
public class StudentDataBaseApp {
	private ArrayList<Student> array = new ArrayList<Student>();
	private Scanner console = new Scanner(System.in);
	// gets the student from the array list with a specified name
	public Student getStudent(String name) {
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if (s.name().equals(name)) {
				return s;
			}
		}
		return array.get(0);
	}
	// creates a new student and calls methods from Student.java to establish a new student
	public void newStudent() {
		System.out.println("Enter student data: ");
		Student s = new Student();
		s.getCourses();
		s.balance();
		s.tuition(console);
		s.getEmergency(console);
		if (s.getAthlete()) {
			s.getSports();
		}
		s.showStatus();
		array.add(s);
	}
	// finds student in array and changes courses
	public void changeCourses(String name) {
		Student s = getStudent(name);
		s.getCourses();
		if (s.getAthlete()) {
			s.getSports();
		}
	}
	// finds student in array and returns the id
	public void getID(String name) {
		Student s = getStudent(name);
		String id = s.getID();
		System.out.println("ID = " + id);
	}
	// allows a student to pay for tuition
	public void payTuition(String name) {
		Student s = getStudent(name);
		s.tuition(console);
	}
	// prints the student for a specified student
	public void printStudent(String name) {
		Student s = getStudent(name);
		s.showStatus();
	}
	// prints the balance for a specified student
	public void balance(String name) {
		Student s = getStudent(name);
		s.balance();
	}
	// removes a course that is resgistered to a student
	public void removeCourse(String name) {
		Student s = getStudent(name);
		s.removeCourse(console);
	}
	// removes a student with a specified name
	public void removeStudent(String name) {
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).name().equals(name)) {
				array.remove(i);
			}
		}
	}
	// displays all students that are in the arraylist
	public void display() {
		System.out.print("[" + array.get(0).name());
		for (int i = 1; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.print(", " + s.name());
		}
		System.out.print("]");
		System.out.println();
	}
}