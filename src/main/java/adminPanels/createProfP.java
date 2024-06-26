package adminPanels;

import javax.swing.JOptionPane;
public class createProfP extends javax.swing.JPanel {
    
    public createProfP() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        nameLabel1 = new java.awt.Label();
        lastNameLabel = new java.awt.Label();
        userLabel = new java.awt.Label();
        passwordLabel = new java.awt.Label();
        passwordLabel1 = new java.awt.Label();
        nameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        userField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        speciallityTextField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        instructions = new javax.swing.JLabel();

        setForeground(new java.awt.Color(255, 255, 255));

        basement.setForeground(new java.awt.Color(255, 255, 255));
        basement.setPreferredSize(new java.awt.Dimension(1500, 540));
        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Assistant ExtraBold", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Add a new professor");
        basement.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 23, 330, 90));

        nameLabel1.setAlignment(java.awt.Label.CENTER);
        nameLabel1.setBackground(new java.awt.Color(3, 27, 59));
        nameLabel1.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel1.setText("Name");
        basement.add(nameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 90, 40));

        lastNameLabel.setAlignment(java.awt.Label.CENTER);
        lastNameLabel.setBackground(new java.awt.Color(3, 27, 59));
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Last name");
        basement.add(lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 90, 40));

        userLabel.setAlignment(java.awt.Label.CENTER);
        userLabel.setBackground(new java.awt.Color(3, 27, 59));
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("User");
        basement.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 90, 40));

        passwordLabel.setAlignment(java.awt.Label.CENTER);
        passwordLabel.setBackground(new java.awt.Color(3, 27, 59));
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");
        basement.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 90, 40));

        passwordLabel1.setAlignment(java.awt.Label.CENTER);
        passwordLabel1.setBackground(new java.awt.Color(3, 27, 59));
        passwordLabel1.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel1.setText("Speciallity");
        basement.add(passwordLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 90, 40));

        nameField.setBackground(new java.awt.Color(71, 108, 166));
        nameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 240, 40));

        lastNameField.setBackground(new java.awt.Color(71, 108, 166));
        lastNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });
        basement.add(lastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 240, 40));

        userField.setBackground(new java.awt.Color(71, 108, 166));
        userField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 240, 40));

        passwordField.setBackground(new java.awt.Color(71, 108, 166));
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 240, 40));

        speciallityTextField.setBackground(new java.awt.Color(71, 108, 166));
        speciallityTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(speciallityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 240, 40));

        saveBtn.setBackground(new java.awt.Color(3, 27, 59));
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        basement.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 449, 140, 50));

        instructions.setFont(new java.awt.Font("Assistant", 0, 14)); // NOI18N
        instructions.setForeground(new java.awt.Color(255, 255, 255));
        instructions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instructions.setText("<html>  Instructions: In order to create new credentials for a new professor, name and last name can only be text, the user needs to be alphanumeric and the password need to contain at least: <ul><li>One Upper case <li>One Lower case <li>One special character <li>One number <ul><html>");
        instructions.setToolTipText("");
        instructions.setAlignmentX(0.5F);
        instructions.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        basement.add(instructions, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 131, 395, 336));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        basement.setOpaque(false);
    }// </editor-fold>//GEN-END:initComponents

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String[] Regexes = {"^[a-zA-Z]+$", "^[a-zA-Z0-9]*$", "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).{8,}$"};
        
        String name = nameField.getText();
        String lastName = lastNameField.getText();
        String userName = userField.getText();
        String password = passwordField.getText();
        String speciallityField = speciallityTextField.getText();
        String sex = "maxculine";
        
        if(name.matches(Regexes[0]) && lastName.matches(Regexes[0]) && userName.matches(Regexes[1]) && password.matches(Regexes[2])) {
            com.mycompany.sistema_de_administracion.professor newProfessor = new com.mycompany.sistema_de_administracion.professor(name, lastName, userName, password, speciallityField, sex);
            com.mycompany.sistema_de_administracion.Sistema_De_Administracion.professorsList.add(newProfessor);
        
            JOptionPane.showMessageDialog(this, "Professor was created succesfully!");
            nameField.setText("");
            lastNameField.setText("");
            userField.setText("");
            passwordField.setText("");
            speciallityTextField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Make sure the all fields contains the parameters needed!");
        }
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel basement;
    javax.swing.JLabel instructions;
    javax.swing.JTextField lastNameField;
    java.awt.Label lastNameLabel;
    javax.swing.JTextField nameField;
    java.awt.Label nameLabel1;
    javax.swing.JTextField passwordField;
    java.awt.Label passwordLabel;
    java.awt.Label passwordLabel1;
    javax.swing.JButton saveBtn;
    javax.swing.JTextField speciallityTextField;
    javax.swing.JLabel title;
    javax.swing.JTextField userField;
    java.awt.Label userLabel;
    // End of variables declaration//GEN-END:variables

}