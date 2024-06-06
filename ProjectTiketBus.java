package projecttiketbus;

import javax.swing.JFrame;

public class ProjectTiketBus {
    public static void main(String[] args) {
        // Membuat instance JFrame
        JFrame frame = new JFrame("Program Pembelian Tiket Bus");
        
        // Membuat instance panel penjualan tiket bus
        login panel = new login();
        
        // Menambahkan panel ke frame
        frame.getContentPane().add(panel);
        
        // Atur ukuran frame
        frame.setSize(615, 550);
        
        // Menentukan operasi default saat menutup frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Menampilkan frame
        frame.setVisible(true);
    }
}
