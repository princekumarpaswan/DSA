import java.util.Scanner;

public class Grater {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        {

            System.out.println("Enter first number");
            int a = in.nextInt();
            System.out.println("Enter Second number");
            int b = in.nextInt();

            if (a > b) {
                System.out.println("the gater number is " + a);
            }
            if (b > a) {
                System.out.println("the gater number is " + b);
            }
            if (a == b) {
                System.out.println("both numbers are equall " + a + " and " + b);
            }
            in.close();
        }
    }
}
