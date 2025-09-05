import java.util.Scanner;

public class OppgaveO2B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        for (int i = 1; i <= 10; i++) {
            int poeng = in.nextInt();
            System.out.print("Skriv inn poengsum " + i + " : ");


            if (poeng >= 90 && poeng <= 100) {
                System.out.println("Du fikk karakteren A");

            } else if (poeng >= 80 && poeng <= 89) {
                System.out.println("Du fikk karakteren B");

            } else if (poeng >= 60 && poeng <= 79) {
                System.out.println("Du fikk karakteren C");

            } else if (poeng >= 50 && poeng <= 59) {
                System.out.println("Du fikk karakteren D");

            } else if (poeng >= 40 && poeng <= 49) {
                System.out.println("Du fikk karakteren E");

            } else if (poeng >= 0 && poeng <= 39) {
                System.out.println("Du fikk karakteren F");

            } else {
                System.out.println("Ugyldig poengsum");
            }


        }
        in.close();
    }
}

