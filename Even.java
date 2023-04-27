import java.util.Scanner;

// Write a program weather a number is even or not

public class Even {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number to be check for even and odd");

        int num = in.nextInt();
        if ((num % 2) == 0) {
            System.out.println("The given number is even " + num);
        } else {
            System.out.println("The given number is odd " + num);
        }

        in.close();
    }
}