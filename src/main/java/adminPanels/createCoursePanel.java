package adminPanels;
import java.io.Serializable;
import java.util.Calendar;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class createCoursePanel extends javax.swing.JPanel implements Serializable {
    
    public static ArrayList<String> threeCharList = new ArrayList<>();
    public static int counter = 0;
    public static int counter2 = 0;
    
    public createCoursePanel() {
        initComponents();
        
        for(com.mycompany.sistema_de_administracion.professor p : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.professorsList){
            professorComboList.addItem(p.getName() + " " + p.lastName);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        courseName = new java.awt.Label();
        lastNameLabel = new java.awt.Label();
        userLabel = new java.awt.Label();
        passwordLabel = new java.awt.Label();
        courseNameField = new javax.swing.JTextField();
        sectionField = new javax.swing.JTextField();
        startDateField = new javax.swing.JTextField();
        finishDateField = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();
        instructions = new javax.swing.JLabel();
        courseName1 = new java.awt.Label();
        startHourField = new javax.swing.JTextField();
        courseName2 = new java.awt.Label();
        idField = new javax.swing.JTextField();
        professorComboList = new javax.swing.JComboBox<>();
        courseName3 = new java.awt.Label();
        finishHourField = new javax.swing.JTextField();
        startHourCombo = new javax.swing.JComboBox<>();
        finishHourCombo = new javax.swing.JComboBox<>();
        saveBtn = new javax.swing.JButton();
        passwordLabel1 = new java.awt.Label();
        universityCenterField = new javax.swing.JTextField();

        basement.setForeground(new java.awt.Color(255, 255, 255));
        basement.setPreferredSize(new java.awt.Dimension(1500, 540));
        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Assistant ExtraBold", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Add a new course");
        basement.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, 50));

        courseName.setAlignment(java.awt.Label.CENTER);
        courseName.setBackground(new java.awt.Color(3, 27, 59));
        courseName.setForeground(new java.awt.Color(255, 255, 255));
        courseName.setText("course ID");
        basement.add(courseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 150, 40));

        lastNameLabel.setAlignment(java.awt.Label.CENTER);
        lastNameLabel.setBackground(new java.awt.Color(3, 27, 59));
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Section");
        basement.add(lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 150, 40));

        userLabel.setAlignment(java.awt.Label.CENTER);
        userLabel.setBackground(new java.awt.Color(3, 27, 59));
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("Start date");
        basement.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 150, 40));

        passwordLabel.setAlignment(java.awt.Label.CENTER);
        passwordLabel.setBackground(new java.awt.Color(3, 27, 59));
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Finish date");
        basement.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 150, 40));

        courseNameField.setBackground(new java.awt.Color(71, 108, 166));
        courseNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(courseNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 240, 40));

        sectionField.setBackground(new java.awt.Color(71, 108, 166));
        sectionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sectionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionFieldActionPerformed(evt);
            }
        });
        basement.add(sectionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 240, 40));

        startDateField.setBackground(new java.awt.Color(71, 108, 166));
        startDateField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(startDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 240, 40));

        finishDateField.setBackground(new java.awt.Color(71, 108, 166));
        finishDateField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(finishDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 240, 40));

        clearBtn.setBackground(new java.awt.Color(3, 27, 59));
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("Clear");
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBtnMouseClicked(evt);
            }
        });
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        basement.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 190, 120, 40));

        instructions.setFont(new java.awt.Font("Assistant", 0, 14)); // NOI18N
        instructions.setForeground(new java.awt.Color(255, 255, 255));
        instructions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instructions.setText("<html>  Instructions: In order to create a new course, enter the name the course's name (only text), section in which the course will be assigned to, the start and finish date, the start and finish hours and select the professor that will be in charge of this course. The course ID will be generated once save button is clicked. You need to click the clear button to enable the save and all other fields<html>");
        instructions.setToolTipText("");
        instructions.setAlignmentX(0.5F);
        instructions.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        basement.add(instructions, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 860, 130));

        courseName1.setAlignment(java.awt.Label.CENTER);
        courseName1.setBackground(new java.awt.Color(3, 27, 59));
        courseName1.setForeground(new java.awt.Color(255, 255, 255));
        courseName1.setText("Start hour");
        basement.add(courseName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 150, 40));

        startHourField.setBackground(new java.awt.Color(71, 108, 166));
        startHourField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(startHourField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 240, 40));

        courseName2.setAlignment(java.awt.Label.CENTER);
        courseName2.setBackground(new java.awt.Color(3, 27, 59));
        courseName2.setForeground(new java.awt.Color(255, 255, 255));
        courseName2.setText("Finish hour");
        basement.add(courseName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 150, 40));

        idField.setBackground(new java.awt.Color(71, 108, 166));
        idField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 240, 40));
        idField.disable();

        professorComboList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professorComboListActionPerformed(evt);
            }
        });
        basement.add(professorComboList, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 390, 40));

        courseName3.setAlignment(java.awt.Label.CENTER);
        courseName3.setBackground(new java.awt.Color(3, 27, 59));
        courseName3.setForeground(new java.awt.Color(255, 255, 255));
        courseName3.setText("Name of the course");
        basement.add(courseName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 150, 40));

        finishHourField.setBackground(new java.awt.Color(71, 108, 166));
        finishHourField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(finishHourField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 240, 40));

        startHourCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM"}));
        startHourCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startHourComboActionPerformed(evt);
            }
        });
        basement.add(startHourCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 90, 70, 40));

        finishHourCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"AM", "PM"}));
        basement.add(finishHourCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, 70, 40));

        saveBtn.setBackground(new java.awt.Color(3, 27, 59));
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBtnMouseClicked(evt);
            }
        });
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        basement.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, 120, 40));

        passwordLabel1.setAlignment(java.awt.Label.CENTER);
        passwordLabel1.setBackground(new java.awt.Color(3, 27, 59));
        passwordLabel1.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel1.setText("Center");
        basement.add(passwordLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 150, 40));

        universityCenterField.setBackground(new java.awt.Color(71, 108, 166));
        universityCenterField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        universityCenterField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                universityCenterFieldActionPerformed(evt);
            }
        });
        basement.add(universityCenterField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 240, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        basement.setOpaque(false);
    }// </editor-fold>//GEN-END:initComponents

    private void sectionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionFieldActionPerformed

    }//GEN-LAST:event_sectionFieldActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        
    }//GEN-LAST:event_clearBtnActionPerformed

    private void professorComboListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professorComboListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_professorComboListActionPerformed

    private void startHourComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startHourComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startHourComboActionPerformed

    private void clearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseClicked
        courseNameField.setText("");
        idField.setText("");
        sectionField.setText("");
        startDateField.setText("");
        finishDateField.setText("");
        startHourField.setText("");
        finishHourField.setText("");
        
        courseNameField.setEnabled(true);
        sectionField.setEnabled(true);
        professorComboList.setEnabled(true);
        startHourField.setEnabled(true);
        finishHourField.setEnabled(true);
        startDateField.setEnabled(true);
        finishDateField.setEnabled(true);
        startHourCombo.setEnabled(true);
        finishHourCombo.setEnabled(true);
        saveBtn.setEnabled(true);
    }//GEN-LAST:event_clearBtnMouseClicked

    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_saveBtnMouseClicked

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String[] Regexes = {"^(?!\\s*$)[a-zA-Z\\s]+$", "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)\\d\\d$", "^[aeiouAEIOU]$", "^[0-9]{1,2}$"};
        
        String courseName = courseNameField.getText();
        String section = sectionField.getText();
        String professorSelected = professorComboList.getSelectedItem().toString();
        String startDate = startDateField.getText();
        String finishDate = finishDateField.getText();
        String universityCenter = universityCenterField.getText();
        
        int startHour = Integer.parseInt(startHourField.getText());
        int finishHour = Integer.parseInt(finishHourField.getText());
        
        String startHourComb = startHourCombo.getSelectedItem().toString();
        String finishHourComb = finishHourCombo.getSelectedItem().toString();
            
        if (courseName.matches(Regexes[0]) && section.matches(Regexes[0]) && startDate.matches(Regexes[1]) && finishDate.matches(Regexes[1]) && section.matches(Regexes[2]) && startHourField.getText().matches(Regexes[3]) && finishHourField.getText().matches(Regexes[3])) {
            
            String ID = generateID(courseName, threeCharList);
            
            com.mycompany.sistema_de_administracion.Class newCourse = new com.mycompany.sistema_de_administracion.Class(ID, courseName, section, professorSelected, startDate, finishDate, startHourComb, finishHourComb, startHour, finishHour, universityCenter);
            com.mycompany.sistema_de_administracion.Sistema_De_Administracion.classList.add(newCourse);
        
        
        
            courseNameField.setEnabled(false);
            sectionField.setEnabled(false);
            professorComboList.setEnabled(false);
            startHourField.setEnabled(false);
            finishHourField.setEnabled(false);
            startDateField.setEnabled(false);
            finishDateField.setEnabled(false);
            startHourCombo.setEnabled(false);
            finishHourCombo.setEnabled(false);
            saveBtn.setEnabled(false);
            idField.setText(ID);
            
            JOptionPane.showMessageDialog(this, "Course was created succesfully");
        }
        else {
            JOptionPane.showMessageDialog(this, "Make sure all fields contains information in the valid format or they are not empty");
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void universityCenterFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_universityCenterFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_universityCenterFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel basement;
    javax.swing.JButton clearBtn;
    java.awt.Label courseName;
    java.awt.Label courseName1;
    java.awt.Label courseName2;
    java.awt.Label courseName3;
    javax.swing.JTextField courseNameField;
    javax.swing.JTextField finishDateField;
    javax.swing.JComboBox<String> finishHourCombo;
    javax.swing.JTextField finishHourField;
    javax.swing.JTextField idField;
    javax.swing.JLabel instructions;
    java.awt.Label lastNameLabel;
    java.awt.Label passwordLabel;
    java.awt.Label passwordLabel1;
    javax.swing.JComboBox<String> professorComboList;
    javax.swing.JButton saveBtn;
    javax.swing.JTextField sectionField;
    javax.swing.JTextField startDateField;
    javax.swing.JComboBox<String> startHourCombo;
    javax.swing.JTextField startHourField;
    javax.swing.JLabel title;
    javax.swing.JTextField universityCenterField;
    java.awt.Label userLabel;
    // End of variables declaration//GEN-END:variables

    public String generateID(String initials, ArrayList<String> myArray) {
        
        
        Calendar date = Calendar.getInstance();
        String ID = null;
        boolean found = true;
        
        
        while(found) {
            
            String firstThree = initials.substring(0, 3).toUpperCase();
        
            int year = date.get(Calendar.YEAR) - 2000;
            
            boolean onTheListOrNot = increaseCounter2(firstThree, myArray);
            
            if (onTheListOrNot) {
                counter2++;
            }
            
            ID = firstThree + counter2 + year + counter;
            
            
            counter++;
            found = false;
        }
        
        return ID;
        
    }
    
    public boolean increaseCounter2(String firstThree, ArrayList<String> myArray) {
        
        boolean response = false;
        
        int listSize = myArray.size();
        
        if (listSize == 0) {
            myArray.add(firstThree);
        } else if(listSize != 0) {
            
            boolean holder = true;
            
            while(holder) {
                
                boolean response2 = false;
                
                for (int j = 0; j < myArray.size(); j++) {
                    
                    String item = threeCharList.get(j);
                    
                    if (firstThree.equalsIgnoreCase(item)) {
                        response2 = true;
                    } else if (!firstThree.equalsIgnoreCase(item)) {
                        response2 = false;
                    }
                }
                
                if (!response2) {
                    myArray.add(firstThree);
                    break;
                } else if (response2) {
                    response = true;
                    break;
                }
                
            }
        }
 
        
        return response;
            
    }

}