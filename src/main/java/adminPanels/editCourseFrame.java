package adminPanels;

import javax.swing.JOptionPane;

public class editCourseFrame extends javax.swing.JFrame {
    
    com.mycompany.sistema_de_administracion.Class parameterCourseInfo = null;
    
    public editCourseFrame(com.mycompany.sistema_de_administracion.Class info) {
        
        initComponents();
        
        defaultSettings(true, info);
        
        parameterCourseInfo = info;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        courseLabel = new java.awt.Label();
        professorLabel = new java.awt.Label();
        sectionLabel = new java.awt.Label();
        startDateLabel = new java.awt.Label();
        finishDateLabel = new java.awt.Label();
        startHourLabel = new java.awt.Label();
        finishHourLabel = new java.awt.Label();
        CourseIDLabel = new java.awt.Label();
        courseNameField = new javax.swing.JTextField();
        sectionField = new javax.swing.JTextField();
        startDateField = new javax.swing.JTextField();
        finishDateField = new javax.swing.JTextField();
        startHourField = new javax.swing.JTextField();
        finishHourField = new javax.swing.JTextField();
        courseIDField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        startHourCombo = new javax.swing.JComboBox<>();
        finishHourCombo = new javax.swing.JComboBox<>();
        exitBtn = new javax.swing.JButton();
        professorComboList = new javax.swing.JComboBox<>();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basement.setForeground(new java.awt.Color(255, 255, 255));
        basement.setPreferredSize(new java.awt.Dimension(1500, 540));
        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title1.setFont(new java.awt.Font("Assistant ExtraBold", 0, 36)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setText("Edit ");
        basement.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, 90));

