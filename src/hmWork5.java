import java.util.Scanner;

public class hmWork5 {
    public static void main (String[] args) {
        for(int i=1; i<=6; i++) {
            for(int j=0; j<=6-i; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("a ");
            }
            System.out.println();
        }

    }
}
