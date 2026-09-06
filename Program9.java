public class MiddleDigitsSum {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.next();
        int length = num.length();
        int sum = 0;

        if (length % 2 == 0) {
            // Even number of digits — two middle digits
            int mid1 = Character.getNumericValue(num.charAt(length / 2 - 1));
            int mid2 = Character.getNumericValue(num.charAt(length / 2));
            sum = mid1 + mid2;
        } else {
            // Odd number of digits — one middle digit
            int mid = Character.getNumericValue(num.charAt(length / 2));
            sum = mid;
        }

        System.out.println("Sum of middle digit(s): " + sum);

        sc.close();
    }
}