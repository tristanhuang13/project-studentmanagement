import java.util.*;

public class Test6 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		String number = console.nextLine();
		int number1 = Integer.parseInt(number);
		int count = 0;
		StudentDataBaseApp studentDatabase = new StudentDataBaseApp();
		while (count < number1) {
			studentDatabase.newStudent();
			count = count + 1;
		}
		String letter = "";
		String name = "";
		while (!name.equals("Q")) {
			System.out.print("Enter student's name: ");
			name = console.nextLine();
			if (name.equals("Q")) {
				break;
			}
			while (!letter.equals("Q")) {
				System.out.println("Enter a to change courses, b to get ID, c to payTuition, d to create or remove students, e to printStudent, f to display, Q to quit.");
				letter = console.nextLine();
				if (letter.equals("a")) {
					changeCourses(name);
				}
				else if (letter.equals("b")) {
					studentDatabase.getID(name);
				}
				else if (letter.equals("c")) {
					payTuition1(name);
				}
				else if (letter.equals("d")) {
					addStudent(name);
				}
				else if (letter.equals("e")) {
					studentDatabase.printStudent(name);
				}
				else if (letter.equals("f")) {
					studentDatabase.display();
				}
			}
		}
	}
	public static void changeCourses(String name) {
		StudentDataBaseApp studentDatabase = new StudentDataBaseApp();
		String letter = "";
		Scanner console = new Scanner(System.in);
		while (!letter.equals("Q")){
			System.out.println("Enter a to change courses, b to remove courses, c to print student, and Q to quit");
			letter = console.nextLine();
			if (letter.equals("a")) {
				studentDatabase.changeCourses(name);
			}
			else if (letter.equals("b")) {
				studentDatabase.removeCourse(name);
			}
			else if (letter.equals("c")) {
				studentDatabase.printStudent(name);
			}
		}
	}
	public static void addStudent(String name) {
		StudentDataBaseApp studentDatabase = new StudentDataBaseApp();
		String letter = "";
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a to add student, b to remove student");
		letter = console.nextLine();
		if (letter.equals("a")) {
			studentDatabase.newStudent();
		}
		else if (letter.equals("b")) {
			studentDatabase.removeStudent(name);
		}
	}
	public static void payTuition1(String name) {
		StudentDataBaseApp studentDatabase = new StudentDataBaseApp();
		String letter = "";
		Scanner console = new Scanner(System.in);
		System.out.print("Your balance is: ");
		studentDatabase.balance(name);
		while (!letter.equals("Q")) {
			System.out.println("Enter a to view balance, b to pay tuition, c to printStudent, and Q to quit");
			letter = console.nextLine();
			if (letter.equals("a")) {
				studentDatabase.balance(name);
			}
			else if (letter.equals("b")) {
				studentDatabase.payTuition(name);
			}
			else if (letter.equals("c")) {
				studentDatabase.printStudent(name);
			}
		}

	}
}