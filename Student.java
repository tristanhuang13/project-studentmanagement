import java.util.*;

public class Student {
	// student creates a student with the name, id number, courses, balance, and athlete and then provides methods to change the student data
	private String name;
	private String idNumber;
	private ArrayList<String> courses = new ArrayList<String>();
	private String year;
	private int balance;
	private int amountPaid;
	private Random rand = new Random();
	private String[] courseOption;
	private String[] emergency;
	private boolean isAthlete;
	private String[] sportOption;
	private Scanner console1;
	// Constructor prompt user to enter student name and year
	public Student() {
		courseOption = new String[] {"US History", "Government/Economics", "AP Computer Science", "English 11H", "AP Biology", "Precalculus"};
		sportOption = new String[] {"Basketball", "Football", "Soccer", "Volleyball", "Tennis"};
		Scanner console = new Scanner(System.in);
		emergency = new String[3];
		console1 = new Scanner(System.in);
		System.out.print("Enter name: ");
		name = console.nextLine();
		System.out.println("Enter year: Freshman - 1, Sophomore - 2, Junior - 3, Senior - 4");
		year = console.nextLine();
		// checks if year is between 1 and 4
		while (!year.equals("1") && !year.equals("2") && !year.equals("3") && !year.equals("4")) {
			System.out.println("Please enter a number 1-4");
			year = console.nextLine();

		}
		System.out.println("Are you an athlete: Yes/No");
		String s = console.nextLine();
		// checks if student has entered Yes/No
		while (!s.equals("Yes") && !s.equals("No")) {
			System.out.println("Invalid option. Please enter either Yes or No");
			s = console.nextLine();
		}

		if (s.equals("Yes")) {
			isAthlete = true;
		}
		else {
			isAthlete = false;
		}
		createID();

	}
	// returns name of student
	public String name() {
		return name;
	}
	// Generate an ID
	public void createID() {
		int number = rand.nextInt(10000);
		idNumber = year + number;
	}
	// returns id number
	public String getID() {
		return idNumber;
	}
	// returns boolean for if they are an athlete
	public boolean getAthlete() {
		return isAthlete;
	}
	// Enroll in courses
	public void getCourses() {
		String course = "";
		while (!course.equals("Q")) {
			System.out.println("Enter Course: US History, Government/Economics, AP Computer Science, English 11H, AP Biology, Precalculus, and Q to quit");
			course = console1.nextLine();
			boolean b = false;
			for (int i = 0; i < courseOption.length; i++) {
				if (courseOption[i].equals(course)) {
					b = true;
				}
			}
			if (!course.equals("Q") && b) {
				courses.add(course);
			}
			else if (!b && !course.equals("Q")) {
				System.out.println("This course is not available. Please select another course.");
			}
		}
		balance = 600 * courses.size();
	}
	// allows a student to register for a sport if they are an athlete
	public void getSports() {
		String course = "";
		while(!course.equals("Q")) {
			System.out.println("Enter sports: Basketball, Football, Soccer, Volleyball, Tennis, Q to quit");
			course = console1.nextLine();
			boolean b = false;
			for (int i = 0; i < sportOption.length; i++) {
				if (sportOption[i].equals(course)) {
					b = true;
				}
			}
			if (!course.equals("Q") && b) {
				courses.add(course);
			}
			else if (!b && !course.equals("Q")) {
				System.out.println("This sport is not available. Please select another sport.");
			}
		}
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
	// removes a course that the student is currently registered in
	public void removeCourse(Scanner console) {
		String course = "";
		while (!course.equals("Q")) {
			System.out.println("Enter course to remove: " + courses);
			course = console.nextLine();
			int count = 0;
			for (int i = 0; i < courses.size(); i++) {
				if (courses.get(i).equals(course)) {
					count = i;
				}
			}
			if (courses.contains(course)) {
				courses.remove(count);
			}
			else if (!course.equals("Q")){
				System.out.println("This course is not available.");
			}
		}
	}
	public void getEmergency(Scanner console) {
		console.nextLine();
		System.out.print("Enter phone number: ");
		emergency[0] = console.nextLine();
		System.out.print("Enter emergency contact: ");
		emergency[1] = console.nextLine();
		System.out.print("Enter address: ");
		emergency[2] = console.nextLine();
		System.out.println(emergency[0] + " " + emergency[1] + " " + emergency[2]);
	}
	// Show Status
	public void showStatus() {
		System.out.println("Current student status is: ");
		System.out.println(idNumber);
		System.out.println("balance = " + balance + " amount paid = " + amountPaid);
		System.out.println("Courses = " + courses);
		if (isAthlete) {
			System.out.println("This person is an athlete.");
		}
		System.out.println(emergency[0] + " " + emergency[1] + " " + emergency[2]);
	}
}