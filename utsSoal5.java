import java.util.Scanner;
public class utsSoal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahData=0, nilaiMin=0, indeks=0;
        int[] nilai;

         do {
            System.out.print("Masukkan jumlah data : ");
            jumlahData = sc.nextInt();
            if (jumlahData < 5) {
                System.out.println("Data minimal 5!");
            }
            sc.nextLine();
        } while (jumlahData < 5);

        nilai = new int[jumlahData];
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Indeks ke-"+i);
            System.out.println("Nomor "+(i+1));
            System.out.print("Nilai: ");
            nilai[i] = sc.nextInt();

            nilaiMin = nilai[0];
            System.out.println();
            sc.nextLine();
            
        }

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > nilaiMin ) {
                nilaiMin = nilai[i];
                indeks = i;
            }
        }

        System.out.println();
        System.out.println("Nilai terendah : "+nilaiMin);
        System.out.println("Indeks ke-"+indeks);

        sc.close();
    }
}
