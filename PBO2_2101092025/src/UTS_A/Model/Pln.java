/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A.Model;

/**
 *
 * @author ynkax25
 */
public class Pln {
    private String KodePelanggan;
    private String NamaPelanggan;
    private String MBI;
    private String MBL;
    private String Tarif;
    private String Potongan;
    
    public Pln(){
        
    }

    public Pln(String KodePelanggan, String NamaPelanggan, String MBI, String MBL, String Tarif, String Potongan) {
        this.KodePelanggan = KodePelanggan;
        this.NamaPelanggan = NamaPelanggan;
        this.MBI = MBI;
        this.MBL = MBL;
        this.Tarif = Tarif;
        this.Potongan = Potongan;
    }
    

    public String getKodePelanggan() {
        return KodePelanggan;
    }

    public void setKodePelanggan(String KodePelanggan) {
        this.KodePelanggan = KodePelanggan;
    }

    public String getNamaPelanggan() {
        return NamaPelanggan;
    }

    public void setNamaPelanggan(String NamaPelanggan) {
        this.NamaPelanggan = NamaPelanggan;
    }

    public String getMBI() {
        return MBI;
    }

    public void setMBI(String MBI) {
        this.MBI = MBI;
    }
    
    public String getMBL() {
        return MBL;
    }

    public void setMBL(String MBL) {
        this.MBL = MBL;
    }
    
    public String getTarif() {
        return Tarif;
    }

    public void setTarif(String Tarif) {
        this.Tarif = Tarif;
    }
    
    public String Potongan() {
        return Potongan;
    }

    public void setPotongan(String Potongan) {
        this.Potongan = Potongan;
    }
}
