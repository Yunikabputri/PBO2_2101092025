/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A.Controller;

import UTS_A.Dao.PlnDao;
import UTS_A.Model.Pln;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import UTS_A.Controller.PlnController;
import UTS_A.View.FormPln;
import UTS_A.Dao.PlnDao;
import UTS_A.Dao.PlnDaoImpl;
import UTS_A.Dao.PlnKoneksi;
import UTS_A.Model.Pln;
import UTS_A.View.FormPln;

/**
 *
 * @author ynkax25
 */
public class PlnController {
    private FormPln formPln;
    private Pln pln;
    private PlnDao plnDao;
    private Connection con;
    private PlnKoneksi koneksi;
    
    public PlnController(FormPln formPln){
        try {
            this.formPln = formPln;
            PlnDao = new PlnDaoImpl();
            con = new PlnKoneksi().getKoneksi();
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(PlnController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PlnController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
 public void clearForm(){
        formPln.getTxtKodePelanggan().setText("");
        formPln.getTxtNamaPelanggan().setText("");
        formPln.getTxtMBI().setText("");
        formPln.getTxtMBL().setText("");
        formPln.getTxtTarif().setText("");
        formPln.getTxtPotongan().setText("");
    }
    
    
public void insert(){
        try {
            pln = new Pln();
            pln.setKodePelanggan(formPln.getTxtKodePelanggan().getText());
            pln.setNamaPelanggan(
                    formPln.getTxtNamaPelanggan().getText());
            pln.setMBI(
                    formPln.getTxtMBI().getText());
            pln.setMBL (
                    formPln.getTxtMBL().getText());
            pln.setTarif (
                    formPln.getTxtTarif().getText());
            pln.setPotongan (
                    formPln.getTxtPotongan().getText());
            plnDao.insert(con,pln);
            JOptionPane.showMessageDialog(formPln, "Entri Ok");
        } catch (Exception ex) {
            Logger.getLogger(PlnController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

public void update(){
       
        try {
            pln = new Pln();
            pln.setKodePelanggan(formPln.getTxtKodePelanggan().getText());
            pln.setNamaPelanggan(formPln.getTxtNamaPelanggan().getText());
            pln.setMBI(formPln.getTxtMBI().getText());
            pln.setMBL (formPln.getTxtMBL().getText());
            plnDao.update(con,pln);
            JOptionPane.showMessageDialog(formPln, "Update Ok");
        } catch (Exception ex) {
            Logger.getLogger(PlnController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

public void delete(){
     
        try {
            plnDao.delete(con, pln);
            JOptionPane.showMessageDialog(formPln, "Delete Ok");
        } catch (Exception ex) {
            Logger.getLogger(PlnController.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public void cari(){
        try {
            String kode = formPln.getTxtKodePelanggan().getText();
            pln = plnDao.getPln(con,kode);
            if(pln != null){
                formPln.getTxtKodePelanggan().setText(pln.getKodePelanggan());
                formPln.getTxtNamaPelanggan().setText(pln.getNamaPelanggan());
                formPln.getTxtMBI().setText(pln.getMBI());
                formPln.getTxtMBL().setText(pln.getMBL());
                formPln.getTxtTarif().setText(pln.getTarif());
                formPln.getTxtPotongan().setText(pln.getPotongan());
            }else{
                JOptionPane.showMessageDialog(formPln, "Data Tidak Ada");
            }
        } catch (Exception ex) {
            Logger.getLogger(PlnController.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
       
public void kirim(){
        try {
            DefaultTableModel tabel = (DefaultTableModel) formPln.getTblPln().getModel();
            tabel.setRowCount(0);
            List<Pln> list = plnDao.getAllPln(con);
            for (Pln pln1 : list) {
                Object[] row ={
                    pln1.getKodePelanggan(),
                    pln1.getNamaPelanggan(),
                    pln1.getMBI(),
                    pln1.getMBL(),
                    pln1.getTarif(),
                    pln1.getPotongan()
                };
                tabel.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(PlnController.class.getName()).log(Level.SEVERE, null, ex);
        }
     }

    public void kirim() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
