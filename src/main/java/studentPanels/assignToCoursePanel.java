package studentPanels;
import adminPanels.Render;
import com.mycompany.sistema_de_administracion.student;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class assignToCoursePanel extends javax.swing.JPanel {

    student globalStudentInfo = null;
    
    public assignToCoursePanel(student info) {
        
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
        assignBtn = new javax.swing.JButton();

        basement.setForeground(new java.awt.Color(255, 255, 255));
        basement.setPreferredSize(new java.awt.Dimension(1500, 540));
        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title1.setFont(new java.awt.Font("Assistant ExtraBold", 0, 36)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setText("Assign to course");
        basement.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 270, 60));

        coursesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(coursesTable);

        basement.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 800, 440));

        assignBtn.setBackground(new java.awt.Color(3, 27, 59));
        assignBtn.setForeground(new java.awt.Color(255, 255, 255));
        assignBtn.setText("Assign");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });
        basement.add(assignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 140, 50));

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

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
            
        ArrayList<com.mycompany.sistema_de_administracion.Class> temporaryArralist = new ArrayList<>();
        
        int checkCounter = 0;

            for (int i = 0; i < coursesTable.getRowCount(); i++) {

                String checked =  String.valueOf(coursesTable.getValueAt(i, 0));
                String courseName = String.valueOf(coursesTable.getValueAt(i, 1));
                String courseID = String.valueOf(coursesTable.getValueAt(i, 7));

                if (checked.equalsIgnoreCase("true")) {
                    checkCounter++;
                }

                for (com.mycompany.sistema_de_administracion.Class cL : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.classList) {
                    if (cL.courseName.equals(courseName) && cL.ID.equals(courseID) && checked.equals("true")) {
                        temporaryArralist.add(cL);
                    }
                }
            }

            boolean checker = checkCounter > 5;
            boolean securityBelt = checkCounter == 0;
            boolean predictingFuture = verification(temporaryArralist.size(), globalStudentInfo.coursesAssigned.size());
            boolean bugControl = globalStudentInfo.coursesAssigned.size() == 5 && !predictingFuture;
            
            
            
        if (globalStudentInfo.coursesAssigned.size() < 5 && predictingFuture && !securityBelt) {
            for(com.mycompany.sistema_de_administracion.Class cL : temporaryArralist) {
                    globalStudentInfo.coursesAssigned.add(cL);
                    cL.studentAssignedList.add(globalStudentInfo);
                    globalStudentInfo.coursesFinalNote.add(-1);
            }
            JOptionPane.showMessageDialog(this, "You assigned to " + checkCounter + " courses succesfully");
        } else if (bugControl) {
            JOptionPane.showMessageDialog(this, "You reach the maximum amount of courses to be assigned");
        } else if (checker) {
            JOptionPane.showMessageDialog(this, "Only up 5 courses can be assigned");
        } else if (!predictingFuture) {
            JOptionPane.showMessageDialog(this, "Currently you are assigned to " + globalStudentInfo.coursesAssigned.size() + " courses, make sure to be assigned to 5");
        } else if(securityBelt) {
            JOptionPane.showMessageDialog(this, "Please, at least select 1 course to assign");
        }

        DefaultTableModel data = (DefaultTableModel) coursesTable.getModel();

        int holder = 0;

        while(holder < checkCounter) {

            for (int j = 0; j < coursesTable.getRowCount(); j++) {

                String greenCheck =  String.valueOf(coursesTable.getValueAt(j, 0));


                if (!greenCheck.equals("true")) {

                } else {
                    data.removeRow(j);
                    holder++;
                    break;
                }
            }
        }
    }//GEN-LAST:event_assignBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton assignBtn;
    javax.swing.JPanel basement;
    javax.swing.JTable coursesTable;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables

    public void setCoursesTableUp() {
            
        ArrayList<com.mycompany.sistema_de_administracion.Class> temporaryClassList = new ArrayList<>();
        ArrayList<com.mycompany.sistema_de_administracion.Class> classListCopy = new ArrayList<>(com.mycompany.sistema_de_administracion.Sistema_De_Administracion.classList);
        
        if (!globalStudentInfo.coursesAssigned.isEmpty()) {

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

            for (int j = 0; j < globalStudentInfo.coursesAssigned.size(); j++) {

                com.mycompany.sistema_de_administracion.Class currentClassStudentAssigned = globalStudentInfo.coursesAssigned.get(j);

                for (int i = 0; i < com.mycompany.sistema_de_administracion.Sistema_De_Administracion.classList.size(); i++) {
                    
                    com.mycompany.sistema_de_administracion.Class currentClassList = com.mycompany.sistema_de_administracion.Sistema_De_Administracion.classList.get(i);

                    if (currentClassStudentAssigned.courseName.equals(currentClassList.courseName) && currentClassStudentAssigned.ID.equals(currentClassList.ID)) {
                        temporaryClassList.add(currentClassList);
                    }
                }                           
            }
            
            classListCopy.removeAll(temporaryClassList);
            
            for (com.mycompany.sistema_de_administracion.Class cl : classListCopy) {
            
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
            
        } else if(globalStudentInfo.coursesAssigned.isEmpty()) {
            easySetUp();
        }
    }
    
    public void easySetUp() {
        
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
    

    private boolean verification(int temporaryArraListSize, int size) {
        boolean response = temporaryArraListSize + size <= 5;
        return response;
    }

}