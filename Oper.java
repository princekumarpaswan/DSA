


import java.util.Scanner;

public class Oper {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = in.nextInt();
        System.out.println("Enter Second number");
        int b = in.nextInt();
        System.out.println("Enter a operater (+, -, *, /)");
        char op = in.next().charAt(0);

        if (op == '+') {
            System.out.println("The sum " + (a + b));
        }
        if (op == '-') {
            System.out.println("The sub " + (a - b));
        }
        if (op == '*') {
            System.out.println("The multiple " + (a * b));
        }
        if (op == '/') {
            System.out.println("The division " + (a / b));
        }
        if (op != '+' && op != '-' && op != '*' && op != '/') {
            System.out.println("You have given wrong input");
        }

        in.close();
    }

}
