/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yunika.dao;

import java.util.List;
import yunika.model.Anggota;
import java.sql.Connection;


/**
 *
 * @author ynkax25
 */
public interface AnggotaDao {
    public void insert(Connection con, Anggota anggota) throws Exception;
    public void update(Connection con, Anggota anggota) throws Exception;
    public void delete(Connection con, Anggota anggota) throws Exception;
    public Anggota getAnggota(Connection con, String Kode) throws Exception;
    public List<Anggota> getAllAnggota(Connection con)throws Exception;
}
