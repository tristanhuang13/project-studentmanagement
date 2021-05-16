import java.util.*;

public class StudentDataBaseApp {
	private ArrayList<Student> array = new ArrayList<Student>();
	private Scanner console = new Scanner(System.in);
	
	public Student getStudent(String name) {
		Student student = new Student();
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if (s.name().equals(name)) {
				return s;
			}
		}
		return student;
	}
	public void newStudent() {
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
}