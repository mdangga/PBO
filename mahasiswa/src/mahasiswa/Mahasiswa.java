package mahasiswa;

import Koneksi.Koneksi;
import Tampilan.Data_Mahasiswa;

public class Mahasiswa {
    public static void main(String[] args) {
        Koneksi db = new Koneksi();
        db.connect(); 
        
        java.awt.EventQueue.invokeLater(() -> {new Data_Mahasiswa().setVisible(true);});
    }
}
