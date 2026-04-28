import java.util.Scanner;

public class pr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter your weight in pounds: ");
        double weightPounds = sc.nextDouble();

        System.out.print("Enter your height in inches: ");
        double heightInches = sc.nextDouble();

        // Conversion
        double weightKg = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;

        // BMI Calculation
        double bmi = weightKg / (heightMeters * heightMeters);

        // Output
        System.out.println("Your BMI is: " + bmi);

        sc.close();
    }
}
