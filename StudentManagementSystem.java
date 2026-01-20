import java.util.Scanner;

public class StudentManagementSystem {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeCalculator gradeCalculator = new GradeCalculator();
        
        System.out.println("===== Student Management System =====\n");
        
        // Input student details
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        
        System.out.print("Enter Math marks: ");
        double mathMarks = scanner.nextDouble();
        
        System.out.print("Enter Science marks: ");
        double scienceMarks = scanner.nextDouble();
        
        System.out.print("Enter English marks: ");
        double englishMarks = scanner.nextDouble();
        
        // Create student object
        Student student = new Student(name, rollNumber, mathMarks, 
                                     scienceMarks, englishMarks);
        
        // Display report card
        gradeCalculator.displayReportCard(student);
        
        scanner.close();
    }
}