/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public abstract class pengguna {
    private int id;
    private String nama;
    private String email;
    private String noTelp;
    
    public pengguna(){        
    }
    
    public pengguna(int id, String nama, String email, String noTelp){
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.noTelp = noTelp;        
    }
    
    // getter
    public int getId(){
        return id;
    }
   
    public String getNama(){
        return nama;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getNotelp(){
        return noTelp;
    }
    
    // setter
    public void setId(int id){
        this.id = id;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setNoTelp(String noTelp){
        this.noTelp = noTelp;
    }
    
    public abstract String getInfo();           
}
