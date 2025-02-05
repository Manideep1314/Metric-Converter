import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the numerical grade (0-100): ");
        int grade = scanner.nextInt();
        
        String letterGrade;
        
        // Control flow statements to determine letter grade
        if (grade >= 90 && grade <= 100) {
            letterGrade = "A";
        } else if (grade >= 80) {
            letterGrade = "B";
        } else if (grade >= 70) {
            letterGrade = "C";
        } else if (grade >= 60) {
            letterGrade = "D";
        } else if (grade >= 0) {
            letterGrade = "F";
        } else {
            letterGrade = "Invalid grade";
        }
        
        System.out.println("The letter grade is: " + letterGrade);
        scanner.close();
    }
}
