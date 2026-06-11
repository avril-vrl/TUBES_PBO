/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author USER
 */
public class Member extends Pengguna {
    private int nomorMember;
    private String tanggalDaftar;
    private String statusAktif;

    public int getNomorMember() {
        return nomorMember;
    }

    public void setNomorMember(int nomorMember) {
        this.nomorMember = nomorMember;
    }

    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    public void setTanggalDaftar(String tanggalDaftar) {
        this.tanggalDaftar = tanggalDaftar;
    }

    public String getStatusAktif() {
        return statusAktif;
    }

    public void setStatusAktif(String statusAktif) {
        this.statusAktif = statusAktif;
    }

    @Override
    public String tampilInfo() {
        return "Member: " + nama + " - Status: " + statusAktif;
    }
}