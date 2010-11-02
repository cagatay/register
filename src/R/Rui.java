/*
 * This program is free software. It comes without any warranty, to
 * the extent permitted by applicable law. You can redistribute it
 * and/or modify it under the terms of the Do What The Fuck You Want
 * To Public License, Version 2, as published by Sam Hocevar. See
 * http://sam.zoy.org/wtfpl/COPYING for more details.
*/

/*
 * Rui.java
 *
 * Created on Jan 28, 2009, 10:36:20 PM
 */

package R;

import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.net.*;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author cagatay
 */
public class Rui extends javax.swing.JFrame {

    private void enableAll(boolean enable) {
        crnField1.setEnabled(enable);
        crnField2.setEnabled(enable);
        crnField3.setEnabled(enable);
        crnField4.setEnabled(enable);
        crnField5.setEnabled(enable);
        crnField6.setEnabled(enable);
        crnField7.setEnabled(enable);
        crnField8.setEnabled(enable);
        crnField9.setEnabled(enable);
        crnField10.setEnabled(enable);

        noField.setEnabled(enable);
        pinField.setEnabled(enable);
        nodeCombo.setEnabled(enable);
        dersList.setEnabled(enable);
    }

    private void clearAll() {
        crnField1.setText("     ");
        crnField1.setText("     ");
        crnField1.setText("     ");
        crnField1.setText("     ");
        crnField1.setText("     ");
        crnField1.setText("     ");
        crnField1.setText("     ");
        crnField1.setText("     ");
        crnField1.setText("     ");
        crnField1.setText("     ");
    }

    /** Creates new form Rui */
    public Rui() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardPanel = new javax.swing.JPanel();
        firstCard = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        noField = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        pinField = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        nodeCombo = new javax.swing.JComboBox();
        secondCard = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dersList = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        processLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        crnField1 = new javax.swing.JFormattedTextField();
        crnField2 = new javax.swing.JFormattedTextField();
        crnField3 = new javax.swing.JFormattedTextField();
        crnField4 = new javax.swing.JFormattedTextField();
        crnField5 = new javax.swing.JFormattedTextField();
        crnField6 = new javax.swing.JFormattedTextField();
        crnField7 = new javax.swing.JFormattedTextField();
        crnField8 = new javax.swing.JFormattedTextField();
        crnField9 = new javax.swing.JFormattedTextField();
        crnField10 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("R!");
        setResizable(false);

        cardPanel.setLayout(new java.awt.CardLayout());

        jLabel2.setText("<html><b>No:</b></html>");

