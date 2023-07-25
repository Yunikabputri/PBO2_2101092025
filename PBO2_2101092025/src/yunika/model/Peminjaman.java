/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yunika.model;

/**
 *
 * @author ynkax25
 */
public class Peminjaman {
    
    private String KodeAnggota;
    private String KodeBuku;
    private String TglPinjam;
    private String TglKembali;
    
    public Peminjaman(){
        
    }

    public Peminjaman(String KodeAnggota, String KodeBuku, String TglPinjam, String TglKembali) {
        this.KodeAnggota = KodeAnggota;
        this.KodeBuku = KodeBuku;
        this.TglPinjam = TglPinjam;
        this.TglKembali = TglKembali;
    }
    
    

    public String getKodeAnggota() {
        return KodeAnggota;
    }

    public void setKodeAnggota(String KodeAnggota) {
        this.KodeAnggota = KodeAnggota;
    }

    public String getKodeBuku() {
        return KodeBuku;
    }

    public void setKodeBuku(String KodeBuku) {
        this.KodeBuku = KodeBuku;
    }

    public String getTglPinjam() {
        return TglPinjam;
    }

    public void setTglPinjam(String TglPinjam) {
        this.TglPinjam = TglPinjam;
    }

    public String getTglKembali() {
        return TglKembali;
    }

    public void setTglKembali(String TglKembali) {
        this.TglKembali = TglKembali;
    }
    
}
