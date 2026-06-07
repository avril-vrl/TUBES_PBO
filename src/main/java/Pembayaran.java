/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.Date;
public class Pembayaran implements IPembayaran {
    private int idPembayaran;
    private double jumlah;
    private String metodePembayaran;
    private Date tanggal;
    private String status;

    public Pembayaran() {
    }

    public Pembayaran(int idPembayaran, double jumlah, String metodePembayaran, Date tanggal) {
        this.idPembayaran = idPembayaran;
        this.jumlah = jumlah;
        this.metodePembayaran = metodePembayaran;
        this.tanggal = tanggal;
        this.status = "pending";
    }

    // Getter
    public int getIdPembayaran() {
        return idPembayaran; 
    }
    
    public double getJumlah() {
        return jumlah; 
    }
    
    public String getMetode() { 
        return metodePembayaran;
    }
    
    public Date getTanggal() {
        return tanggal;
    }
    
    public String getStatus() {
        return status;
    }

    // Setter
    public void setIdPembayaran(int idPembayaran) {
        this.idPembayaran = idPembayaran;
    }
    
    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }
    
    public void setMetodePembayaran(String metodePembayaran){
        this.metodePembayaran = metodePembayaran;
    }
    
    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal; 
    }
    
    public void setStatus(String status) {
        this.status = status; 
    }
   

    public String prosesPembayaran() {
        this.status = "Lunas";
        return "Pembayaran ID" + idPembayaran + " sebesar Rp"
                + String.format("%,.0f", jumlah) + " berhasil diproses via " + metodePembayaran;
    }

    public String getBuktiPembayaran() {
        return "BUKTI PEMBAYARAN \n"
                + "ID     : " + idPembayaran + "\n"
                + "Jumlah : Rp" + String.format("%,.0f", jumlah) + "\n"
                + "Metode : " + metodePembayaran + "\n"
                + "Tanggal: " + tanggal + "\n"
                + "Status : " + status;
    }

    public String refund() {
        this.status = "Refund";
        return "Refund pembayaran ID-" + idPembayaran + " berhasil.";
    }

    @Override
    public String validasi(String data) {
        if (data == null || data.isEmpty()) return "Gagal : Pembayaran tidak valid.";
        return "Valid : Pembayaran " + data + "telah divalidasi";
    }

    @Override
    public String konfirmasi(int idPembayaran) {
        return "Konfirmasi: Pembayaran ID-" + idPembayaran + " telah dikonfirmasi.";
    }
}
