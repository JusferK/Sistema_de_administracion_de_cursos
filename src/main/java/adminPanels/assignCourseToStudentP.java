package adminPanels;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class assignCourseToStudentP extends javax.swing.JPanel {
    
    public assignCourseToStudentP() {
        initComponents();
        
        setStudentTableUp();
        setCoursesTableUp();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentsTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        coursesTable = new javax.swing.JTable();
        assignBtn = new javax.swing.JButton();

        basement.setForeground(new java.awt.Color(255, 255, 255));
        basement.setPreferredSize(new java.awt.Dimension(1500, 540));
        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Assistant ExtraBold", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Assign student to course");
        basement.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 400, 40));

        studentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(studentsTable);

        basement.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 440, 400));

        coursesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(coursesTable);

        basement.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 860, 400));

        assignBtn.setBackground(new java.awt.Color(3, 27, 59));
        assignBtn.setForeground(new java.awt.Color(255, 255, 255));
        assignBtn.setText("Assign");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });
        basement.add(assignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, 110, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        basement.setOpaque(false);
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        
        int studentSelectedCounter = 0;
        int coursesSelectedCounter = 0;
        
        boolean doorHolder = true;
        
        ArrayList<com.mycompany.sistema_de_administracion.student> studentTemporaryArrayList = new ArrayList<>();
        ArrayList<com.mycompany.sistema_de_administracion.Class> classTemporaryArrayList = new ArrayList<>();
        
        while(doorHolder) {
            
            boolean break1 = false, break2 = false;
            
            for (int i = 0; i < studentsTable.getRowCount(); i++) {
                
                String studentCheckBoxValue = String.valueOf(studentsTable.getValueAt(i, 0));
                
                if (studentCheckBoxValue.equalsIgnoreCase("true")) {
                    
                    studentSelectedCounter++;
                    
                    String studentName = String.valueOf(studentsTable.getValueAt(i, 1));
                    String studentLastName = String.valueOf(studentsTable.getValueAt(i, 2));
                    String studentID = String.valueOf(studentsTable.getValueAt(i, 3));
                    
                    for (com.mycompany.sistema_de_administracion.student s : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.studentList) {
                        if (studentName.equalsIgnoreCase(s.getStudentName()) && studentLastName.equalsIgnoreCase(s.getStudentLastName()) && studentID.equalsIgnoreCase(s.getStudentID())) {
                            studentTemporaryArrayList.add(s);
                        }
                    }
                    
                }
                
                if (i == studentsTable.getRowCount() - 1) {
                    break1 = true;
                }
            }
            
            for (int e = 0; e < coursesTable.getRowCount(); e++) {
                
                String classCheckBoxValue = String.valueOf(coursesTable.getValueAt(e, 0));
                
                if (classCheckBoxValue.equalsIgnoreCase("true")) {
                    
                    coursesSelectedCounter++;
                    
                    String courseName = String.valueOf(coursesTable.getValueAt(e, 1));
                    String section = String.valueOf(coursesTable.getValueAt(e, 2));
                    String startDate = String.valueOf(coursesTable.getValueAt(e, 3));
                    String finishDate = String.valueOf(coursesTable.getValueAt(e, 4));
                    String startHour = String.valueOf(coursesTable.getValueAt(e, 5));
                    String finishHour = String.valueOf(coursesTable.getValueAt(e, 6));
                    String courseID = String.valueOf(coursesTable.getValueAt(e, 7));
                    String professorAssigned = String.valueOf(coursesTable.getValueAt(e, 8));
                    
                    
                    
                    for (com.mycompany.sistema_de_administracion.Class c : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.classList) {
                        
                        String temporaryString = String.valueOf(c.startHour);
                        String temporaryString2 = String.valueOf(c.finishHour);
                        
                        if (courseName.equalsIgnoreCase(c.courseName) && section.equalsIgnoreCase(c.section) && startDate.equalsIgnoreCase(c.startDate) && finishDate.equalsIgnoreCase(c.finishDate) && startHour.equalsIgnoreCase(temporaryString + ":00 " + c.startHourAmOrPm) && finishHour.equalsIgnoreCase(temporaryString2 + ":00 " + c.finishHourAmOrPm) && courseID.equalsIgnoreCase(c.ID) && professorAssigned.equalsIgnoreCase(c.professorAssigned)) {
                            classTemporaryArrayList.add(c);
                        }
                    }
                }
                
                if (e == coursesTable.getRowCount() - 1) {
                    break2 = true;
                }
            }
            
            if (coursesSelectedCounter == 0 && studentSelectedCounter == 0) {
                JOptionPane.showMessageDialog(this, "Please make sure to select students and classes");
                doorHolder = false;
            } else if (coursesSelectedCounter == 0) {
                JOptionPane.showMessageDialog(this, "Please make sure to select classes");
                doorHolder = false;
            } else if (studentSelectedCounter == 0) {
                JOptionPane.showMessageDialog(this, "Please make sure to select students");
                doorHolder = false;
            }
            
            if ((break1 && break2)) {
                doorHolder = false;
            }
        }
        
        boolean securityBelt = limitVerification(studentSelectedCounter, coursesSelectedCounter);
        
        if (securityBelt) {
            
            for (com.mycompany.sistema_de_administracion.Class cl : classTemporaryArrayList) {
                for (com.mycompany.sistema_de_administracion.student s : studentTemporaryArrayList) {
                    cl.studentAssignedList.add(s);   
                }
            }
            
            for (com.mycompany.sistema_de_administracion.student s : studentTemporaryArrayList) {
                for (com.mycompany.sistema_de_administracion.Class cL : classTemporaryArrayList) {
                    s.coursesAssigned.add(cL);
                }
            }
            
            JOptionPane.showMessageDialog(this, "The assignment was sucessfull");
            
            assignBtn.setEnabled(false);
            
        } else if(studentSelectedCounter > 10 ) {
            JOptionPane.showMessageDialog(this, "Only up to 10 students can be assigned per class");
        } else if (coursesSelectedCounter > 5) {
            JOptionPane.showMessageDialog(this, "Only up to 5 courses can be assigned per student");
        }
    }//GEN-LAST:event_assignBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton assignBtn;
    javax.swing.JPanel basement;
    javax.swing.JTable coursesTable;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JTable studentsTable;
    javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    public void setStudentTableUp() {
        studentsTable.setDefaultRenderer(Object.class, new Render());
        
        String [] columns = new String[]{"Select", "Name", "lastname", "Student ID"};
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
        
        for (com.mycompany.sistema_de_administracion.student sL : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.studentList) {
            data[0] = false;
            data[1] = String.valueOf(sL.getStudentName());
            data[2] = String.valueOf(sL.getStudentLastName());
            data[3] = String.valueOf(sL.getStudentID());
            
            myModel.addRow(data);
        }
        
        studentsTable.setModel(myModel);
    }
    
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
        
        for (com.mycompany.sistema_de_administracion.Class cl : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.classList) {
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

    public boolean limitVerification(int studentCounter, int coursesCounter) {
        boolean response = (studentCounter <= 10) && (coursesCounter <= 5);
        return response;
    }
}