import java.util.Scanner;

public class ptr {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Principal amount");
        int princial = in.nextInt();
        System.out.println("Enter Time in year");
        int time = in.nextInt();
        System.out.println("Enter Principal Rate");
        int rate = in.nextInt();
        int si = princial * (1 + (rate * time));
        System.out.println("Simple Intrest = " + si);
        in.close();
    }
}