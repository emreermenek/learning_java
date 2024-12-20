
import java.util.LinkedHashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author emree
 */
public class Radio extends javax.swing.JFrame {
    Set<String> diller = new LinkedHashSet<>();

    /**
     * Creates new form Radio
     */
    
    public void goster(){
        String message = "";
        
        for(String dil : diller){
            message += dil + "\n";
        }
        JOptionPane.showMessageDialog(this, message);
    }
    public Radio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        javaRadio = new javax.swing.JRadioButton();
        pythonRadio = new javax.swing.JRadioButton();
        phpRadio = new javax.swing.JRadioButton();
        dilGoster = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(javaRadio);
        javaRadio.setText("Java");

        buttonGroup1.add(pythonRadio);
        pythonRadio.setText("Python");
        pythonRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pythonRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(phpRadio);
        phpRadio.setText("PHP");

        dilGoster.setText("göster");
        dilGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dilGosterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(phpRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pythonRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(javaRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(dilGoster, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(javaRadio)
                .addGap(18, 18, 18)
                .addComponent(pythonRadio)
                .addGap(18, 18, 18)
                .addComponent(phpRadio)
                .addGap(35, 35, 35)
                .addComponent(dilGoster)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pythonRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pythonRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pythonRadioActionPerformed

    private void dilGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dilGosterActionPerformed
        // TODO add your handling code here:
        if(javaRadio.isSelected()){
            diller.add("Java");
        }else{
            diller.remove("Java");
        }
        if(pythonRadio.isSelected()){
            diller.add("Python");
        }else{
            diller.remove("Python");
        }
        if(phpRadio.isSelected()){
            diller.add("PHP");
        }else{
            diller.remove("PHP");
        }
        goster();
    }//GEN-LAST:event_dilGosterActionPerformed

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
            java.util.logging.Logger.getLogger(Radio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Radio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Radio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Radio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Radio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton dilGoster;
    private javax.swing.JRadioButton javaRadio;
    private javax.swing.JRadioButton phpRadio;
    private javax.swing.JRadioButton pythonRadio;
    // End of variables declaration//GEN-END:variables
}
