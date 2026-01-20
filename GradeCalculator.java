// Abstraction: Hides the logic of grade calculation
public class GradeCalculator {
    
    // Method to calculate grade based on average
    public String calculateGrade(double average) {
        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
    
    // Method to display report card
    public void displayReportCard(Student student) {
        System.out.println("\n========== REPORT CARD ==========");
        student.displayDetails();
        double average = student.calculateAverage();
        String grade = calculateGrade(average);
        System.out.println("Average: " + String.format("%.2f", average));
        System.out.println("Grade: " + grade);
        System.out.println("=================================\n");
    }
}