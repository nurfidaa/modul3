package org.example;
public class pegawaiData {
    public static void main(String[] args) {
        pegawai karyawanZ , karyawanX;
        karyawanZ = new pegawai();
        karyawanX = new pegawai();

        System.out.println();
        karyawanZ.setNIP("2211103052");
        karyawanZ.setNama("Kevin Pratama");
        karyawanZ.setAlamat("Cirebon");
        karyawanZ.setInfo(10,6500000);
        karyawanZ.cetak();
        System.out.println();

        karyawanX.setNIP("2111605");
        karyawanX.setNama("Gevanda Aliya");
        karyawanX.setAlamat("Pekalongan");
        karyawanX.setInfo(4500000);
        karyawanX.cetak();
    }
}