import java.util.Scanner;
//ესე იგი, ეს პროგრამა იკვლევს შეტანილი რიცხვი ლუწია თუ კენტი
public class hmWork3 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Please insert number: ");
        int inputNumb = number.nextInt();

        int oddNumb = 0;
        if (inputNumb % 2 == 0) { //ეს ლაინი ამოწმებს ნაშთი (%) 2-ზე გაყოფისას უდრის თუ არა 0-ს.
            oddNumb = inputNumb / 2;
            System.out.println("number is odd, because of this divide by 2, answer is:" + oddNumb);
        }
        else if (inputNumb % 2 != 0) {
            int nextEvenNumb = 1 + (3 * inputNumb) / 2;
            System.out.println("number was even, and muctiplied 3 times and divide by 2, answer is: " + nextEvenNumb);

        }
        else {
            System.out.println("every test");
        }


    }
}
