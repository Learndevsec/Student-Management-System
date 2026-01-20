// Encapsulation: Private fields with public getters/setters
public class Student {
    // Attributes
    private String name;
    private int rollNumber;
    private double mathMarks;
    private double scienceMarks;
    private double englishMarks;
    
    // Constructor
    public Student(String name, int rollNumber, double mathMarks, 
                   double scienceMarks, double englishMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.mathMarks = mathMarks;
        this.scienceMarks = scienceMarks;
        this.englishMarks = englishMarks;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }
    
    public double getMathMarks() {
        return mathMarks;
    }
    
    public double getScienceMarks() {
        return scienceMarks;
    }
    
    public double getEnglishMarks() {
        return englishMarks;
    }
    
    // Method to calculate average
    public double calculateAverage() {
        return (mathMarks + scienceMarks + englishMarks) / 3.0;
    }
    
    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Math: " + mathMarks);
        System.out.println("Science: " + scienceMarks);
        System.out.println("English: " + englishMarks);
    }
}