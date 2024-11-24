package Tugas2;

import java.awt.Image;
import javax.swing.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import org.json.JSONObject;
import org.json.JSONArray;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.imageio.ImageIO;


public class AplikasiCekCuaca extends javax.swing.JFrame {
    private final String apiKey = "b42508d2844a424f45cfdf7a3369629b";
    private final ArrayList<String> favoriteCities = new ArrayList<>();

    public AplikasiCekCuaca() {
        setTitle("Aplikasi Cek Cuaca");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kotaTextField = new javax.swing.JTextField();
        favoritComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cekButton = new javax.swing.JButton();
        favoritButton = new javax.swing.JButton();
        simpanButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cuacaTable = new javax.swing.JTable();
        muatButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        keluarButton = new javax.swing.JButton();
        jLabelCuaca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Masukkan Kota");

        jLabel2.setText("Kota Favorit Anda");

        favoritComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        favoritComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favoritComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("HASIL");

        cekButton.setText("CEK CUACA");
        cekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekButtonActionPerformed(evt);
            }
        });

        favoritButton.setText("TAMBAH");
        favoritButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favoritButtonActionPerformed(evt);
            }
        });

        simpanButton.setText("SIMPAN");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        cuacaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hari", "Tanggal", "Kota", "Suhu", "Kelembapan", "Angin", "Deskripsi"
            }
        ));
        jScrollPane1.setViewportView(cuacaTable);

        muatButton.setText("MUAT DATA");
        muatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muatButtonActionPerformed(evt);
            }
        });

        hapusButton.setText("HAPUS");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        keluarButton.setText("KELUAR");
        keluarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarButtonActionPerformed(evt);
            }
        });

        jLabelCuaca.setText(".");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(kotaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(cekButton)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(favoritComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCuaca, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(favoritButton)
                        .addGap(18, 18, 18)
                        .addComponent(simpanButton)
                        .addGap(18, 18, 18)
                        .addComponent(muatButton)
                        .addGap(18, 18, 18)
                        .addComponent(hapusButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(keluarButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(kotaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cekButton)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(favoritComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabelCuaca, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(favoritButton)
                    .addComponent(simpanButton)
                    .addComponent(muatButton)
                    .addComponent(hapusButton)
                    .addComponent(keluarButton))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keluarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarButtonActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_keluarButtonActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        int selectedRow = cuacaTable.getSelectedRow();
        if (selectedRow != -1) {
            String city = (String) cuacaTable.getValueAt(selectedRow, 1);
            favoriteCities.remove(city);
            favoritComboBox.removeItem(city);

            DefaultTableModel model = (DefaultTableModel) cuacaTable.getModel();
            model.removeRow(selectedRow);

            JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
        } else {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus");
        }
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void muatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muatButtonActionPerformed
        // TODO add your handling code here:
        loadWeatherData();
    }//GEN-LAST:event_muatButtonActionPerformed

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        // TODO add your handling code here:
        saveWeatherData();
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void favoritButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favoritButtonActionPerformed
        // TODO add your handling code here:
        String city = kotaTextField.getText();
        if (!city.isEmpty() && !favoriteCities.contains(city)) {
            favoriteCities.add(city);
            favoritComboBox.addItem(city);
        }
    }//GEN-LAST:event_favoritButtonActionPerformed

    private void cekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekButtonActionPerformed
        // TODO add your handling code here:
        String city = kotaTextField.getText();
        if (city.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan Nama Kota");
            return;
        }
        getWeather(city);
    }//GEN-LAST:event_cekButtonActionPerformed

    private void favoritComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favoritComboBoxActionPerformed
        // TODO add your handling code here:
        String selectedCity = (String) favoritComboBox.getSelectedItem();
        if (selectedCity != null && !selectedCity.trim().isEmpty()) {
            kotaTextField.setText(selectedCity);
        }
    }//GEN-LAST:event_favoritComboBoxActionPerformed

        public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplikasiCekCuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiCekCuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiCekCuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiCekCuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiCekCuaca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cekButton;
    private javax.swing.JTable cuacaTable;
    private javax.swing.JButton favoritButton;
    private javax.swing.JComboBox<String> favoritComboBox;
    private javax.swing.JButton hapusButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCuaca;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluarButton;
    private javax.swing.JTextField kotaTextField;
    private javax.swing.JButton muatButton;
    private javax.swing.JButton simpanButton;
    // End of variables declaration//GEN-END:variables
