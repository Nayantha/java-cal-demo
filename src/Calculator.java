import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int x, y, answer;
        String operator;
        System.out.println("Type a number:");
        x = myObj.nextInt();

        System.out.println("Type another number:");
        y = myObj.nextInt();

        System.out.println("What do you want to do? (add + ,divide / ,multiply * ,subtract - )? :");
        operator = myObj.next();

        switch (operator) {
            case "+":
            case "add":
                answer = x + y;
                System.out.println("Sum is: " + answer);
                break;
            case "-":
            case "subtract":
                answer = x - y;
                System.out.println("Difference is: " + answer);
                break;
            case "*":
            case "multiply":
                answer = x * y;
                System.out.println("Product is: " + answer);
                break;
            case "/":
                if (y != 0) {
                    answer = x / y;
                    System.out.println("Sum is: " + answer);
                } else {
                    System.out.println("I am not able to divide a number by 0");
                }
                break;
            default:
                System.out.println("Sorry we do not provide that service.");
                break;
        }
    }
}
