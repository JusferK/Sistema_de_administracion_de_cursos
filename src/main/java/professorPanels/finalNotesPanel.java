package professorPanels;
import adminPanels.Render;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class finalNotesPanel extends javax.swing.JPanel {
    
    ArrayList<com.mycompany.sistema_de_administracion.Class> coursesArray = null;
    com.mycompany.sistema_de_administracion.Class auxiliar = null;
    
    public finalNotesPanel(String userParameters, String fullName) {
    
        initComponents();
        
        ArrayList<com.mycompany.sistema_de_administracion.Class> temporaryArray = new ArrayList<>();
        
        setCoursesTableUp(userParameters, temporaryArray);
        
        coursesArray = temporaryArray;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentsTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        coursesAssignedTable = new javax.swing.JTable();
        title = new javax.swing.JLabel();
        selectCourseBtn = new javax.swing.JButton();
        selectStudentBtn = new javax.swing.JButton();

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
        jScrollPane2.setViewportView(studentsTable);

        basement.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 450, 350));

        coursesAssignedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(coursesAssignedTable);

        basement.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 690, 350));

        title.setFont(new java.awt.Font("Assistant ExtraBold", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Enter final notes");
        basement.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 270, 40));

        selectCourseBtn.setBackground(new java.awt.Color(3, 27, 59));
        selectCourseBtn.setForeground(new java.awt.Color(255, 255, 255));
        selectCourseBtn.setText("Select course");
        selectCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCourseBtnActionPerformed(evt);
            }
        });
        basement.add(selectCourseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 210, 50));

        selectStudentBtn.setBackground(new java.awt.Color(3, 27, 59));
        selectStudentBtn.setForeground(new java.awt.Color(255, 255, 255));
        selectStudentBtn.setText("Select student");
        selectStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectStudentBtnActionPerformed(evt);
            }
        });
        basement.add(selectStudentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, 190, 50));

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

    private void selectCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCourseBtnActionPerformed

        ArrayList<com.mycompany.sistema_de_administracion.Class> temporaryClassList = new ArrayList<>();
        
        
        for (int i = 0; i < coursesAssignedTable.getRowCount(); i++) {

            String checked =  String.valueOf(coursesAssignedTable.getValueAt(i, 0));
            String courseName = String.valueOf(coursesAssignedTable.getValueAt(i, 1));
            String courseID = String.valueOf(coursesAssignedTable.getValueAt(i, 7));
            
            for (com.mycompany.sistema_de_administracion.Class cL : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.classList) {
                if (checked.equalsIgnoreCase("true") && courseName.equals(cL.courseName) && courseID.equals(cL.ID)) {
                    temporaryClassList.add(cL);
                }
            }
        }
        
        int temporaryListSize = temporaryClassList.size();
        
        if (temporaryListSize == 1) {
            com.mycompany.sistema_de_administracion.Class item = temporaryClassList.get(0);
            setStudentsTableUp(item);
        } else if(temporaryListSize > 1) {
            JOptionPane.showMessageDialog(this, "Only one course can be selected at a time.");
        } else if (temporaryListSize == 0) {
            JOptionPane.showMessageDialog(this, "Please, select at least one course to show students.");
        }
        
        auxiliar = temporaryClassList.get(0);
        
        selectCourseBtn.setEnabled(false);
    }//GEN-LAST:event_selectCourseBtnActionPerformed

    private void selectStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectStudentBtnActionPerformed
                
        com.mycompany.sistema_de_administracion.student studentSelect = null;
        
        int checkCounter = 0;
        
        if (studentsTable.getRowCount() != 0) {
            for (int i = 0; i < studentsTable.getRowCount(); i++) {
                String checked =  String.valueOf(studentsTable.getValueAt(i, 0));

                if (checked.equalsIgnoreCase("true")) {
                    checkCounter++;
                }
            }
        }
        
        if (checkCounter == 1) {
            
            for (int i = 0; i < studentsTable.getRowCount(); i++) {
            
                String checked =  String.valueOf(studentsTable.getValueAt(i, 0));
                String studentName = String.valueOf(studentsTable.getValueAt(i, 1));
                String studentLastName = String.valueOf(studentsTable.getValueAt(i, 2));
                String studentID = String.valueOf(studentsTable.getValueAt(i, 3));

                for (com.mycompany.sistema_de_administracion.student sT: com.mycompany.sistema_de_administracion.Sistema_De_Administracion.studentList) {
                    if (studentName.equals(sT.getStudentName()) && studentLastName.equals(sT.getStudentLastName()) && studentID.equals(sT.getStudentID()) && checked.equalsIgnoreCase("true")) {
                        studentSelect = sT;
                    }
                }
            }
            
            for (int e = 0; e < studentSelect.coursesAssigned.size(); e++) {
                com.mycompany.sistema_de_administracion.Class item = studentSelect.coursesAssigned.get(e);

                if (item.courseName.equals(auxiliar.courseName) && item.ID.equals(auxiliar.ID)) {

                    enterNoteFrame newFrame = new enterNoteFrame(studentSelect, item, e);
                    newFrame.setVisible(true);
                    newFrame.setResizable(false);
                    break;
                }
            }
        } else if (checkCounter == 0) {
            JOptionPane.showMessageDialog(this, "Please make sure to select a student");
        } else {
            JOptionPane.showMessageDialog(this, "Only one student can be selected at a time");
        }
        
        selectStudentBtn.setEnabled(false);
    }//GEN-LAST:event_selectStudentBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel basement;
    javax.swing.JTable coursesAssignedTable;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JButton selectCourseBtn;
    javax.swing.JButton selectStudentBtn;
    javax.swing.JTable studentsTable;
    javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    public void setCoursesTableUp(String user, ArrayList<com.mycompany.sistema_de_administracion.Class> temporaryArray) {
        
        coursesAssignedTable.setDefaultRenderer(Object.class, new Render());

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
        
        for (com.mycompany.sistema_de_administracion.Class cl : temporaryArray) {
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
            
            coursesAssignedTable.setModel(myModel);
        
    }

    public void setStudentsTableUp(com.mycompany.sistema_de_administracion.Class list) {
        
        studentsTable.setDefaultRenderer(Object.class, new Render());

        String [] columns = new String[]{"Select", "Name", "Last name", "Student ID"};
        boolean [] editable = {true, false, false, false};
        Class [] types = new Class[]{java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class};

        DefaultTableModel myModel = new DefaultTableModel(columns, 0) {
            public Class getColumnClass(int i) {
                return types[i];
            }

            public boolean isCellEditable(int row, int column) {
                return editable[column];
            }
        };

        Object[] data = new Object[columns.length];
        
        for (com.mycompany.sistema_de_administracion.student sT: list.studentAssignedList) {
            data[0] = false;
            data[1] = sT.getStudentName();
            data[2] = sT.getStudentLastName();
            data[3] = sT.getStudentID();
            
            myModel.addRow(data);
        }
        
        studentsTable.setModel(myModel);
    }
    
}