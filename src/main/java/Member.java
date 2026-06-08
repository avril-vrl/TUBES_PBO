/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.Date;
public class Member extends Pengguna {
    private int nomorMember;
    private Date tanggalDaftar;
    private String statusAktif;
    private Membership membership;
    
    public Member(){ 
}
    public Member(int id, String nama, String email, String noTelp, int nomorMember, Date tanggalDaftar, String statusAktif){
        super(id, nama,email, noTelp);
        this.nomorMember = nomorMember;
        this.tanggalDaftar= tanggalDaftar;
        this.statusAktif = statusAktif;
    }

    @Override
    public String getInfo() {
        return "Member ID: " + getId() + ", Nama: " + getNama() + ", No Member:" + nomorMember;
}

    @Override
    public String getNama() {
        return "MEMBER Nama: " + getNama() + ", No Member: " + nomorMember;
    }
}
   
