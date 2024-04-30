package studentPanels;

import javax.swing.JOptionPane;

public class gradesQueryFrame extends javax.swing.JFrame {

    com.mycompany.sistema_de_administracion.student publicStudentInfo = null;
    
    public gradesQueryFrame(com.mycompany.sistema_de_administracion.student info) {
        
        initComponents();
        
        setComboBoxUp(info);
        publicStudentInfo = info;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        queryBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        coursesComboBox = new javax.swing.JComboBox<>();
        gradeLabel = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        queryBtn.setBackground(new java.awt.Color(3, 27, 59));
        queryBtn.setFont(new java.awt.Font("Assistant", 0, 11)); // NOI18N
        queryBtn.setForeground(new java.awt.Color(255, 255, 255));
        queryBtn.setText("Query");
        queryBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        queryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                queryBtnMouseClicked(evt);
            }
        });
        queryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryBtnActionPerformed(evt);
            }
        });
        basement.add(queryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 130, 40));

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
        basement.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 100, 50));

        coursesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Select"}));
        basement.add(coursesComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 320, 50));

        gradeLabel.setBackground(new java.awt.Color(71, 108, 166));
        gradeLabel.setFont(new java.awt.Font("Assistant", 0, 11)); // NOI18N
        gradeLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gradeLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gradeLabelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gradeLabelFocusLost(evt);
            }
        });
        gradeLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeLabelActionPerformed(evt);
            }
        });
        basement.add(gradeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 250, 50));

        title.setFont(new java.awt.Font("Assistant ExtraBold", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Grades query");
        basement.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 220, 40));

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

    private void queryBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_queryBtnMouseClicked
        
    }//GEN-LAST:event_queryBtnMouseClicked

    private void queryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryBtnActionPerformed
        String selectedCourse = String.valueOf(coursesComboBox.getSelectedItem());
        
        if (selectedCourse.equalsIgnoreCase("Select")) {
            JOptionPane.showMessageDialog(this, "Select a course to query your grades");
        } else {
            for (int i = 0; i < publicStudentInfo.coursesAssigned.size(); i++) {
                
                com.mycompany.sistema_de_administracion.Class iterationItem = publicStudentInfo.coursesAssigned.get(i);

                boolean getCourse = selectedCourse.contains(iterationItem.courseName);
                boolean getCourseID= selectedCourse.contains(iterationItem.ID);

                if (getCourse && getCourseID) {
                    
                    if (publicStudentInfo.coursesFinalNote.get(i) == -1) {
                        gradeLabel.setText("No grade has been entered yet");
                    } else {
                        gradeLabel.setText(String.valueOf(publicStudentInfo.coursesFinalNote.get(i)));
                    }
                }
            }
        }
    }//GEN-LAST:event_queryBtnActionPerformed

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBtnMouseClicked

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void gradeLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gradeLabelFocusGained

    }//GEN-LAST:event_gradeLabelFocusGained

    private void gradeLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gradeLabelFocusLost

    }//GEN-LAST:event_gradeLabelFocusLost

    private void gradeLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeLabelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel backgroundLabel;
    javax.swing.JPanel basement;
    javax.swing.JComboBox<String> coursesComboBox;
    javax.swing.JButton exitBtn;
    javax.swing.JTextField gradeLabel;
    javax.swing.JButton queryBtn;
    javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    public void setComboBoxUp(com.mycompany.sistema_de_administracion.student info) {
        gradeLabel.setEnabled(false);
        
        for (com.mycompany.sistema_de_administracion.Class cL : info.coursesAssigned) {
            coursesComboBox.addItem(cL.courseName + " " + cL.ID);
        }
    }

}
