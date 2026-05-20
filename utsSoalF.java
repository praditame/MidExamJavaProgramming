import java.util.Scanner;
public class utsSoalF {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int jmlPertemuan=0, total=0, persentase=0;
        String[] tgl;
        int[] kehadiran;

        do {
            System.out.print("Masukkan jumlah pertemuan: ");
            jmlPertemuan = a.nextInt();
            if (jmlPertemuan < 14) {
                System.out.println("Pertemuan minimal 14x!");
            }
            a.nextLine();
        } while (jmlPertemuan < 14);
        

        tgl = new String[jmlPertemuan];
        kehadiran = new int[jmlPertemuan];

        System.out.print("Nama : ");
        namaMhs = a.nextLine();
        for (int i = 0; i < kehadiran.length; i++) {
            System.out.print("Tanggal: ");
            tgl[i] = a.nextLine();
            System.out.print("Kehadiran (0/1) : ");
            kehadiran[i] = a.nextInt();
            
            if (kehadiran[i] == 1) {
                total += kehadiran[i];
            }
            
            a.nextLine();
        }
        System.out.println();
        System.out.println("Total kehadiran: "+total);
        //persentase
        persentase = 100 * total/jmlPertemuan;
        System.out.println("Persentase kehadiran: "+persentase+"%");

        if (persentase >= 75) {
            System.out.println("Status kehadiran: Baik");
        } else {
            System.out.println("Status kehadiran: Kurang");
        }
        
        a.close();
    }
}
