import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //argument for Q1
        int result = compareNumbers();
        System.out.println("The greatest number is: " + result);

        ///argument for Q2
        int num14 = 877;
        int num24 = 99;
        int num34 = 01;
        double[] result4 = addSumAndAverage(num14, num24, num34);
        System.out.println("The sum is: " + result4[0]);
        System.out.println("The average is: " + result4[1]);

    }

    // Q1 with catch and try
    public static int compareNumbers() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            System.out.print("Enter the third number: ");
            int num3 = scanner.nextInt();

            if (num1 > num2) {
                if (num1 > num3) {
                    return num1;
                } else {
                    return num3;
                }
            } else {
                if (num2 > num3) {
                    return num2;
                } else {
                    return num3;
                }
            }
        } catch (InputMismatchException e1) {
            System.out.println(" we accept only numbers ");
            return 0;

        } catch (NullPointerException e2) {
            System.out.println("the input should be not null");
            return 0;
        }
    }

    // Q2 with catch and try
    public static double[] addSumAndAverage(int num14, int num24, int num34) {
        try {
            double sum = num14 + num24 + num34;
            double average = sum / 3;
            return new double[]{sum, average};
        }
        catch (NumberFormatException e3) {
            System.out.println("Invalid input values: " + num14 + ", " + num24 + ", " + num34);
            return null;
        }
    }
}