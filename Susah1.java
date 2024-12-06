import java.util.Scanner;

public class Susah1 {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        int jumlahSiswa;
        double totalNilai = 0;
        double nilai;

        System.out.println("Masukkan jumlah siswa: ");
        jumlahSiswa = x.nextInt();
            
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Masukkan nilai siswa ke-" + i + ": ");
            nilai = x.nextDouble();
            totalNilai +=nilai;
        }
        double rataRata = totalNilai / jumlahSiswa;
        System.out.println("Rata-rata nilai dari " + jumlahSiswa + " siswa adalah " + rataRata);

        x.close();
    }
}
    


      