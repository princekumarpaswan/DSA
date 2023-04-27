import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        {
            System.out.println("Enter a number");
            int a = in.nextInt();

            int num1 = 0, num2 = 1;

            int counter = 0;

            // Iterate till counter is N
            while (counter < a) {

                // Print the number
                System.out.print(num1 + " ");

                // Swap
                int num3 = num2 + num1;
                num1 = num2;
                num2 = num3;
                counter = counter + 1;
            }
        }
    }
}
