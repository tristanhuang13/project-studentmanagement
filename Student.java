import java.util.*;

public class Student {
	private String name;
	private String idNumber;
	private ArrayList<String> courses = new ArrayList<String>();
	private String year;
	private int balance;
	private int amountPaid;
	private Random rand = new Random();
	private String[] courseOption;
	// Constructor prompt user to enter student name and year
	public Student() {
		courseOption = new String[] {"US History", "Government/Economics", "AP Computer Science", "English 11H", "AP Biology", "Precaculus"};
		Scanner console = new Scanner(System.in);
		System.out.print("Enter name: ");
		name = console.nextLine();
		System.out.println("Enter year: Freshman - 1, Sophomore - 2, Junior - 3, Senior - 4");
		year = console.nextLine();
		getID();

	}
	public String name() {
		return name;
	}
	// Generate an ID
	public String getID() {
		int number = rand.nextInt(10000);
		idNumber = year + number;
		return idNumber;
	}
	// Enroll in courses
	public void getCourses(Scanner console) {
		String course = "";
		while (!course.equals("Q")) {
			System.out.println("Enter Course: US History, Government/Economics, AP Computer Science, English 11H, AP Biology, Precalculus, and Q to quit");
			course = console.nextLine();
			boolean b = false;
			for (int i = 0; i < courseOption.length; i++) {
				if (courseOption[i].equals(course)) {
					b = true;
				}
			}
			if (!course.equals("Q") && b) {
				courses.add(course);
			}
			else if (!b){
				System.out.println("This course is not available. Please select another course.");
			}
		}
		balance = 600 * courses.size();
	}
	// View Balance
	public void balance() {
		System.out.println("Balance is " + balance);
	}
	// Pay Tuition
	public void tuition(Scanner console) {
		System.out.print("Enter amount to pay: ");
		int number = console.nextInt();
		amountPaid = amountPaid + number;
		balance = balance - number;
		System.out.println("Amount left = " + balance);
		System.out.println("Amount paid = " + amountPaid);
	}
	// Show Status
	public void showStatus() {
		System.out.println("Current student status is: ");
		System.out.println("balance = " + balance + " amount paid = " + amountPaid);
		System.out.println("Courses = " + courses);
	}
}