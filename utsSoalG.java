import java.util.Scanner;
public class utsSoalG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahHari=0, max=0, min=0, indeks=0, indeksMax=0, indeksMin=0;
        String status="";
        int[] jmlPenjualan;

        do {
            System.out.print("Masukkan jumlah hari: ");
            jumlahHari = sc.nextInt();
            if (jumlahHari < 7) {
                System.out.println("Jumlah hari minimal 7!");
            }
            sc.nextLine(); 
        } while (jumlahHari<7);
        

        jmlPenjualan = new int[jumlahHari];
        for (int i = 0; i < jmlPenjualan.length; i++) {
            indeks = i+1;
            System.out.println("Hari ke-"+indeks);
            System.out.print("Jumlah penjualan: ");
            jmlPenjualan[i] = sc.nextInt();
            
            System.out.println();
            sc.nextLine();  
        }

        min = jmlPenjualan[0];
        max = jmlPenjualan[0];

        for (int i = 0; i < jmlPenjualan.length; i++) {
            if (jmlPenjualan[i] > max) {
                max = jmlPenjualan[i];
                indeksMax = i;
                
            } else if (jmlPenjualan[i] < min) {
                min = jmlPenjualan[i];
                indeksMin = i;
                
            }
            System.out.println();
            
        }

        System.out.println("Penjualan tertinggi: "+max+ " pada hari ke-"+(indeksMax+1));
        System.out.println("Penjualan terendah: "+min+ " pada hari ke-"+(indeksMin+1));
        
        System.out.println();
        System.out.println("==KONDISI TOKO==");
        for (int i = 0; i < jmlPenjualan.length; i++) {
            if (jmlPenjualan[i] >= 100) {
                status = "Ramai";
            } else if (jmlPenjualan[i] >= 50) {
                status = "Cukup";
            } else {
                status = "Sepi";
            }
            System.out.println("Hari ke-"+(i+1));
            System.out.println("Penjualan: "+jmlPenjualan[i]);
            System.out.println("Kondisi toko: "+status);
        }
        sc.close();
    }
}
