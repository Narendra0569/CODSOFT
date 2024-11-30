package Codsoft;



// 	************ STUDENT GRADE CALCULATOR **************


import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of subjects: ");
		int numSubjects = sc.nextInt();
		int[] marks = new int[numSubjects];
		int totalMarks = 0;
		
		for(int i=0;i<numSubjects;i++) {
			System.out.print("Enter marks for subjects "+ ""+(i+1)+":");
			marks[i] = sc.nextInt();
			totalMarks +=marks[i];
		}
		
		double average = (double)totalMarks/numSubjects;
		char grade;
		
		if(average >= 90) {
			grade = 'A';
		}
		else if(average >= 75){
			grade = 'B';
		}
		else if(average >= 50) {
			grade = 'C';
		}
		else {
			grade = 'D';
		}
		
		System.out.println("Total Marks: "+totalMarks);
		System.out.println("Average percentage: "+average+"%");
		System.out.println("Grade: "+grade);

	}

}
