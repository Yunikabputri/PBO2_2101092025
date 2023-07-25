/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_2101092025;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import yunika.dao.Koneksi;

/**
 *
 * @author ynkax25
 */
public class PBO2_2101092025 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws ClassNotFoundException  {
        // TODO code application logic here
        
        Koneksi koneksi = new Koneksi();
        try {
            Connection con = koneksi.getKoneksi();
            JOptionPane.showMessageDialog(null, "Koneksi Ok");
        }  catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error :" + ex.getMessage());
            Logger.getLogger(PBO2_2101092025.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
