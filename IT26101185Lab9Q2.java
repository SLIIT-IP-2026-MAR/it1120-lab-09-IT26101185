import java.util.Scanner;

public class IT26101185Lab9Q2 {
    
    public static double circleArea(double radius) {
        double area;
        
        area = Math.PI * radius * radius;
        
        return area;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double radius;
        double area;
        
        System.out.print("Enter radius: ");
        radius = input.nextDouble();
        
        area = circleArea(radius);
        
        System.out.println("Area of the circle is: " + area);
    }
}
