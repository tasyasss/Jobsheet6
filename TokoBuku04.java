package Jobsheet6;
import java.util.Scanner;

public class TokoBuku04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenisBuku, diskon;
        int jumlahBuku;

        System.out.print("Masukkan jenis buku: ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = sc.nextInt();

        if(jenisBuku.equals("kamus")){
            diskon = "10";
            if(jumlahBuku >= 2){
                diskon = "12";
                System.out.println("Anda mendapatkan diskon: " + diskon + "%");
            }else{
                System.out.println("Anda mendapatkan diskon: " + diskon + "%");
            }
        }
        if(jenisBuku.equals("novel")){
            diskon = "8";
            if(jumlahBuku > 3){
                diskon = "9";
                System.out.println("Anda mendapatkan diskon: " + diskon + "%");
            }else{
                System.out.println("anda mendapatkan diskon: " + diskon + "%");
            }
        }
        if(jenisBuku.equals("selainnya")){
            diskon = "0";
            if(jumlahBuku > 3){
                diskon = "5";
                System.out.println("anda mendapatkan diskon: " + diskon + "%");
            }else{
                System.out.println("Anda mendapatkan diskon: " + diskon + "%");
            }
        }
        sc.close();
    }
}
