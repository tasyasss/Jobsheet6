package Jobsheet6;
import java.util.Scanner;

public class BilanganNested04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1, bil2, bil3;
        
        System.out.print("Masukkan bilangan 1: ");
        bil1 = sc.nextInt();

        System.out.print("Masukkan bilangan 2: ");
        bil2 = sc.nextInt();

        System.out.print("Masukkan bilangan 3: ");
        bil3 = sc.nextInt();
        
        System.out.println ("input: " + bil1 + " " + bil2 + " " + bil3);
        
        // PERTAMA
        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("(1.0) Max: " + bil1);
                    if (bil2 > bil3) {
                        System.out.println("(1.1) Mid: " + bil2 + "\n(1.1) Min: " + bil3);
                    } else {
                        System.out.println("(1.2) Mid: " + bil3 + "\n(1.2) Min: " + bil2);
                    }
            } else if (bil1 < bil3){
                System.out.println("(1.0) Max: " + bil3);
                    if (bil1 > bil2) {
                        System.out.println("(1.3) Mid: " + bil1 + "\n(1.3) Min: " + bil2);
                    }
            }
        } 
        // KEDUA
        else if (bil2 > bil1) {
            if (bil2 > bil3) {
                System.out.println("(2.0) Max: " + bil2);
                    if (bil1 > bil3) {
                        System.out.println("(2.1) Mid: " + bil1 + "\n(2.1) Min: " + bil3);
                    } else {
                        System.out.println("(2.2) Mid: " + bil3 + "\n(2.2) Min: " + bil1);
                    }
            } else {
                System.out.println("(2.0) Max: " + bil3);
                    if (bil1 > bil2) {
                        System.out.println("(2.3) Mid: " + bil1 + "\n(2.3) Min: " + bil2);
                    } else {
                        System.out.println("(2.4) Mid: " + bil2 + "\n(2.4) Min: " + bil1);
                    }
            }
        } 
        else {
            System.out.println("TRY AGAIN");
        }
        sc.close();
    }
}
