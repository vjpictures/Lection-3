package homework;
import java.util.*;

public class BelongingOfThePointToTheCircle {

    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);

        System.out.print("Enter the x-coordinate of the center of the circle: ");
        int x = con.nextInt();
        System.out.print("Enter the y-coordinate of the center of the circle: ");
        int y = con.nextInt();
        System.out.print("Enter the radius of the circle: ");
        int r = con.nextInt();
        System.out.print("Enter x-coordinate of the point: ");
        int a = con.nextInt();
        System.out.print("Enter y-coordinate of the point: ");
        int b = con.nextInt();

        if ((x - a) * (x - a) + (y - b) * (y - b) <= r * r)
            System.out.println("The point is inside or on the circle.");
        else
            System.out.println("The point is outside the circle.");
    }
}
