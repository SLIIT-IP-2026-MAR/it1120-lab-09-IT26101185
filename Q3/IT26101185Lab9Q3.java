public class IT26101185Lab9Q3 {
    
    public static int add(int num1, int num2) {
        int answer;
        
        answer = num1 + num2;
        
        return answer;
    }
    
    public static int multiply(int num1, int num2) {
        int answer;
        
        answer = num1 * num2;
        
        return answer;
    }
    
    public static int square(int num) {
        int answer;
        
        answer = num * num;
        
        return answer;
    }
    
    public static void main(String[] args) {
        
        int result1;
        int result2;
        
        result1 = square(add(multiply(3, 4), multiply(5, 7)));
        result2 = add(square(add(4, 7)), square(add(8, 3)));
        
        System.out.println("Result 1 is: " + result1);
        System.out.println("Result 2 is: " + result2);
    }
}
