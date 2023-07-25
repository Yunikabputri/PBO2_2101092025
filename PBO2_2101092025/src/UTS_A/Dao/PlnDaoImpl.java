/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A.Dao;

import UTS_A.Model.Pln;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ynkax25
 */
public class PlnDaoImpl implements PlnDao{
    @Override
    public void insert(Connection con, Pln pln) throws Exception {
        String sql = "insert into anggota values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, pln.getKodePelanggan());
        ps.setString(2, pln.getNamaPelanggan());
        ps.setString(3, pln.getMBI());
        ps.setString(3, pln.getMBL());
        ps.setString(4, pln.getTarif());
        ps.setString(4, pln.getPotongan());
        ps.executeUpdate();
        
    }
    
    public void update(Connection con, Pln pln) throws Exception {
        String sql = 
                "update pln set namapelanggan=?, mbi=?, mbl=?, tarif=?, potongan=? where kodepelanggan=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, pln.getKodePelanggan());
        ps.setString(2, pln.getNamaPelanggan());
        ps.setString(3, pln.getMBI());
        ps.setString(3, pln.getMBL());
        ps.setString(3, pln.getTarif());
        ps.setString(3, pln.getPotongan());
        
        ps.executeUpdate();
        
    }
    
    public void delete(Connection con, Pln pln) throws Exception {
        String sql = "delete from pln "
                + "where kodepelanggan = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, pln.getKodePelanggan());
        ps.executeUpdate();
    }
    
    public Pln getPln(Connection con, String kode) throws Exception {
        String sql = 
                "select * from pln where kodepelanggan = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kode);
        ResultSet rs = ps.executeQuery();
        Pln pln = null;
        if (rs.next()){
            pln = new Pln();
            pln.setKodePelanggan(rs.getString(1));
            pln.setNamaPelanggan(rs.getString(2));
            pln.setMBI(rs.getString(3));
            pln.setMBL(rs.getString(4));
            pln.setTarif(rs.getString(5));
            pln.setPotongan(rs.getString(6));
        }
        return pln;
        
        
    }
    
    public List<Pln> getAllPln(Connection con)throws Exception {
        String sql = "select * from pln";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Pln> list = new ArrayList<>();
        Pln pln = null;
        while (rs.next()){
            pln = new pln();
            pln.setKodePelanggan(rs.getString(1));
            pln.setNamaPelanggan(rs.getString(2));
            pln.setMBI(rs.getString(3));
            pln.setMBL(rs.getString(4));
            pln.setTarif(rs.getString(5));
            pln.setPotongan(rs.getString(6));
            
            list.add(pln);
        }
        return list;
        
        
    }

    @Override
    public void insert(Connection con, Pln pln) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Connection con, Pln pln) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Connection con, Pln pln) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Pln getPln(Connection con, String Kode) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Pln> getAllPln(Connection con) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
