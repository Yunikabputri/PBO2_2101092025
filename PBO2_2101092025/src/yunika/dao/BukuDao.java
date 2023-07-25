/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yunika.dao;

import yunika.model.Buku;
import java.sql.Connection;
import java.util.List;
/**
 *
 * @author ynkax25
 */

public interface BukuDao {
    public void insert(Connection con, Buku buku) throws Exception;
    public void update(Connection con, Buku buku) throws Exception;
    public void delete(Connection con, Buku buku) throws Exception;
    public Buku getBuku(Connection con, String kode) throws Exception;
    public List<Buku> getAllBuku(Connection con) throws Exception;
}
