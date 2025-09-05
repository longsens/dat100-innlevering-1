import java.util.Scanner;

public class OppgaveO3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Skriv inn ett heltall: ");
        int n = in.nextInt();

        if (n < 1) {
            System.out.println("Ugyldig tall, må være større enn 0!");

        } else {
            int fakultet = 1;

            for (int i = 1; i <= n; i++) {
                fakultet *= i;
            }
            System.out.println(n+ "!= " + fakultet);
        }
        in.close();
    }
}

