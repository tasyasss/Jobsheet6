package Jobsheet6;
import java.util.Scanner;

public class Segitiga04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSudut, sudut1, sudut2, sudut3;

        System.out.print("Masukkan sudut 1: ");
        sudut1 = sc.nextInt();
        System.out.print("Masukkan sudut 2: ");
        sudut2 = sc.nextInt();
        System.out.print("Masukkan sudut 3: ");
        sudut3 = sc.nextInt();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            // ----- SIKU SIKU -----
            if ((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3)){
                if((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                    System.out.println("Segitiga Siku-siku dengan kaki yang sama");
                } else {
                    System.out.println("Segitiga Sama Kaki");
                }
            } 
            // ----- SAMA SISI -----
            else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60)) {
                System.out.println("Segitiga Sama Sisi");
            }
            // ----- SAMA KAKI ----- 
            else if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga Siku-Siku");
            } 
            // ----- SEMBARANG ----- 
            else {
                System.out.println("Segitiga Sembarang");
            }
        } else {
            System.out.println("Bukan segitiga");
        }

        sc.close();
    }
}
