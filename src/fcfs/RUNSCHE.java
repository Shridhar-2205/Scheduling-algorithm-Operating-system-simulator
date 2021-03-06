/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcfs;

import java.awt.Color;

/**
 *
 * @author Dell
 */
public class RUNSCHE extends javax.swing.JFrame {

    /**
     * Creates new form RUNSCHE
     */
    public RUNSCHE() {
        initComponents();
        getContentPane().setBackground(Color.LIGHT_GRAY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PRIORITY = new javax.swing.JButton();
        FCFS = new javax.swing.JButton();
        PREM = new javax.swing.JButton();
        RR = new javax.swing.JButton();
        NONPREM = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("RUN SCHEDULING ALGORTHM");

        PRIORITY.setForeground(new java.awt.Color(51, 51, 255));
        PRIORITY.setText("PRIORITY PREEMPTIVE");
        PRIORITY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRIORITYActionPerformed(evt);
            }
        });

        FCFS.setForeground(new java.awt.Color(102, 0, 102));
        FCFS.setText("FCFS");
        FCFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCFSActionPerformed(evt);
            }
        });

        PREM.setForeground(new java.awt.Color(0, 102, 102));
        PREM.setText("SJF PREEMPTIVE");
        PREM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PREMActionPerformed(evt);
            }
        });

        RR.setForeground(new java.awt.Color(255, 0, 0));
        RR.setText("ROUND ROBIN");
        RR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RRActionPerformed(evt);
            }
        });

        NONPREM.setForeground(new java.awt.Color(153, 204, 0));
        NONPREM.setText("SJF NON-PREEMPTIVE");
        NONPREM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NONPREMActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("PRIORITY NON-PREEMPTIVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(140, 140, 140)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(PREM)
                    .addComponent(FCFS)
                    .addComponent(RR)
                    .addComponent(NONPREM)
                    .addComponent(PRIORITY))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(68, 68, 68)
                .addComponent(FCFS)
                .addGap(18, 18, 18)
                .addComponent(RR)
                .addGap(18, 18, 18)
                .addComponent(NONPREM)
                .addGap(18, 18, 18)
                .addComponent(PREM)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PRIORITY)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FCFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCFSActionPerformed
        FCFSTODAY frame1=new FCFSTODAY();
   RUNSCHE.this.setVisible(false);
   frame1.setVisible(true);        
        // TODO add your handling code here:
    }//GEN-LAST:event_FCFSActionPerformed

    private void RRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RRActionPerformed
RRTODAY frame2=new RRTODAY();
   RUNSCHE.this.setVisible(false);
   frame2.setVisible(true);        
                
// TODO add your handling code here:
    }//GEN-LAST:event_RRActionPerformed

    private void PRIORITYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRIORITYActionPerformed
PRIORITYTODAY frame3=new PRIORITYTODAY();
   RUNSCHE.this.setVisible(false);
   frame3.setVisible(true);        
                // TODO add your handling code here:
    }//GEN-LAST:event_PRIORITYActionPerformed

    private void NONPREMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NONPREMActionPerformed
SJFNPRTODAY frame4=new SJFNPRTODAY();
   RUNSCHE.this.setVisible(false);
   frame4.setVisible(true);        
                // TODO add your handling code here:
    }//GEN-LAST:event_NONPREMActionPerformed

    private void PREMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PREMActionPerformed
SJFPRTODAY frame5=new SJFPRTODAY();
   RUNSCHE.this.setVisible(false);
   frame5.setVisible(true);        
        // TODO add your handling code here:
    }//GEN-LAST:event_PREMActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
HomePage frame6=new HomePage();
   RUNSCHE.this.setVisible(false);
   frame6.setVisible(true);        
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
PRIONPRTODAY frame5C=new PRIONPRTODAY();
   RUNSCHE.this.setVisible(false);
   frame5C.setVisible(true);        

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(RUNSCHE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RUNSCHE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RUNSCHE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RUNSCHE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RUNSCHE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FCFS;
    private javax.swing.JButton NONPREM;
    private javax.swing.JButton PREM;
    private javax.swing.JButton PRIORITY;
    private javax.swing.JButton RR;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
