/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author i7 MAX GAMER
 */
public class NuevaFactura extends javax.swing.JFrame {

    /**
     * Creates new form NuevaFactura
     */
    public NuevaFactura() {
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        labelID1 = new javax.swing.JLabel();
        labelIDIN2 = new javax.swing.JLabel();
        labelID5 = new javax.swing.JLabel();
        labelID6 = new javax.swing.JLabel();
        labelIDIN7 = new javax.swing.JLabel();
        labelIDIN8 = new javax.swing.JLabel();
        labelID8 = new javax.swing.JLabel();
        labelIDIN9 = new javax.swing.JLabel();
        labelID7 = new javax.swing.JLabel();
        labelIDIN11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        labelID9 = new javax.swing.JLabel();
        labelID10 = new javax.swing.JLabel();
        labelID11 = new javax.swing.JLabel();
        labelIDIN12 = new javax.swing.JLabel();
        labelIDIN13 = new javax.swing.JLabel();
        labelID12 = new javax.swing.JLabel();
        labelID13 = new javax.swing.JLabel();
        labelIDIN14 = new javax.swing.JLabel();
        labelIDIN15 = new javax.swing.JLabel();
        labelID = new javax.swing.JLabel();
        labelIDIN1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        labelID2 = new javax.swing.JLabel();
        labelID3 = new javax.swing.JLabel();
        labelID4 = new javax.swing.JLabel();
        labelIDIN6 = new javax.swing.JLabel();
        labelIDIN5 = new javax.swing.JLabel();
        labelIDIN4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Producto", "Descripcion", "Precio Unitario", "Cantidad", "Nombre Tipo", "ValorAgregado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 480, 220));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Empresa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        labelID1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelID1.setText("RUC:");

        labelIDIN2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelIDIN2.setText("0159756347621");

        labelID5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelID5.setText("Nombre:");

        labelID6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelID6.setText("Direccion:");

        labelIDIN7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelIDIN7.setText("Agencia de viajes inaneitor");

        labelIDIN8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelIDIN8.setText("Av Gil  Ramires Davaloz");

        labelID8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelID8.setText("Email:");

        labelIDIN9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelIDIN9.setText("ivaneitor@ups.edu.ec");

        labelID7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelID7.setText("Telefono:");

        labelIDIN11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelIDIN11.setText("0991039408");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labelID1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelIDIN2)
                        .addGap(49, 49, 49)
                        .addComponent(labelID6)
                        .addGap(17, 17, 17)
                        .addComponent(labelIDIN8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labelID5)
                        .addGap(27, 27, 27)
                        .addComponent(labelIDIN7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelID7)
                    .addComponent(labelID8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIDIN11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIDIN9))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelID5)
                    .addComponent(labelIDIN7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelID7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelIDIN11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelID6)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelIDIN8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelID8)
                        .addComponent(labelIDIN9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelID1)
                        .addComponent(labelIDIN2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 700, 110));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        labelID9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelID9.setText("ID:");

        labelID10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelID10.setText("Nombre:");

        labelID11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelID11.setText("Direccion:");

        labelIDIN12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        labelIDIN13.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        labelID12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelID12.setText("Telefono:");

        labelID13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelID13.setText("Email:");

        labelIDIN14.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        labelIDIN15.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        labelID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelID.setText("Fecha:");

        labelIDIN1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(labelID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelIDIN1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(labelID9)
                        .addGap(30, 30, 30)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(labelID10)
                        .addGap(18, 18, 18)
                        .addComponent(labelIDIN12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelID12)
                        .addGap(18, 18, 18)
                        .addComponent(labelIDIN15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(labelID11)
                        .addGap(17, 17, 17)
                        .addComponent(labelIDIN13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(labelID13)
                        .addGap(42, 42, 42)
                        .addComponent(labelIDIN14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelID9)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelID10)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelIDIN12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelID12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIDIN15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelID)
                    .addComponent(labelIDIN1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelID11)
                    .addComponent(labelIDIN13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelID13)
                    .addComponent(labelIDIN14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 700, 90));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labelID2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelID2.setText("Subtotal:");

        labelID3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelID3.setText("IVA:");

        labelID4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelID4.setText("Total:");

        labelIDIN6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        labelIDIN5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        labelIDIN4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelID2)
                        .addGap(14, 14, 14)
                        .addComponent(labelIDIN4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelID3)
                        .addGap(45, 45, 45)
                        .addComponent(labelIDIN5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelID4)
                        .addGap(34, 34, 34)
                        .addComponent(labelIDIN6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelID2)
                    .addComponent(labelIDIN4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelID3)
                    .addComponent(labelIDIN5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelID4)
                    .addComponent(labelIDIN6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, 100));

        jLabel1.setForeground(new java.awt.Color(62, 150, 148));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CompraGRande.png"))); // NOI18N
        jLabel1.setText("Agregar Detalle");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Enter_OFF_v.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Enter_ON_v.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Enter_ON_v.png"))); // NOI18N
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 130, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(NuevaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelID1;
    private javax.swing.JLabel labelID10;
    private javax.swing.JLabel labelID11;
    private javax.swing.JLabel labelID12;
    private javax.swing.JLabel labelID13;
    private javax.swing.JLabel labelID2;
    private javax.swing.JLabel labelID3;
    private javax.swing.JLabel labelID4;
    private javax.swing.JLabel labelID5;
    private javax.swing.JLabel labelID6;
    private javax.swing.JLabel labelID7;
    private javax.swing.JLabel labelID8;
    private javax.swing.JLabel labelID9;
    private javax.swing.JLabel labelIDIN1;
    private javax.swing.JLabel labelIDIN11;
    private javax.swing.JLabel labelIDIN12;
    private javax.swing.JLabel labelIDIN13;
    private javax.swing.JLabel labelIDIN14;
    private javax.swing.JLabel labelIDIN15;
    private javax.swing.JLabel labelIDIN2;
    private javax.swing.JLabel labelIDIN4;
    private javax.swing.JLabel labelIDIN5;
    private javax.swing.JLabel labelIDIN6;
    private javax.swing.JLabel labelIDIN7;
    private javax.swing.JLabel labelIDIN8;
    private javax.swing.JLabel labelIDIN9;
    // End of variables declaration//GEN-END:variables
}