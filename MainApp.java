import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student marks: ");
        double marks = input.nextDouble();

        Student s1 = new Student(name, marks);
        GradeCalculator gc = new GradeCalculator();

        String grade = gc.calculateGrade(marks);

        System.out.println("\n--- Student Details ---");
        s1.displayDetails();
        System.out.println("Grade: " + grade);
    }
}