        try {
            noField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("<html><b>Şifre:</b></html>");

        nodeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "node1", "node2", "node3", "node6", "node7", "node8" }));

        javax.swing.GroupLayout firstCardLayout = new javax.swing.GroupLayout(firstCard);
        firstCard.setLayout(firstCardLayout);
        firstCardLayout.setHorizontalGroup(
            firstCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(firstCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(pinField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
            .addGroup(firstCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nodeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        firstCardLayout.setVerticalGroup(
            firstCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstCardLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pinField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nodeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        noField.setText("");

        cardPanel.add(firstCard, "card2");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jScrollPane1.setViewportView(dersList);

        jLabel4.setText("<html><b>Alınan dersler:</b></html>");

        javax.swing.GroupLayout secondCardLayout = new javax.swing.GroupLayout(secondCard);
        secondCard.setLayout(secondCardLayout);
        secondCardLayout.setHorizontalGroup(
            secondCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(secondCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        secondCardLayout.setVerticalGroup(
            secondCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondCardLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );

        cardPanel.add(secondCard, "card3");

        okButton.setText("Tamam");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("<html><b>CRNler:</b></html>");

        try {
            crnField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            crnField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            crnField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            crnField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            crnField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            crnField6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            crnField7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            crnField8.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            crnField9.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            crnField10.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(crnField9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(crnField10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(crnField1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(crnField2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(crnField3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(crnField4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(crnField5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(crnField6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(crnField7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(crnField8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(crnField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(crnField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(crnField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(crnField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(crnField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(crnField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(crnField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(crnField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(crnField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(crnField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(processLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
            .addComponent(okButton, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(72, Short.MAX_VALUE))
            .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(processLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        if(status == 0) {
            status++;
            enableAll(false);
            okButton.setText("İptal");
            sid = noField.getText();
            pin = pinField.getText();
            host = nodes[nodeCombo.getSelectedIndex()];

            for(int i=0; i<10; i++) {
                String tmp = ((JTextField)(jPanel1.getComponent(i))).getText().replaceAll("\\s", "");
                post += "CRN2=" + tmp + "&";
            }

            post += "komut=Submit+Changes++";

            Task task = new Task(status);
            task.execute();
        } else if(status == 1) {
            
        }
        

    }//GEN-LAST:event_okButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardPanel;
    private javax.swing.JFormattedTextField crnField1;
    private javax.swing.JFormattedTextField crnField10;
    private javax.swing.JFormattedTextField crnField2;
    private javax.swing.JFormattedTextField crnField3;
    private javax.swing.JFormattedTextField crnField4;
    private javax.swing.JFormattedTextField crnField5;
    private javax.swing.JFormattedTextField crnField6;
    private javax.swing.JFormattedTextField crnField7;
    private javax.swing.JFormattedTextField crnField8;
    private javax.swing.JFormattedTextField crnField9;
    private javax.swing.JList dersList;
    private javax.swing.JPanel firstCard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JFormattedTextField noField;
    private javax.swing.JComboBox nodeCombo;
    private javax.swing.JButton okButton;
    private javax.swing.JPasswordField pinField;
    private javax.swing.JLabel processLabel;
    private javax.swing.JPanel secondCard;
    // End of variables declaration//GEN-END:variables

    private String sid, pin;
    private String post = "RSTS=&CRN1=&num_kayit=0&";

    private String[] nodes = {
                                "http://node1.sis.itu.edu.tr:8092",
                                "http://node2.sis.itu.edu.tr:8092",
                                "http://node3.sis.itu.edu.tr:8092",
                                "http://node6.sis.itu.edu.tr:8092",
                                "http://node7.sis.itu.edu.tr:8092",
                                "http://node8.sis.itu.edu.tr:8092",
                            };

    private String login = "/pls/pprd/twbkwbis.P_ValLogin";
    private String kisayol = "/pls/pprd/kyol.P_Kisa";
    private String addDrop = "/pls/pprd/kayit.P_AddDrop";
    private String host = "";
    private String cookie = "";
    private String[] alinan_dersler = new String[15];
    private String hata = "";
    private String num_kayit;

    private int status = 0;

    private class Task extends SwingWorker<Void, Void> {
        private int status = 0;
        public Task(int i) {
            super();
            status = i;
        }
        @Override
        protected Void doInBackground() throws Exception {
            if(status == 1) {
                URLConnection connection = (new URL(host + login)).openConnection();
                connection.setDoOutput(true);
                connection.setRequestProperty("Cookie", "TESTID=set");
                processLabel.setText("Bağlanılıyor...");
                if(isCancelled()) return null;
                OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
                processLabel.setText("Sisteme giriliyor...");
                out.write("sid=" + sid + "&pin=" + pin);
                out.close();
                if(isCancelled()) return null;
                cookie = connection.getHeaderField("Set-Cookie");
                if(cookie == null) {
                    JOptionPane.showMessageDialog(rootPane, "Şifre hatalı!", "Hata", JOptionPane.ERROR_MESSAGE);
                    processLabel.setText("");
                    enableAll(true);
                    pinField.setText("");
                    return null;
                }
                if(isCancelled()) return null;
                connection = (new URL(host + kisayol)).openConnection();
                connection.setRequestProperty("Cookie", cookie);
                connection.connect();
                cookie = connection.getHeaderField("Set-Cookie");

                connection = (new URL(host + addDrop)).openConnection();
                connection.setDoOutput(true);
                connection.setRequestProperty("Cookie", cookie);

                processLabel.setText("CRNler gönderiliyor...");
                if(isCancelled()) return null;
                out = new OutputStreamWriter(connection.getOutputStream());
                out.write(post);
                out.close();
                okButton.setEnabled(false);
                cookie = connection.getHeaderField("Set-Cookie");
                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "ISO-8859-9"));
                while(!br.readLine().equals("</TR>")) continue;
                int i=0;
                while(true) {
                    if(br.readLine().equals("</TABLE>")) break;
                    br.readLine();
                    alinan_dersler[i] = br.readLine().replaceAll("\\<.*?\\>", "") + " " + br.readLine().replaceAll("\\<.*?\\>", "") + br.readLine().replaceAll("\\<.*?\\>", "");
                    br.readLine();
                    i++;
                }
                for(i=0; i<11; i++) br.readLine();
                if(br.readLine().contains("Error")) {
                    while(true) {
                        hata += br.readLine();
                        if(hata.contains("</table>")) {
                            break;
                        }
                    }
                }
                num_kayit = br.readLine().substring(45, 46);
            }
            return null;
        }

        @Override
        protected void done() {
            if(!hata.equals("")) JOptionPane.showMessageDialog(rootPane, "<html>" + hata + "</html>", "Bazı dersler alınamadı.", JOptionPane.INFORMATION_MESSAGE);
            enableAll(true);
            clearAll();
            processLabel.setText("");

            for(int i=0; i<15; i++) {
                if(alinan_dersler[i] == null) break;
                else dersList.setListData(alinan_dersler);
            }

            ((CardLayout)cardPanel.getLayout()).next(cardPanel);
            okButton.setEnabled(true);
            okButton.setText("Tamam");
            JOptionPane.showMessageDialog(rootPane, "<html>Listede aldığınız dersleri görebilirsiniz.<br><b>Drop etmek istediğiniz</b> dersler varsa seçin. <br>(CTRL'ye basılı tutarak çoklu seçim yapabilirsiniz)<br>yeni CRN'leri girip Tamam'a basın.</html>", "Dikkat!", JOptionPane.WARNING_MESSAGE);
            status++;
        }

    }
}
