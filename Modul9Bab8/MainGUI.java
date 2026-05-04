package Modul9Bab8;

import java.awt.*;
import java.awt.event.*;

public class MainGUI extends Frame {
    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    Button btnHitung, btnTampil;
    TextArea areaHasil;
    CheckboxGroup cbg;
    Checkbox cbPemlan, cbASD, cbMatkomlan, cbProbstat;

    double nilaiPemlan, nilaiASD, nilaiMatkomlan, nilaiProbstat;

    public MainGUI() {
        setLayout(null);

        lbJudul = new Label("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Arial", Font.BOLD, 14));
        add(lbJudul);
        lbJudul.setBounds(100, 30, 170, 20);

        cbg = new CheckboxGroup();
        cbPemlan = new Checkbox("Pemlan", cbg, false);
        cbASD = new Checkbox("ASD", cbg, false);
        cbMatkomlan = new Checkbox("Matkomlan", cbg, false);
        cbProbstat = new Checkbox("Probstat", cbg, false);

        add(cbPemlan).setBounds(100, 60, 100, 20);
        add(cbASD).setBounds(200, 60, 100, 20);
        add(cbMatkomlan).setBounds(100, 80, 100, 20);
        add(cbProbstat).setBounds(200, 80, 100, 20);

        lbTugas = new Label("Tugas : ");
        add(lbTugas).setBounds(100, 110, 70, 20);
        txtTugas = new TextField("0");
        add(txtTugas).setBounds(200, 110, 60, 20);

        lbKuis = new Label("Kuis : ");
        add(lbKuis).setBounds(100, 140, 70, 20);
        txtKuis = new TextField("0");
        add(txtKuis).setBounds(200, 140, 60, 20);

        lbUTS = new Label("UTS : ");
        add(lbUTS).setBounds(100, 170, 70, 20);
        txtUTS = new TextField("0");
        add(txtUTS).setBounds(200, 170, 60, 20);

        lbUAS = new Label("UAS : ");
        add(lbUAS).setBounds(100, 200, 70, 20);
        txtUAS = new TextField("0");
        add(txtUAS).setBounds(200, 200, 60, 20);

        lbHasil = new Label("Hasil : ");
        add(lbHasil).setBounds(100, 230, 70, 20);
        txtHasil = new TextField("0");
        add(txtHasil).setBounds(200, 230, 60, 20);

        btnHitung = new Button("Hitung");
        add(btnHitung).setBounds(120, 260, 100, 20);

        btnTampil = new Button("Tampilkan nilai semua matkul");
        add(btnTampil).setBounds(80, 290, 200, 20);

        areaHasil = new TextArea();
        add(areaHasil).setBounds(80, 320, 200, 100);

        btnHitung.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int tugas = Integer.parseInt(txtTugas.getText().trim());
                int kuis = Integer.parseInt(txtKuis.getText().trim());
                int uts = Integer.parseInt(txtUTS.getText().trim());
                int uas = Integer.parseInt(txtUAS.getText().trim());

                MataKuliah mk = null;
                if (cbPemlan.getState()) {
                    mk = new Pemlan(tugas, kuis, uts, uas);
                    nilaiPemlan = mk.hitungNilaiAkhir();
                    txtHasil.setText(String.valueOf(nilaiPemlan));
                } else if (cbASD.getState()) {
                    mk = new ASD(tugas, kuis, uts, uas);
                    nilaiASD = mk.hitungNilaiAkhir();
                    txtHasil.setText(String.valueOf(nilaiASD));
                } else if (cbMatkomlan.getState()) {
                    mk = new Matkomlan(tugas, kuis, uts, uas);
                    nilaiMatkomlan = mk.hitungNilaiAkhir();
                    txtHasil.setText(String.valueOf(nilaiMatkomlan));
                } else if (cbProbstat.getState()) {
                    mk = new Probstat(tugas, kuis, uts, uas);
                    nilaiProbstat = mk.hitungNilaiAkhir();
                    txtHasil.setText(String.valueOf(nilaiProbstat));
                }
            }
        });

        btnTampil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                areaHasil.setText("");
                areaHasil.append("HASIL NILAI SEMUA MATA KULIAH\n");
                areaHasil.append(String.format("%-10s : %.2f\n", "Pemlan", nilaiPemlan));
                areaHasil.append(String.format("%-10s : %.2f\n", "ASD", nilaiASD));
                areaHasil.append(String.format("%-10s : %.2f\n", "Matkomlan", nilaiMatkomlan));
                areaHasil.append(String.format("%-10s : %.2f\n", "Probstat", nilaiProbstat));
            }
        });
    }

    public static void main(String[] args) {
        MainGUI window = new MainGUI();
        window.setTitle("Hitung Nilai Akhir");
        window.setSize(400, 480);
        window.setVisible(true);
    }
}

