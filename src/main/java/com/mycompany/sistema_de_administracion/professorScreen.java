package com.mycompany.sistema_de_administracion;


public class professorScreen extends javax.swing.JFrame {

    
    public professorScreen() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        myProfile = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        coursesAssQuery = new javax.swing.JButton();
        studAssigCoursesQ = new javax.swing.JButton();
        finalScore = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));

        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        basement.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1050, 410));
        content.setOpaque(false);

        myProfile.setText("My profile");
        basement.add(myProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 470, -1, -1));

        logoutBtn.setText("log out");
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });
        basement.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 470, -1, -1));

        coursesAssQuery.setText("Courses assigned query");
        basement.add(coursesAssQuery, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        studAssigCoursesQ.setText("students assign to courses query");
        basement.add(studAssigCoursesQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        finalScore.setText("Enter final score");
        basement.add(finalScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, -1, -1));

        background.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/background-login.jpg")); // NOI18N
        basement.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basement, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basement, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        basement.setOpaque(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        professor.logout(this);
    }//GEN-LAST:event_logoutBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel background;
    javax.swing.JPanel basement;
    javax.swing.JPanel content;
    javax.swing.JButton coursesAssQuery;
    javax.swing.JButton finalScore;
    javax.swing.JButton logoutBtn;
    javax.swing.JButton myProfile;
    javax.swing.JButton studAssigCoursesQ;
    // End of variables declaration//GEN-END:variables
}
