package alex.woz;
import java.util.Scanner;

public class Inbetween {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y;

        System.out.println("Please Enter a Number > ");
        x = scan.nextInt();
        System.out.println("Please Enter Another Number > ");
        y = scan.nextInt();

        if(x > y + 1)
            for(int i = y + 1; i < x; i++)
                System.out.print(" " + i);
        else if(x + 1 < y)
            for(int i = x + 1; i < y; i++)
                System.out.print(" " + i);
        else
            System.out.println("There are no numbers between " + x + " and " + y);
    }
}
