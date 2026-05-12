import java.util.Scanner;
public class utsSoalB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlBarang = 0,total=0, diskon=0;
        String[] nama;
        int[] harga;

        do {
            System.out.print("Masukkan jumlah barang : ");
            jmlBarang = sc.nextInt();
            if (jmlBarang < 5) {
                System.out.println("Jumlah barang minimal 5!");
            }
            sc.nextLine();
        } while (jmlBarang < 5);
        

        nama = new String[jmlBarang];
        harga = new int[jmlBarang];

        for (int i = 0; i < harga.length; i++) {
            System.out.print("Nama barang : ");
            nama[i] = sc.nextLine();
            System.out.print("Harga barang : ");
            harga[i] = sc.nextInt();
            
            total += harga[i];
           
            System.out.println();
            sc.nextLine();  
        }

        System.out.println("Total : "+total);

        if (total >= 100000) {
            diskon = total * 10/100;
            System.out.println("Diskon : "+ diskon);
            System.out.println("Pembayaran setelah diskon : "+(total-diskon));
        } else if(total >= 50000) {
            diskon = total * 5/100;
            System.out.println("Diskon : "+ diskon);
            System.out.println("Pembayaran setelah diskon : "+(total-diskon));
        } else if (total < 50000) {
            System.out.println("Maaf, anda tidak mendapatkan diskon");
        }
        
        sc.close();

    }
}
