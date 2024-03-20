package adminPanels;
public class welcomeAdmin extends javax.swing.JPanel {
    
    public welcomeAdmin() {
        initComponents();
        welcomeLabel.setText("Welcome " + com.mycompany.sistema_de_administracion.Sistema_De_Administracion.mainAdmin.getAdminName() + ", you are an administrator");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        adminIcon = new javax.swing.JLabel();

        setForeground(new java.awt.Color(255, 255, 250));

        basement.setForeground(new java.awt.Color(255, 255, 255));

        welcomeLabel.setFont(new java.awt.Font("Assistant ExtraBold", 0, 48)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));

        adminIcon.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/admin-icon.png")); // NOI18N

        javax.swing.GroupLayout basementLayout = new javax.swing.GroupLayout(basement);
        basement.setLayout(basementLayout);
        basementLayout.setHorizontalGroup(
            basementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(basementLayout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(adminIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        basementLayout.setVerticalGroup(
            basementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(basementLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(adminIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        basement.setOpaque(false);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel adminIcon;
    javax.swing.JPanel basement;
    javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
