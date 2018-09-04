/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author NISAH~05
 */
public class NewJFrame extends javax.swing.JFrame {

    String angka;
    int pilih;
    double angka1,angka2,jumlahd,jumlah;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    angka="";
    }
    
    void angka0(){
        angka+="0";
        input.setText(angka);
    }
     void angka1(){
        angka+="1";
        input.setText(angka);
    }

      void angka2(){
        angka+="2";
        input.setText(angka);
    }

       void angka3(){
        angka+="3";
        input.setText(angka);
    }

        void angka4(){
        angka+="4";
        input.setText(angka);
    }

         void angka5(){
        angka+="5";
        input.setText(angka);
    }

          void angka6(){
        angka+="6";
        input.setText(angka);
    }

           void angka7(){
        angka+="7";
        input.setText(angka);
    }

            void angka8(){
        angka+="8";
        input.setText(angka);
    }

             void angka9(){
        angka+="9";
        input.setText(angka);
    }
                void koma(){
        angka+=".";
        input.setText(angka);
    }
                void kuadrat(){
        angka+="^y";
        input.setText(angka);
    }
                 void pengakaran(){
        angka+="√";
        input.setText(angka);
    }
                   void persentase(){
        angka+="%";
        input.setText(angka);
    }
                    void sinn(){
        angka+="sin";
        input.setText(angka);
    }
                     void coss(){
        angka+="cos";
        input.setText(angka);
    }
                      void tann(){
        angka+="tan";
        input.setText(angka);
    }
                       void logg(){
        angka+="log";
        input.setText(angka);
    }
                        void modulus(){
        angka+="modulus";
        input.setText(angka);
    }
                    
             
