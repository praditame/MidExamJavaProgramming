import java.util.Scanner;
public class utsSoal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pelanggan=0, member=0, poin=0, get=0;
        String[] tgl;
        int[] total;

        do {
            System.out.print("Berapa jumlah pelanggan: ");
            pelanggan = sc.nextInt();
            if (pelanggan < 3) {
                System.out.println("Jumlah pelanggan minimal 3!");
            }
            sc.nextLine();
        } while (pelanggan < 3);
        

        tgl = new String[pelanggan];
        total = new int[pelanggan];

        for (int i = 0; i < total.length; i++) {
            System.out.print("Tanggal: ");
            tgl[i] = sc.nextLine();
            System.out.print("Total belanja: ");
            total[i] = sc.nextInt();
            System.out.print("Member? (0/1) : ");
            member = sc.nextInt();

            if (member == 1) {
                if (total[i] >= 100000) {
                    poin=50;
                } else if (total[i] < 100000) {
                    poin=20;
                }
            } else if (member==0) {
                if (total[i] >= 100000) {
                    poin=10;
                } else {
                    poin=0;
                }
            }

            System.out.println("Poin anda: "+poin);
            
            //ambil orang yang dapat poin
            if (poin > 0) {
                get++;
            }
            System.out.println();
            sc.nextLine();

        }

        
        System.out.println("Jumlah pelanggan yang mendapat poin: "+get);    
        sc.close();
    }
}
