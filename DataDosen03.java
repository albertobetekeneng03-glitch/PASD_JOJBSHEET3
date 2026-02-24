public class DataDosen03 {
    
    public void dataSemuaDosen(Dosen03[] arrayOfDosen) {
        System.out.println("\n========== DATA SEMUA DOSEN ==========");
        for (Dosen03 dosen : arrayOfDosen) {
            System.out.println("Kode           : " + dosen.kode);
            System.out.println("Nama           : " + dosen.nama);
            System.out.println("Jenis Kelamin  : " + (dosen.jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia           : " + dosen.usia);
            System.out.println("-----------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen03[] arrayOfDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (Dosen03 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }

        System.out.println("\n========== JUMLAH DOSEN PER JENIS KELAMIN ==========");
        System.out.println("Jumlah Dosen Pria    : " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita  : " + jumlahWanita);
        System.out.println("-----------------------------------");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen03[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (Dosen03 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }

        double rerataUsiaPria = jumlahPria > 0 ? (double) totalUsiaPria / jumlahPria : 0;
        double rerataUsiaWanita = jumlahWanita > 0 ? (double) totalUsiaWanita / jumlahWanita : 0;

        System.out.println("\n========== RATA-RATA USIA DOSEN PER JENIS KELAMIN ==========");
        System.out.printf("Rata-rata Usia Dosen Pria    : %.2f tahun%n", rerataUsiaPria);
        System.out.printf("Rata-rata Usia Dosen Wanita  : %.2f tahun%n", rerataUsiaWanita);
        System.out.println("-----------------------------------");
    }

    public void infoDosenPalingTua(Dosen03[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen");
            return;
        }

        Dosen03 dosenTua = arrayOfDosen[0];
        for (Dosen03 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTua.usia) {
                dosenTua = dosen;
            }
        }

        System.out.println("\n========== INFO DOSEN PALING TUA ==========");
        System.out.println("Kode           : " + dosenTua.kode);
        System.out.println("Nama           : " + dosenTua.nama);
        System.out.println("Jenis Kelamin  : " + (dosenTua.jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia           : " + dosenTua.usia + " tahun");
        System.out.println("-----------------------------------");
    }

    public void infoDosenPalingMuda(Dosen03[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen");
            return;
        }

        Dosen03 dosenMuda = arrayOfDosen[0];
        for (Dosen03 dosen : arrayOfDosen) {
            if (dosen.usia < dosenMuda.usia) {
                dosenMuda = dosen;
            }
        }

        System.out.println("\n========== INFO DOSEN PALING MUDA ==========");
        System.out.println("Kode           : " + dosenMuda.kode);
        System.out.println("Nama           : " + dosenMuda.nama);
        System.out.println("Jenis Kelamin  : " + (dosenMuda.jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia           : " + dosenMuda.usia + " tahun");
        System.out.println("-----------------------------------");
    }
}