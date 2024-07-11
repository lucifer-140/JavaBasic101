package Java_GUI;

import javax.swing.*;
import java.awt.*;

public class Main { 

    public static void main(String[] args) {
        JFrame frame = new JFrame("Menghitung Volume Persegi Panjang");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420, 350);
        
        // Create a panel for the contents
        JPanel panel = new JPanel();
        panel.setLayout(null); 

        // Components
        JLabel lblTitle = new JLabel("Menghitung Persegi Panjang");
        JLabel lblPanjang = new JLabel("Panjang:");
        JLabel lblLebar = new JLabel("Lebar:");
        JLabel lblTinggi = new JLabel("Tinggi:");
        JTextField txtPanjang = new JTextField(15);
        JTextField txtLebar = new JTextField(15);
        JTextField txtTinggi = new JTextField(15);
        JButton btnHitung = new JButton("Hitung");
        JLabel lblHasil = new JLabel("Hasil:");

        // Layout (manual positioning)
        lblTitle.setBounds(130, 20, 200, 25);
        lblPanjang.setBounds(50, 70, 80, 25);
        txtPanjang.setBounds(140, 70, 200, 25);
        lblLebar.setBounds(50, 110, 80, 25);
        txtLebar.setBounds(140, 110, 200, 25);
        lblTinggi.setBounds(50, 150, 80, 25);
        txtTinggi.setBounds(140, 150, 200, 25);
        btnHitung.setBounds(175, 190, 80, 30);
        lblHasil.setBounds(50, 240, 80, 25);

        // Add components to the panel
        panel.add(lblTitle);
        panel.add(lblPanjang);
        panel.add(txtPanjang);
        panel.add(lblLebar);
        panel.add(txtLebar);
        panel.add(lblTinggi);
        panel.add(txtTinggi);
        panel.add(btnHitung);
        panel.add(lblHasil); 

        // Add the panel to the frame
        frame.add(panel);  

        // Event Listener
        btnHitung.addActionListener(e -> {
            // Implement your calculation logic here.
        });

        frame.setVisible(true);
    }
}
