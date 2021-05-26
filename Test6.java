import java.util.*;

public class Test6 {
	// test6 uses studentdatabase to access each student and changes a student from the list
	public static StudentDataBaseApp studentDatabase = new StudentDataBaseApp();
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		String number = console.nextLine();
		int number1 = Integer.parseInt(number);
		int count = 0;
		// creates a certain number of new students
		while (count < number1) {
			studentDatabase.newStudent();
			count = count + 1;
		}
		// gets name from user and checks to see if it is equal to Q
		String name = "";
		while (!name.equals("Q")) {
			System.out.print("Enter student's name: ");
			name = console.nextLine();
			String letter = "";
			if (name.equals("Q")) {
				break;
			}
			// for a certain person, the loop can either use studentdatabase to change courses, print ID, pay tuition, create and remove students, or print student
			while (!letter.equals("Q")) {
				System.out.println("Enter a to change courses, b to get ID, c to payTuition, d to create or remove students, e to printStudent, f to display, Q to quit.");
				letter = console.nextLine();
				// changes courses for someone in the list of people
				if (letter.equals("a")) {
					changeCourses(name);
				}
				// gets a person from a list of people and prints their ID
				else if (letter.equals("b")) {
					studentDatabase.getID(name);
				}
				// allows user to pay for their tuition
				else if (letter.equals("c")) {
					payTuition1(name);
				}
				// allows user to create and remove students
				else if (letter.equals("d")) {
					addStudent(name);
				}
				// prints student data
				else if (letter.equals("e")) {
					studentDatabase.printStudent(name);
				}
				// displays all students
				else if (letter.equals("f")) {
					studentDatabase.display();
				}
			}
		}
	}
	// allows user to change courses and print student
	public static void changeCourses(String name) {
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
	// allows user to add a new student or remove the student entered
	public static void addStudent(String name) {
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
	// allows user to pay for tuition, view balance, and print student
	public static void payTuition1(String name) {
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