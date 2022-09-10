import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void printResult(Man manData, Woman womanData) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n");
        System.out.println(manData.getName() + " " + "[" + manData.getAge() + "]" + " " + "tahun");
        printLovePattern();
        System.out.println(womanData.getName() + " " + "[" + womanData.getAge() + "]" + " " + "tahun");
        System.out.println("Tekan ENTER untuk melihat hasil ramalan ...");
        scanner.nextLine();
        System.out.println("Kecocokan Anda dengan pasangan Anda adalah : " + printMatchResult());
        System.out.println("\n");
        System.out.println("Terima Karena Anda telah menggunakan jasa ramalan kami.. ^^v");
    }

    static String printMatchResult() {
        Random random = new Random();
        int lowestValue = 50;
        int highestValue = 100;
        int result = random.nextInt(highestValue - lowestValue) + lowestValue;

        double finalResult = result / 1.1;
        return new DecimalFormat("#.##").format(finalResult) + " %";
    }
    static void printLovePattern() {
        final int N = 3;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= 4 * N; j++) {
                double d1 = Math.sqrt(Math.pow(i - N, 2) + Math.pow(j - N, 2));
                double d2 = Math.sqrt(Math.pow(i - N, 2) + Math.pow(j - 3 * N, 2));

                if (d1 < N + 0.5 || d2 < N + 0.5) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print(System.lineSeparator());
        }

        for (int i = 1; i < 2 * N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }

            for (int j = 0; j < 4 * N + 1 - 2 * i; j++) {
                System.out.print('*');
            }

            System.out.print(System.lineSeparator());
        }
    }
}
