package gui;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Welcome_Screen extends javax.swing.JFrame {
    Connection conn = null;    
    
    private PreparedStatement pst;

    
    public Welcome_Screen() {
        initComponents();
        conn = (Connection) Database.conn();        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        line1 = new javax.swing.JButton();
        line2 = new javax.swing.JButton();
        line3 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 127, 80));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(212, 227, 222));

        jPanel2.setBackground(new java.awt.Color(168, 187, 185));

        jLabel2.setFont(new java.awt.Font("Cocogoose Pro SemiLight", 0, 30)); // NOI18N
        jLabel2.setText("BUS TICKET SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        line1.setBackground(new java.awt.Color(168, 187, 185));
        line1.setFont(new java.awt.Font("d Diam", 0, 20)); // NOI18N
        line1.setText("LINE 1");
        line1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line1ActionPerformed(evt);
            }
        });

        line2.setBackground(new java.awt.Color(168, 187, 185));
        line2.setFont(new java.awt.Font("d Diam", 0, 20)); // NOI18N
        line2.setText("LINE 2");
        line2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line2ActionPerformed(evt);
            }
        });

        line3.setBackground(new java.awt.Color(168, 187, 185));
        line3.setFont(new java.awt.Font("d Diam", 0, 20)); // NOI18N
        line3.setForeground(new java.awt.Color(255, 0, 0));
        line3.setText("EXIT");
        line3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(line3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(line2, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(line1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(94, 94, 94))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(line1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(line2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(line3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void line1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_line1ActionPerformed
        
        // IF THE USER WILL CLICKED LINE 1 BUTTON, THE LINE 1 SCREEN WILL POP-UP
        line1 l1 = new line1();
        l1.setVisible(true);         
    }//GEN-LAST:event_line1ActionPerformed

    private void line2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_line2ActionPerformed
        
        // IF THE USER WILL CLICKED LINE 2 BUTTON, THE LINE 1 SCREEN WILL POP-UP
        line2 l2 = new line2();
        l2.setVisible(true);
    }//GEN-LAST:event_line2ActionPerformed

    private void line3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_line3ActionPerformed
        // IF THE USER WANTS TO EXIT THE PROGRAM
        System.exit (0);
    }//GEN-LAST:event_line3ActionPerformed

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String [] args){

        java.awt.EventQueue.invokeLater(() -> {
            new Welcome_Screen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton line1;
    private javax.swing.JButton line2;
    private javax.swing.JButton line3;
    // End of variables declaration//GEN-END:variables
}
