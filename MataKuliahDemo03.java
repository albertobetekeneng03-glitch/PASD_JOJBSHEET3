import java.util.Scanner;
class MatakuliahDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah03[] arrayOfMatakuliah03 = new Matakuliah03[3];
        String kode, nama, dummy;
        int sks, JumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("SKS        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            JumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------------");

            arrayOfMatakuliah03[i] = new Matakuliah03(kode, nama, sks, JumlahJam);
        }
            for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode       : "+ arrayOfMatakuliah03[i].kode);
            System.out.println("Nama       : "+ arrayOfMatakuliah03[i].nama);
            System.out.println("SKS        : "+ arrayOfMatakuliah03[i].sks);
            System.out.println("Jumlah Jam : "+ arrayOfMatakuliah03[i].JumlahJam);
            System.out.println("-----------------------------------");

        }
    }}