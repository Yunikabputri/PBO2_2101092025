/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yunika.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import yunika.model.Peminjaman;

/**
 *
 * @author ynkax25
 */
public class PeminjamanDaoImpl implements PeminjamanDao {
    

    public void insert(Connection con, Peminjaman peminjaman) throws Exception {
        String sql = "insert into peminjaman"
                + " values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, peminjaman.getKodeAnggota());
        ps.setString(2, peminjaman.getKodeBuku());
        ps.setString(3, peminjaman.getTglPinjam());
        ps.setString(4, peminjaman.getTglKembali());
        ps.executeUpdate();
        
    }
    
    public void update(Connection con, Peminjaman peminjaman) throws Exception {
        String sql = 
                "update anggota set namaanggota=?, alamat=?, jeniskelamin=? where kodeanggota=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, peminjaman.getKodeAnggota());
        ps.setString(2, peminjaman.getKodeBuku());
        ps.setString(3, peminjaman.getTglPinjam());
        ps.setString(4, peminjaman.getTglKembali());
        ps.executeUpdate();
        
    }
    
    public void delete(Connection con, Peminjaman peminjaman) throws Exception {
        String sql = "delete from peminjaman "
                + "where kodeanggota = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, peminjaman.getKodeAnggota());
        ps.executeUpdate();
    }
    
    public Peminjaman getPeminjaman(Connection con, String kode) throws Exception {
        String sql = 
                "select * from peminjaman where kodeanggota = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kode);
        ResultSet rs = ps.executeQuery();
        Peminjaman peminjaman = null;
        if (rs.next()){
            peminjaman = new Peminjaman();
            peminjaman.setKodeAnggota(rs.getString(1));
            peminjaman.setKodeBuku(rs.getString(2));
            peminjaman.setTglPinjam(rs.getString(3));
            peminjaman.setTglKembali(rs.getString(4));
        }
        return peminjaman;
        
        
    }
    
    public List<Peminjaman> getAllPeminjaman(Connection con)throws Exception {
        String sql = "select * from peminjaman";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Peminjaman> list = new ArrayList<>();
        Peminjaman peminjaman =null;
        while (rs.next()){
            peminjaman = new Peminjaman();
            peminjaman.setKodeAnggota(rs.getString(1));
            peminjaman.setKodeBuku(rs.getString(2));
            peminjaman.setTglPinjam(rs.getString(3));
            peminjaman.setTglKembali(rs.getString(4));
            list.add(peminjaman);
        }
        return list;
        
        
    }
}
