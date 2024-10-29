
/**
 * this class will allow the user to enter their optimal 
 * sleep time and sleep history, and will then generate a 
 * report for them.
 * @author Omar Habib ID:3742418
 */
import java.util.Scanner;

public class SleepTracker {
    public static void main(String[] args) {
        System.out.print("Please enter your optimal sleep time (in hours): ");
        Scanner sc = new Scanner(System.in);
        double optimal = sc.nextDouble();
        int counter = 0;
        int below = 0;
        double sum = 0;
        double lowest = 0;

        System.out.println("Next, enter your recorded sleep history values (in hours)");
        System.out.println("Enter a negative number when done:");
        double history = sc.nextDouble();

        if (history >= 0) {
            below++;
            lowest = history;
        }
        while (history >= 0) {
            sum += history;
            counter++;
            history = sc.nextDouble();

            if (history < lowest && history >= 0) {
                lowest = history;
            }
            if (history < optimal && history >= 0) {
                below++;
            }
        }
        double average = sum / counter;
        System.out.println("Your sleep report:");
        System.out.println(counter + " nights total");
        System.out.println(below + " nights below your optimal sleep time");
        System.out.println("Lowest sleep time: " + lowest);
        System.out.println("Average sleep time: " + average);

    }
}
