/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author USER
 */
public class Membership {

    private int idMembership;
    private String tipe;
    private double harga;
    private String tanggalMulai;
    private String tanggalBerakhir;
    private int durasiHari;

    public int getIdMembership() {
        return idMembership;
    }

    public void setIdMembership(int idMembership) {
        this.idMembership = idMembership;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getTanggalMulai() {
        return tanggalMulai;
    }

    public void setTanggalMulai(String tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    }

    public String getTanggalBerakhir() {
        return tanggalBerakhir;
    }

    public void setTanggalBerakhir(String tanggalBerakhir) {
        this.tanggalBerakhir = tanggalBerakhir;
    }

    public int getDurasiHari() {
        return durasiHari;
    }

    public void setDurasiHari(int durasiHari) {
        this.durasiHari = durasiHari;
    }
}