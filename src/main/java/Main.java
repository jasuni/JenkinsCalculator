import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        while (scan.hasNext()) {
            String function = scan.next();
            int num1 = scan.nextInt();
            String result;
            if(function.equalsIgnoreCase("add")) {
                int num2 = scan.nextInt();
                result = Integer.toString(calc.add(num1, num2));
            } else if(function.equalsIgnoreCase("subtract")) {
                int num2 = scan.nextInt();
                result = Integer.toString(calc.subtract(num1, num2));
            } else if(function.equalsIgnoreCase("multiply")) {
                int num2 = scan.nextInt();
                result = Integer.toString(calc.multiply(num1, num2));
            } else if(function.equalsIgnoreCase("divide")) {
                int num2 = scan.nextInt();
                result = Integer.toString(calc.divide(num1, num2));
            } else if(function.equalsIgnoreCase("fibonacciNumberFinder") ||
                    function.equalsIgnoreCase("fib")) {
                result = Integer.toString(calc.fibonacciNumberFinder(num1));
            } else if(function.equalsIgnoreCase("intToBinaryNumber") ||
                    function.equalsIgnoreCase("binary")) {
                result = calc.intToBinaryNumber(num1);
            } else {
                result = "invalid input";
            }
            System.out.println(result);
        }
    }

}
