package Modul9Bab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormPendaftaran extends JFrame {
    private JTextField txtNama, txtTanggal, txtNoPendaftaran, txtTelp, txtAlamat, txtEmail;
    private JButton btnSubmit;

    public FormPendaftaran() {
        setTitle("Form Daftar Ulang Mahasiswa Baru");
        setSize(400, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblNama = new JLabel("Nama Lengkap:");
        lblNama.setBounds(30, 30, 120, 20);
        add(lblNama);
        txtNama = new JTextField();
        txtNama.setBounds(160, 30, 200, 20);
        add(txtNama);

        JLabel lblTanggal = new JLabel("Tanggal Lahir:");
        lblTanggal.setBounds(30, 60, 120, 20);
        add(lblTanggal);
        txtTanggal = new JTextField();
        txtTanggal.setBounds(160, 60, 200, 20);
        add(txtTanggal);

        JLabel lblNoPendaftaran = new JLabel("No. Pendaftaran:");
        lblNoPendaftaran.setBounds(30, 90, 120, 20);
        add(lblNoPendaftaran);
        txtNoPendaftaran = new JTextField();
        txtNoPendaftaran.setBounds(160, 90, 200, 20);
        add(txtNoPendaftaran);

        JLabel lblTelp = new JLabel("No. Telp:");
        lblTelp.setBounds(30, 120, 120, 20);
        add(lblTelp);
        txtTelp = new JTextField();
        txtTelp.setBounds(160, 120, 200, 20);
        add(txtTelp);

        JLabel lblAlamat = new JLabel("Alamat:");
        lblAlamat.setBounds(30, 150, 120, 20);
        add(lblAlamat);
        txtAlamat = new JTextField();
        txtAlamat.setBounds(160, 150, 200, 20);
        add(txtAlamat);

        JLabel lblEmail = new JLabel("E-mail:");
        lblEmail.setBounds(30, 180, 120, 20);
        add(lblEmail);
        txtEmail = new JTextField();
        txtEmail.setBounds(160, 180, 200, 20);
        add(txtEmail);

        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(140, 220, 100, 30);
        add(btnSubmit);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txtNama.getText().isEmpty() || txtTanggal.getText().isEmpty() ||
                        txtNoPendaftaran.getText().isEmpty() || txtTelp.getText().isEmpty() ||
                        txtAlamat.getText().isEmpty() || txtEmail.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Semua kolom harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                } else {
                    int confirm = JOptionPane.showConfirmDialog(null, "Apakah anda yakin data yang Anda isi sudah benar?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
                    if (confirm == JOptionPane.OK_OPTION) {
                        tampilkanData();
                    }
                }
            }
        });
    }

    private void tampilkanData() {
        JFrame frameData = new JFrame("Data Mahasiswa");
        frameData.setSize(400, 300);
        frameData.setLocationRelativeTo(null);
        frameData.setLayout(new GridLayout(6, 2));

        frameData.add(new JLabel("Nama :"));
        frameData.add(new JLabel(txtNama.getText()));
        frameData.add(new JLabel("Tanggal Lahir :"));
        frameData.add(new JLabel(txtTanggal.getText()));
        frameData.add(new JLabel("No. Pendaftaran :"));
        frameData.add(new JLabel(txtNoPendaftaran.getText()));
        frameData.add(new JLabel("No. Telp :"));
        frameData.add(new JLabel(txtTelp.getText()));
        frameData.add(new JLabel("Alamat :"));
        frameData.add(new JLabel(txtAlamat.getText()));
        frameData.add(new JLabel("E-mail :"));
        frameData.add(new JLabel(txtEmail.getText()));

        frameData.setVisible(true);
    }

    public static void main(String[] args) {
        new FormPendaftaran().setVisible(true);
    }
}