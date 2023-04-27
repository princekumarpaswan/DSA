import java.util.Scanner;

// Take a Nme as input and print a greeting message for that particular name

public class name {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name ");
        String name = in.nextLine();
        System.out.println("Hello " + name + " you are amzing");
        in.close();
    }
}
