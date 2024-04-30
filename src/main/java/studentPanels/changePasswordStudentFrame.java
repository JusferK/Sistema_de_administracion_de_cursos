package studentPanels;

import javax.swing.JOptionPane;

public class changePasswordStudentFrame extends javax.swing.JFrame {

    com.mycompany.sistema_de_administracion.student globalStudentInfo = null;
    
    public changePasswordStudentFrame(com.mycompany.sistema_de_administracion.student info) {
        
        initComponents();
        
        String fullName = info.getStudentName() + " " + info.getStudentLastName();
        String studentID = info.getStudentID();
        
        globalStudentInfo = info;
        setPasswordUp(fullName, studentID);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        editBtn = new javax.swing.JButton();
        changeBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        passwordInput = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editBtn.setBackground(new java.awt.Color(3, 27, 59));
        editBtn.setFont(new java.awt.Font("Assistant", 0, 11)); // NOI18N
        editBtn.setForeground(new java.awt.Color(255, 255, 255));
        editBtn.setText("Edit");
        editBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBtnMouseClicked(evt);
            }
        });
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        basement.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 90, 50));

        changeBtn.setBackground(new java.awt.Color(3, 27, 59));
        changeBtn.setFont(new java.awt.Font("Assistant", 0, 11)); // NOI18N
        changeBtn.setForeground(new java.awt.Color(255, 255, 255));
        changeBtn.setText("Change");
        changeBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        changeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeBtnMouseClicked(evt);
            }
        });
        changeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBtnActionPerformed(evt);
            }
        });
        basement.add(changeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 150, 40));

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
        basement.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 100, 50));

        passwordInput.setBackground(new java.awt.Color(71, 108, 166));
        passwordInput.setFont(new java.awt.Font("Assistant", 0, 11)); // NOI18N
        passwordInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordInputFocusLost(evt);
            }
        });
        passwordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordInputActionPerformed(evt);
            }
        });
        basement.add(passwordInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 440, 50));

        nameLabel.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/password-icon.png")); // NOI18N
        basement.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        title.setFont(new java.awt.Font("Assistant ExtraBold", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Change password");
        basement.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 300, 40));

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

    private void editBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseClicked
        passwordInput.setEnabled(true);
        editBtn.setEnabled(false);
        changeBtn.setEnabled(true);
    }//GEN-LAST:event_editBtnMouseClicked

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        
    }//GEN-LAST:event_editBtnActionPerformed

    private void changeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_changeBtnMouseClicked

    private void changeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeBtnActionPerformed

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).{8,}$";
        String passwordChange = passwordInput.getText();

        if (globalStudentInfo.password.equals(passwordChange)) {
            JOptionPane.showMessageDialog(this, "No change was made");
            changeBtn.setEnabled(false);
            passwordInput.setEnabled(false);
        } else if (passwordChange.matches(regex)) {
            globalStudentInfo.password = passwordChange;
            JOptionPane.showMessageDialog(this, "Password was successfully changed");
            changeBtn.setEnabled(false);
            passwordInput.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "Make sure that the password contains the characteristics needed");
            changeBtn.setEnabled(false);
            passwordInput.setEnabled(false);
        }

        editBtn.setEnabled(true);
    }//GEN-LAST:event_changeBtnActionPerformed

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBtnMouseClicked

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void passwordInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordInputFocusGained

    }//GEN-LAST:event_passwordInputFocusGained

    private void passwordInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordInputFocusLost

    }//GEN-LAST:event_passwordInputFocusLost

    private void passwordInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInputActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel backgroundLabel;
    javax.swing.JPanel basement;
    javax.swing.JButton changeBtn;
    javax.swing.JButton editBtn;
    javax.swing.JButton exitBtn;
    javax.swing.JLabel nameLabel;
    javax.swing.JTextField passwordInput;
    javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    public void setPasswordUp(String name, String user) {

            com.mycompany.sistema_de_administracion.student studentWorkingWith = null;

            for (com.mycompany.sistema_de_administracion.student sT : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.studentList) {

                String fullName = sT.getStudentName() + " " + sT.getStudentLastName();

                if (fullName.equals(name) && sT.getStudentID().equals(user)) {
                    studentWorkingWith = sT;
                }
            }

            globalStudentInfo = studentWorkingWith;

            passwordInput.setText(studentWorkingWith.password);
            changeBtn.setEnabled(false);
            passwordInput.setEnabled(false);
    }

}
