import java.util.Scanner;
public class utsSoal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlHari=0;
        String status="";
        String[] hari;
        int[] jmlPemakaian;

        do {
            System.out.print("Masukkan jumlah hari: ");
            jmlHari = sc.nextInt();
            if (jmlHari < 7) {
                System.out.println("Jumlah hari minimal 7!");
            }
            sc.nextLine();
        } while (jmlHari < 7);
        

        hari = new String[jmlHari];
        jmlPemakaian = new int[jmlHari];

        for (int i = 0; i < jmlPemakaian.length; i++) {
            System.out.print("Hari : ");
            hari[i] = sc.nextLine();
            System.out.print("Jumlah Pemakaian (dalam GB) : ");
            jmlPemakaian[i] = sc.nextInt();

            if (jmlPemakaian[i] >= 15) {
                status="TINGGI";
            } else if (jmlPemakaian[i] >= 8) {
                status="SEDANG";
            } else if (jmlPemakaian[i] < 8) {
                status="RENDAH";
            }

            System.out.println("Kategori: "+status);
            System.out.println();
            sc.nextLine();
        }

        System.out.println();
        System.out.println("Jumlah Pemakaian Terbesar pada hari : ");
        for (int i = 0; i < jmlPemakaian.length; i++) {
            if (jmlPemakaian[i] >= 15) {
                System.out.println("- "+hari[i]);
            }
        }

        sc.close();
    }   
}
