package com.mycompany.sistema_de_administracion;
import java.awt.Color;
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
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
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

        jTextField1.setBackground(new java.awt.Color(19, 58, 119));
        jTextField1.setText("User");
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 236, -1, 18));

        jTextField3.setBackground(new java.awt.Color(71, 108, 166));
        jTextField3.setFont(new java.awt.Font("Assistant", 0, 11)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Password");
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 138, 222, 50));

        jButton1.setBackground(new java.awt.Color(3, 27, 59));
        jButton1.setFont(new java.awt.Font("Assistant", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 214, 66, 26));

        jTextField4.setBackground(new java.awt.Color(71, 108, 166));
        jTextField4.setFont(new java.awt.Font("Assistant", 0, 11)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("User");
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 80, 218, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 104, 410, 280));

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/user-icon.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

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

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        String[] inputFields = {jTextField4.getText(), jTextField3.getText()};
        
        boolean adminResult = Sistema_De_Administracion.mainAdmin.login(inputFields[0], inputFields[1]);
        boolean professorResult = Sistema_De_Administracion.newProfessor.login(inputFields[0], inputFields[1]);
        boolean studenResult = Sistema_De_Administracion.newStudent.studentlogin(inputFields[0], inputFields[1]);
        
        
        
        administratorScreen adminScreen = new administratorScreen();
        professorScreen profScreen = new professorScreen();
        studentScreen studScreen = new studentScreen();
        
        if (adminResult) {
            adminScreen.setVisible(true);
            adminScreen.setResizable(false);
            this.dispose();
            JOptionPane.showMessageDialog(this, "Login succesful!");
        } else if(professorResult) {
            profScreen.setVisible(true);
            profScreen.setResizable(false);
            this.dispose();
            JOptionPane.showMessageDialog(this, "Login succesful!");
        } else if(studenResult) {
            studScreen.setVisible(true);
            studScreen.setResizable(false);
            this.dispose();
            JOptionPane.showMessageDialog(this, "Login succesful!");
        } 
        if(!adminResult && !professorResult && !studenResult) {
            JOptionPane.showMessageDialog(this, "User or password not found");
        }  
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        String inputField = jTextField4.getText(); // Evento cuando se enfoca el focus
        
        if (inputField.equals("User")) {
            jTextField4.setText("");
        }
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        String inputField = jTextField3.getText();
        
        if (inputField.length() == 0 || inputField.equals("Password")) {
            jTextField3.setText("");
        }
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        String inputField = jTextField4.getText(); // Evento cuando se pierde el focus
        
        if (inputField.equals("")) {
            jTextField4.setText("User");
        }
    }//GEN-LAST:event_jTextField4FocusLost

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        String inputField = jTextField3.getText();
        
        if (inputField.length() == 0) {
            jTextField3.setText("Password");
        }
    }//GEN-LAST:event_jTextField3FocusLost

    private void jPanel2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
