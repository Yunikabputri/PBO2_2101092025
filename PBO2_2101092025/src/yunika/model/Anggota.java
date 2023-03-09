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
    private String kodeAnggota;
    private String namaAnggota;
    private String alamat;
    private String jenisKelamin;
    
    public Anggota(){
    
    }

    public Anggota(String kodeAnggota, String namaAnggota, String alamat, String jenisKelamin) {
        this.kodeAnggota = kodeAnggota;
        this.namaAnggota = namaAnggota;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    
    public String getKodeanggota() {
        return kodeAnggota;
    }

    public void setKodeanggota(String kodeAnggota) {
        this.kodeAnggota = kodeAnggota;
    }

    public String getNamaanggota() {
        return namaAnggota;
    }

    public void setNamaanggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    public String getalamat() {
        return alamat;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    public String getjenisKelamin() {
        return jenisKelamin;
    }

    public void setjenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
}
