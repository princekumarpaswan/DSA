import java.util.Scanner;

public class palindron {

    public static void main(String args[]) {
        int x, number, y = 0, temp = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number: ");
        number = s.nextInt();
        x = number;

        
        while (number > 0) {
            x = number % 10;
            System.out.println(x);
            number = number / 10;
            System.out.println(number);
            temp = temp * 10 + x;
            System.out.println(temp);
        }
        if (temp == y) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }
}