void hasil(){
switch(pilih){
    case 1:
        angka2=Double.parseDouble(angka);
        jumlah=angka1+angka2;
        angka=Double.toString(jumlah);
        input.setText(angka);
        break;
         case 2:
        angka2=Double.parseDouble(angka);
        jumlah=angka1-angka2;
        angka=Double.toString(jumlah);
        input.setText(angka);
        break;
         case 3:
        angka2=Double.parseDouble(angka);
        jumlah=angka1*angka2;
        angka=Double.toString(jumlah);
        input.setText(angka);
        break;
         case 4:
        angka2=Double.parseDouble(angka);
        jumlah=angka1/angka2;
        angka=Double.toString(jumlah);
        input.setText(angka);
        break;
        case 5:
        angka2=Double.parseDouble(angka);
        jumlah=Math.pow(angka1,angka2);
        angka=Double.toString(jumlah);
        input.setText(angka);
        break;
        case 6:
        
        jumlah=Math.sqrt(angka1);
        angka=Double.toString(jumlah);
        input.setText(angka);
        break;
        case 7:
        
        jumlah= angka1 / 100;
        angka=Double.toString(jumlah);
        input.setText(angka);
        break;
        case 8:
        
        jumlah=Math.sin(angka1);
        angka=Double.toString(jumlah);
        input.setText(angka);
        break;

        case 9:
        
        jumlah=Math.cos(angka1);
        angka=Double.toString(jumlah);
        input.setText(angka);
        break;

        case 10:
        
        jumlah=Math.tan(angka1);
        angka=Double.toString(jumlah);
        input.setText(angka);
        break;

        case 11:
        
        jumlah=Math.log(angka1);
        angka=Double.toString(jumlah);
        input.setText(angka);
        break;
        case 12:
        
         angka2=Double.parseDouble(angka);
        jumlah=angka1%angka2;
        angka=Double.toString(jumlah);
        input.setText(angka);
        break;


}
}
void tambah(){
angka1=Double.parseDouble(angka);
input.setText("+");
angka="";
pilih=1;
}
void kali(){
angka1=Double.parseDouble(angka);
input.setText("*");
angka="";
pilih=3;
}
void bagi(){
angka1=Double.parseDouble(angka);
input.setText("/");
angka="";
pilih=4;
}
void kurang(){
angka1=Double.parseDouble(angka);
input.setText("-");
angka="";
pilih=2;
}
void pangkat(){
angka1=Double.parseDouble(angka);
input.setText("^2");
angka="";
pilih=5;
}
void akar(){
angka1=Double.parseDouble(angka);
input.setText("√");
angka="";
pilih=6;
}
void persen(){
angka1=Double.parseDouble(angka);
input.setText("%");
angka="";
pilih=7;
}
void sin(){
angka1=Double.parseDouble(angka);
input.setText("sin");
angka="";
pilih=8;
}
void cos(){
angka1=Double.parseDouble(angka);
input.setText("cos");
angka="";
pilih=9;
}
void tan(){
angka1=Double.parseDouble(angka);
input.setText("tan");
angka="";
pilih=10;
}
void log(){
angka1=Double.parseDouble(angka);
input.setText("log");
angka="";
pilih=11;
}
void mdls(){
angka1=Double.parseDouble(angka);
input.setText("modulus");
angka="";
pilih=12;
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        input = new javax.swing.JTextField();
        tujuh = new javax.swing.JButton();
        delapan = new javax.swing.JButton();
        sembilan = new javax.swing.JButton();
        lima = new javax.swing.JButton();
        enam = new javax.swing.JButton();
        dua = new javax.swing.JButton();
        tiga = new javax.swing.JButton();
        kosong = new javax.swing.JButton();
        empat = new javax.swing.JButton();
        satu = new javax.swing.JButton();
        koma = new javax.swing.JButton();
        bagi = new javax.swing.JButton();
        kali = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        samadengan = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        kuadrat = new javax.swing.JButton();
        pengakaran = new javax.swing.JButton();
        persentase = new javax.swing.JButton();
        sinn = new javax.swing.JButton();
        coss = new javax.swing.JButton();
        tann = new javax.swing.JButton();
        logg = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        modulus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator Scientific");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(null);
        jPanel1.add(input);
        input.setBounds(10, 56, 310, 63);

        tujuh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tujuh.setText("7");
        tujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuhActionPerformed(evt);
            }
        });
        jPanel1.add(tujuh);
        tujuh.setBounds(10, 130, 50, 39);

        delapan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        delapan.setText("8");
        delapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delapanActionPerformed(evt);
            }
        });
        jPanel1.add(delapan);
        delapan.setBounds(66, 130, 50, 39);

        sembilan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sembilan.setText("9");
        sembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sembilanActionPerformed(evt);
            }
        });
        jPanel1.add(sembilan);
        sembilan.setBounds(122, 130, 50, 39);

        lima.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lima.setText("5");
        lima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limaActionPerformed(evt);
            }
        });
        jPanel1.add(lima);
        lima.setBounds(66, 175, 50, 39);

        enam.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        enam.setText("6");
        enam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enamActionPerformed(evt);
            }
        });
        jPanel1.add(enam);
        enam.setBounds(122, 175, 50, 39);

        dua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dua.setText("2");
        dua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duaActionPerformed(evt);
            }
        });
        jPanel1.add(dua);
        dua.setBounds(66, 220, 50, 39);

        tiga.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tiga.setText("3");
        tiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tigaActionPerformed(evt);
            }
        });
        jPanel1.add(tiga);
        tiga.setBounds(122, 220, 50, 39);

        kosong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        kosong.setText("0");
        kosong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kosongActionPerformed(evt);
            }
        });
        jPanel1.add(kosong);
        kosong.setBounds(10, 265, 160, 39);

        empat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        empat.setText("4");
        empat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empatActionPerformed(evt);
            }
        });
        jPanel1.add(empat);
        empat.setBounds(10, 175, 50, 39);

        satu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        satu.setText("1");
        satu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuActionPerformed(evt);
            }
        });
        jPanel1.add(satu);
        satu.setBounds(10, 220, 50, 39);

        koma.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        koma.setText(".");
        koma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                komaActionPerformed(evt);
            }
        });
        jPanel1.add(koma);
        koma.setBounds(270, 220, 50, 40);

        bagi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bagi.setText("/");
        bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiActionPerformed(evt);
            }
        });
        jPanel1.add(bagi);
        bagi.setBounds(178, 265, 80, 39);

        kali.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        kali.setText("x");
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });
        jPanel1.add(kali);
        kali.setBounds(178, 220, 80, 39);

        tambah.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tambah.setText("+");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        jPanel1.add(tambah);
        tambah.setBounds(178, 130, 80, 39);

        samadengan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        samadengan.setText("=");
        samadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samadenganActionPerformed(evt);
            }
        });
        jPanel1.add(samadengan);
        samadengan.setBounds(270, 270, 50, 130);

        reset.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        reset.setText("c");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset);
        reset.setBounds(270, 170, 50, 40);

        kurang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        kurang.setText("-");
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });
        jPanel1.add(kurang);
        kurang.setBounds(178, 175, 80, 39);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Calculator Scientific");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 300, 35);

        kuadrat.setText("X^y");
        kuadrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuadratActionPerformed(evt);
            }
        });
        jPanel1.add(kuadrat);
        kuadrat.setBounds(140, 310, 60, 40);

        pengakaran.setText("√\t");
        pengakaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengakaranActionPerformed(evt);
            }
        });
        jPanel1.add(pengakaran);
        pengakaran.setBounds(210, 310, 50, 40);

        persentase.setText("%");
        persentase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persentaseActionPerformed(evt);
            }
        });
        jPanel1.add(persentase);
        persentase.setBounds(10, 310, 50, 40);

        sinn.setText("sin");
        sinn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinnActionPerformed(evt);
            }
        });
        jPanel1.add(sinn);
        sinn.setBounds(10, 360, 50, 40);

        coss.setText("cos");
        coss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cossActionPerformed(evt);
            }
        });
        jPanel1.add(coss);
        coss.setBounds(130, 360, 50, 40);

        tann.setText("tan");
        tann.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tannActionPerformed(evt);
            }
        });
        jPanel1.add(tann);
        tann.setBounds(70, 360, 50, 40);

        logg.setText("log");
        logg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggActionPerformed(evt);
            }
        });
        jPanel1.add(logg);
        logg.setBounds(190, 360, 70, 40);

        hapus.setText("<-");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        jPanel1.add(hapus);
        hapus.setBounds(270, 130, 50, 30);

        modulus.setText("mdls");
        modulus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modulusActionPerformed(evt);
            }
        });
        jPanel1.add(modulus);
        modulus.setBounds(70, 310, 60, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuhActionPerformed
angka7();
        // TODO add your handling code here:
    }//GEN-LAST:event_tujuhActionPerformed

    private void kosongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kosongActionPerformed
