/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A.Dao;

import UTS_A.Model.Pln;
import java.sql.Connection;
import java.util.List;


/**
 *
 * @author ynkax25
 */

    public interface PlnDao {
    public void insert(Connection con, Pln pln) throws Exception;
    public void update(Connection con, Pln pln) throws Exception;
    public void delete(Connection con, Pln pln) throws Exception;
    public Pln getPln(Connection con, String Kode) throws Exception;
    public List<Pln> getAllPln(Connection con)throws Exception;
}

