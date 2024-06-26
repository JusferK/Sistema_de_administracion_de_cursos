package adminPanels;
import javax.swing.JOptionPane;
public class createStudentP extends javax.swing.JPanel {
    
    public createStudentP() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        nameLabel = new java.awt.Label();
        lastNameLabel = new java.awt.Label();
        studenID = new java.awt.Label();
        passwordLabel = new java.awt.Label();
        nameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        studentIDField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        instructions = new javax.swing.JLabel();
        passwordLabel1 = new java.awt.Label();
        sexField = new javax.swing.JTextField();

        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Assistant ExtraBold", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Add a new student");
        basement.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 330, 80));

        nameLabel.setAlignment(java.awt.Label.CENTER);
        nameLabel.setBackground(new java.awt.Color(3, 27, 59));
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name");
        basement.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 90, 40));

        lastNameLabel.setAlignment(java.awt.Label.CENTER);
        lastNameLabel.setBackground(new java.awt.Color(3, 27, 59));
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Last name");
        basement.add(lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 90, 40));

        studenID.setAlignment(java.awt.Label.CENTER);
        studenID.setBackground(new java.awt.Color(3, 27, 59));
        studenID.setForeground(new java.awt.Color(255, 255, 255));
        studenID.setText("Student ID");
        basement.add(studenID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 90, 40));

        passwordLabel.setAlignment(java.awt.Label.CENTER);
        passwordLabel.setBackground(new java.awt.Color(3, 27, 59));
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Sex");
        basement.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 90, 40));

        nameField.setBackground(new java.awt.Color(71, 108, 166));
        nameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 240, 40));

        lastNameField.setBackground(new java.awt.Color(71, 108, 166));
        lastNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });
        basement.add(lastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 240, 40));

        studentIDField.setBackground(new java.awt.Color(71, 108, 166));
        studentIDField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(studentIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 240, 40));

        passwordField.setBackground(new java.awt.Color(71, 108, 166));
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 240, 40));

        saveBtn.setBackground(new java.awt.Color(3, 27, 59));
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        basement.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 100, 40));

        instructions.setFont(new java.awt.Font("Assistant", 0, 14)); // NOI18N
        instructions.setForeground(new java.awt.Color(255, 255, 255));
        instructions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instructions.setText("<html>  Instructions: In order to create new credentials for a new student, name and last name can only be text, the studen ID needs to be alphanumeric with a minimum and miximum of 8 characters and the password need to contain at least: <ul><li>One Upper case <li>One Lower case <li>One special character <li>One number <ul><html>");
        instructions.setToolTipText("");
        instructions.setAlignmentX(0.5F);
        instructions.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        basement.add(instructions, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 370, 250));

        passwordLabel1.setAlignment(java.awt.Label.CENTER);
        passwordLabel1.setBackground(new java.awt.Color(3, 27, 59));
        passwordLabel1.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel1.setText("Password");
        basement.add(passwordLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 90, 40));

        sexField.setBackground(new java.awt.Color(71, 108, 166));
        sexField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(sexField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 240, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basement, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        basement.setOpaque(false);
    }// </editor-fold>//GEN-END:initComponents

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed

    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        
        String[] Regexes = {"^[a-zA-Z]+$", "^[a-zA-Z0-9]{8,8}$", "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).{8,}$"};
        
        String name = nameField.getText();
        String lastName = lastNameField.getText();
        String studentID = studentIDField.getText();
        String password = passwordField.getText();
        String sex = sexField.getText();

        if (password.matches(Regexes[2]) && name.matches(Regexes[0]) && lastName.matches(Regexes[0]) && studentID.matches(Regexes[1])) {
            com.mycompany.sistema_de_administracion.student newStudent = new com.mycompany.sistema_de_administracion.student(name, lastName, studentID, password, sex);
            com.mycompany.sistema_de_administracion.Sistema_De_Administracion.studentList.add(newStudent);

            JOptionPane.showMessageDialog(this, "Student was created succesfully!");
            nameField.setText("");
            lastNameField.setText("");
            studentIDField.setText("");
            passwordField.setText("");
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
    java.awt.Label nameLabel;
    javax.swing.JTextField passwordField;
    java.awt.Label passwordLabel;
    java.awt.Label passwordLabel1;
    javax.swing.JButton saveBtn;
    javax.swing.JTextField sexField;
    java.awt.Label studenID;
    javax.swing.JTextField studentIDField;
    javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
