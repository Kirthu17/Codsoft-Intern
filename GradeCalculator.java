package codsoft;
import java.util.*;
public class GradeCalculator {	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter number of subjects: ");
		 int subjects = scanner.nextInt();
		 int totalMarks = 0;
		 for (int i = 1; i <= subjects; i++) {
		 System.out.print("Enter marks for subject " + i + ": ");
		 int marks = scanner.nextInt();
		 totalMarks += marks;
		 }
		 double average = totalMarks / (double) subjects;
		 char grade;
		 if (average >= 90) grade = 'A';
		 else if (average >= 80) grade = 'B';
		 else if (average >= 70) grade = 'C';
		 else if (average >= 60) grade = 'D';
		 else grade = 'F';
		 System.out.println("Total Marks: " + totalMarks);
		 System.out.println("Average Percentage: " + average);
		 System.out.println("Grade: " + grade);
	}
}

	
