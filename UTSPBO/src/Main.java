public class Main {
    public static void main(String[] args) {
        System.out.println("Nama    : Muhammad Farhan Anwar Wahyudi");
        System.out.println("NIM     : 2100018195");
        System.out.println("Kelas   : D");
        System.out.println("UTS");
        System.out.println("\n");
        Tendik tndk = new Tendik();
        tndk.setNama("JOKO");
        tndk.setNip(12345678);
        tndk.setTglLahir("06/09/1999");
        tndk.setAlamat("Jakarta");
        tndk.setJk("Laki-Laki");
        tndk.setTahunMasuk(2010);

        Dosen dsn = new Dosen();
        dsn.setJurusan("Informatika");
        dsn.setNidn(2209345);
        dsn.setNama("Yudi Wahyudi S.Kom");
        dsn.setNip(210000232);
        dsn.setTglLahir("11/10/1976");
        dsn.setJk("Laki-Laki");
        dsn.setAlamat("Palembang");
        dsn.setTahunMasuk(2015);

        System.out.println("Nama Tendik         : "+ tndk.getNama());
        System.out.println("NIP  Tendik         : "+ tndk.getNip());
        System.out.println("Tanggal Lahir       : "+ tndk.getTglLahir());
        System.out.println("Jenis Kelamin       : "+ tndk.getJk());
        System.out.println("Alamat              : "+ tndk.getAlamat());
        System.out.println("Tahun masuk         : "+ tndk.getTahunMasuk());
        System.out.println("Gaji pokok          : "+tndk.gajiTotal());
        System.out.println("Upah lembur(20 jam) : "+ tndk.lembur(20));
        System.out.println("Gaji total          : "+ tndk.gajiTotal(20));

        System.out.println("\n");
        System.out.println("Nama Dosen             : "+ dsn.getNama());
        System.out.println("NIDN                   : " +dsn.getNidn());
        System.out.println("Jurusan                : " + dsn.getJurusan());
        System.out.println("NIP Dosen              : "+ dsn.getNip());
        System.out.println("Tanggal Lahir          : "+ dsn.getTglLahir());
        System.out.println("Jenis Kelamin          : "+ dsn.getJk());
        System.out.println("Alamat                 : "+ dsn.getAlamat());
        System.out.println("Tahun masuk            : "+ dsn.getTahunMasuk());
        System.out.println("Gaji pokok             : "+ dsn.gajiTotal());
        System.out.println("Mengajar lebih (6 SKS) : "+ dsn.mengajarLebih(6));
        System.out.println("Gaji total          : "+ dsn.gajiTotal(6));

    }
}