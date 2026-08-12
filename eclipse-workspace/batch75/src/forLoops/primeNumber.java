package forLoops;

import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Up to where you want to print:");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {

            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int n) {

        boolean status = true;

        if (n == 0 || n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) {
                status = false;
                break;
            }
        }

        return status;
    }
}