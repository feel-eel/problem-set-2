import java.util.Scanner;

/**
 * INSTRUCTIONS.
 * 
 * Problem Set 2 will test your knowledge and understanding of arithmetic
 * operators and String concatenation. You'll be asked use the Scanner to
 * read user input from the keyboard, and use this input later to compute
 * and print certain required values to the console. All of this is explained
 * (and demonstrated, when appropriate) in the README file.
 */

public class ProblemSet2 {
	
	/**
	 * You need not modify the main method.
	 */
	
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}
	
	public void sayHello() {
		Scanner in = new Scanner(System.in);
		System.out.println("What's your first name?");
		String fName = in.nextLine();
		
		System.out.println("What's your last name?");
		String lName = in.nextLine();
		
		System.out.println("Hello " + fName + " " + lName + "!" );
	}
	
	public void gradeMe() {
		Scanner in = new Scanner(System.in);
		System.out.println("What's your homework grades?");
		double homeworkone = in.nextDouble();
		double homeworktwo = in.nextDouble();
		double homeworkthree = in.nextDouble();

		
		System.out.println("What's your quiz grades?");
		double quizone = in.nextDouble();
		double quiztwo = in.nextDouble();
		double quizthree = in.nextDouble();
		
		
		System.out.println("What's your test grades?");
		double testone = in.nextDouble();
		double testtwo = in.nextDouble();
		double testthree = in.nextDouble();
		
		
		double finalGrade = (((homeworkone + homeworktwo + homeworkthree) / 3) * .15) +
				+ (((quizone + quiztwo + quizthree) /3) * .30)
				+ (((testone + testtwo + testthree) /3) * .55);
		System.out.println("Your final grade is " + finalGrade);
	}
	
	public void groupUs() {
		Scanner in = new Scanner(System.in);
		System.out.println("How many teachers are going on the trip?");
		int teachers = in.nextInt();
		
		System.out.println("How many students are going on the trip?");
		int bus;
		int students = in.nextInt();
		int remainder = (teachers + students) % 47;
		bus = ((teachers + students) % 47 == 0) ?  ((teachers + students)/ 47) : ((teachers + students)/47 + 1); 
		if ((teachers + students) % 47 == 0) {
			System.out.println("You need " + bus + " buses. The buses will all have 47 people.");
		} else {
		System.out.println("You need " + bus + " buses. The last bus will have " + remainder + " people.");
		}

	}
	
	public void info() {
		Scanner in = new Scanner(System.in);
		System.out.println("What's your first name?");
		String fName = in.nextLine();
		
		System.out.println("What's your last name?");
		String lName = in.nextLine();
		
		System.out.println("What's your grade?");
		String grade = in.nextLine();
		
		System.out.println("What's your age?");
		String age = in.nextLine();
		
		System.out.println("What's your hometown?");
		String hometown = in.nextLine();
		
		System.out.println("NAME     : " + fName + " " + lName);
		System.out.println("GRADE    : " + grade); 
		System.out.println("AGE      : " + age);
		System.out.println("HOMETOWN : " + hometown);
		System.out.println(" ");
	}
	
	public void initials() {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your first name: ");
		String fName = in.nextLine();
		
		System.out.print("Please enter your middle name: ");
		String mName = in.nextLine();
		
		System.out.print("Please enter your last name: ");
		String lName = in.nextLine();
		in.close();
		
		System.out.println("Your initials are " + fName.charAt(0) + mName.charAt(0) + lName.charAt(0) + ".");
	}
}