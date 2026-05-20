import java.util.Scanner;
public class utsSoal6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlMhs=0; 
        double total=0.0, rataRata=0.0;
        String[] namaMhs;
        double[] lamaBelajar;

        System.out.print("Masukkan jumlah mhs: ");
        jmlMhs = sc.nextInt();

        sc.nextLine();

        namaMhs = new String[jmlMhs];
        lamaBelajar = new double[jmlMhs];

        for (int i = 0; i < lamaBelajar.length; i++) {
            System.out.print("Nama : ");
            namaMhs[i] = sc.nextLine();
            System.out.print("Lama belajar (jam) : ");
            lamaBelajar[i] = sc.nextInt();

            total += lamaBelajar[i];
            
            System.out.println();
            sc.nextLine();
        }
        
        rataRata = total/jmlMhs;

        System.out.println("Rata-rata waktu belajar mahasiswa: "+rataRata+" jam");

        if (rataRata >= 2 && rataRata <= 4) {
            System.out.println("Keterangan: Aktif");
        } else {
            System.out.println("Keterangan: Perlu Motivasi");
        }
        
        sc.close();
    }
}
