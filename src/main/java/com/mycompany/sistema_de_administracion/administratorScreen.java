package com.mycompany.sistema_de_administracion;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class administratorScreen extends javax.swing.JFrame {
    
    public administratorScreen() {
        initComponents();
        adminPanels.welcomeAdmin welcomeScreen = new adminPanels.welcomeAdmin();
        showPanel(welcomeScreen);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        createProf = new javax.swing.JButton();
        profQuery = new javax.swing.JButton();
        editProfInfo = new javax.swing.JButton();
        createStud = new javax.swing.JButton();
        studQuery = new javax.swing.JButton();
        editStudInfo = new javax.swing.JButton();
        createCourse = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        courseQuery = new javax.swing.JButton();
        assignCourse = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        myProfile = new javax.swing.JButton();
        massLoadProf = new javax.swing.JButton();
        massLoadStud = new javax.swing.JButton();
        massLoadStud1 = new javax.swing.JButton();
        editCourse = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        basement.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1740, 560));
        content.setOpaque(false);

        createProf.setText("Create prof.");
        createProf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createProfMouseClicked(evt);
            }
        });
        createProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createProfActionPerformed(evt);
            }
        });
        basement.add(createProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 50));

        profQuery.setText("Prof. query");
        profQuery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profQueryMouseClicked(evt);
            }
        });
        profQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profQueryActionPerformed(evt);
            }
        });
        basement.add(profQuery, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 110, 50));

        editProfInfo.setText("Edit prof info");
        basement.add(editProfInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 120, 50));

        createStud.setText("Create stud.");
        createStud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createStudActionPerformed(evt);
            }
        });
        basement.add(createStud, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 120, 50));

        studQuery.setText("Stud. query");
        studQuery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studQueryMouseClicked(evt);
            }
        });
        studQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studQueryActionPerformed(evt);
            }
        });
        basement.add(studQuery, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 110, 50));

        editStudInfo.setText("Edit stud. info");
        basement.add(editStudInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 130, 50));

        createCourse.setText("Create cour.");
        createCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCourseActionPerformed(evt);
            }
        });
        basement.add(createCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 110, 50));

        jButton1.setText("Courses asg. Q");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        basement.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, 130, 50));

        courseQuery.setText("Cour. query");
        courseQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseQueryActionPerformed(evt);
            }
        });
        basement.add(courseQuery, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 120, 50));

        assignCourse.setText("Assign cour.");
        assignCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignCourseActionPerformed(evt);
            }
        });
        basement.add(assignCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 120, 50));

        logout.setText("Log out");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        basement.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 630, 95, -1));

        myProfile.setText("My profile");
        basement.add(myProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 630, -1, -1));

        massLoadProf.setText("Massive prof load");
        massLoadProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                massLoadProfActionPerformed(evt);
            }
        });
        basement.add(massLoadProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 0, -1, 50));

        massLoadStud.setText("Massive stud load ");
        massLoadStud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                massLoadStudActionPerformed(evt);
            }
        });
        basement.add(massLoadStud, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 0, 150, 50));

        massLoadStud1.setText("Massive courses load");
        massLoadStud1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                massLoadStud1ActionPerformed(evt);
            }
        });
        basement.add(massLoadStud1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1580, 0, 160, 50));

        editCourse.setText("Edit cour.");
        basement.add(editCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 110, 50));

        backgroundImage.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/background-login.jpg")); // NOI18N
        basement.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1740, 690));

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

    private void assignCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignCourseActionPerformed
        adminPanels.assignCourseToStudentP newContainer = new adminPanels.assignCourseToStudentP();
        editableShowPanel(newContainer, 150, 0, 1350, 520);
    }//GEN-LAST:event_assignCourseActionPerformed

    private void massLoadProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_massLoadProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_massLoadProfActionPerformed

    private void massLoadStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_massLoadStudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_massLoadStudActionPerformed

    private void massLoadStud1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_massLoadStud1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_massLoadStud1ActionPerformed

    private void createProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createProfActionPerformed
        
    }//GEN-LAST:event_createProfActionPerformed

    private void createProfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createProfMouseClicked
        adminPanels.createProfP newContainer = new adminPanels.createProfP();
        editableShowPanel(newContainer, 300, 0, 1050, 520);
    }//GEN-LAST:event_createProfMouseClicked

    private void profQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profQueryActionPerformed
        
    }//GEN-LAST:event_profQueryActionPerformed

    private void profQueryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profQueryMouseClicked
        adminPanels.professorQuery newContainer = new adminPanels.professorQuery();
        editableShowPanel(newContainer, 300, 0, 1050, 520);
    }//GEN-LAST:event_profQueryMouseClicked

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        administrator.logout(this);
    }//GEN-LAST:event_logoutMouseClicked

    private void createStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createStudActionPerformed
        adminPanels.createStudentP newContainer = new adminPanels.createStudentP();
        editableShowPanel(newContainer, 300, 0, 1050, 520);
    }//GEN-LAST:event_createStudActionPerformed

    private void studQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studQueryActionPerformed
        
    }//GEN-LAST:event_studQueryActionPerformed

    private void createCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCourseActionPerformed
        adminPanels.createCoursePanel newContainer = new adminPanels.createCoursePanel();
        showPanel(newContainer);
    }//GEN-LAST:event_createCourseActionPerformed

    private void studQueryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studQueryMouseClicked
        adminPanels.studentQuery newContainer = new adminPanels.studentQuery();
        editableShowPanel(newContainer, 300, 0, 1050, 520);
    }//GEN-LAST:event_studQueryMouseClicked

    private void courseQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseQueryActionPerformed
        adminPanels.courseQueryPanel newContainer = new adminPanels.courseQueryPanel();
        showPanel(newContainer);
    }//GEN-LAST:event_courseQueryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        adminPanels.coursesAssignedQuery newContainer = new adminPanels.coursesAssignedQuery();
        editableShowPanel(newContainer, 300, 0, 1050, 520);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton assignCourse;
    javax.swing.JLabel backgroundImage;
    javax.swing.JPanel basement;
    javax.swing.JPanel content;
    javax.swing.JButton courseQuery;
    javax.swing.JButton createCourse;
    javax.swing.JButton createProf;
    javax.swing.JButton createStud;
    javax.swing.JButton editCourse;
    javax.swing.JButton editProfInfo;
    javax.swing.JButton editStudInfo;
    javax.swing.JButton jButton1;
    javax.swing.JButton logout;
    javax.swing.JButton massLoadProf;
    javax.swing.JButton massLoadStud;
    javax.swing.JButton massLoadStud1;
    javax.swing.JButton myProfile;
    javax.swing.JButton profQuery;
    javax.swing.JButton studQuery;
    // End of variables declaration//GEN-END:variables

    public void showPanel(JPanel panel) {
        panel.setSize(1050, 520);
        panel.setLocation(400, 0);
        panel.setOpaque(false);
        
        content.removeAll();
        content.add(panel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    public void editableShowPanel(JPanel panel, int x, int y, int width, int height) {
        panel.setSize(width, height);
        panel.setLocation(x, y);
        panel.setOpaque(false);
        
        content.removeAll();
        content.add(panel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
}