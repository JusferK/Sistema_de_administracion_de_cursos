package adminPanels;

import javax.swing.JOptionPane;

public class editStudentPanel extends javax.swing.JPanel {
    
    com.mycompany.sistema_de_administracion.student globalStudentSelected = null;
    
    public editStudentPanel() {
        
        initComponents();
        setComboBoxUp();
        defaultSettings(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        nameLabel = new java.awt.Label();
        lastNameLabel = new java.awt.Label();
        userLabel = new java.awt.Label();
        passwordLabel = new java.awt.Label();
        studentNameField = new javax.swing.JTextField();
        studentLastNameField = new javax.swing.JTextField();
        studentIDField = new javax.swing.JTextField();
        studentPasswordField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        studentComboBox = new javax.swing.JComboBox<>();
        selectBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();

        basement.setForeground(new java.awt.Color(255, 255, 255));
        basement.setPreferredSize(new java.awt.Dimension(1500, 540));
        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title1.setFont(new java.awt.Font("Assistant ExtraBold", 0, 36)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setText("Edit  student");
        basement.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 12, -1, 90));

        nameLabel.setAlignment(java.awt.Label.CENTER);
        nameLabel.setBackground(new java.awt.Color(3, 27, 59));
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name");
        basement.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 90, 40));

        lastNameLabel.setAlignment(java.awt.Label.CENTER);
        lastNameLabel.setBackground(new java.awt.Color(3, 27, 59));
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Last name");
        basement.add(lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 90, 40));

        userLabel.setAlignment(java.awt.Label.CENTER);
        userLabel.setBackground(new java.awt.Color(3, 27, 59));
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("ID");
        basement.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 90, 40));

        passwordLabel.setAlignment(java.awt.Label.CENTER);
        passwordLabel.setBackground(new java.awt.Color(3, 27, 59));
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");
        basement.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 90, 40));

        studentNameField.setBackground(new java.awt.Color(71, 108, 166));
        studentNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(studentNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 240, 40));

        studentLastNameField.setBackground(new java.awt.Color(71, 108, 166));
        studentLastNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        studentLastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentLastNameFieldActionPerformed(evt);
            }
        });
        basement.add(studentLastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 240, 40));

        studentIDField.setBackground(new java.awt.Color(71, 108, 166));
        studentIDField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(studentIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 240, 40));

        studentPasswordField.setBackground(new java.awt.Color(71, 108, 166));
        studentPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(studentPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 240, 40));

        saveBtn.setBackground(new java.awt.Color(3, 27, 59));
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        basement.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 140, 50));

        basement.add(studentComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 330, 50));

        selectBtn.setBackground(new java.awt.Color(3, 27, 59));
        selectBtn.setForeground(new java.awt.Color(255, 255, 255));
        selectBtn.setText("Select");
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });
        basement.add(selectBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 140, 50));

        editBtn.setBackground(new java.awt.Color(3, 27, 59));
        editBtn.setForeground(new java.awt.Color(255, 255, 255));
        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        basement.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 150, 50));

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

    private void studentLastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentLastNameFieldActionPerformed

    }//GEN-LAST:event_studentLastNameFieldActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

        String[] inputFields = {studentNameField.getText(), studentLastNameField.getText(), studentIDField.getText(), studentPasswordField.getText()};

        boolean studentNameChange = changeVerification(globalStudentSelected.getStudentName(), inputFields[0]);
        boolean studentLastNameChange = changeVerification(globalStudentSelected.getStudentLastName(), inputFields[1]);
        boolean studentPasswordChange = changeVerification(globalStudentSelected.password, inputFields[3]);

        if (studentNameChange) {
            globalStudentSelected.setStudentName(inputFields[0]);
            JOptionPane.showMessageDialog(this, "Name has been change");
        }
        if (studentLastNameChange) {
            globalStudentSelected.setStudentLastName(inputFields[1]);
            JOptionPane.showMessageDialog(this, "Last name has been change");
        }
        if (studentPasswordChange) {
            globalStudentSelected.password = inputFields[3];
            JOptionPane.showMessageDialog(this, "Password has been change");
        }

        if (!studentNameChange && !studentLastNameChange && !studentPasswordChange) {
            JOptionPane.showMessageDialog(this, "No change was made");
        }

        defaultSettings(true);

    }//GEN-LAST:event_saveBtnActionPerformed

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed

        String studentSelected = studentComboBox.getSelectedItem().toString();

        if (studentSelected.length() > 0) {

            for (com.mycompany.sistema_de_administracion.student sT : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.studentList) {

                String studentName = sT.getStudentName() + " " + sT.getStudentLastName();

                if (studentSelected.equals(studentName)) {
                    
                    studentNameField.setText(sT.getStudentName());
                    studentLastNameField.setText(sT.getStudentLastName());
                    studentIDField.setText(sT.getStudentID());
                    studentPasswordField.setText(sT.password);

                    globalStudentSelected = sT;
                }
            }

            defaultSettings(true);
        }
    }//GEN-LAST:event_selectBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        studentNameField.setEditable(true);
        studentLastNameField.setEditable(true);
        studentPasswordField.setEnabled(true);
        saveBtn.setEnabled(true);
        editBtn.setEnabled(false);
    }//GEN-LAST:event_editBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel basement;
    javax.swing.JButton editBtn;
    java.awt.Label lastNameLabel;
    java.awt.Label nameLabel;
    java.awt.Label passwordLabel;
    javax.swing.JButton saveBtn;
    javax.swing.JButton selectBtn;
    javax.swing.JComboBox<String> studentComboBox;
    javax.swing.JTextField studentIDField;
    javax.swing.JTextField studentLastNameField;
    javax.swing.JTextField studentNameField;
    javax.swing.JTextField studentPasswordField;
    javax.swing.JLabel title1;
    java.awt.Label userLabel;
    // End of variables declaration//GEN-END:variables

    public void defaultSettings(boolean myValue) {
        studentNameField.setEditable(false);
        studentLastNameField.setEditable(false);
        studentIDField.setEditable(false);
        studentPasswordField.setEnabled(false);
        saveBtn.setEnabled(false);
        editBtn.setEnabled(myValue);
    }
    
    private boolean changeVerification(String name, String inputField) {
        boolean response = !name.equals(inputField);
        return response;
    }
    
    public void setComboBoxUp() {
        for (com.mycompany.sistema_de_administracion.student sT : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.studentList) {
            studentComboBox.addItem(sT.getStudentName() + " " + sT.getStudentLastName());
        }
    }

}
