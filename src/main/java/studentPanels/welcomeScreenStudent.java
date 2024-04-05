package studentPanels;
public class welcomeScreenStudent extends javax.swing.JPanel {
    
    public welcomeScreenStudent(String name) {
        initComponents();
        welcomeLabel.setText("Welcome " + name + ", you are a student");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        adminIcon = new javax.swing.JLabel();

        basement.setForeground(new java.awt.Color(255, 255, 255));
        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomeLabel.setFont(new java.awt.Font("Assistant ExtraBold", 0, 48)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        basement.add(welcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 820, 210));

        adminIcon.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/student-icon.png")); // NOI18N
        basement.add(adminIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 149, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        basement.setOpaque(false);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel adminIcon;
    javax.swing.JPanel basement;
    javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
