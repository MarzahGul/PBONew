/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agul270423.controller;
import Agul270423.model.Buku;
import Agul270423.model.BukuDaoImp1;
import Agul270423.model.BukuDao;
import Agul270423.view.FormBuku;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author LABP1KOMP
 */
public class BukuController {
    private FormBuku formBuku;
    private BukuDao bukuDao;
    private Buku buku;

    public BukuController(FormBuku formBuku) {
        this.formBuku = formBuku;
        bukuDao = new BukuDaoImp1();
    }
    
    public void bersihForm(){
        formBuku.getTxtKodebuku().setText("");
        formBuku.getTxtJudul().setText("");
        formBuku.getTxtPengarang().setText("");
        formBuku.getTxtPenerbit().setText("");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = 
               (DefaultTableModel) formBuku.getTabelBuku().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Buku> list = bukuDao.getAllBuku();
        for(Buku buku : list){
            Object[] data = {
                buku.getKode(),
                buku.getJudul(),
                buku.getPengarang(),
                buku.getPenerbit()
            };
            tabelModel.addRow(data); 
        }
    }
}
