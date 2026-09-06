import java.util.Scanner;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;

        int lastDigit = num % 10;

        while (num >= 10) {
            num = num / 10;
        }
        int firstDigit = num;

        int sum = firstDigit + lastDigit;
        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
        System.out.println("Sum of first and last digit: " + sum);

        sc.close();
    }
}