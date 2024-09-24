import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give your input:");
        String input = sc.next();
        int size = -1;

        switch (input.toLowerCase()) {
            case "integer":
                size = Integer.SIZE / 8;
                break;

            case "long":
                size = Long.SIZE / 8;
                break;

            case "float":
                size = Float.SIZE / 8;
                break;

            case "double":
                size = Double.SIZE / 8;
                break;

            case "character":
                size = Character.SIZE / 8;
                break;

            default:
                System.out.println("Unknown data type!");
        }
        System.out.println("The size of a "+input+" datatype is: "+size+" bits.");
    }
}
