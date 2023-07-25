/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yunika.dao;

import java.sql.Connection;
import java.util.List;
import yunika.model.Peminjaman;

/**
 *
 * @author ynkax25
 */
public interface PeminjamanDao {
    public void insert(Connection con, Peminjaman peminjaman) throws Exception;
    public void update(Connection con, Peminjaman peminjaman) throws Exception;
    public void delete(Connection con, Peminjaman peminjaman) throws Exception;
    public Peminjaman getPeminjaman(Connection con, String Kode) throws Exception;
    public List<Peminjaman> getAllPeminjaman(Connection con)throws Exception;
}

