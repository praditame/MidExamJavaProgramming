import java.util.Scanner;
public class utsSoal6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlMhs=0, rataRata=0;
        String[] namaMhs;
        int[] lamaBelajar;

        System.out.print("Masukkan jumlah mhs: ");
        jmlMhs = sc.nextInt();

        sc.nextLine();

        namaMhs = new String[jmlMhs];
        lamaBelajar = new int[jmlMhs];

        for (int i = 0; i < lamaBelajar.length; i++) {
            System.out.print("Nama : ");
            namaMhs[i] = sc.nextLine();
            System.out.print("Lama belajar (jam) : ");
            lamaBelajar[i] = sc.nextInt();

            rataRata += lamaBelajar[i]/jmlMhs;
            System.out.println();
            sc.nextLine();
        }
            
        if (rataRata >= 2 && rataRata <= 4) {
            System.out.println("Keterangan: Aktif");
        } else {
            System.out.println("Perlu Motivasi");
        }
        
        sc.close();
    }
}
