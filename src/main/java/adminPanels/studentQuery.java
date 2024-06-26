package adminPanels;
import javax.swing.table.DefaultTableModel;
public class studentQuery extends javax.swing.JPanel {

    public studentQuery() {
        initComponents();
        
        DefaultTableModel studentQueryTable = new DefaultTableModel(new String[]{"Name", "Last name", "Student ID", "sex"}, com.mycompany.sistema_de_administracion.Sistema_De_Administracion.studentList.size());
        studentQTable.setModel(studentQueryTable);
        
        int rows = 0;
        
        for (com.mycompany.sistema_de_administracion.student s : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.studentList) {
            studentQTable.setValueAt(s.getStudentName(), rows, 0);
            studentQTable.setValueAt(s.getStudentLastName(), rows, 1);
            studentQTable.setValueAt(s.getStudentID(), rows, 2);
            studentQTable.setValueAt(s.sex, rows, 3);
            rows++;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentQTable = new javax.swing.JTable();

        basement.setForeground(new java.awt.Color(255, 255, 255));
        basement.setPreferredSize(new java.awt.Dimension(1500, 540));
        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Assistant ExtraBold", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Query student");
        basement.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 240, 50));

        studentQTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        studentQTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(studentQTable);

        basement.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 820, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    javax.swing.JTable studentQTable;
    javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
