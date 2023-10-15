package org.example;

public class pegawai {
    private String NIP,nama,alamat;
    private double jumlahHariLembur,gajiPokok,totalGaji;

    public pegawai() { System.out.println("Kostruktor dijalankan..");}
    // Fungsi mutator
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJumlahHariLembur(int jumlahHariLembur) {
        this.jumlahHariLembur = jumlahHariLembur;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Fungsi aksesor
    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setInfo(double HariLembur, double gajiPokok) {
        jumlahHariLembur = HariLembur;
        this.gajiPokok = gajiPokok;
        totalGaji = gajiPokok + (gajiPokok * HariLembur * 0.01);
    }

    // Method overloading untuk perhitungan total gaji
    public void setInfo(double gajiPokok) {
        this.gajiPokok = gajiPokok;
        jumlahHariLembur = 3;
        totalGaji = gajiPokok + (gajiPokok * jumlahHariLembur * 0.01);
    }

    public void cetak() {
        System.out.println("KTP Karyawan : " + getNIP());
        System.out.println("Nama Karyawan : " + getNama());
        System.out.println("Alamat Karyawan: " + getAlamat());
        System.out.println("Hari Lembur Karyawan : " + jumlahHariLembur);
        System.out.println("Gaji Pokok Karyawan: " + gajiPokok);
        System.out.println("Total Gaji Karyawan: " + totalGaji);
    }
}