private void getWeather(String city) {
        try {
            String apiUrl = String.format("http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s", city, apiKey);
            HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            parseWeatherData(response.toString(), city);
        } catch (IOException | org.json.JSONException e) {
            JOptionPane.showMessageDialog(this, "Pengambilan Data Gagal");
        }
    }

    private void parseWeatherData(String jsonData, String city) {
        try {
            JSONObject obj = new JSONObject(jsonData);
            JSONObject main = obj.getJSONObject("main");
            JSONArray weatherArray = obj.getJSONArray("weather");
            JSONObject weather = weatherArray.getJSONObject(0);
            JSONObject wind = obj.getJSONObject("wind");

            java.util.Date currentDate = new java.util.Date();
            SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE", new Locale("id", "ID"));
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            
            String day = dayFormat.format(currentDate);
            String date = dateFormat.format(currentDate);
            String description = weather.getString("description");
            String translatedDescription = translateWeatherDescription(description);
            String iconCode = weather.getString("icon");
            double temp = main.getDouble("temp") - 273.15;
            int humidity = main.getInt("humidity");
            double windSpeed = wind.getDouble("speed");
            

            DefaultTableModel model = (DefaultTableModel) cuacaTable.getModel();
            model.addRow(new Object[]{day, date, city, String.format("%.2f°C", temp), humidity + "%", String.format("%.2f m/s", windSpeed),translatedDescription, iconCode });

            setWeatherIcon(iconCode);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }

    private String translateWeatherDescription(String description) {
        Map<String, String> weatherTranslations = new HashMap<>();
        weatherTranslations.put("clear sky", "Langit Cerah");
        weatherTranslations.put("few clouds", "Sedikit Berawan");
        weatherTranslations.put("scattered clouds", "Berawan Tipis");
        weatherTranslations.put("broken clouds", "Berawan Tebal");
        weatherTranslations.put("overcast clouds", "Mendung");
        weatherTranslations.put("shower rain", "Hujan Gerimis");
        weatherTranslations.put("light rain", "Hujan Ringan");
        weatherTranslations.put("moderate rain", "Hujan Sedang");
        weatherTranslations.put("heavy intensity rain", "Hujan Lebat");
        weatherTranslations.put("thunderstorm", "Badai Petir");
        weatherTranslations.put("snow", "Salju");
        weatherTranslations.put("mist", "Berkabut");
        weatherTranslations.put("fog", "Kabut Tebal");

        return weatherTranslations.getOrDefault(description.toLowerCase(), "Deskripsi Tidak Dikenali: " + description);
    }

    private void setWeatherIcon(String iconCode) {
        try {
            String iconUrl = String.format("http://openweathermap.org/img/wn/%s@2x.png", iconCode);
            Image image = ImageIO.read(new URL(iconUrl));
            jLabelCuaca.setIcon(new ImageIcon(image));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveWeatherData() {
    JFileChooser fileChooser = new JFileChooser();
    int option = fileChooser.showSaveDialog(this);
    if (option == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("Hari,Tanggal,Kota,Suhu,Kelembapan,Angin,Deskripsi\n"); // Header
            DefaultTableModel model = (DefaultTableModel) cuacaTable.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                writer.write(model.getValueAt(i, 0) + ","
                        + model.getValueAt(i, 1) + ","
                        + model.getValueAt(i, 2) + ","
                        + model.getValueAt(i, 3) + ","
                        + model.getValueAt(i, 4) + ","
                        + model.getValueAt(i, 5) + ","
                        + model.getValueAt(i, 6) + "\n");
            }
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data. Periksa file atau izin akses.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}


    private void loadWeatherData() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            DefaultTableModel model = (DefaultTableModel) cuacaTable.getModel();
            model.setRowCount(0);
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(",");
                    model.addRow(new Object[]{data[0], data[1], data[2], data[3], data[4], data[5], data[6]});
                    
                }
                JOptionPane.showMessageDialog(this, "Data berhasil dimuat");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
