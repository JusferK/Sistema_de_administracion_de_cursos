package com.mycompany.sistema_de_administracion;
public class administratorScreen extends javax.swing.JFrame {
    
    public administratorScreen() {
        initComponents();
        welcomeLabel.setText("Welcome " + Sistema_De_Administracion.mainAdmin.getAdminName() + ", you are an administrator");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        createProf = new javax.swing.JButton();
        profQuery = new javax.swing.JButton();
        editProfInfo = new javax.swing.JButton();
        createStud = new javax.swing.JButton();
        studQuery = new javax.swing.JButton();
        editStudInfo = new javax.swing.JButton();
        createCourse = new javax.swing.JButton();
        editCourse = new javax.swing.JButton();
        courseQuery = new javax.swing.JButton();
        editCourse1 = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        myProfile = new javax.swing.JButton();
        massLoadProf = new javax.swing.JButton();
        massLoadStud = new javax.swing.JButton();
        massLoadStud1 = new javax.swing.JButton();
        content = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        adminIcon = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        basement.add(createProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 0, 140, 53));

        profQuery.setText("Prof. query");
        basement.add(profQuery, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, 53));

        editProfInfo.setText("Edit prof info");
        basement.add(editProfInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, 53));

        createStud.setText("Create stud.");
        basement.add(createStud, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, 53));

        studQuery.setText("Stud. query");
        basement.add(studQuery, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, 53));

        editStudInfo.setText("Edit stud. info");
        basement.add(editStudInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, 53));

        createCourse.setText("Create cour.");
        basement.add(createCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, 53));

        editCourse.setText("Edit cour.");
        basement.add(editCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, -1, 53));

        courseQuery.setText("Cour. query");
        basement.add(courseQuery, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, -1, 53));

        editCourse1.setText("Assign cour.");
        editCourse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCourse1ActionPerformed(evt);
            }
        });
        basement.add(editCourse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, -1, 53));

        logout.setText("Log out");
        basement.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 630, 95, -1));

        myProfile.setText("My profile");
        basement.add(myProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 630, -1, -1));

        massLoadProf.setText("Massive prof load");
        massLoadProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                massLoadProfActionPerformed(evt);
            }
        });
        basement.add(massLoadProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, -1, 53));

        massLoadStud.setText("Massive stud load ");
        massLoadStud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                massLoadStudActionPerformed(evt);
            }
        });
        basement.add(massLoadStud, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, -1, 53));

        massLoadStud1.setText("Massive courses load");
        massLoadStud1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                massLoadStud1ActionPerformed(evt);
            }
        });
        basement.add(massLoadStud1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 0, -1, 53));

        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomeLabel.setFont(new java.awt.Font("Assistant ExtraBold", 0, 48)); // NOI18N
        content.add(welcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 1070, 315));

        adminIcon.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/admin-icon.png")); // NOI18N
        content.add(adminIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 149, 162));

        backgroundImage.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/com/mycompany/sistema_de_administracion/background-login.jpg")); // NOI18N
        content.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 550));

        basement.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1600, 551));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basement, javax.swing.GroupLayout.PREFERRED_SIZE, 1593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editCourse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCourse1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editCourse1ActionPerformed

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
        // TODO add your handling code here:
    }//GEN-LAST:event_createProfActionPerformed

    private void createProfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createProfMouseClicked
        // EVENT HERE MATE
        welcomePackageFade();
    }//GEN-LAST:event_createProfMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel adminIcon;
    javax.swing.JLabel backgroundImage;
    javax.swing.JPanel basement;
    javax.swing.JPanel content;
    javax.swing.JButton courseQuery;
    javax.swing.JButton createCourse;
    javax.swing.JButton createProf;
    javax.swing.JButton createStud;
    javax.swing.JButton editCourse;
    javax.swing.JButton editCourse1;
    javax.swing.JButton editProfInfo;
    javax.swing.JButton editStudInfo;
    javax.swing.JButton logout;
    javax.swing.JButton massLoadProf;
    javax.swing.JButton massLoadStud;
    javax.swing.JButton massLoadStud1;
    javax.swing.JButton myProfile;
    javax.swing.JButton profQuery;
    javax.swing.JButton studQuery;
    javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables

    private void welcomePackageFade() {
        welcomeLabel.setVisible(false);
        adminIcon.setVisible(false);
    }
}


