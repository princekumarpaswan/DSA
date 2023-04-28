import java.util.Scanner;

public class Currency {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        {
            System.out.println("Enter the Amoutn in Rs");
            double rs = in.nextInt();
            System.out.println("The doller is taken 81.1");
            // int doller = 81.1;
            double fin = (rs / 81);
            System.out.println("The final amout is = " + fin);
        }
        in.close();
    }
}
