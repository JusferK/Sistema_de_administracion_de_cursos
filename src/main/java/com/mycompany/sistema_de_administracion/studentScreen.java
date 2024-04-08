package com.mycompany.sistema_de_administracion;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class studentScreen extends javax.swing.JFrame {

    public studentScreen(String name) {

        initComponents();

        studentPanels.welcomeScreenStudent welcomeScreen = new studentPanels.welcomeScreenStudent(name);
        showPanel(welcomeScreen);
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

        basement.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1200, 520));
        content.setOpaque(false);

        myProfile.setText("My profile");
        basement.add(myProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 600, -1, -1));

        coursesAssgQuery.setText("Courses assigned query");
        basement.add(coursesAssgQuery, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 180, -1));

        assgCourses.setText("Assign courses");
        basement.add(assgCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        unassgCourse.setText("Unassign course");
        unassgCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unassgCourseActionPerformed(evt);
            }
        });
        basement.add(unassgCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, -1, -1));

        logoutBtn.setText("log out");
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });
        basement.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 600, -1, -1));

        background.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/background-login.jpg")); // NOI18N
        basement.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, 1202, Short.MAX_VALUE)
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
        // TODO add your handling code here:
    }//GEN-LAST:event_unassgCourseActionPerformed


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
        panel.setSize(900, 320);
        panel.setLocation(100, 0);
        panel.setOpaque(false);

        content.removeAll();
        content.add(panel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

}
