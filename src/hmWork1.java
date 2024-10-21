import java.util.Scanner;
// this code calculate: X+Y-Z
public class hmWork1 {
    public static void main(String[] args) {
        Scanner scannerinput = new Scanner(System.in);
        System.out.print("please input X: ");
        int inputX = scannerinput.nextInt();
        System.out.print("please input Y: ");
        int inputY = scannerinput.nextInt();
        System.out.print("please input Z: ");
        int inputZ = scannerinput.nextInt();
        int result = inputX + inputY - inputZ;
        System.out.println("Result is: " + result);

    }
}