import java.util.Scanner;
public class utsSoalC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlPelanggan=0, nominal=0, bayar=0, cb=0;
        String[] namaProv;
        String[] jenisPaket;
        int[] nominalPulsa;

        do {
            System.out.print("Masukkan jumlah pelanggan : ");
            jmlPelanggan = sc.nextInt();
            if (jmlPelanggan < 3) {
                System.out.println("Jumlah pelanggan minimal 3");
            }
            sc.nextLine();
        } while (jmlPelanggan < 3);
        
        
        namaProv = new String[jmlPelanggan];
        jenisPaket = new String[jmlPelanggan];
        nominalPulsa = new int[jmlPelanggan];
        for (int i = 0; i < nominalPulsa.length; i++) {
            System.out.print("Nama Provider : ");
            namaProv[i] = sc.nextLine();
            System.out.print("Jenis Paket: ");
            jenisPaket[i] = sc.nextLine();

            System.out.println("Nominal Pulsa Tersedia");
            System.out.println("1. 100.000");
            System.out.println("2. 50.000");
            System.out.println("3. 25.000");
            System.out.println("4. 15.000");
            System.out.print("Pilih nominal pulsa : ");
            nominalPulsa[i] = sc.nextInt();
            if (nominalPulsa[i] == 1) {
                nominal = 100000;
            } else if (nominalPulsa[i] == 2) {
                nominal = 50000;
            } else if (nominalPulsa[i] == 3) {
                nominal = 25000;
            } else if (nominalPulsa[i] == 4) {
                nominal = 15000;
            }

            bayar += (nominal+2000);
            System.out.println();
            System.out.println("Total: "+bayar);
            if (bayar >= 100000) {
                cb = bayar * 15/100;
                System.out.println("Cashback : "+cb);
                System.out.println("Grand Total : "+(bayar-cb));
            } else if(bayar >= 50000){
                cb = bayar * 10/100;
                System.out.println("Cashback : "+cb);
                System.out.println("Grand Total : "+(bayar-cb));
            } else if (bayar < 50000) {
                System.out.println("Cashback : 0");
                System.out.println("Grand Total : "+bayar);
            }
            sc.nextLine();
        }

        sc.close();
    }
}
