/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.Date;
public class member extends pengguna {
    private int nomorMember;
    private Date tanggalDaftar;
    private String statusAktif;
    private Membership membership;
    private JadwalList jadwalLatihan;
    
    public member(){ 
}
    public member(int id, String nama, String email, String noTelp, int nomorMember, Date tanggalDaftar, String statusAktif){
        super(id, nama,email, noTelp);
        this.nomorMember = nomorMember;
        this.tanggalDaftar= tanggalDaftar;
        this.statusAktif = statusAktif;
    }
}
