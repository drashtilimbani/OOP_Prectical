import java.util.Scanner;
import java.text.DecimalFormat;

public class pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();
        double feet = meters * 3.28084;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Distance in feet: " + df.format(feet));
    }
}

/*
Output:
Enter distance in meters: 5
Distance in feet: 16.40
*/
