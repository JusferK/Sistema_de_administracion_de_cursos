package adminPanels;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class editCoursePanel extends javax.swing.JPanel {
    
    com.mycompany.sistema_de_administracion.Class courseInfo = null;
    
    public editCoursePanel() {
        
        initComponents();
        
        setCoursesTableUp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        coursesTable = new javax.swing.JTable();
        selectBtn = new javax.swing.JButton();

        basement.setForeground(new java.awt.Color(255, 255, 255));
        basement.setPreferredSize(new java.awt.Dimension(1500, 540));
        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title1.setFont(new java.awt.Font("Assistant ExtraBold", 0, 36)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setText("Edit  course");
        basement.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 12, -1, 60));

        coursesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(coursesTable);

        basement.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 800, 440));

        selectBtn.setBackground(new java.awt.Color(3, 27, 59));
        selectBtn.setForeground(new java.awt.Color(255, 255, 255));
        selectBtn.setText("Select");
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });
        basement.add(selectBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 140, 50));

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

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed
        
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
                    courseInfo = cL;
                }
            }
        }
        
        boolean checker = checkCounter < 2;
        boolean securityBelt = checkCounter == 0;
        
        if (!checker) {
            JOptionPane.showMessageDialog(this, "Only one course can be selected at time");
        } else if(securityBelt) {
            JOptionPane.showMessageDialog(this, "Please select one course to edit");
        } else {
            editCourseFrame newScreen = new editCourseFrame(courseInfo);
            newScreen.setVisible(true);
            newScreen.setResizable(false);
            selectBtn.setEnabled(false);
        }
    }//GEN-LAST:event_selectBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel basement;
    javax.swing.JTable coursesTable;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JButton selectBtn;
    javax.swing.JLabel title1;
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

}
