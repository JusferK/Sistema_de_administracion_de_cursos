package adminPanels;
import javax.swing.table.DefaultTableModel;
public class courseQueryPanel extends javax.swing.JPanel {
    
    public courseQueryPanel() {
        
        initComponents();
        
        setTableUp();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        coursesQTable = new javax.swing.JTable();

        basement.setForeground(new java.awt.Color(255, 255, 255));
        basement.setPreferredSize(new java.awt.Dimension(1500, 540));
        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Assistant ExtraBold", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Query class");
        basement.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 190, 50));

        coursesQTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(coursesQTable);

        basement.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 930, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        basement.setOpaque(false);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel basement;
    javax.swing.JTable coursesQTable;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    public void setTableUp() {
        DefaultTableModel coursesQueryTable = new DefaultTableModel(new String[]{"Course", "Professor", "Section", "Start date", "Finish date", "Start hour", "Finish hour", "course ID"}, com.mycompany.sistema_de_administracion.Sistema_De_Administracion.classList.size());
        coursesQTable.setModel(coursesQueryTable);
        
        int rows = 0;
        
        for (com.mycompany.sistema_de_administracion.Class c : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.classList) {
            coursesQTable.setValueAt(c.courseName, rows, 0);
            coursesQTable.setValueAt(c.professorAssigned, rows, 1);
            coursesQTable.setValueAt(c.section, rows, 2);
            coursesQTable.setValueAt(c.startDate, rows, 3);
            coursesQTable.setValueAt(c.finishDate, rows, 4);
            coursesQTable.setValueAt(c.startHour + ":00 " + c.startHourAmOrPm, rows, 5);
            coursesQTable.setValueAt(c.finishHour + ":00 " + c.finishHourAmOrPm, rows, 6);
            coursesQTable.setValueAt(c.ID, rows, 7);
            rows++;
        }
    }

}
