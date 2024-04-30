package studentPanels;

public class studentProfileFrame extends javax.swing.JFrame {
    
    com.mycompany.sistema_de_administracion.student globalStudentInfo = null;
    
    public studentProfileFrame(com.mycompany.sistema_de_administracion.student info) {
        
        initComponents();
        
        setInfoUp(info);
        
        globalStudentInfo = info;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        nameInput = new javax.swing.JTextField();
        changPasswordBtn = new javax.swing.JButton();
        gradesQuery = new javax.swing.JButton();
        studentIDInput = new javax.swing.JTextField();
        userLabel = new javax.swing.JLabel();
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
        basement.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 120, 50));

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

        changPasswordBtn.setBackground(new java.awt.Color(3, 27, 59));
        changPasswordBtn.setFont(new java.awt.Font("Assistant", 0, 11)); // NOI18N
        changPasswordBtn.setForeground(new java.awt.Color(255, 255, 255));
        changPasswordBtn.setText("Change password");
        changPasswordBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        changPasswordBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changPasswordBtnMouseClicked(evt);
            }
        });
        changPasswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changPasswordBtnActionPerformed(evt);
            }
        });
        basement.add(changPasswordBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 150, 50));

        gradesQuery.setBackground(new java.awt.Color(3, 27, 59));
        gradesQuery.setForeground(new java.awt.Color(255, 255, 255));
        gradesQuery.setText("Query grades");
        gradesQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradesQueryActionPerformed(evt);
            }
        });
        basement.add(gradesQuery, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 180, 50));

        studentIDInput.setBackground(new java.awt.Color(71, 108, 166));
        studentIDInput.setFont(new java.awt.Font("Assistant", 0, 11)); // NOI18N
        studentIDInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        studentIDInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                studentIDInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                studentIDInputFocusLost(evt);
            }
        });
        studentIDInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIDInputActionPerformed(evt);
            }
        });
        basement.add(studentIDInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 440, 50));

        userLabel.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/carne-icon.png")); // NOI18N
        basement.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

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
            .addComponent(basement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void studentIDInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studentIDInputFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIDInputFocusGained

    private void studentIDInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studentIDInputFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIDInputFocusLost

    private void studentIDInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIDInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIDInputActionPerformed

    private void changPasswordBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changPasswordBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_changPasswordBtnMouseClicked

    private void changPasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changPasswordBtnActionPerformed
        changePasswordStudentFrame newFrame = new changePasswordStudentFrame(globalStudentInfo);
        newFrame.setVisible(true);
        newFrame.setResizable(false);
    }//GEN-LAST:event_changPasswordBtnActionPerformed

    private void gradesQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradesQueryActionPerformed
        gradesQueryFrame newFrame = new gradesQueryFrame(globalStudentInfo);
        newFrame.setVisible(true);
        newFrame.setResizable(false);
    }//GEN-LAST:event_gradesQueryActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel backgroundLabel;
    javax.swing.JPanel basement;
    javax.swing.JButton changPasswordBtn;
    javax.swing.JButton exitBtn;
    javax.swing.JButton gradesQuery;
    javax.swing.JLabel iconLabel;
    javax.swing.JTextField nameInput;
    javax.swing.JLabel nameLabel;
    javax.swing.JTextField studentIDInput;
    javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables

    public void setInfoUp(com.mycompany.sistema_de_administracion.student studentInfo) {
        nameInput.setEnabled(false);
        studentIDInput.setEnabled(false);
        
        nameInput.setText(studentInfo.getStudentName() + " " + studentInfo.getStudentLastName());
        studentIDInput.setText(studentInfo.getStudentID());
    }

}
