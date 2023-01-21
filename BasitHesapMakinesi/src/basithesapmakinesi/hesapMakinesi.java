
package basithesapmakinesi;

public class hesapMakinesi extends javax.swing.JFrame {

    public hesapMakinesi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        çarpma_butonu = new javax.swing.JButton();
        toplama_butonu = new javax.swing.JButton();
        çıkarma_butonu = new javax.swing.JButton();
        bölme_butonu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        birinci_sayi = new javax.swing.JTextField();
        ikinci_sayi = new javax.swing.JTextField();
        sonuç = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        çarpma_butonu.setText("x");
        çarpma_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                çarpma_butonuActionPerformed(evt);
            }
        });

        toplama_butonu.setText("+");
        toplama_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toplama_butonuActionPerformed(evt);
            }
        });

        çıkarma_butonu.setText("-");
        çıkarma_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                çıkarma_butonuActionPerformed(evt);
            }
        });

        bölme_butonu.setText("%");
        bölme_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bölme_butonuActionPerformed(evt);
            }
        });

        jLabel1.setText("Birinci sayi :");

        jLabel2.setText("İkinci sayi :");

        jLabel3.setText("Sonuç :");

        sonuç.setEditable(false);
        sonuç.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonuçActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(çarpma_butonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toplama_butonu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(birinci_sayi, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(ikinci_sayi)
                            .addComponent(sonuç)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(çıkarma_butonu, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(bölme_butonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(birinci_sayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ikinci_sayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sonuç, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toplama_butonu)
                    .addComponent(çıkarma_butonu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(çarpma_butonu)
                    .addComponent(bölme_butonu))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sonuçActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonuçActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sonuçActionPerformed

    private void toplama_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toplama_butonuActionPerformed

        int birinci_sayi = Integer.valueOf(this.birinci_sayi.getText());
        int ikinci_sayi = Integer.valueOf(this.ikinci_sayi.getText());
        
        sonuç.setText(String.valueOf(birinci_sayi+ikinci_sayi));

    }//GEN-LAST:event_toplama_butonuActionPerformed

    private void çıkarma_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_çıkarma_butonuActionPerformed

        int birinci_sayi = Integer.valueOf(this.birinci_sayi.getText());
        int ikinci_sayi = Integer.valueOf(this.ikinci_sayi.getText());
        
        sonuç.setText(String.valueOf(birinci_sayi-ikinci_sayi));
    }//GEN-LAST:event_çıkarma_butonuActionPerformed

    private void çarpma_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_çarpma_butonuActionPerformed

        int birinci_sayi = Integer.valueOf(this.birinci_sayi.getText());
        int ikinci_sayi = Integer.valueOf(this.ikinci_sayi.getText());
        
        sonuç.setText(String.valueOf(birinci_sayi*ikinci_sayi));
    }//GEN-LAST:event_çarpma_butonuActionPerformed

    private void bölme_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bölme_butonuActionPerformed

        Double birinci_sayi = Double.valueOf(this.birinci_sayi.getText());
        Double ikinci_sayi = Double.valueOf(this.ikinci_sayi.getText());
        
        sonuç.setText(String.valueOf(birinci_sayi/ikinci_sayi));
       
    }//GEN-LAST:event_bölme_butonuActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hesapMakinesi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField birinci_sayi;
    private javax.swing.JButton bölme_butonu;
    private javax.swing.JTextField ikinci_sayi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField sonuç;
    private javax.swing.JButton toplama_butonu;
    private javax.swing.JButton çarpma_butonu;
    private javax.swing.JButton çıkarma_butonu;
    // End of variables declaration//GEN-END:variables
}
