package adminPanels;

public class profileFrame extends javax.swing.JFrame {
    
    public profileFrame() {
        
        initComponents();
        setInfoUp();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        nameInput = new javax.swing.JTextField();
        carneInput = new javax.swing.JTextField();
        addressInput = new javax.swing.JTextField();
        sedeLabel = new javax.swing.JLabel();
        carneLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setBackground(new java.awt.Color(3, 27, 59));
        exitBtn.setFont(new java.awt.Font("Assistant", 0, 11)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("Exit");
        exitBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel3.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 90, 40));

        nameInput.setBackground(new java.awt.Color(71, 108, 166));
        nameInput.setFont(new java.awt.Font("Assistant", 0, 11)); // NOI18N
        nameInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameInputFocusLost(evt);
            }
        });
        nameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInputActionPerformed(evt);
            }
        });
        jPanel3.add(nameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 440, 50));

        carneInput.setBackground(new java.awt.Color(71, 108, 166));
        carneInput.setFont(new java.awt.Font("Assistant", 0, 11)); // NOI18N
        carneInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        carneInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                carneInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                carneInputFocusLost(evt);
            }
        });
        carneInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carneInputActionPerformed(evt);
            }
        });
        jPanel3.add(carneInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 440, 50));

        addressInput.setBackground(new java.awt.Color(71, 108, 166));
        addressInput.setFont(new java.awt.Font("Assistant", 0, 11)); // NOI18N
        addressInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addressInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressInputFocusLost(evt);
            }
        });
        addressInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressInputActionPerformed(evt);
            }
        });
        jPanel3.add(addressInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 440, 50));

        sedeLabel.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/location-icon.png")); // NOI18N
        jPanel3.add(sedeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        carneLabel.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/carne-icon.png")); // NOI18N
        jPanel3.add(carneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        nameLabel.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/user_2.png")); // NOI18N
        jPanel3.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        iconLabel.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/user-icon.png")); // NOI18N
        jPanel3.add(iconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 90, 70));

        backgroundLabel.setBackground(new java.awt.Color(0, 0, 0));
        backgroundLabel.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/background-login.jpg")); // NOI18N
        jPanel3.add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameInputActionPerformed

    private void nameInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameInputFocusLost
        
    }//GEN-LAST:event_nameInputFocusLost

    private void nameInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameInputFocusGained
        
    }//GEN-LAST:event_nameInputFocusGained

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked

        
    }//GEN-LAST:event_exitBtnMouseClicked

    private void carneInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_carneInputFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_carneInputFocusGained

    private void carneInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_carneInputFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_carneInputFocusLost

    private void carneInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carneInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carneInputActionPerformed

    private void addressInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressInputFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_addressInputFocusGained

    private void addressInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressInputFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_addressInputFocusLost

    private void addressInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressInputActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTextField addressInput;
    javax.swing.JLabel backgroundLabel;
    javax.swing.JTextField carneInput;
    javax.swing.JLabel carneLabel;
    javax.swing.JButton exitBtn;
    javax.swing.JLabel iconLabel;
    javax.swing.JPanel jPanel3;
    javax.swing.JTextField nameInput;
    javax.swing.JLabel nameLabel;
    javax.swing.JLabel sedeLabel;
    // End of variables declaration//GEN-END:variables

    public void setInfoUp() {
        
        nameInput.setEnabled(false);
        carneInput.setEnabled(false);
        addressInput.setEnabled(false);
        
        nameInput.setText("Justine Fernando Arriaga Marroquin");
        carneInput.setText("3190-22-21898");
        addressInput.setText("Mariano Galvez de Guatemala, Centro de San Jose Pinula");
    }
    
}
