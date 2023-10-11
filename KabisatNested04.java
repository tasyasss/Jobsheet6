package Jobsheet6;
import java.util.Scanner;

public class KabisatNested04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tahun;

        System.out.println("Masukkan tahun: ");
        tahun = sc.nextInt();

        if ((tahun % 4) == 0){
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat (1)");
            } else if ((tahun % 400) == 0) {
                System.out.println("Tahun Kabisat (2)");
            }
            else {
                System.out.println("Bukan tahun kabisat (1)");
            }
        } else {
            System.out.println("Bukan Tahun Kabisat (2)");
        }
        sc.close();
    }
}
