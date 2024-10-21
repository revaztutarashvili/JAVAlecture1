import java.util.Scanner;

public class hmWork4 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("please input number: ");
        int inputNumber = number.nextInt();
        int counter = 0;
        while (inputNumber != 1) {
            if (inputNumber % 2 == 1){
                inputNumber = 3 * inputNumber + 1;
                System.out.println("number is odd, number multiplied by 3 and +1, then divided by 2, result number is: "+ inputNumber );
            }
            else {
                inputNumber /= 2;
                System.out.println("number is even, divided by 2, result number is: " + inputNumber );
            }
            counter++;
        }
        System.out.println("calculator used  " + counter + " step");

    }

}
