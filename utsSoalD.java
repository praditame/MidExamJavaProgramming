import java.util.Scanner;
public class utsSoalD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahData=0, nilaiMax=0, indeks=0;
        int[] nilai;
        int[] nomor;

        do {
            System.out.print("Masukkan jumlah data : ");
            jumlahData = sc.nextInt();
            if (jumlahData < 5) {
                System.out.println("Data minimal 5!");
            }
            sc.nextLine();
        } while (jumlahData < 5);
        

        nilai = new int[jumlahData];
        nomor = new int[jumlahData];
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Indeks ke-"+i);
            System.out.print("Nomor :");
            nomor[i] = sc.nextInt();
            System.out.print("Nilai: ");
            nilai[i] = sc.nextInt();

            nilaiMax = nilai[0];
            System.out.println();
            sc.nextLine();
            
        }

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > nilaiMax ) {
                nilaiMax = nilai[i];
                indeks = i;
            }
        }

        System.out.println();
        System.out.println("Nilai tertinggi : "+nilaiMax);
        System.out.println("Indeks ke-"+indeks);

        sc.close();
    }
}
