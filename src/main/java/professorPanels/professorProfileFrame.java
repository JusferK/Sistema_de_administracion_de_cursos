package professorPanels;

public class professorProfileFrame extends javax.swing.JFrame {
    
    com.mycompany.sistema_de_administracion.professor globaInfo = null;
    
    public professorProfileFrame(com.mycompany.sistema_de_administracion.professor info) {
        
        initComponents();
        
        globaInfo = info;
        
        setInfoUp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        changePasswordBtn = new javax.swing.JButton();
        nameInput = new javax.swing.JTextField();
        userInput = new javax.swing.JTextField();
        speciallityField = new javax.swing.JTextField();
        userLabel1 = new javax.swing.JLabel();
        speciallityLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        basement.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 90, 40));

        changePasswordBtn.setBackground(new java.awt.Color(3, 27, 59));
        changePasswordBtn.setFont(new java.awt.Font("Assistant", 0, 11)); // NOI18N
        changePasswordBtn.setForeground(new java.awt.Color(255, 255, 255));
        changePasswordBtn.setText("Change password");
        changePasswordBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        changePasswordBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePasswordBtnMouseClicked(evt);
            }
        });
        changePasswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordBtnActionPerformed(evt);
            }
        });
        basement.add(changePasswordBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 150, 40));

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
        basement.add(nameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 440, 50));

        userInput.setBackground(new java.awt.Color(71, 108, 166));
        userInput.setFont(new java.awt.Font("Assistant", 0, 11)); // NOI18N
        userInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userInputFocusLost(evt);
            }
        });
        userInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInputActionPerformed(evt);
            }
        });
        basement.add(userInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 440, 50));

        speciallityField.setBackground(new java.awt.Color(71, 108, 166));
        speciallityField.setFont(new java.awt.Font("Assistant", 0, 11)); // NOI18N
        speciallityField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        speciallityField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                speciallityFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                speciallityFieldFocusLost(evt);
            }
        });
        speciallityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speciallityFieldActionPerformed(evt);
            }
        });
        basement.add(speciallityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 440, 50));

        userLabel1.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/carne-icon.png")); // NOI18N
        basement.add(userLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        speciallityLabel.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/carne-icon.png")); // NOI18N
        basement.add(speciallityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        nameLabel.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/user_2.png")); // NOI18N
        basement.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        iconLabel.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/user-icon.png")); // NOI18N
        basement.add(iconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 90, 70));

        backgroundLabel.setBackground(new java.awt.Color(0, 0, 0));
        backgroundLabel.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/background-login.jpg")); // NOI18N
        basement.add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked

    }//GEN-LAST:event_exitBtnMouseClicked

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void nameInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameInputFocusGained

    }//GEN-LAST:event_nameInputFocusGained

    private void nameInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameInputFocusLost

    }//GEN-LAST:event_nameInputFocusLost

    private void nameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameInputActionPerformed

    private void userInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userInputFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_userInputFocusGained

    private void userInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userInputFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_userInputFocusLost

    private void userInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userInputActionPerformed

    private void changePasswordBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePasswordBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_changePasswordBtnMouseClicked

    private void changePasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordBtnActionPerformed
        changePasswordProfessorFrame newFrame = new changePasswordProfessorFrame(globaInfo);
        newFrame.setVisible(true);
        newFrame.setResizable(false);
    }//GEN-LAST:event_changePasswordBtnActionPerformed

    private void speciallityFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_speciallityFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_speciallityFieldFocusGained

    private void speciallityFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_speciallityFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_speciallityFieldFocusLost

    private void speciallityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speciallityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_speciallityFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel backgroundLabel;
    javax.swing.JPanel basement;
    javax.swing.JButton changePasswordBtn;
    javax.swing.JButton exitBtn;
    javax.swing.JLabel iconLabel;
    javax.swing.JTextField nameInput;
    javax.swing.JLabel nameLabel;
    javax.swing.JTextField speciallityField;
    javax.swing.JLabel speciallityLabel;
    javax.swing.JTextField userInput;
    javax.swing.JLabel userLabel1;
    // End of variables declaration//GEN-END:variables

    public void setInfoUp() {
        nameInput.setEnabled(false);
        userInput.setEnabled(false);
        speciallityField.setEnabled(false);
        
        nameInput.setText(globaInfo.getName() + " " + globaInfo.lastName);
        userInput.setText(globaInfo.user);
        speciallityField.setText(globaInfo.speciallity);
    }

}
