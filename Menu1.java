import java.util.*;

public class Menu1 {
	public static void main(String[] args) {
		StudentDataBaseApp studentData = new StudentDataBaseApp();
		Scanner console = new Scanner(System.in);
		System.out.println("Enter number of students");
		int number = console.nextInt();
		int count = 0;
		while (count < number) {
			studentData.newStudent();
			count = count + 1;
		}
		String name = console.next();
		studentData.changeCourses(name);
		Student s = studentData.getStudent(name);
		s.showStatus();

		System.out.println(s.name());
		String letter = "";
		while (!letter.equals("Q")) {
			System.out.println("Enter name of student: ");
			letter = console.next();
			studentData.removeCourse(letter);

		}
	}
}