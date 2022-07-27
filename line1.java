package gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class line1 extends javax.swing.JFrame {
    Connection conn = null;    
    
    private PreparedStatement pst;

    public line1() {
        initComponents();
        conn = Database.conn();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtClass = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTicket = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTicketNo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtFrom = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rdbtnOrdinaryBus = new javax.swing.JRadioButton();
        rdbtnAirconBus = new javax.swing.JRadioButton();
        rdbtnSingleTicket = new javax.swing.JRadioButton();
        rdbtnReturnTicket = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        cmbDestination = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        confirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(0, 0, 620, 639));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Line 2"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(212, 227, 222));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168, 187, 185), 5));

        jLabel1.setFont(new java.awt.Font("Cocogoose Pro SemiLight", 0, 40)); // NOI18N
        jLabel1.setText("LINE 1 BUS TICKET SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(212, 227, 222));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168, 187, 185), 5));

        jLabel7.setFont(new java.awt.Font("d Diam", 0, 15)); // NOI18N
        jLabel7.setText("BUS TYPE;");

        txtClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClassActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("d Diam", 0, 15)); // NOI18N
        jLabel8.setText("TICKET TYPE;");

        txtTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTicketActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("d Diam", 0, 15)); // NOI18N
        jLabel10.setText("TICKET NO:");

        jLabel11.setFont(new java.awt.Font("d Diam", 0, 15)); // NOI18N
        jLabel11.setText("FROM:");

        jLabel12.setFont(new java.awt.Font("d Diam", 0, 15)); // NOI18N
        jLabel12.setText("TO:");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("d Diam", 0, 20)); // NOI18N
        jLabel9.setText("DESTINATION");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("d Diam", 0, 15)); // NOI18N
        jLabel13.setText("DATE:");

        jLabel14.setFont(new java.awt.Font("d Diam", 0, 15)); // NOI18N
        jLabel14.setText("TIME:");

        jLabel15.setFont(new java.awt.Font("d Diam", 0, 15)); // NOI18N
        jLabel15.setText("PRICE:");

        txtTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeActionPerformed(evt);
            }
        });

        txtFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTicketNo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTicket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFrom)
                                    .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtPrice))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTime))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTicketNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(212, 227, 222));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168, 187, 185), 5));

        jLabel2.setFont(new java.awt.Font("d Diam", 0, 15)); // NOI18N
        jLabel2.setText("BUS TYPE");

        jLabel3.setFont(new java.awt.Font("d Diam", 0, 15)); // NOI18N
        jLabel3.setText("TICKET TYPE");
        jLabel3.setToolTipText("");

        rdbtnOrdinaryBus.setText("ORDINARY");
        rdbtnOrdinaryBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnOrdinaryBusActionPerformed(evt);
            }
        });

        rdbtnAirconBus.setText("AIR-CONDITIONED");
        rdbtnAirconBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnAirconBusActionPerformed(evt);
            }
        });

        rdbtnSingleTicket.setText("SINGLE");
        rdbtnSingleTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnSingleTicketActionPerformed(evt);
            }
        });

        rdbtnReturnTicket.setText("RETURN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(rdbtnOrdinaryBus)
                    .addComponent(rdbtnAirconBus))
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbtnReturnTicket)
                            .addComponent(rdbtnSingleTicket)))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnOrdinaryBus)
                    .addComponent(rdbtnSingleTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnAirconBus)
                    .addComponent(rdbtnReturnTicket))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(212, 227, 222));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168, 187, 185), 5));

        cmbDestination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "Recto", "Legarda", "Pureza", "V.Mapa", "J.Ruiz", "Gilmore", "Betty Go-Belmonte", "Anonas", "Katipunan", "Santolan", "Marikina-Pasig", "Antipolo" }));
        cmbDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDestinationActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("d Diam", 0, 15)); // NOI18N
        jLabel4.setText("DESTINATION");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cmbDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(212, 227, 222));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168, 187, 185), 5));

        jLabel5.setFont(new java.awt.Font("d Diam", 0, 15)); // NOI18N
        jLabel5.setText("TOTAL:");

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        reset.setFont(new java.awt.Font("Lato Black", 0, 20)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(255, 0, 0));
        cancel.setFont(new java.awt.Font("Lato Black", 0, 20)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        confirm.setFont(new java.awt.Font("Lato Black", 0, 20)); // NOI18N
        confirm.setText("CONFIRM");
        confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmMouseClicked(evt);
            }
        });
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(confirm)
                                    .addComponent(reset))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(confirm)
                                .addGap(18, 18, 18)
                                .addComponent(reset))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(cancel))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rdbtnOrdinaryBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnOrdinaryBusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnOrdinaryBusActionPerformed

    private void rdbtnAirconBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnAirconBusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnAirconBusActionPerformed

    private void rdbtnSingleTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnSingleTicketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnSingleTicketActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void cmbDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDestinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDestinationActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
    //time
    Calendar timer = Calendar.getInstance();		
    timer.getTime();
    SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
    txtTime.setText(tTime.format(timer.getTime()));
    
    //date
    SimpleDateFormat tDate = new SimpleDateFormat("dd:MMM:yyy");
    txtDate.setText(tDate.format(timer.getTime()));
    
    //from
    txtFrom.setText("Araneta Center-Cubao"); //we chose this station as the starting place.
    
    //the chosen destination of the user will displayed in "to" 
    txtTo.setText((String) cmbDestination.getSelectedItem()+ "");
    
    //ticket number
    int num1;	
    String q1 = "";	
    num1 = 1325 + (int) (Math.random()*4328);	
    q1 += num1 + 1324;		
    txtTicketNo.setText(q1);
				
    }//GEN-LAST:event_confirmActionPerformed

    private void txtFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFromActionPerformed

    private void txtTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeActionPerformed

    private void txtTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTicketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTicketActionPerformed

    private void txtClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClassActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        
        // THIS WILL RESET THE PROGRAM. 
        txtTotal.setText(null);
        rdbtnAirconBus.setSelected(false);	
        rdbtnOrdinaryBus.setSelected(false);
        rdbtnSingleTicket.setSelected(false);
        rdbtnReturnTicket.setSelected(false);
        cmbDestination.setSelectedItem("----");
        txtTo.setText(null);
        txtFrom.setText(null);
        txtDate.setText(null);
        txtTime.setText(null);
        txtPrice.setText(null);
        txtClass.setText(null);
        txtTicketNo.setText(null);		
        txtTicket.setText(null);
        
    }//GEN-LAST:event_resetActionPerformed

    private void confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseClicked

    //database code
    try
        {
            //bus_ticket_system is the database's name, root is its username, and there is no password
            conn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/bus_ticket_system","root","");
            
            //inserting data from the program/gui to the database
            //l1 is the tablename            
            PreparedStatement pst = conn.prepareStatement ("INSERT INTO l1 values (?,?,?,?,?,?,?,?)");
 
            //insertiong of prepared statement
            pst.setString(1, txtTicketNo.getText());
            pst.setString(2, txtDate.getText());
            pst.setString(3, txtTime.getText());
            pst.setString(4, txtClass.getText());
            pst.setString(5, txtTicket.getText());
            pst.setString(6, txtFrom.getText());
            pst.setString(7, txtTo.getText());
            pst.setString(8, txtTotal.getText());
            
            int row = pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Successful");
            
        } catch (SQLException e1){
        }        

    
    //IF THE USER CLIKED CONFIRM IT, THIS WILL BE THE CODE THE WILL RUN IN ORDER FOR THE USER TO KNOW HOW MUCH HE/SHE WILL GONNA PAY.
        double origin = 13.00; //MINIMUM FARE
        double totalCost, ac = 20.00; // AIRCON BUS FEE

        //IF THE USER CHOSE ANONAS AS HIS/HER DESTINATION
        //IF THE USER CHOSE ORDINARY BUS & SINGLE TICKET
        if ((rdbtnOrdinaryBus.isSelected()) && (rdbtnSingleTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Anonas"))
        {
            totalCost= origin + 1.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Ordinary Bus");
            txtTicket.setText("Single");
        }
        //IF THE USER CHOSE ORDINARY BUS & RETURN TICKET
        else if ((rdbtnOrdinaryBus.isSelected()) && (rdbtnReturnTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Anonas"))
        {
            totalCost= (origin * 2) + 1.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Ordinary Bus");
            txtTicket.setText("Return");
        }
        //IF THE USER CHOSE AIRCON BUS & SINGLE TICKET
        else if ((rdbtnAirconBus.isSelected()) && (rdbtnSingleTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Anonas"))
        {
            totalCost= (origin + ac) + 1.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Air-Con Bus");
            txtTicket.setText("Single");
        }
        //IF THE USER CHOSE AIRCON BUS & RETURN TICKET
        else if ((rdbtnAirconBus.isSelected()) && (rdbtnReturnTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Anonas"))
        {
            totalCost= ((origin*2) + ac) + 1.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Air-Con Bus");
            txtTicket.setText("Return");
        }

        //IF THE USER CHOSE KATIPUNAN AS HIS/HER DESTINATION
        //IF THE USER CHOSE ORDINARY BUS & SINGLE TICKET
        if ((rdbtnOrdinaryBus.isSelected()) && (rdbtnSingleTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Katipunan"))
        {
            totalCost= origin + 1.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Ordinary Bus");
            txtTicket.setText("Single");
        }
        //IF THE USER CHOSE ORDINARY BUS & RETURN TICKET
        else if ((rdbtnOrdinaryBus.isSelected()) && (rdbtnReturnTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Katipunan"))
        {
            totalCost= (origin * 2) + 1.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Ordinary Bus");
            txtTicket.setText("Return");
        }
        //IF THE USER CHOSE AIRCON BUS & SINGLE TICKET
        else if ((rdbtnAirconBus.isSelected()) && (rdbtnSingleTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Katipunan"))
        {
            totalCost= (origin + ac) + 1.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Air-Con Bus");
            txtTicket.setText("Single");
        }
        //IF THE USER CHOSE AIRCON BUS & RETURN TICKET
        else if ((rdbtnAirconBus.isSelected()) && (rdbtnReturnTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Katipunan"))
        {
            totalCost= ((origin*2) + ac) + 1.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Air-Con Bus");
            txtTicket.setText("Return");
        }
        
        //IF THE USER CHOSE BETTY GO AS HIS/HER DESTINATION
        //IF THE USER CHOSE ORDINARY BUS & SINGLE TICKET
        if ((rdbtnOrdinaryBus.isSelected()) && (rdbtnSingleTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Betty Go-Belmonte"))
        {
            totalCost= origin + 1.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Ordinary Bus");
            txtTicket.setText("Single");
        }
        //IF THE USER CHOSE ORDINARY BUS & RETURN TICKET
        else if ((rdbtnOrdinaryBus.isSelected()) && (rdbtnReturnTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Betty Go-Belmonte"))
        {
            totalCost= (origin * 2) + 1.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Ordinary Bus");
            txtTicket.setText("Return");
        }
        //IF THE USER CHOSE AIRCON BUS & SINGLE TICKET
        else if ((rdbtnAirconBus.isSelected()) && (rdbtnSingleTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Betty Go-Belmonte"))
        {
            totalCost= (origin + ac) + 1.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Air-Con Bus");
            txtTicket.setText("Single");
        }
        //IF THE USER CHOSE AIRCON BUS & RETURN TICKET
        else if ((rdbtnAirconBus.isSelected()) && (rdbtnReturnTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Betty Go-Belmonte"))
        {
            totalCost= ((origin*2) + ac) + 1.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Air-Con Bus");
            txtTicket.setText("Return");
        }
        
        //IF THE USER CHOSE GILMORE AS HIS/HER DESTINATION
        //IF THE USER CHOSE ORDINARY BUS & SINGLE TICKET
        if ((rdbtnOrdinaryBus.isSelected()) && (rdbtnSingleTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Gilmore"))
        {
            totalCost= origin + 1.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Ordinary Bus");
            txtTicket.setText("Single");
        }
        //IF THE USER CHOSE ORDINARY BUS & RETURN TICKET
        else if ((rdbtnOrdinaryBus.isSelected()) && (rdbtnReturnTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Gilmore"))
        {
            totalCost= (origin * 2) + 1.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Ordinary Bus");
            txtTicket.setText("Return");
        }
        //IF THE USER CHOSE AIRCON BUS & SINGLE TICKET
        else if ((rdbtnAirconBus.isSelected()) && (rdbtnSingleTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Gilmore"))
        {
            totalCost= (origin + ac) + 1.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Air-Con Bus");
            txtTicket.setText("Single");
        }
        //IF THE USER CHOSE AIRCON BUS & RETURN TICKET
        else if ((rdbtnAirconBus.isSelected()) && (rdbtnReturnTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Gilmore"))
        {
            totalCost= ((origin*2) + ac) + 1.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Air-Con Bus");
            txtTicket.setText("Return");
        }
        
        //IF THE USER CHOSE MARIKINA-PASIG AS HIS/HER DESTINATION
        //IF THE USER CHOSE ORDINARY BUS & SINGLE TICKET
        if ((rdbtnOrdinaryBus.isSelected()) && (rdbtnSingleTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Marikina-Pasig"))
        {
            totalCost= origin + 2.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Ordinary Bus");
            txtTicket.setText("Single");
        }
        //IF THE USER CHOSE ORDINARY BUS & RETURN TICKET
        else if ((rdbtnOrdinaryBus.isSelected()) && (rdbtnReturnTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Marikina-Pasig"))
        {
            totalCost= (origin * 2) + 2.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Ordinary Bus");
            txtTicket.setText("Return");
        }
        //IF THE USER CHOSE AIRCON BUS & SINGLE TICKET
        else if ((rdbtnAirconBus.isSelected()) && (rdbtnSingleTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Marikina-Pasig"))
        {
            totalCost= (origin + ac) + 2.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Air-Con Bus");
            txtTicket.setText("Single");
        }
        //IF THE USER CHOSE AIRCON BUS & RETURN TICKET
        else if ((rdbtnAirconBus.isSelected()) && (rdbtnReturnTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Marikina-Pasig"))
        {
            totalCost= ((origin*2) + ac) + 2.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Air-Con Bus");
            txtTicket.setText("Return");
        }
        //IF THE USER CHOSE ANTIPOLO AS HIS/HER DESTINATION
        //IF THE USER CHOSE ORDINARY BUS & SINGLE TICKET
        if ((rdbtnOrdinaryBus.isSelected()) && (rdbtnSingleTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Antipolo"))
        {
            totalCost= origin + 2.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Ordinary Bus");
            txtTicket.setText("Single");
        }
        //IF THE USER CHOSE ORDINARY BUS & RETURN TICKET
        else if ((rdbtnOrdinaryBus.isSelected()) && (rdbtnReturnTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Antipolo"))
        {
            totalCost= (origin * 2) + 2.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Ordinary Bus");
            txtTicket.setText("Return");
        }
        //IF THE USER CHOSE AIRCON BUS & SINGLE TICKET
        else if ((rdbtnAirconBus.isSelected()) && (rdbtnSingleTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Antipolo"))
        {
            totalCost= (origin + ac) + 2.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Air-Con Bus");
            txtTicket.setText("Single");
        }
        //IF THE USER CHOSE AIRCON BUS & RETURN TICKET
        else if ((rdbtnAirconBus.isSelected()) && (rdbtnReturnTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Antipolo"))
        {
            totalCost= ((origin*2) + ac) + 2.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Air-Con Bus");
            txtTicket.setText("Return");
        }
        
        //IF THE USER CHOSE J.RUIZ AS HIS/HER DESTINATION
        //IF THE USER CHOSE ORDINARY BUS & SINGLE TICKET
        if ((rdbtnOrdinaryBus.isSelected()) && (rdbtnSingleTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("J.Ruiz"))
        {
            totalCost= origin + 2.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Ordinary Bus");
            txtTicket.setText("Single");
        }
        //IF THE USER CHOSE ORDINARY BUS & RETURN TICKET
        else if ((rdbtnOrdinaryBus.isSelected()) && (rdbtnReturnTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("J.Ruiz"))
        {
            totalCost= (origin * 2) + 2.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Ordinary Bus");
            txtTicket.setText("Return");
        }
        //IF THE USER CHOSE AIRCON BUS & SINGLE TICKET
        else if ((rdbtnAirconBus.isSelected()) && (rdbtnSingleTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("J.Ruiz"))
        {
            totalCost= (origin + ac) + 2.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Air-Con Bus");
            txtTicket.setText("Single");
        }
        //IF THE USER CHOSE AIRCON BUS & RETURN TICKET
        else if ((rdbtnAirconBus.isSelected()) && (rdbtnReturnTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("J.Ruiz"))
        {
            totalCost= ((origin*2) + ac) + 2.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Air-Con Bus");
            txtTicket.setText("Return");
        }
        //IF THE USER CHOSE V.MAPA AS HIS/HER DESTINATION
        //IF THE USER CHOSE ORDINARY BUS & SINGLE TICKET
        if ((rdbtnOrdinaryBus.isSelected()) && (rdbtnSingleTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("V.Mapa"))
        {
            totalCost= origin + 2.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Ordinary Bus");
            txtTicket.setText("Single");
        }
        //IF THE USER CHOSE ORDINARY BUS & RETURN TICKET
        else if ((rdbtnOrdinaryBus.isSelected()) && (rdbtnReturnTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("V.Mapa"))
        {
            totalCost= (origin * 2) + 2.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Ordinary Bus");
            txtTicket.setText("Return");
        }
        //IF THE USER CHOSE AIRCON BUS & SINGLE TICKET
        else if ((rdbtnAirconBus.isSelected()) && (rdbtnSingleTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("V.Mapa"))
        {
            totalCost= (origin + ac) + 2.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Air-Con Bus");
            txtTicket.setText("Single");
        }
        //IF THE USER CHOSE AIRCON BUS & RETURN TICKET
        else if ((rdbtnAirconBus.isSelected()) && (rdbtnReturnTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("V.Mapa"))
        {
            totalCost= ((origin*2) + ac) + 2.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Air-Con Bus");
            txtTicket.setText("Return");
        }
        //IF THE USER CHOSE PUREZA AS HIS/HER DESTINATION
        //IF THE USER CHOSE ORDINARY BUS & SINGLE TICKET
        if ((rdbtnOrdinaryBus.isSelected()) && (rdbtnSingleTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Pureza"))
        {
            totalCost= origin + 3.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Ordinary Bus");
            txtTicket.setText("Single");
        }
        //IF THE USER CHOSE ORDINARY BUS & RETURN TICKET
        else if ((rdbtnOrdinaryBus.isSelected()) && (rdbtnReturnTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Pureza"))
        {
            totalCost= (origin * 2) + 3.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Ordinary Bus");
            txtTicket.setText("Return");
        }
        //IF THE USER CHOSE AIRCON BUS & SINGLE TICKET
        else if ((rdbtnAirconBus.isSelected()) && (rdbtnSingleTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Pureza"))
        {
            totalCost= (origin + ac) + 3.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Air-Con Bus");
            txtTicket.setText("Single");
        }
        //IF THE USER CHOSE AIRCON BUS & RETURN TICKET
        else if ((rdbtnAirconBus.isSelected()) && (rdbtnReturnTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Pureza"))
        {
            totalCost= ((origin*2) + ac) + 3.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Air-Con Bus");
            txtTicket.setText("Return");
        }
        
        //IF THE USER CHOSE LEGARDA AS HIS/HER DESTINATION
        //IF THE USER CHOSE ORDINARY BUS & SINGLE TICKET
        if ((rdbtnOrdinaryBus.isSelected()) && (rdbtnSingleTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Legarda"))
        {
            totalCost= origin + 3.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Ordinary Bus");
            txtTicket.setText("Single");
        }
        //IF THE USER CHOSE ORDINARY BUS & RETURN TICKET
        else if ((rdbtnOrdinaryBus.isSelected()) && (rdbtnReturnTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Legarda"))
        {
            totalCost= (origin * 2) + 3.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Ordinary Bus");
            txtTicket.setText("Return");
        }
        //IF THE USER CHOSE AIRCON BUS & SINGLE TICKET
        else if ((rdbtnAirconBus.isSelected()) && (rdbtnSingleTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Legarda"))
        {
            totalCost= (origin + ac) + 3.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Air-Con Bus");
            txtTicket.setText("Single");
        }
        //IF THE USER CHOSE AIRCON BUS & RETURN TICKET
        else if ((rdbtnAirconBus.isSelected()) && (rdbtnReturnTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Legarda"))
        {
            totalCost= ((origin*2) + ac) + 3.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Air-Con Bus");
            txtTicket.setText("Return");
        }
        
        //IF THE USER CHOSE RECTO AS HIS/HER DESTINATION
        //IF THE USER CHOSE ORDINARY BUS & SINGLE TICKET
        if ((rdbtnOrdinaryBus.isSelected()) && (rdbtnSingleTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Recto"))
        {
            totalCost= origin + 4.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Ordinary Bus");
            txtTicket.setText("Single");
        }
        //IF THE USER CHOSE ORDINARY BUS & RETURN TICKET
        else if ((rdbtnOrdinaryBus.isSelected()) && (rdbtnReturnTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Recto"))
        {
            totalCost= (origin * 2) + 4.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Ordinary Bus");
            txtTicket.setText("Return");
        }
        //IF THE USER CHOSE AIRCON BUS & SINGLE TICKET
        else if ((rdbtnAirconBus.isSelected()) && (rdbtnSingleTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Recto"))
        {
            totalCost= (origin + ac) + 4.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Air-Con Bus");
            txtTicket.setText("Single");
        }
        //IF THE USER CHOSE AIRCON BUS & RETURN TICKET
        else if ((rdbtnAirconBus.isSelected()) && (rdbtnReturnTicket.isSelected()) &&
            cmbDestination.getSelectedItem().equals("Recto"))
        {
            totalCost= ((origin*2) + ac) + 4.00;
            String Total = String.format("PHP %.2f", + totalCost);
            txtTotal.setText(Total);
            txtPrice.setText(Total);
            txtClass.setText("Air-Con Bus");
            txtTicket.setText("Return");
        }   
    }//GEN-LAST:event_confirmMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked

    }//GEN-LAST:event_cancelMouseClicked

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        //IF USER CLICKED THE CANCEL BUTTON, THE PROGRAM WILL GO BACK TO START SCREEN
        this.setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new line1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox<String> cmbDestination;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton rdbtnAirconBus;
    private javax.swing.JRadioButton rdbtnOrdinaryBus;
    private javax.swing.JRadioButton rdbtnReturnTicket;
    private javax.swing.JRadioButton rdbtnSingleTicket;
    private javax.swing.JButton reset;
    private javax.swing.JTextField txtClass;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtTicket;
    private javax.swing.JTextField txtTicketNo;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtTo;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
