import java.util.Scanner;

public class Sedang1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        long faktorial = 1;

        if (bilangan < 0) {
            System.out.println("Faktorial tidak terdefinisi untuk bilangan negatif.");
        } else {
            for (int i = 1; i <= bilangan; i++) {
                faktorial *= i;
            }
            System.out.println("Faktorial dari " + bilangan + " adalah " + faktorial);
        }
    }
}