        courseLabel.setAlignment(java.awt.Label.CENTER);
        courseLabel.setBackground(new java.awt.Color(3, 27, 59));
        courseLabel.setForeground(new java.awt.Color(255, 255, 255));
        courseLabel.setText("Course");
        basement.add(courseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 90, 40));

        professorLabel.setAlignment(java.awt.Label.CENTER);
        professorLabel.setBackground(new java.awt.Color(3, 27, 59));
        professorLabel.setForeground(new java.awt.Color(255, 255, 255));
        professorLabel.setText("professor");
        basement.add(professorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 90, 40));

        sectionLabel.setAlignment(java.awt.Label.CENTER);
        sectionLabel.setBackground(new java.awt.Color(3, 27, 59));
        sectionLabel.setForeground(new java.awt.Color(255, 255, 255));
        sectionLabel.setText("Section");
        basement.add(sectionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 90, 40));

        startDateLabel.setAlignment(java.awt.Label.CENTER);
        startDateLabel.setBackground(new java.awt.Color(3, 27, 59));
        startDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        startDateLabel.setText("start date");
        basement.add(startDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 90, 40));

        finishDateLabel.setAlignment(java.awt.Label.CENTER);
        finishDateLabel.setBackground(new java.awt.Color(3, 27, 59));
        finishDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        finishDateLabel.setText("finish date");
        basement.add(finishDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 90, 40));

        startHourLabel.setAlignment(java.awt.Label.CENTER);
        startHourLabel.setBackground(new java.awt.Color(3, 27, 59));
        startHourLabel.setForeground(new java.awt.Color(255, 255, 255));
        startHourLabel.setText("start hour");
        basement.add(startHourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 90, 40));

        finishHourLabel.setAlignment(java.awt.Label.CENTER);
        finishHourLabel.setBackground(new java.awt.Color(3, 27, 59));
        finishHourLabel.setForeground(new java.awt.Color(255, 255, 255));
        finishHourLabel.setText("finish hour");
        basement.add(finishHourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 90, 40));

        CourseIDLabel.setAlignment(java.awt.Label.CENTER);
        CourseIDLabel.setBackground(new java.awt.Color(3, 27, 59));
        CourseIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        CourseIDLabel.setText("Course ID");
        basement.add(CourseIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 90, 40));

        courseNameField.setBackground(new java.awt.Color(71, 108, 166));
        courseNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(courseNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 240, 40));

        sectionField.setBackground(new java.awt.Color(71, 108, 166));
        sectionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(sectionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 240, 40));

        startDateField.setBackground(new java.awt.Color(71, 108, 166));
        startDateField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(startDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 240, 40));

        finishDateField.setBackground(new java.awt.Color(71, 108, 166));
        finishDateField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(finishDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 240, 40));

        startHourField.setBackground(new java.awt.Color(71, 108, 166));
        startHourField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(startHourField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 240, 40));

        finishHourField.setBackground(new java.awt.Color(71, 108, 166));
        finishHourField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(finishHourField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 240, 40));

        courseIDField.setBackground(new java.awt.Color(71, 108, 166));
        courseIDField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(courseIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 240, 40));

        saveBtn.setBackground(new java.awt.Color(3, 27, 59));
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        basement.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 270, 140, 50));

        editBtn.setBackground(new java.awt.Color(3, 27, 59));
        editBtn.setForeground(new java.awt.Color(255, 255, 255));
        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        basement.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 150, 50));

        startHourCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"AM", "PM"}));
        startHourCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startHourComboActionPerformed(evt);
            }
        });
        basement.add(startHourCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 70, 40));

        finishHourCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"AM", "PM"}));
        basement.add(finishHourCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 70, 40));

        exitBtn.setBackground(new java.awt.Color(3, 27, 59));
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("Salir");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        basement.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 460, 140, 50));

        professorComboList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professorComboListActionPerformed(evt);
            }
        });
        basement.add(professorComboList, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 240, 40));

        backgroundImage.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/background-login.jpg")); // NOI18N
        basement.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(basement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE))
        );

        basement.setOpaque(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void startHourComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startHourComboActionPerformed
        
    }//GEN-LAST:event_startHourComboActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed

        courseNameField.setEnabled(true);
        professorComboList.setEnabled(true);
        sectionField.setEnabled(true);
        startDateField.setEnabled(true);
        finishDateField.setEnabled(true);
        startHourField.setEnabled(true);
        finishHourField.setEnabled(true);
        courseIDField.setEnabled(true);
        startHourCombo.setEnabled(true);
        finishHourCombo.setEnabled(true);

        saveBtn.setEnabled(true);
        editBtn.setEnabled(false);
    }//GEN-LAST:event_editBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        
        String inputNameCourse = courseNameField.getText();
        String inputProfessorAssigned = professorComboList.getSelectedItem().toString();
        String inputsectionField = sectionField.getText();
        String inputStartDateField = startDateField.getText();
        String inputFinishDateField = finishDateField.getText();
        String inputStartHourField = startHourField.getText();
        String inputFinishHourField = finishHourField.getText();
        String inputCourseIDField = courseIDField.getText();
        String inputStartHourCombo = startHourCombo.getSelectedItem().toString();
        String inputFinishHourCombo = finishHourCombo.getSelectedItem().toString();
        
        
        boolean nameChange = changeVerification(parameterCourseInfo.courseName, inputNameCourse);
        boolean professorChange = changeVerification(parameterCourseInfo.professorAssigned, inputProfessorAssigned);
        boolean sectionChange = changeVerification(parameterCourseInfo.section, inputsectionField);
        boolean startDateChange = changeVerification(parameterCourseInfo.startDate, inputStartDateField);
        boolean finishDateChange = changeVerification(parameterCourseInfo.finishDate, inputFinishDateField);
        boolean startHourChange = changeVerification(String.valueOf(parameterCourseInfo.startHour), inputStartHourField);
        boolean finishHourChange = changeVerification(String.valueOf(parameterCourseInfo.finishHour), inputFinishHourField);
        boolean courseIDChange = changeVerification(parameterCourseInfo.ID, inputCourseIDField);
        boolean startHourComboChange = changeVerification(parameterCourseInfo.startHourAmOrPm, inputStartHourCombo);
        boolean finishHourComboChange = changeVerification(parameterCourseInfo.finishHourAmOrPm, inputFinishHourCombo);
        
        if (nameChange) {
            parameterCourseInfo.courseName = inputNameCourse;
            JOptionPane.showMessageDialog(this, "Course name has been change");
        }
        if (professorChange) {
            parameterCourseInfo.professorAssigned = inputProfessorAssigned;
            JOptionPane.showMessageDialog(this, "Professor assigned has been change");
        }
        if (sectionChange) {
            parameterCourseInfo.section = inputsectionField;
            JOptionPane.showMessageDialog(this, "Professor assigned has been change");
        }
        if (startDateChange) {
            parameterCourseInfo.startDate = inputStartDateField;
            JOptionPane.showMessageDialog(this, "Start date has been change");
        }
        if (finishDateChange) {
            parameterCourseInfo.finishDate = inputFinishDateField;
            JOptionPane.showMessageDialog(this, "Finish date has been change");
        }
        if (startHourChange || startHourComboChange) {
            parameterCourseInfo.startHour = Integer.parseInt(inputStartHourField);
            JOptionPane.showMessageDialog(this, "Start hour has been change");
        }
        if (finishHourChange || finishHourComboChange) {
            parameterCourseInfo.finishHour = Integer.parseInt(inputFinishHourField);
            JOptionPane.showMessageDialog(this, "Finish hour has been change");
        }
        if (courseIDChange) {
            parameterCourseInfo.ID = inputCourseIDField;
            JOptionPane.showMessageDialog(this, "Course ID has been change");
        } 
        
        if (!nameChange && !professorChange && !sectionChange && !startDateChange && !finishDateChange && !startHourChange && !finishHourChange && !courseIDChange && !startHourComboChange && !finishHourComboChange) {
            JOptionPane.showMessageDialog(this, "No change has been made");
        }
        
        onceSave();
        
    }//GEN-LAST:event_saveBtnActionPerformed
    
    private boolean changeVerification(String name, String inputField) {
        boolean response = !name.equals(inputField);
        return response;
    }
    
    private void professorComboListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professorComboListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_professorComboListActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    java.awt.Label CourseIDLabel;
    javax.swing.JLabel backgroundImage;
    javax.swing.JPanel basement;
    javax.swing.JTextField courseIDField;
    java.awt.Label courseLabel;
    javax.swing.JTextField courseNameField;
    javax.swing.JButton editBtn;
    javax.swing.JButton exitBtn;
    javax.swing.JTextField finishDateField;
    java.awt.Label finishDateLabel;
    javax.swing.JComboBox<String> finishHourCombo;
    javax.swing.JTextField finishHourField;
    java.awt.Label finishHourLabel;
    javax.swing.JComboBox<String> professorComboList;
    java.awt.Label professorLabel;
    javax.swing.JButton saveBtn;
    javax.swing.JTextField sectionField;
    java.awt.Label sectionLabel;
    javax.swing.JTextField startDateField;
    java.awt.Label startDateLabel;
    javax.swing.JComboBox<String> startHourCombo;
    javax.swing.JTextField startHourField;
    java.awt.Label startHourLabel;
    javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables

    
    public void onceSave() {
        courseNameField.setEnabled(false);
        professorComboList.setEnabled(false);
        sectionField.setEnabled(false);
        startDateField.setEnabled(false);
        finishDateField.setEnabled(false);
        startHourField.setEnabled(false);
        finishHourField.setEnabled(false);
        courseIDField.setEnabled(false);
        startHourCombo.setEnabled(false);
        finishHourCombo.setEnabled(false);
        
        saveBtn.setEnabled(false);
        editBtn.setEnabled(true);
    }
    
    public void defaultSettings(boolean myValue, com.mycompany.sistema_de_administracion.Class info) {
        
        courseNameField.setEnabled(false);
        professorComboList.setEnabled(false);
        sectionField.setEnabled(false);
        startDateField.setEnabled(false);
        finishDateField.setEnabled(false);
        startHourField.setEnabled(false);
        finishHourField.setEnabled(false);
        courseIDField.setEnabled(false);
        startHourCombo.setEnabled(false);
        finishHourCombo.setEnabled(false);
        
        saveBtn.setEnabled(false);
        editBtn.setEnabled(myValue);
        
        courseNameField.setText(info.courseName);
        setComboBoxUp(info);
        sectionField.setText(info.section);
        startDateField.setText(info.startDate);
        finishDateField.setText(info.finishDate);
        startHourField.setText(String.valueOf(info.startHour));
        finishHourField.setText(String.valueOf(info.finishHour));
        courseIDField.setText(info.ID);
    }
    
    public void setComboBoxUp(com.mycompany.sistema_de_administracion.Class info) {
        
        for (com.mycompany.sistema_de_administracion.professor p : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.professorsList) {
            professorComboList.addItem(p.getName() + " " + p.lastName);
        }
        
        setComboName(info);
    }
    
    private void setComboName(com.mycompany.sistema_de_administracion.Class info) {
        
        String professorAssigned = info.professorAssigned;
        String startAMorPMInfo = info.startHourAmOrPm;
        String finishAMorPMInfo = info.finishHourAmOrPm;
        
        for (int i = 0; i < professorComboList.getItemCount(); i++) {
            String professorListCombo = professorComboList.getItemAt(i);
            
            if (professorAssigned.equals(professorListCombo)) {
                professorComboList.setSelectedIndex(i);
            }
            
        }
        
        for (int e = 0; e < startHourCombo.getItemCount(); e++) {
            String startAMorPMCombo = startHourCombo.getItemAt(e);
            
            if (startAMorPMInfo.equals(startAMorPMCombo)) {
                startHourCombo.setSelectedIndex(e);
            }
        }
        
        for (int a = 0; a < finishHourCombo.getItemCount(); a++) {
            String finishAMorPMCombo = finishHourCombo.getItemAt(a);
            
            if (finishAMorPMInfo.equals(finishAMorPMCombo)) {
                finishHourCombo.setSelectedIndex(a);
            }
        }
        
    }
    
}
