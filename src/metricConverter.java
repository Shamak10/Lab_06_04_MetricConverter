import java.util.Scanner;
public class metricConverter {
    public static void main(String[] args) {//Creating scanner to take input from the user
        Scanner scanner = new Scanner("1000");//It is asking for the user input
        System.out.print("Enter the length in meters: ");
        if (scanner.hasNextDouble()) {
            double meters = scanner.nextDouble();//Taking meters as an input
            if (meters >= 0) {//meter cannot be less than zero
                double miles = meters / 1609.344;
                double feet = meters / 0.3048;
                double inches = meters / 0.0254;
                System.out.println(meters + " meters");
                System.out.println(miles + " miles");
                System.out.println(feet + " feet");
                System.out.println(inches + " inches");
            } else {
                System.err.println("Invalid input. Length cannot be negative.");//Invalid input if the value less than 0
            }
        }
    }
}
