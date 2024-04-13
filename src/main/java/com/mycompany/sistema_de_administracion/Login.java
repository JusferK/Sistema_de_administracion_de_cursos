package com.mycompany.sistema_de_administracion;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    public Login() {
        
        initComponents();
        jPanel2.setBackground(new Color(255, 255, 255, 127));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        userNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPanel2FocusLost(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/user_2.png")); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 80, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/password-icon.png")); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 138, -1, -1));

        passwordField.setBackground(new java.awt.Color(71, 108, 166));
        passwordField.setFont(new java.awt.Font("Assistant", 0, 11)); // NOI18N
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordField.setText("Password");
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        jPanel2.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 138, 222, 50));

        loginBtn.setBackground(new java.awt.Color(3, 27, 59));
        loginBtn.setFont(new java.awt.Font("Assistant", 0, 11)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel2.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 214, 66, 26));

        userNameField.setBackground(new java.awt.Color(71, 108, 166));
        userNameField.setFont(new java.awt.Font("Assistant", 0, 11)); // NOI18N
        userNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userNameField.setText("User");
        userNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userNameFieldFocusLost(evt);
            }
        });
        userNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameFieldActionPerformed(evt);
            }
        });
        jPanel2.add(userNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 80, 218, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 104, 410, 280));

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/user-icon.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/background-login.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        
    }//GEN-LAST:event_loginBtnActionPerformed

    private void userNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameFieldActionPerformed

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        
        String[] inputFields = {userNameField.getText(), passwordField.getText()};
        boolean adminResult = Sistema_De_Administracion.mainAdmin.login(inputFields[0], inputFields[1]);
        boolean professorMethodCall = professor.professorLogin(inputFields[0], inputFields[1]);
        boolean studentMethodCall = student.studentLogin(inputFields[0], inputFields[1]);
        
        
        if (adminResult) {
            administratorScreen adminScreen = new administratorScreen();
            openScreen(adminScreen);
        } else if(professorMethodCall) {
            String name = professor.professorWelcomeName(inputFields[0]);
            String lastName = professor.professorLastName(inputFields[0], name);
            professorScreen profScreen = new professorScreen(name, inputFields[0], lastName);
            openScreen(profScreen);
        } else if(studentMethodCall) {
            String name = student.studentWelcomeName(inputFields[0]);
            student studentInfo = student.retreiveInfo(name, inputFields[0]);
            studentScreen studScreen = new studentScreen(name, studentInfo);
            openScreen(studScreen);
        } 
        if(!adminResult && !professorMethodCall && !studentMethodCall) {
            JOptionPane.showMessageDialog(this, "User or password not found");
        }
    }//GEN-LAST:event_loginBtnMouseClicked

    private void userNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameFieldFocusGained
        String inputField = userNameField.getText();
        
        if (inputField.equals("User")) {
            userNameField.setText("");
        }
    }//GEN-LAST:event_userNameFieldFocusGained

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        String inputField = passwordField.getText();
        
        if (inputField.length() == 0 || inputField.equals("Password")) {
            passwordField.setText("");
        }
    }//GEN-LAST:event_passwordFieldFocusGained

    private void userNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameFieldFocusLost
        String inputField = userNameField.getText();
        
        if (inputField.equals("")) {
            userNameField.setText("User");
        }
    }//GEN-LAST:event_userNameFieldFocusLost

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
        String inputField = passwordField.getText();
        
        if (inputField.length() == 0) {
            passwordField.setText("Password");
        }
    }//GEN-LAST:event_passwordFieldFocusLost

    private void jPanel2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables

    private void openScreen(JFrame roleScreen) {
        
            roleScreen.setVisible(true);
            roleScreen.setResizable(false);
            this.dispose();
            JOptionPane.showMessageDialog(this, "Login succesful!");
    }
}
