
import java.util.Scanner;

public class OppgaveO1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Legg inn årslønn:");
        double lonn= in.nextDouble();

        double trinn1 = 0.017;
        double trinn2 = 0.04;
        double trinn3 = 0.137;
        double trinn4 = 0.167;
        double trinn5 = 0.177;

        /* sånn jeg har forstått det så er det så må man regne trinskatten for hvert trinn
        og plusse trinnene sammen, eks lønn på 500.000 må man først ta 500k minus minstefradraget
        også må man
         */

        if (lonn >= 217401 && lonn <= 306050) {
            System.out.println("Trinnskatten er: " +
                    ((lonn - 217400) * trinn1)
            );

        } else if (lonn >= 306051 && lonn <= 697150) {
            System.out.println("Trinnskatten er: " +
                    (((306050 - 217400) * trinn1) +
                    ((lonn - 306050) * trinn2))
            );

        } else if (lonn >= 697151 && lonn <= 942400) {
            System.out.println("Trinnskatten er: " +
                    (((306050 - 217400) * trinn1) +
                            ((697150 - 306050) * trinn2) +
                            ((lonn - 697150) * trinn3))
            );

        } else if (lonn >= 942401 && lonn <= 1410750) {
            System.out.println("Trinnskatten er: " +
                    (((306050 - 217400) * trinn1) +
                            ((697150 - 306050) * trinn2) +
                            ((942400 - 697150) * trinn3) +
                            ((lonn - 942400) * trinn4))
            );

        } else if (lonn > 1410750) {
            System.out.println("Trinnskatten er: " +
                    (((306050 - 217400) * trinn1) +
                            ((697150 - 306050) * trinn2) +
                            ((942400 - 697150) * trinn3) +
                            ((1410750 - 942400) * trinn4) +
                            ((lonn - 1410750) * trinn5))
            );

        } else {
            System.out.println("Trinnskatten din er 0");
        }
    in.close();
    }
}