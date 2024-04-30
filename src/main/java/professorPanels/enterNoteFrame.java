package professorPanels;

import javax.swing.JOptionPane;

public class enterNoteFrame extends javax.swing.JFrame {

    int globalIndex = 0;
    com.mycompany.sistema_de_administracion.student globalStudentInfo = null;
    
    public enterNoteFrame(com.mycompany.sistema_de_administracion.student studentInfo, com.mycompany.sistema_de_administracion.Class classInfo, int index) {
        initComponents();
        
        noteTitle.setText("Enter note for: " + classInfo.courseName);
        studentNameLabel.setText("Student name: " + studentInfo.getStudentName() + " " + studentInfo.getStudentLastName());
        
        globalIndex = index;
        globalStudentInfo = studentInfo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        noteTitle = new javax.swing.JLabel();
        assignBtn = new javax.swing.JButton();
        gradeField = new javax.swing.JTextField();
        studentNameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basement.setForeground(new java.awt.Color(255, 255, 255));
        basement.setPreferredSize(new java.awt.Dimension(1500, 540));
        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        noteTitle.setFont(new java.awt.Font("Assistant ExtraBold", 0, 36)); // NOI18N
        noteTitle.setForeground(new java.awt.Color(255, 255, 255));
        basement.add(noteTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 580, 60));

        assignBtn.setBackground(new java.awt.Color(3, 27, 59));
        assignBtn.setForeground(new java.awt.Color(255, 255, 255));
        assignBtn.setText("Enter note");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });
        basement.add(assignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 260, 50));

        gradeField.setBackground(new java.awt.Color(71, 108, 166));
        gradeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        basement.add(gradeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 260, 50));

        studentNameLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        studentNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        basement.add(studentNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 270, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/background-login.jpg")); // NOI18N
        basement.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        basement.setOpaque(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        String regex = "^(100|[1-9][0-9]?|0)$";
        
        if (gradeField.getText().matches(regex)) {
            
            int inputGradeField = Integer.parseInt(gradeField.getText());
            globalStudentInfo.coursesFinalNote.set(globalIndex, inputGradeField);

            this.dispose();
            
            JOptionPane.showMessageDialog(this, "Note was entered succesfully");
        } else {
            JOptionPane.showMessageDialog(this, "Make sure that the note is a number from 0 to 100");
        }
    }//GEN-LAST:event_assignBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton assignBtn;
    javax.swing.JPanel basement;
    javax.swing.JTextField gradeField;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel noteTitle;
    javax.swing.JLabel studentNameLabel;
    // End of variables declaration//GEN-END:variables
}
