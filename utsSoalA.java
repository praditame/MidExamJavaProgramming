import java.util.Scanner;
public class utsSoalA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahMhs = 0, underB=0;
        String grade = "";
        String[] nim;
        String[] nama;
        int[] nilai;

        do {
            System.out.print("Masukkan jumlah mahasiswa : ");
            jumlahMhs = sc.nextInt();
            if (jumlahMhs<3) {
                System.err.println("Jumlah mhs minimal 10!");
            }

            sc.nextLine();
        } while (jumlahMhs < 3);
        

        nim = new String[jumlahMhs];
        nama = new String[jumlahMhs];
        nilai = new int[jumlahMhs];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Input nim : ");
            nim[i] = sc.nextLine();
            System.out.print("Input nama : ");
            nama[i] = sc.nextLine();
            System.out.print("Input nilai : ");
            nilai[i] = sc.nextInt();

            if (nilai[i] >= 80 && nilai[i] <= 100) {
                grade = "A";
            } else if(nilai[i] >= 75 && nilai[i] <= 79){
                grade = "B+";
            } else if(nilai[i] >= 65 && nilai[i] <= 74){
                grade = "B";
            } else if(nilai[i] >= 60 && nilai[i] <= 64) {
                grade = "C+";
            } else {
                grade = "C";
            }
            System.out.println("Grade: "+grade);

            if (nilai[i] < 65) {
                underB++;
            }

            System.out.println();
            sc.nextLine();
        }

        System.out.println();
        System.out.println("Jumlah mahasiswa nilai di bawah B adalah " + underB);

        sc.close();
        
    }
}
