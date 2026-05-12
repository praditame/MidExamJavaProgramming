import java.util.Scanner;
public class utsSoalE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlPeserta=0, lulus=0, gagal=0, min=0;
        String status="";

        String[] nama;
        int[] nilaiUjian;

        do {
            System.out.print("Jumlah peserta ujian: ");
            jmlPeserta = sc.nextInt();
            if (jmlPeserta < 5) {
                System.out.println("Data minimal 5!");
            }
            sc.nextLine();
        } while (jmlPeserta < 5);
        
        System.out.print("Nilai minimal ujian: ");
        min = sc.nextInt();
        System.out.println();
        sc.nextLine();

        nama = new String[jmlPeserta];
        nilaiUjian = new int[jmlPeserta];

        for (int i = 0; i < nilaiUjian.length; i++) {
            System.out.print("Nama : ");
            nama[i] = sc.nextLine();
            System.out.print("Nilai Ujian: ");
            nilaiUjian[i] = sc.nextInt();

            if (nilaiUjian[i] < min) {
                status = "Gagal";
                gagal++;
            } else if (nilaiUjian[i] >= min) {
                status = "LULUS";
                lulus++;
            }
            System.out.println("Status Ujian: "+status);
            System.out.println();
            sc.nextLine();
        }

        System.out.println();
        System.out.println("Jumlah yang lulus: "+lulus);
        System.out.println("Jumlah yang gagal: "+gagal);

        sc.close();
    }
}
