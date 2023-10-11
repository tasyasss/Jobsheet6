package Jobsheet6;
import java.util.Scanner;

public class Bilangan04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1, bil2, bil3;
        
        System.out.print("Masukkan bilangan 1: ");
        bil1 = sc.nextInt();

        System.out.print("Masukkan bilangan 2: ");
        bil2 = sc.nextInt();

        System.out.print("Masukkan bilangan 3: ");
        bil3 = sc.nextInt();
        
        System.out.println (bil1 + " " + bil2 + " " + bil3);
        
        // PERTAMA
        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("Bilangan 1 Besar (1)");
            } else if (bil1 < bil3){
                System.out.println("Bilangan 3 Besar (1)");
            }
        } 
        // KEDUA
        else if (bil2 > bil1) {
            if (bil2 > bil3) {
                System.out.println("Bilangan 2 Besar (2)");
            } else {
                System.out.println("Bilangan 3 Besar (2)");
            }
        } 
        else {
            System.out.println("TRY AGAIN");
        }
        sc.close();
    }
}
