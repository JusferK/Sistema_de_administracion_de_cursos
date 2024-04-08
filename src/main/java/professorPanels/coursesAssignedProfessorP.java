package professorPanels;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class coursesAssignedProfessorP extends javax.swing.JPanel {
    
    ArrayList<com.mycompany.sistema_de_administracion.Class> coursesArray = null;
    
    public coursesAssignedProfessorP(String user) {
        
        initComponents();
        
        ArrayList<com.mycompany.sistema_de_administracion.Class> temporaryArray = new ArrayList<>();
        
        setCoursesTableUp(user, temporaryArray);
        setComboBox(temporaryArray);
        
        coursesArray = temporaryArray;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentsTable = new javax.swing.JTable();
        title = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        coursesTable = new javax.swing.JTable();
        courseComboBox = new javax.swing.JComboBox<>();
        selectBtn = new javax.swing.JButton();

        basement.setForeground(new java.awt.Color(255, 255, 255));
        basement.setMaximumSize(new java.awt.Dimension(1200, 510));
        basement.setMinimumSize(new java.awt.Dimension(1200, 510));
        basement.setPreferredSize(new java.awt.Dimension(1200, 510));
        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(studentsTable);

        basement.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 370, 430));

        title.setFont(new java.awt.Font("Assistant ExtraBold", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Courses & students assigned");
        basement.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 480, 40));

        coursesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(coursesTable);

        basement.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 580, 430));

        basement.add(courseComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 110, 170, 40));

        selectBtn.setBackground(new java.awt.Color(3, 27, 59));
        selectBtn.setForeground(new java.awt.Color(255, 255, 255));
        selectBtn.setText("Select");
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });
        basement.add(selectBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 170, 130, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        basement.setOpaque(false);
    }// </editor-fold>//GEN-END:initComponents

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed
        
        String courseName = courseComboBox.getSelectedItem().toString();
        
        for (com.mycompany.sistema_de_administracion.Class cL : coursesArray) {
            
            if (courseName.equals(cL.courseName)) {
                
                int arrayCoursesSize = cL.studentAssignedList.size();
                
                DefaultTableModel studentQueryTable = new DefaultTableModel(new String[]{"Name", "last name", "student ID"}, arrayCoursesSize);
                studentsTable.setModel(studentQueryTable);
                
                int row = 0;
                
                for (com.mycompany.sistema_de_administracion.student sT : cL.studentAssignedList) {
                    studentsTable.setValueAt(sT.getStudentName(), row, 0);
                    studentsTable.setValueAt(sT.getStudentLastName(), row, 1);
                    studentsTable.setValueAt(sT.getStudentID(), row, 2);
                    row++;
                }
                
            }
        }
    }//GEN-LAST:event_selectBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel basement;
    javax.swing.JComboBox<String> courseComboBox;
    javax.swing.JTable coursesTable;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JButton selectBtn;
    javax.swing.JTable studentsTable;
    javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    public void setCoursesTableUp(String user, ArrayList<com.mycompany.sistema_de_administracion.Class> temporaryArray) {
        
        for (com.mycompany.sistema_de_administracion.professor p : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.professorsList) {
            if (user.equals(p.user)) {
                
                String professorName = p.getName() + " " + p.lastName;
                
                for (com.mycompany.sistema_de_administracion.Class cL : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.classList) {
                    if (professorName.equals(cL.professorAssigned)) {
                        temporaryArray.add(cL);
                    }
                }
            }
        }
        
        DefaultTableModel coursesQueryTable = new DefaultTableModel(new String[]{"Course", "Professor", "Section", "Start date", "Finish date", "Start hour", "Finish hour", "course ID"}, temporaryArray.size());
        coursesTable.setModel(coursesQueryTable);
        
        int row = 0;
        
        for (com.mycompany.sistema_de_administracion.Class cL : temporaryArray) {
            coursesTable.setValueAt(cL.courseName, row, 0);
            coursesTable.setValueAt(cL.professorAssigned, row, 1);
            coursesTable.setValueAt(cL.section, row, 2);
            coursesTable.setValueAt(cL.startDate, row, 3);
            coursesTable.setValueAt(cL.finishDate, row, 4);
            coursesTable.setValueAt(cL.startHour + ":00 " + cL.startHourAmOrPm, row, 5);
            coursesTable.setValueAt(cL.finishHour + ":00 " + cL.finishHourAmOrPm, row, 6);
            coursesTable.setValueAt(cL.ID, row, 7);
            row++;
        }
    }

    public void setComboBox(ArrayList<com.mycompany.sistema_de_administracion.Class> temporaryArray) {
        for (com.mycompany.sistema_de_administracion.Class cL : temporaryArray) {
            courseComboBox.addItem(cL.courseName);
        }
    }
}
