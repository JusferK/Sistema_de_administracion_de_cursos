package adminPanels;
import javax.swing.table.DefaultTableModel;
public class professorQuery extends javax.swing.JPanel {
    
    public professorQuery() {
        
        initComponents();
        
        DefaultTableModel professorQueryTable = new DefaultTableModel(new String[]{"Name", "Last name", "Speciallity", "Sex"}, com.mycompany.sistema_de_administracion.Sistema_De_Administracion.professorsList.size());
        professorQTable.setModel(professorQueryTable);
        
        int rows = 0;
        
        for (com.mycompany.sistema_de_administracion.professor p : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.professorsList) {
            professorQTable.setValueAt(p.getName(), rows, 0);
            professorQTable.setValueAt(p.lastName, rows, 1);
            professorQTable.setValueAt(p.speciallity, rows, 2);
            professorQTable.setValueAt(p.sex, rows, 3);
            rows++;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        professorQTable = new javax.swing.JTable();

        basement.setForeground(new java.awt.Color(255, 255, 255));
        basement.setPreferredSize(new java.awt.Dimension(1500, 540));
        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Assistant ExtraBold", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Query professors");
        basement.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 280, 50));

        professorQTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(professorQTable);
        if (professorQTable.getColumnModel().getColumnCount() > 0) {
            professorQTable.getColumnModel().getColumn(0).setResizable(false);
            professorQTable.getColumnModel().getColumn(1).setResizable(false);
            professorQTable.getColumnModel().getColumn(2).setResizable(false);
            professorQTable.getColumnModel().getColumn(3).setResizable(false);
        }

        basement.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 820, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        basement.setOpaque(false);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel basement;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTable professorQTable;
    javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
