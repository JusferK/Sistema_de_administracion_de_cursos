package adminPanels;
import javax.swing.JOptionPane;

public class editProfessorPanel extends javax.swing.JPanel {
    
    com.mycompany.sistema_de_administracion.professor globalProfessorSelected = null;
    
    public editProfessorPanel() {
        
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
        nameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        userField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        professorComboBox = new javax.swing.JComboBox<>();
        selectBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();

        basement.setForeground(new java.awt.Color(255, 255, 255));
        basement.setPreferredSize(new java.awt.Dimension(1500, 540));
        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title1.setFont(new java.awt.Font("Assistant ExtraBold", 0, 36)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setText("Edit a professor");
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
        userLabel.setText("User");
        basement.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 90, 40));

        passwordLabel.setAlignment(java.awt.Label.CENTER);
        passwordLabel.setBackground(new java.awt.Color(3, 27, 59));
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");
        basement.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 90, 40));

        nameField.setBackground(new java.awt.Color(71, 108, 166));
        nameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 240, 40));

        lastNameField.setBackground(new java.awt.Color(71, 108, 166));
        lastNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });
        basement.add(lastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 240, 40));

        userField.setBackground(new java.awt.Color(71, 108, 166));
        userField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 240, 40));

        passwordField.setBackground(new java.awt.Color(71, 108, 166));
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 240, 40));

        saveBtn.setBackground(new java.awt.Color(3, 27, 59));
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        basement.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 140, 50));

        basement.add(professorComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 330, 50));

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

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed

    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
                
        String[] inputFields = {nameField.getText(), lastNameField.getText(), userField.getText(), passwordField.getText()};
        
        
        boolean nameChange = changeVerification(globalProfessorSelected.getName(), inputFields[0]);
        boolean lastNameChange = changeVerification(globalProfessorSelected.lastName, inputFields[1]);
        boolean userNameChange = changeVerification(globalProfessorSelected.user, inputFields[2]);
        boolean passwordChange = changeVerification(globalProfessorSelected.password, inputFields[3]);
        
        if (nameChange) {
            globalProfessorSelected.setName(inputFields[0]);
            JOptionPane.showMessageDialog(this, "Name has been change");
        }
        if (lastNameChange) {
            globalProfessorSelected.lastName = inputFields[1];
            JOptionPane.showMessageDialog(this, "Last name has been change");
        }
        if (userNameChange) {
            globalProfessorSelected.user = inputFields[2];
            JOptionPane.showMessageDialog(this, "User has been change");
        }
        if (passwordChange) {
            globalProfessorSelected.password = inputFields[3];
            JOptionPane.showMessageDialog(this, "Password has been change");
        }
        
        if (!nameChange && !lastNameChange && !userNameChange && !passwordChange) {
            JOptionPane.showMessageDialog(this, "No change was made");
        }
        
        defaultSettings(true);
        
    }//GEN-LAST:event_saveBtnActionPerformed

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed
        
        String professorSelected = professorComboBox.getSelectedItem().toString();
        
        if (professorSelected.length() > 0) {
            
            for (com.mycompany.sistema_de_administracion.professor p : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.professorsList) {
                
                String professorName = p.getName() + " " + p.lastName;
                
                if (professorSelected.equals(professorName)) {
                    nameField.setText(p.getName());
                    lastNameField.setText(p.lastName);
                    userField.setText(p.user);
                    passwordField.setText(p.password);
                    
                    globalProfessorSelected = p;
                }
            }
            
            defaultSettings(true);
        } 
    }//GEN-LAST:event_selectBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        nameField.setEditable(true);
        lastNameField.setEditable(true);
        userField.setEditable(true);
        passwordField.setEnabled(true);
        saveBtn.setEnabled(true);
        editBtn.setEnabled(false);
    }//GEN-LAST:event_editBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel basement;
    javax.swing.JButton editBtn;
    javax.swing.JTextField lastNameField;
    java.awt.Label lastNameLabel;
    javax.swing.JTextField nameField;
    java.awt.Label nameLabel;
    javax.swing.JTextField passwordField;
    java.awt.Label passwordLabel;
    javax.swing.JComboBox<String> professorComboBox;
    javax.swing.JButton saveBtn;
    javax.swing.JButton selectBtn;
    javax.swing.JLabel title1;
    javax.swing.JTextField userField;
    java.awt.Label userLabel;
    // End of variables declaration//GEN-END:variables

    public void setComboBoxUp() {
        for (com.mycompany.sistema_de_administracion.professor p : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.professorsList) {
            professorComboBox.addItem(p.getName() + " " + p.lastName);
        }
    }
    
    public void defaultSettings(boolean myValue) {
        nameField.setEditable(false);
        lastNameField.setEditable(false);
        userField.setEditable(false);
        passwordField.setEnabled(false);
        saveBtn.setEnabled(false);
        editBtn.setEnabled(myValue);
    }

    private boolean changeVerification(String name, String inputField) {
        boolean response = !name.equals(inputField);
        return response;
    }

}