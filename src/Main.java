import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat Datang di Program Ramalan Cupu");
        System.out.println("++++++++++++++++++++++++++++++++++++++");

        System.out.println("Data Anda :");
        System.out.println("❤️❤️❤️❤️❤️❤️");
        System.out.println("Masukkan Nama Anda : ");
        String manName = scanner.nextLine();
        System.out.println("Masukkan Umur Anda :");
        int manAge = Integer.parseInt(scanner.nextLine());

        System.out.println("\n");

        System.out.println("Data Pasangan Anda :");
        System.out.println("❤️❤️❤️❤️❤️❤️❤️❤️");
        System.out.println("Masukkan Nama Anda : ");
        String womanName = scanner.nextLine();
        System.out.println("Masukkan Umur Pasangan Anda : ");
        int womanAge = Integer.parseInt(scanner.nextLine());

        Man manObj = new Man(manName, manAge);
        Woman womanObj = new Woman(womanName, womanAge);

        Program.printResult(manObj, womanObj);
    }
}