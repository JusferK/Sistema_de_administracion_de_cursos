package com.mycompany.sistema_de_administracion;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class studentScreen extends javax.swing.JFrame {
    
    com.mycompany.sistema_de_administracion.student globalStudentInfo = null;

    public studentScreen(String name, com.mycompany.sistema_de_administracion.student info) {

        initComponents();

        studentPanels.welcomeScreenStudent welcomeScreen = new studentPanels.welcomeScreenStudent(name);
        showEditablePanel(welcomeScreen, 1200, 560, 100, 0);
        
        globalStudentInfo = info;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        myProfile = new javax.swing.JButton();
        coursesAssgQuery = new javax.swing.JButton();
        assgCourses = new javax.swing.JButton();
        unassgCourse = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));

        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        content.setMaximumSize(new java.awt.Dimension(1400, 510));
        content.setMinimumSize(new java.awt.Dimension(1400, 510));

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

        basement.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1410, 560));
        content.setOpaque(false);

        myProfile.setText("My profile");
        myProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myProfileActionPerformed(evt);
            }
        });
        basement.add(myProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 670, -1, -1));

        coursesAssgQuery.setText("Courses assigned query");
        coursesAssgQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesAssgQueryActionPerformed(evt);
            }
        });
        basement.add(coursesAssgQuery, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 220, -1));

        assgCourses.setText("Assign to courses");
        assgCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assgCoursesActionPerformed(evt);
            }
        });
        basement.add(assgCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 160, -1));

        unassgCourse.setText("Unassign course");
        unassgCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unassgCourseActionPerformed(evt);
            }
        });
        basement.add(unassgCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 20, -1, -1));

        logoutBtn.setText("log out");
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });
        basement.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 670, -1, -1));

        background.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/background-login.jpg")); // NOI18N
        basement.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 720));

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

        basement.setOpaque(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        student.logout(this);
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void unassgCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unassgCourseActionPerformed
        studentPanels.unassignCoursesPanel newContainer = new studentPanels.unassignCoursesPanel(globalStudentInfo);
        showEditablePanel(newContainer, 1200, 560, 100, 0);
    }//GEN-LAST:event_unassgCourseActionPerformed

    private void coursesAssgQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesAssgQueryActionPerformed
        studentPanels.coursesAssignedStudentPanel newContainer = new studentPanels.coursesAssignedStudentPanel(globalStudentInfo);
        showEditablePanel(newContainer, 1200, 560, 100, 0);
    }//GEN-LAST:event_coursesAssgQueryActionPerformed

    private void assgCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assgCoursesActionPerformed
        studentPanels.assignToCoursePanel newContainer = new studentPanels.assignToCoursePanel(globalStudentInfo);
        showEditablePanel(newContainer, 1200, 560, 200, 0);
    }//GEN-LAST:event_assgCoursesActionPerformed

    private void myProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myProfileActionPerformed
        studentPanels.studentProfileFrame newFrame = new studentPanels.studentProfileFrame(globalStudentInfo);
        newFrame.setVisible(true);
        newFrame.setResizable(false);
    }//GEN-LAST:event_myProfileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton assgCourses;
    javax.swing.JLabel background;
    javax.swing.JPanel basement;
    javax.swing.JPanel content;
    javax.swing.JButton coursesAssgQuery;
    javax.swing.JButton logoutBtn;
    javax.swing.JButton myProfile;
    javax.swing.JButton unassgCourse;
    // End of variables declaration//GEN-END:variables

    public void showPanel(JPanel panel) {
        panel.setSize(1200, 560);
        panel.setLocation(10, 0);
        panel.setOpaque(false);
        
        content.removeAll();
        content.add(panel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    public void showEditablePanel(JPanel panel, int width, int height, int x, int y) {
        panel.setSize(width, height);
        panel.setLocation(x, y);
        panel.setOpaque(false);
        
        content.removeAll();
        content.add(panel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

}
