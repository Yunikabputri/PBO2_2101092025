/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yunika.model;

/**
 *
 * @author ynkax25
 */
public class Anggota {
    private String KodeAnggota;
    private String NamaAnggota;
    private String Alamat;
    private String JenisKelamin;
    
    public Anggota(){
        
    }

    public Anggota(String KodeAnggota, String NamaAnggota, String Alamat, String JenisKelamin) {
        this.KodeAnggota = KodeAnggota;
        this.NamaAnggota = NamaAnggota;
        this.Alamat = Alamat;
        this.JenisKelamin = JenisKelamin;
    }
    
    

    public String getKodeAnggota() {
        return KodeAnggota;
    }

    public void setKodeAnggota(String KodeAnggota) {
        this.KodeAnggota = KodeAnggota;
    }

    public String getNamaAnggota() {
        return NamaAnggota;
    }

    public void setNamaAnggota(String NamaAnggota) {
        this.NamaAnggota = NamaAnggota;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }
    
    
}