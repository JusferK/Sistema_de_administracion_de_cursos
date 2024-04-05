package adminPanels;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class coursesAssignedQuery extends javax.swing.JPanel {
    
    public coursesAssignedQuery() {
        
        initComponents();
        
        for (com.mycompany.sistema_de_administracion.student s : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.studentList) {
            studentComboBox.addItem(s.getStudentName() + " " + s.getStudentLastName());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        coursesAssignedQTable = new javax.swing.JTable();
        studentComboBox = new javax.swing.JComboBox<>();
        queryBtn = new javax.swing.JButton();

        basement.setForeground(new java.awt.Color(255, 255, 255));
        basement.setPreferredSize(new java.awt.Dimension(1500, 540));
        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Assistant ExtraBold", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Classes assigned Query");
        basement.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 380, 50));

        coursesAssignedQTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(coursesAssignedQTable);

        basement.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 590, 370));

        studentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Select"}));
        basement.add(studentComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 270, 50));

        queryBtn.setBackground(new java.awt.Color(3, 27, 59));
        queryBtn.setForeground(new java.awt.Color(255, 255, 255));
        queryBtn.setText("Query");
        queryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryBtnActionPerformed(evt);
            }
        });
        basement.add(queryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 110, 50));

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

    private void queryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryBtnActionPerformed
        
        String studentSelected = studentComboBox.getSelectedItem().toString();
        
        if (!studentSelected.equalsIgnoreCase("selected")) {
            
            
            for (com.mycompany.sistema_de_administracion.student s : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.studentList) {
            
                String studentFullName = s.getStudentName() + " " + s.getStudentLastName();
            
                if (studentFullName.equalsIgnoreCase(studentSelected)) {
                        
                    DefaultTableModel professorQueryTable = new DefaultTableModel(new String[]{"Course name", "Section", "start date", "finish date", "start hour", "finish hour", "course ID", "professor assigned"}, s.coursesAssigned.size());
                    coursesAssignedQTable.setModel(professorQueryTable);
                    
                    int row = 0;
                    
                    for (com.mycompany.sistema_de_administracion.Class cL : s.coursesAssigned) {
                        coursesAssignedQTable.setValueAt(cL.courseName, row, 0);
                        coursesAssignedQTable.setValueAt(cL.section, row, 1);
                        coursesAssignedQTable.setValueAt(cL.startDate, row, 2);
                        coursesAssignedQTable.setValueAt(cL.finishDate, row, 3);
                        coursesAssignedQTable.setValueAt(cL.startHour + ":00 " + cL.startHourAmOrPm, row, 4);
                        coursesAssignedQTable.setValueAt(cL.finishHour + ":00 " + cL.finishHourAmOrPm, row, 5);
                        coursesAssignedQTable.setValueAt(cL.ID, row, 6);
                        coursesAssignedQTable.setValueAt(cL.professorAssigned, row, 7);
                        row++;
                    }
                }
                
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please, select a student");
        }
    }//GEN-LAST:event_queryBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel basement;
    javax.swing.JTable coursesAssignedQTable;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JButton queryBtn;
    javax.swing.JComboBox<String> studentComboBox;
    javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
