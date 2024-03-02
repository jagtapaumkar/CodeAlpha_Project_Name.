package codeaplha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentGradeGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");

        int numStudents = scanner.nextInt();

        // Declare ArrayLists to store student data
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Double> studentGrades = new ArrayList<>();

        // Input student data
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames.add(scanner.next());

            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            studentGrades.add(scanner.nextDouble());
        }

        // Compute average, highest, and lowest grades
        double sum = 0;
        double highest = Collections.max(studentGrades);
        double lowest = Collections.min(studentGrades);

        for (double grade : studentGrades) {
            sum += grade;
        }

        double average = sum / numStudents;

        // Display results
        System.out.println("\nHighest Grade: " + highest);
        System.out.println("Average Grade: " + average);
        System.out.println("Lowest Grade: " + lowest);

        // Close the scanner
        scanner.close();
    }
}