import java.util.Scanner;

/**
 * ეს კოდი მოკლედ ითვლის ფითაგორას თეორემას, რომლის მიხედვითაც ჰიპოთენუზა უდრის კათეტების კვადრატების ჯამიდან ამოღებულ ფესვს
 *
 */
public class homework2 { // this code calculate pithagora's theorema a2+b2=c2
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please input A: ");
        int inputA = input.nextInt();
        System.out.print("please input b: ");
        int inputB = input.nextInt();
        int frstData = (inputA * inputA) + (inputB * inputB);
        int scndData = inputB * inputB;
        double fesvi = Math.sqrt(frstData);
        System.out.println("fesvi aris: " + fesvi);

    }
}