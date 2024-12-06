import java.util.Scanner;

public class Mudah1{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan berat paket (kg): ");
        double beratPaket = scanner.nextDouble();
        System.out.print("Masukkan jarak tempuh (km): ");
        double jarakTempuh = scanner.nextDouble();
        System.out.print("Masukkan volume barang (cm³): ");
        double volumeBarang = scanner.nextDouble();

        double biayaPengiriman = hitungBiayaPengiriman(beratPaket, jarakTempuh, volumeBarang);

        System.out.println("Total biaya pengiriman: Rp " + biayaPengiriman);

        scanner.close();
    }

    public static double hitungBiayaPengiriman(double beratPaket, double jarakTempuh, double volumeBarang) {

        double biayaDasar = 0;
        if (jarakTempuh <= 10) {
            biayaDasar = beratPaket * 4250;
        } else {
            biayaDasar = beratPaket * 6000;
        }

        if (volumeBarang > 100) {
            biayaDasar += 5000;     
        } else if (Volume >200) {
            
        }

        return biayaDasar;
    }
}
        
    


