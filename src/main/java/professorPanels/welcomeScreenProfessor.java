package professorPanels;
public class welcomeScreenProfessor extends javax.swing.JPanel {
    
    public welcomeScreenProfessor(com.mycompany.sistema_de_administracion.professor info) {
        
        initComponents();
        welcomeLabel.setText("Welcome " + info.getName() + ", you are a professor");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        adminIcon = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1200, 500));
        setMinimumSize(new java.awt.Dimension(1200, 500));
        setPreferredSize(new java.awt.Dimension(1200, 500));

        basement.setForeground(new java.awt.Color(255, 255, 255));
        basement.setMaximumSize(new java.awt.Dimension(1200, 510));
        basement.setMinimumSize(new java.awt.Dimension(1200, 510));
        basement.setPreferredSize(new java.awt.Dimension(1200, 510));
        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomeLabel.setFont(new java.awt.Font("Assistant ExtraBold", 0, 48)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        basement.add(welcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 870, 200));

        adminIcon.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/professor-icon.png")); // NOI18N
        basement.add(adminIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 149, 162));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
