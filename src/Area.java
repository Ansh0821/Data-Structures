import java.util.Scanner;

public class Area {
    public static double calcArea(int ch, double[]a){
        double area = 0;

        switch (ch){
            case 1:
                double radius = a[0];
                area = Math.PI * radius * radius;
                break;

            case 2:
                double length = a[0];
                double breadth = a[1];
                area = length * breadth;
                break;
        }
        return area;
    }
    public static void main(String[] args) {
        System.out.println("Enter 1 for circle & 2 rectangle:");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        double[] a = new double[0];

        if (ch == 1) {
            a = new double[1];
            System.out.println("Enter the radius of circle:");
            a[0] = sc.nextInt();
        } else if (ch == 2) {
            a = new double[2];
            System.out.println("Enter the length & breadth of rectangle:");
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
        } else System.out.println("Invalid input!");

        double area = calcArea(ch, a);
        System.out.println("The area is: "+area+" sq. units.");
    }
}

