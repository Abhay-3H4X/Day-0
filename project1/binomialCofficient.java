import java.util.*;

public class binomialCofficient {
    public static int Abhay(int n, int r) {
        int factN = 1;
        for (int i = 1; i <= n; i++) {
            factN = factN * i;
        }
        int factR = 1;
        for (int i = 1; i <= r; i++) {
            factR = factR * i;
        }
        int factc = 1;
        for (int i = 1; i <= (n - r); i++) {
            factc = factc * i;
        }

        int NCR = (factN / (factR * factc));

        return NCR;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give me value of n:");
        int n = sc.nextInt();
        System.out.println("give me value of r:");
        int r = sc.nextInt();
        System.out.println("value of binomial cofficient:" + Abhay(n, r));
    }
}

/*
 * import java.util.*;
 * 
 * public class BinomialCoefficient {
 * 
 * public static int factorial(int num) {
 * int fact = 1;
 * for (int i = 1; i <= num; i++) {
 * fact *= i;
 * }
 * return fact;
 * }
 * 
 * public static int calculateNCR(int n, int r) {
 * int factN = factorial(n);
 * int factR = factorial(r);
 * int factNR = factorial(n - r);
 * 
 * return factN / (factR * factNR);
 * }
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.print("Enter value of n: ");
 * int n = sc.nextInt();
 * 
 * System.out.print("Enter value of r: ");
 * int r = sc.nextInt();
 * 
 * if (r > n || n < 0 || r < 0) {
 * System.out.println("Invalid input. Ensure that 0 ≤ r ≤ n.");
 * } else {
 * int result = calculateNCR(n, r);
 * System.out.println("Binomial Coefficient (nCr) is: " + result);
 * }
 * 
 * sc.close();
 * }
 * }
 * 
 */