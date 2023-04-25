import java.util.Scanner;

public class MAin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number to sum");
        int a = input.nextInt();
        int b = input.nextInt();

        int sum = a + b;
        System.out.println("sum" + sum);
    }
}
