import java.util.Scanner;
public class utsSoal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahBarang=0;
        String status="";
        String[] namaBarang;
        int[] stok;

        do {
            System.out.print("Masukkan jumlah barang: ");
            jumlahBarang = sc.nextInt();
            if (jumlahBarang < 5) {
                System.out.println("Jumlah barang minimal 5!");
            }
            sc.nextLine(); 
        } while (jumlahBarang < 5);


        namaBarang = new String[jumlahBarang];
        stok = new int[jumlahBarang];

        for (int i = 0; i < stok.length; i++) {
            System.out.print("Nama barang: ");
            namaBarang[i] = sc.nextLine();
            System.out.print("Stok: ");
            stok[i] = sc.nextInt();

            if (stok[i] >= 50) {
                status="Aman";
            } else if (stok[i] >= 20) {
                status="Menipis";
            } else {
                status="Sangat Kurang";
            }

            System.out.println("Stok saat ini: "+status);
            System.out.println();
            sc.nextLine();
        }

        System.out.println("Nama barang yang perlu direstok: ");
        for (int i = 0; i < stok.length; i++) {
            if (stok[i] < 20) {
                System.out.println("- "+namaBarang[i]);
            }
        }

        sc.close();
    }
}
