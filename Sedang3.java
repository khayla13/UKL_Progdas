import java.util.Random;
import java.util.Scanner;

public class Sedang3 {
    //fungsi untuk menyimpan variabel yang sama
    public static void perkalian(int nom1, int nom2) {
        Scanner x = new Scanner(System.in);
        int hasil = nom1 * nom2;
        System.out.println("Berapa hasil perkalian dari " + nom1 + " x " + nom2 + " adalah = ");
        int jawab = x.nextInt();
        if (jawab == hasil) {
            System.out.println("Selamat jawaban anda benar");
        } else {
            System.out.println("Maaf jawaban anda salah \n jawaban yang benar adalah = " + hasil);
        }
    }
    public static void pembagian(int nom1, int nom2) {
        Scanner x = new Scanner(System.in);
        int hasil = nom1/nom2;
        System.out.println("Berapa hasil pembagian dari " + nom1 + " / " + nom2 + " adalah = " );
        int jawab = x.nextInt();
        if (jawab == hasil) {
            System.out.println("Selamat jawaban anda benar");
        } else {
            System.out.println("Maaf jawaban anda salah \n jawaban yang benar adalah = " + hasil);
        }
    }
    public static void modulus(int nom1, int nom2) {
        Scanner x = new Scanner(System.in);
        int hasil = nom1 % nom2;
        System.out.println("Hasil modulus dari " + nom1 + " % " + nom2 + " adalah = " );
        int jawab = x.nextInt();
        if (jawab == hasil) {
            System.out.println("Selamat jawaban anda benar");
        } else {
            System.out.println("Maaf jawaban anda salah \n jawaban yang benar adalah = " + hasil);
        }
    }
    public static String bertannya(){
        Scanner x = new Scanner(System.in);
        System.out.println("Apakah anda ingin melanjutkan? ");
        return x.nextLine();
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Random masuk = new Random();
        String lanjut;

        do{
            int nom1 = masuk.nextInt(10) + 1; //agar outputan tidak lebih dari 10 dan tidak kurang dari 1/0
            int nom2 = masuk.nextInt(10) + 1;

            System.out.println("Pilih operasi \n 1. Perkalian \n 2. Pembagian \n 3. Modulus"); //memilih salah satu operasi yg akan di lakukan
            int pilih = x.nextInt();

            switch (pilih) {
                case 1:
                    perkalian(nom1, nom2);
                    break;
                case 2:
                    pembagian(nom1, nom2);
                    break;
                case 3:
                    modulus(nom1, nom2);
                    break;
            
                default:
            }
            lanjut = bertannya();
        }while (lanjut.equalsIgnoreCase("ya")); {
            System.out.println("Baiklah, terima kasih banyak");
        }
    }
}