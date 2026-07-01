import java.util.Scanner;

public class IT26101185Lab9Q4 {
    
    public static double calcFinalMark(double assignmentMark, double examMark) {
        double finalMark;
        
        finalMark = (assignmentMark * 30 / 100) + (examMark * 70 / 100);
        
        return finalMark;
    }
    
    public static char findGrades(double finalMark) {
        char grade;
        
        if (finalMark >= 75) {
            grade = 'A';
        } else if (finalMark >= 60) {
            grade = 'B';
        } else if (finalMark >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        
        return grade;
    }
    
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-15s %-15.2f %c\n", name, finalMark, grade);
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];
        
        double assignmentMark;
        double examMark;
        int i;
        
        for (i = 0; i < 5; i++) {
            
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.next();
            
            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            assignmentMark = input.nextDouble();
            
            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            examMark = input.nextDouble();
            
            finalMarks[i] = calcFinalMark(assignmentMark, examMark);
            grades[i] = findGrades(finalMarks[i]);
            
            System.out.println();
        }
        
        System.out.printf("%-15s %-15s %s\n", "Name", "Final Mark", "Grade");
        
        for (i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
    }
}
