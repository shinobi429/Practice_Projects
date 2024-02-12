import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        //stores 2 numbers
        double num1, num2;

        //takes input from user(keyboard)
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        // Take the inputs
        num1 = sc.nextDouble();
        System.out.println("Enter second number:");
        num2 = sc.nextDouble();
 
        System.out.println("Enter the operator (+,-,*,/) :");
 
        char op = sc.next().charAt(0);
        double ans = 0;

        switch (op) {
            //add 2 numbers
            case '+':
                ans = num1 + num2;
                System.out.println("=================" + "you are trying to perform '+'" + "=================");
                System.out.println("hello, iam \"Jignesh\".");
                break;
            
            //substract 2 numbers
            case '-':
                ans = num1 - num2;
                System.out.println("=================" + "you are trying to perform '-' " + "=================");
                break;

            //multiply 2 numbers
            case '*':
                ans = num1 * num2;
                System.out.println("=================" + "you are trying to perform '*' "+ "=================");
                break;
            
            //divide 2 numbers
            case '/':
                ans = num1 / num2;
                System.out.println("=================" + "you are trying to perform '/' "+ "=================");
                break;
        
            default:
                System.out.println("=================" + "you have enterted wrong input"+ "=================");
                break;
        }
        if(op=='/'&& num2 == 0){
                throw new ArithmeticException("=================" + "Division by zero is not allowed"+ "=================");
        }else{
            System.out.println(num1 + " " + op + " " + num2+ " = " + ans);
            }        
    }    
}