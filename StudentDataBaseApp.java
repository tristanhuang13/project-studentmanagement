import java.util.*;

public class StudentDataBaseApp {
	private ArrayList<Student> array = new ArrayList<Student>();
	private Scanner console = new Scanner(System.in);
	
	public Student getStudent(String name) {
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if (s.name().equals(name)) {
				return s;
			}
		}
		return array.get(0);
	}
	public void newStudent() {
		System.out.println("Enter student data: ");
		Student s = new Student();
		s.getCourses(console);
		s.balance();
		s.tuition(console);
		s.showStatus();
		array.add(s);
	}
	public void changeCourses(String name) {
		Student s = getStudent(name);
		s.getCourses(console);
	}
	public void getID(String name) {
		Student s = getStudent(name);
		String id = s.getID();
		System.out.println("ID = " + id);
	}
	public void payTuition(String name) {
		Student s = getStudent(name);
		s.tuition(console);
	}
	public void printStudent(String name) {
		Student s = getStudent(name);
		s.showStatus();
	}
	public void balance(String name) {
		Student s = getStudent(name);
		s.balance();
	}
	public void removeCourse(String name) {
		Student s = getStudent(name);
		s.removeCourse(console);
	}
	public void removeStudent(String name) {
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).name().equals(name)) {
				array.remove(i);
			}
		}
	}
	public void display() {
		System.out.print("[" + array.get(0).name());
		for (int i = 1; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.print(", " + s.name());
		}
		System.out.print("]");
	}
}