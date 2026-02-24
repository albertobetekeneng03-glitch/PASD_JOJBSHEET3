import java.util.Scanner;

public class DosenDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen03[] arrayOfDosen03 = new Dosen03[3];
        String kode, nama, dummy;
        Boolean jenisKelamin;
        int usia;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode           : ");
            kode = sc.nextLine();
            System.out.print("Nama           : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true=Laki-laki, false=Perempuan): ");
            dummy = sc.nextLine();
            jenisKelamin = Boolean.parseBoolean(dummy);
            System.out.print("Usia           : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("-----------------------------------");

            arrayOfDosen03[i] = new Dosen03(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\n========== DATA DOSEN ==========");
        for (Dosen03 dosen : arrayOfDosen03      ) {
            System.out.println("Kode           : " + dosen.kode);
            System.out.println("Nama           : " + dosen.nama);
            System.out.println("Jenis Kelamin  : " + (dosen.jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia           : " + dosen.usia);
            System.out.println("-----------------------------------");
        }

        sc.close();
    }
}