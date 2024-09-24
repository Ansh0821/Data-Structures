import java.util.Objects;
import java.util.Scanner;

public class Parametrised_recursion {
    static int sum(int n) {
        if (n == 0) return 0;

        return n + sum(n - 1);
    }
    static void sum(int n, int result) {
        if (n < 1) {
            System.out.println(result);
            return;
        }
        sum(n - 1, result + n);
    }
    static void revArr(int i, int[] arr, int n) {
        if (i >= n / 2) return;
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        revArr(i + 1, arr, n);
    }
    static boolean palindrome(int i, String s) {
        if (s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        if (i >= s.length() / 2) return true;
        return palindrome(i + 1, s);
    }

    public static void main(String[] args) {
//        int result = sum(10);
//        System.out.println(result);
//        sum(10, 0);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of string array:");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements of array:");
//        for (int i = 0; i<n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        revArr(0, arr, n);
//        for (int i = 0; i < arr.length ;i++) {
//            System.out.print(arr[i] + " ");
//        }
        String s = "MADAM";
        boolean result = palindrome(0,s);
        if (result) System.out.println("It is a palindrome");
        else System.out.println("It is not a palindrome");
    }
}