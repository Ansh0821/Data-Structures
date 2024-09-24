import java.util.Scanner;

public class User_Input_Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char input = sc.next().charAt(0);
        if (!Character.isAlphabetic(input)) System.out.println(-1);
        if (Character.isUpperCase(input)) System.out.println(1);
        if (Character.isLowerCase(input)) System.out.println(0);
    }
}
