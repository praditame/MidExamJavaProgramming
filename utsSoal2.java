import java.util.Scanner;
public class utsSoal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int orang=0, bb=0;
        String[] nama;
        String[] jk;
        int[] tb;
        int[] bbs;

        do {
            System.out.print("Masukkan jumlah orang: ");
            orang = sc.nextInt();
            if (orang < 3) {
                System.out.println("Jumlah minimal 3!");
            }
            sc.nextLine();
        } while (orang < 3);
        

        nama = new String[orang];
        jk = new String[orang];
        tb = new int[orang];
        bbs = new int[orang];

        for (int i = 0; i < tb.length; i++) {
            System.out.print("Nama : ");
            nama[i] = sc.nextLine();
            System.out.print("Jenis kelamin: ");
            jk[i] = sc.nextLine();
            System.out.print("Tinggi badan: ");
            tb[i] = sc.nextInt();

            //berat badan
            if (jk[i].equalsIgnoreCase("Pria")) {
                bb = (tb[i]-100) - ((tb[i]-100)*10/100);
                System.out.println("Berat badan ideal anda: "+bb);
            } else if (jk[i].equalsIgnoreCase("Wanita")) {
                bb = (tb[i]-100) - ((tb[i]-100)*15/100);
                System.out.println("Berat badan ideal anda: "+bb);
            }

            System.out.print("Berat badan saat ini: ");
            bbs[i] = sc.nextInt();

            if (tb[i] >= 170 && bbs[i]<=68) {
                System.out.println("Kategori: Normal");
            } else if (tb[i] < 170 && bbs[i]>=71) {
                System.out.println("Kategori: Overweight");
            }
            System.out.println();
            sc.nextLine();

        }
        
        sc.close();
        
    }
}
