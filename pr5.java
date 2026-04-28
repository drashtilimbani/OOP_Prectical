import java.util.Scanner;

public class pr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sides
        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        // Check triangle validity
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            
            // Calculate semi-perimeter
            double s = (a + b + c) / 2;

            // Heron's formula
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("Triangle is valid.");
            System.out.println("Area of triangle = " + area);
        } else {
            System.out.println("Invalid triangle! The given sides cannot form a triangle.");
        }

        sc.close();
    }
}
