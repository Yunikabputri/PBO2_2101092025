/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yunika.model;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author ynkax25
 */
public class Pengembalian {
    private String kodeanggota;
    private String kodebuku;
    private String tglpinjam;
    private String tgldikembalikan;
    private int terlambat;
    private double denda;
    
    //contruktor

    public Pengembalian() {
    }

    public Pengembalian(String kodeanggota, String kodebuku, String tglpinjam, String tgldikembalikan, int terlambat, double denda) {
        this.kodeanggota = kodeanggota;
        this.kodebuku = kodebuku;
        this.tglpinjam = tglpinjam;
        this.tgldikembalikan = tgldikembalikan;
        this.terlambat = terlambat;
        this.denda = denda;
    }
    
    //acessor

    public String getKodeanggota() {
        return kodeanggota;
    }

    public void setKodeanggota(String kodeanggota) {
        this.kodeanggota = kodeanggota;
    }

    public String getKodebuku() {
        return kodebuku;
    }

    public void setKodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
    }

    public String getTglpinjam() {
        return tglpinjam;
    }

    public void setTglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }
    
    

    public String getTgldikembalikan() {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        Date tgl = new Date();
        tgldikembalikan = s.format(tgl);
        return tgldikembalikan;
    }

    public void setTgldikembalikan(String tgldikembalikan) {
        this.tgldikembalikan = tgldikembalikan;
    }

    public int getTerlambat() {
        //terlambat = tgldikembalikan - tglkembali;
        return terlambat;
    }

    public void setTerlambat(int terlambat) {
        this.terlambat = terlambat;
    }

    public double getDenda() {
        denda = terlambat * 1000;
        return denda;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    }
    
    
}
