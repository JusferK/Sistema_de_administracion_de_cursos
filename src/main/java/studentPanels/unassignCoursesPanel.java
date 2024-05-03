package studentPanels;
import adminPanels.Render;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class unassignCoursesPanel extends javax.swing.JPanel {
    
    com.mycompany.sistema_de_administracion.student globalStudentInfo = null;
    
    public unassignCoursesPanel(com.mycompany.sistema_de_administracion.student info) {
        
        initComponents();
        
        globalStudentInfo = info;
        setCoursesTableUp();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        coursesTable = new javax.swing.JTable();
        unassignBtn = new javax.swing.JButton();

        basement.setForeground(new java.awt.Color(255, 255, 255));
        basement.setPreferredSize(new java.awt.Dimension(1500, 540));
        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title1.setFont(new java.awt.Font("Assistant ExtraBold", 0, 36)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setText("Unassign from course");
        basement.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 360, 60));

        coursesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(coursesTable);

        basement.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 800, 440));

        unassignBtn.setBackground(new java.awt.Color(3, 27, 59));
        unassignBtn.setForeground(new java.awt.Color(255, 255, 255));
        unassignBtn.setText("Unassign");
        unassignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unassignBtnActionPerformed(evt);
            }
        });
        basement.add(unassignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 140, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        basement.setOpaque(false);
    }// </editor-fold>//GEN-END:initComponents

    private void unassignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unassignBtnActionPerformed
        
        ArrayList<com.mycompany.sistema_de_administracion.Class> classFound = new ArrayList<com.mycompany.sistema_de_administracion.Class>();
        ArrayList<Integer> rowIndexList = new ArrayList<>();
        int checkCounter = 0;

        for (int i = 0; i < coursesTable.getRowCount(); i++) {

            String checked =  String.valueOf(coursesTable.getValueAt(i, 0));
            String courseName = String.valueOf(coursesTable.getValueAt(i, 1));
            String courseID = String.valueOf(coursesTable.getValueAt(i, 7));

            for (int e = 0; e < globalStudentInfo.coursesAssigned.size(); e++) {
                com.mycompany.sistema_de_administracion.Class currentClass = globalStudentInfo.coursesAssigned.get(e);

                if (currentClass.courseName.equals(courseName) && currentClass.ID.equals(courseID) && checked.equalsIgnoreCase("true")) {
                    classFound.add(currentClass);
                    checkCounter++;
                    rowIndexList.add(i);
                }
            }
            
        }

        if (checkCounter == 0) {
            JOptionPane.showMessageDialog(this, "Select at least one to unassigned");
        } else {
            globalStudentInfo.coursesAssigned.removeAll(classFound);

            DefaultTableModel data = (DefaultTableModel) coursesTable.getModel();

            int holder = 0;

            while(holder < checkCounter) {

                for (int j = 0; j < coursesTable.getRowCount(); j++) {

                    String greenCheck =  String.valueOf(coursesTable.getValueAt(j, 0));


                    if (!greenCheck.equals("true")) {

                    } else {
                        data.removeRow(j);
                        globalStudentInfo.coursesFinalNote.remove(j);
                        removeStudentsFromCourseList(classFound, globalStudentInfo);
                        holder++;
                        break;
                    }
                }
            }
            JOptionPane.showMessageDialog(this, "Unassignment was succesfull");
        }
        

    }//GEN-LAST:event_unassignBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel basement;
    javax.swing.JTable coursesTable;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JLabel title1;
    javax.swing.JButton unassignBtn;
    // End of variables declaration//GEN-END:variables

    public void setCoursesTableUp() {
        
        coursesTable.setDefaultRenderer(Object.class, new Render());
        
        String [] columns = new String[]{"Select", "Course name", "Section", "start date", "finish date", "start hour", "finish hour", "course ID", "professor assigned"};
        boolean [] editable = {true, false, false, false, false, false, false, false, false};
        Class [] types = new Class[]{java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class};
        
        DefaultTableModel myModel = new DefaultTableModel(columns, 0) {
            public Class getColumnClass(int i) {
                return types[i];
            }
            
            public boolean isCellEditable(int row, int column) {
                return editable[column];
            }
        };
        
        Object[] data = new Object[columns.length];
        
        for (com.mycompany.sistema_de_administracion.Class cl : globalStudentInfo.coursesAssigned) {
            data[0] = false;
            data[1] = String.valueOf(cl.courseName);
            data[2] = String.valueOf(cl.section);
            data[3] = String.valueOf(cl.startDate);
            data[4] = String.valueOf(cl.finishDate);
            data[5] = String.valueOf(cl.startHour + ":00 " + cl.startHourAmOrPm);
            data[6] = String.valueOf(cl.finishHour + ":00 " + cl.finishHourAmOrPm);
            data[7] = String.valueOf(cl.ID);
            data[8] = String.valueOf(cl.professorAssigned); 
            
            myModel.addRow(data);
        }
        
        coursesTable.setModel(myModel);
    }

    public void removeStudentsFromCourseList(ArrayList<com.mycompany.sistema_de_administracion.Class> classesToRemove, com.mycompany.sistema_de_administracion.student studentToRemove) {
        
        for (com.mycompany.sistema_de_administracion.Class cL : classesToRemove) {
            for (int i = 0; i < cL.studentAssignedList.size(); i++) {
                
                com.mycompany.sistema_de_administracion.student item = cL.studentAssignedList.get(i);
                String fullName = item.getStudentName() + " " + item.getStudentLastName();
                
                if (fullName.equals(studentToRemove.getStudentName() + " " + studentToRemove.getStudentLastName()) && item.getStudentID().equals(studentToRemove.getStudentID())) {
                    cL.studentAssignedList.remove(i);
                }
            }
        }
    }
}