angka0();
        // TODO add your handling code here:
    }//GEN-LAST:event_kosongActionPerformed

    private void satuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satuActionPerformed
angka1();
        // TODO add your handling code here:
    }//GEN-LAST:event_satuActionPerformed

    private void duaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duaActionPerformed
angka2();
        // TODO add your handling code here:
    }//GEN-LAST:event_duaActionPerformed

    private void tigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tigaActionPerformed
angka3();
        // TODO add your handling code here:
    }//GEN-LAST:event_tigaActionPerformed

    private void empatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empatActionPerformed
angka4();
        // TODO add your handling code here:
    }//GEN-LAST:event_empatActionPerformed

    private void limaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limaActionPerformed
angka5();
        // TODO add your handling code here:
    }//GEN-LAST:event_limaActionPerformed

    private void enamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enamActionPerformed
angka6();
        // TODO add your handling code here:
    }//GEN-LAST:event_enamActionPerformed

    private void delapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delapanActionPerformed
angka8();
        // TODO add your handling code here:
    }//GEN-LAST:event_delapanActionPerformed

    private void sembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sembilanActionPerformed
angka9();
        // TODO add your handling code here:
    }//GEN-LAST:event_sembilanActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
tambah();
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahActionPerformed

    private void samadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samadenganActionPerformed
hasil();
        // TODO add your handling code here:
    }//GEN-LAST:event_samadenganActionPerformed

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
      kali();
        // TODO add your handling code here:
    }//GEN-LAST:event_kaliActionPerformed

    private void bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiActionPerformed
bagi();
        // TODO add your handling code here:
    }//GEN-LAST:event_bagiActionPerformed

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
kurang();
        // TODO add your handling code here:
    }//GEN-LAST:event_kurangActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
input.setText("");
angka1=(int) 0.0;
angka2=(int) 0.0;
jumlah=(int) 0.0;
angka="";
        // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    private void komaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_komaActionPerformed
koma();
        // TODO add your handling code here:
    }//GEN-LAST:event_komaActionPerformed

    private void kuadratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuadratActionPerformed
pangkat();
        // TODO add your handling code here:
    }//GEN-LAST:event_kuadratActionPerformed

    private void pengakaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengakaranActionPerformed
akar();
        // TODO add your handling code here:
    }//GEN-LAST:event_pengakaranActionPerformed

    private void persentaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persentaseActionPerformed
persen();
        // TODO add your handling code here:
    }//GEN-LAST:event_persentaseActionPerformed

    private void sinnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinnActionPerformed
sin();        // TODO add your handling code here:
    }//GEN-LAST:event_sinnActionPerformed

    private void cossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cossActionPerformed
cos();        // TODO add your handling code here:
    }//GEN-LAST:event_cossActionPerformed

    private void tannActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tannActionPerformed
tan();        // TODO add your handling code here:
    }//GEN-LAST:event_tannActionPerformed

    private void loggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggActionPerformed
log();        // TODO add your handling code here:
    }//GEN-LAST:event_loggActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
input.getText().length();
StringBuilder all = new StringBuilder (input.getText());
char end = all.charAt(all.length()-1);
all.deleteCharAt(all.length()-1);
input.setText(all.toString());
angka = input.getText();
if(input.getText().length()>0){
hapus.setEnabled(true);}
        // TODO add your handling code here:
    }//GEN-LAST:event_hapusActionPerformed

    private void modulusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modulusActionPerformed
mdls();
        // TODO add your handling code here:
    }//GEN-LAST:event_modulusActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bagi;
    private javax.swing.JButton coss;
    private javax.swing.JButton delapan;
    private javax.swing.JButton dua;
    private javax.swing.JButton empat;
    private javax.swing.JButton enam;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kali;
    private javax.swing.JButton koma;
    private javax.swing.JButton kosong;
    private javax.swing.JButton kuadrat;
    private javax.swing.JButton kurang;
    private javax.swing.JButton lima;
    private javax.swing.JButton logg;
    private javax.swing.JButton modulus;
    private javax.swing.JButton pengakaran;
    private javax.swing.JButton persentase;
    private javax.swing.JButton reset;
    private javax.swing.JButton samadengan;
    private javax.swing.JButton satu;
    private javax.swing.JButton sembilan;
    private javax.swing.JButton sinn;
    private javax.swing.JButton tambah;
    private javax.swing.JButton tann;
    private javax.swing.JButton tiga;
    private javax.swing.JButton tujuh;
    // End of variables declaration//GEN-END:variables
}
