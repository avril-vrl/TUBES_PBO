/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
class JadwalLatihan {
    private int idJadwal;
    private String namaKelas;
    private String waktuMulai;
    private int kapasitas;
    private Trainer trainer;

    public JadwalLatihan() {
    }

    public JadwalLatihan(int idJadwal, String namaKelas, String waktuMulai, int kapasitas) {
        this.idJadwal = idJadwal;
        this.namaKelas = namaKelas;
        this.waktuMulai = waktuMulai;
        this.kapasitas = kapasitas;
    }

    // Getter
    public int getIdJadwal() { 
        return idJadwal; 
    }
    
    public String getNamaKelas() { 
        return namaKelas; 
    }
    
    public String getWaktuMulai() {
        return waktuMulai; 
    }
    
    public int getKapasitas() { 
        return kapasitas; 
    }
    public Trainer getTrainer() {
        return trainer; 
    }

    // Setter
    public void setIdJadwal(int idJadwal) { 
        this.idJadwal = idJadwal;
    }
    
    public void setNamaKelas(String namaKelas) { 
        this.namaKelas = namaKelas;
    }
    
    public void setWaktuMulai(String waktuMulai) {
        this.waktuMulai = waktuMulai; 
    }
    
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
    
    public void setTrainer(Trainer trainer) { 
        this.trainer = trainer; 
    }

    public String tambahPeserta(member member) {
        return "Member " + member.getNama() + " ditambahkan ke kelas " + namaKelas;
    }

    public String getWaktu() {
        return waktuMulai;
    }

    public String getInfoTrainer() {
        return null != trainer ? trainer.getNama() : "Tidak ada";
 }

}