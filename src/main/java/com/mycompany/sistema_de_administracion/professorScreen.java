package com.mycompany.sistema_de_administracion;
import java.awt.BorderLayout;
import javax.swing.JPanel;


public class professorScreen extends javax.swing.JFrame {

    String userParameters = null;
    
    public professorScreen(String name, String user) {
        initComponents();
        
        professorPanels.welcomeScreenProfessor welcomeScreen = new professorPanels.welcomeScreenProfessor(name);
        showPanel(welcomeScreen);
        
        userParameters = user;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        myProfile = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        coursesAssQuery = new javax.swing.JButton();
        finalScore = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));

        basement.setMaximumSize(new java.awt.Dimension(1400, 700));
        basement.setMinimumSize(new java.awt.Dimension(1400, 700));
        basement.setPreferredSize(new java.awt.Dimension(1400, 700));
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

        basement.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1400, 560));
        content.setOpaque(false);

        myProfile.setText("My profile");
        basement.add(myProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 650, -1, -1));

        logoutBtn.setText("log out");
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        basement.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 650, -1, -1));

        coursesAssQuery.setText("Courses and students assigned query");
        coursesAssQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesAssQueryActionPerformed(evt);
            }
        });
        basement.add(coursesAssQuery, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 360, 30));

        finalScore.setText("Enter final score");
        basement.add(finalScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 20, -1, -1));

        background.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/background-login.jpg")); // NOI18N
        basement.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        basement.setOpaque(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        professor.logout(this);
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void coursesAssQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesAssQueryActionPerformed
        professorPanels.coursesAssignedProfessorP newContainer = new professorPanels.coursesAssignedProfessorP(userParameters);
        showPanel(newContainer);
    }//GEN-LAST:event_coursesAssQueryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel background;
    javax.swing.JPanel basement;
    javax.swing.JPanel content;
    javax.swing.JButton coursesAssQuery;
    javax.swing.JButton finalScore;
    javax.swing.JButton logoutBtn;
    javax.swing.JButton myProfile;
    // End of variables declaration//GEN-END:variables

    public void showPanel(JPanel panel) {
        panel.setSize(1250, 560);
        panel.setLocation(75, 0);
        panel.setOpaque(false);
        
        content.removeAll();
        content.add(panel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
}
