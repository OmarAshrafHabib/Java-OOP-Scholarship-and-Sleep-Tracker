
/**
 * this class can be used to determine a student’s scholarship eligibility
 * @author Omar Habib ID:374241
 */
import java.util.Scanner;

public class ScholarshipAssessment {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Enter the number of credit hours completed in the last year: ");
        Scanner sc = new Scanner(System.in);
        int credit = sc.nextInt();
        double gpa;
        int clubs;
        double base = 500;
        double add = 0;
        double total = base + add;

        while (credit < 0) {
            System.out.println("Credit hours must be non-negative. ");
            System.out.print("Enter the number of credit hours completed in the last year: ");
            credit = sc.nextInt();
        }
        if (credit >= 24) {
            System.out.print("Enter your GPA:");
            gpa = sc.nextDouble();
            while (gpa < 0) {
                System.out.print("Invalid GPA. Enter a non-negative GPA: ");
                gpa = sc.nextDouble();
            }
            if (gpa >= 3.0 && gpa < 3.7) {
                add = add + 200;
            } else if (gpa >= 3.7) {
                add = add + 400;
                total = total + add;
            }
            if (gpa >= 2.7) {
                System.out.print(
                        "Enter the number of official university clubs, societies, or teams in which you participated last year:");
                clubs = sc.nextInt();
                if (clubs >= 3) {
                    add = add + 100;
                    total = total + add;

                }
                while (clubs < 0) {
                    System.out.print(
                            "Invalid Number Cannot be Negative, Enter the number of official university clubs, societies, or teams in which you participated last year: ");
                    clubs = sc.nextInt();
                }
                System.out.print("Do you have demonstrated financial need (yes or no)? ");
                String finance = sc.next();
                while (!(finance.equals("yes")) && !(finance.equals("no"))) {
                    System.out.print("Enter yes or no: ");
                    finance = sc.next();
                }
                if (finance.equals("yes")) {
                    total = (base + add) * 2;
                }
                System.out.println("You are eligible for a scholarship of " + total);
            } else if (gpa < 2.7) {
                System.out.println("Sorry, you are not eligible for a scholarship.");
            }
        } else if (credit < 24) {
            System.out.print("Have you participated in a university co-op program in the last year (yes or no)? ");
            String userInput1 = sc.next();
            while (!(userInput1.equals("yes")) && !(userInput1.equals("no"))) {
                System.out.print("Enter yes or no: ");
                userInput1 = sc.next();
            }
            if (userInput1.equals("yes")) {
                System.out.print("Enter your GPA:");
                gpa = sc.nextDouble();
                while (gpa < 0) {
                    System.out.print("Invalid GPA. Enter a non-negative GPA: ");
                    gpa = sc.nextDouble();
                }
                if (gpa >= 3.0 && gpa < 3.7) {
                    add = add + 200;
                    total = total + add;
                } else if (gpa >= 3.7) {
                    add = add + 400;
                    total = total + add;
                }
                if (gpa >= 2.7) {
                    System.out.print(
                            "Enter the number of official university clubs, societies, or teams in which you participated last year: ");
                    clubs = sc.nextInt();
                    if (clubs >= 3) {
                        add = add + 100;
                        total = total + add;

                    }
                    while (clubs < 0) {
                        System.out.print(
                                "Invalid Number Cannot be Negative, Enter the number of official university clubs, societies, or teams in which you participated last year: ");
                        clubs = sc.nextInt();
                    }
                    System.out.print("Do you have demonstrated financial need (yes or no)? ");
                    String finance = sc.next();
                    while (!(finance.equals("yes")) && !(finance.equals("no"))) {
                        System.out.print("Enter yes or no: ");
                        finance = sc.next();
                    }
                    if (finance.equals("yes")) {
                        total = (base + add) * 2;
                    }
                    System.out.println("You are eligible for a scholarship of " + total);

                } else if (gpa < 2.7) {
                    System.out.println("Sorry, you are not eligible for a scholarship.");
                }
            } else if (userInput1.equals("no")) {
                System.out.println("Sorry, you are not eligible for a scholarship.");
            }
        }
        System.out.println();

    }

}
