package adminPanels;
import com.opencsv.CSVWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class massiveLoadsClassP extends javax.swing.JPanel {
    
    int counter = 0;
    public massiveLoadsClassP() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement = new javax.swing.JPanel();
        professorLabel = new javax.swing.JLabel();
        fileChooser = new javax.swing.JFileChooser();
        typeOfFileCombo = new javax.swing.JComboBox<>();
        typeOfActionCombo = new javax.swing.JComboBox<>();
        performActionBtn = new javax.swing.JButton();
        actionLabel = new javax.swing.JLabel();
        typeOfFileLabel = new javax.swing.JLabel();

        basement.setForeground(new java.awt.Color(255, 255, 255));
        basement.setPreferredSize(new java.awt.Dimension(1500, 540));
        basement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        professorLabel.setFont(new java.awt.Font("Assistant ExtraBold", 0, 36)); // NOI18N
        professorLabel.setForeground(new java.awt.Color(255, 255, 255));
        professorLabel.setText("Massive class load/generate");
        basement.add(professorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 520, 90));

        fileChooser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fileChooser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fileChooserFocusLost(evt);
            }
        });
        fileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserActionPerformed(evt);
            }
        });
        basement.add(fileChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 570, 370));

        typeOfFileCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"csv", "xml", "json"}));
        typeOfFileCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeOfFileComboActionPerformed(evt);
            }
        });
        basement.add(typeOfFileCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 250, 40));

        typeOfActionCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Load", "Generate", "Assignment"}));
        typeOfActionCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                typeOfActionComboItemStateChanged(evt);
            }
        });
        typeOfActionCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeOfActionComboActionPerformed(evt);
            }
        });
        basement.add(typeOfActionCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 240, 40));

        performActionBtn.setBackground(new java.awt.Color(3, 27, 59));
        performActionBtn.setForeground(new java.awt.Color(255, 255, 255));
        performActionBtn.setText("Load");
        performActionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                performActionBtnActionPerformed(evt);
            }
        });
        basement.add(performActionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 170, 70));

        actionLabel.setForeground(new java.awt.Color(255, 255, 255));
        actionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actionLabel.setText("Select an action");
        basement.add(actionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 230, 40));

        typeOfFileLabel.setForeground(new java.awt.Color(255, 255, 255));
        typeOfFileLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typeOfFileLabel.setText("What type of file you want to Load");
        basement.add(typeOfFileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 290, 40));

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

    private void fileChooserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fileChooserFocusLost

    }//GEN-LAST:event_fileChooserFocusLost

    private void fileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserActionPerformed

    }//GEN-LAST:event_fileChooserActionPerformed

    private void typeOfFileComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeOfFileComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeOfFileComboActionPerformed

    private void typeOfActionComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_typeOfActionComboItemStateChanged
        counter++;
        String answer = typeOfActionCombo.getSelectedItem().toString();

        switch(answer) {
            case "Load" -> {
                performActionBtn.setText(answer);
                typeOfFileLabel.setText("What type of file you want to " + answer + "?");
                if (counter == 1) JOptionPane.showMessageDialog(this, "Please now select the file to upload it");
                if(counter == 2) counter = 0;
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                if (typeOfFileCombo.getItemCount() == 1) {
                    typeOfFileCombo.addItem("csv");
                    typeOfFileCombo.addItem("xml");
                    typeOfFileCombo.addItem("json");
                    typeOfFileCombo.removeItem("progra1");
                }
            } case "Generate" -> {
                performActionBtn.setText(answer);
                typeOfFileLabel.setText("What type of file you want to " + answer + "?");
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                if (counter == 1) JOptionPane.showMessageDialog(this, "Please now select where you want to save it from your files directories");
                if(counter == 2) counter = 0;
                if (typeOfFileCombo.getItemCount() == 1) {
                        typeOfFileCombo.addItem("csv");
                        typeOfFileCombo.addItem("xml");
                        typeOfFileCombo.addItem("json");
                        typeOfFileCombo.removeItem("progra1");
                }
            } case "Assignment" -> {
                if (counter == 1) {
                    if (typeOfFileCombo.getItemCount() == 3) {
                        typeOfFileCombo.removeItem("csv");
                        typeOfFileCombo.removeItem("xml");
                        typeOfFileCombo.removeItem("json");
                        typeOfFileCombo.addItem("progra1");
                    }
                }
                 typeOfFileLabel.setText("Assign courses to students massively");
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                if(counter == 2) counter = 0;
                performActionBtn.setText(answer);
            }
        }
    }//GEN-LAST:event_typeOfActionComboItemStateChanged

    private void typeOfActionComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeOfActionComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeOfActionComboActionPerformed

    private void performActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_performActionBtnActionPerformed
        String typeOfAction = typeOfActionCombo.getSelectedItem().toString();
        String typeOfFile = typeOfFileCombo.getSelectedItem().toString();
        String cloneOfTypeOfFile = "." + typeOfFileCombo.getSelectedItem().toString();
        String fileOrPath = null;
        String[] formats = {".csv", ".xml", ".json", ".progra1"};
        boolean holder = false;

        try {
            fileOrPath = fileChooser.getSelectedFile().toString();

            if (typeOfAction.equalsIgnoreCase("load") || typeOfAction.equalsIgnoreCase("assignment")) {

                String formatFromFileChoseen = fileNameViceVersa(fileOrPath);

                for (int i = 0; i < formats.length; i++) {
                    if (fileOrPath.contains(formats[i]) && formatFromFileChoseen.equals(cloneOfTypeOfFile)) {
                        holder = true;
                    }
                }

                if (!holder) JOptionPane.showMessageDialog(this, "The format you choose is " + cloneOfTypeOfFile + " and you are trying to upload a " + formatFromFileChoseen);
            }

        } catch(Exception e) {
            if (typeOfAction.equals("Load") || typeOfAction.equals("Assignment")) JOptionPane.showMessageDialog(this, "Please, select a file");
            if (typeOfAction.equals("Generate")) JOptionPane.showMessageDialog(this, "Please, select a path");
        }

        if (typeOfAction == "Load" && typeOfFile == "csv" && fileOrPath != null && holder) {
            boolean mySecurityBelt = readCSVFile(fileOrPath);
            if (mySecurityBelt) JOptionPane.showMessageDialog(this, "Load has been succesfull!");
        } else if(typeOfAction == "Generate" && typeOfFile == "csv" && fileOrPath != null) {
            if (!com.mycompany.sistema_de_administracion.Sistema_De_Administracion.classList.isEmpty()) {
                String inputName = JOptionPane.showInputDialog("Enter the file name");
                String fileName = fileOrPath + "/" + inputName + ".csv";

                try{
                    CSVWriter writer = new CSVWriter(new FileWriter(fileName));
                    String[] header = {"ID", "course name", "section", "professor assigned", "start date", "finish date", "start hour", "finish hour"};
                    writer.writeNext(header);
                    for (com.mycompany.sistema_de_administracion.Class cL : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.classList) {
                        String[] studentInfo = {cL.ID, cL.courseName, cL.section, cL.professorAssigned, cL.startDate, cL.finishDate, String.valueOf(cL.startHour) + " " + cL.startHourAmOrPm, String.valueOf(cL.finishHour) + " " + cL.finishHourAmOrPm};
                        writer.writeNext(studentInfo);
                    }
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                JOptionPane.showMessageDialog(this, "File was generated successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "There is no information to print!");
            }
        } else if (typeOfAction == "Load" && typeOfFile == "xml" && holder) {
            File xmlFile = null;

            try {
                xmlFile = fileChooser.getSelectedFile();
            }catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Please, select a file");
            }

            if(xmlFile != null) readXMLFile(xmlFile);
        } else if (typeOfAction == "Generate" && typeOfFile == "xml") {
            if (!com.mycompany.sistema_de_administracion.Sistema_De_Administracion.classList.isEmpty()) {
                String fileName = JOptionPane.showInputDialog("Enter the file name");
                String newFileAddedToPath = fileOrPath + "/" + fileName + ".xml";

                String content = "<Classes> \n";

                for (com.mycompany.sistema_de_administracion.Class cL : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.classList) {
                    content += "\t<Class>\n";
                    content += "\t\t<courseID>" + cL.ID + "</courseID> \n";
                    content += "\t\t<courseName>" + cL.courseName + "</courseName> \n";
                    content += "\t\t<section>" + cL.section + "</section> \n";
                    content += "\t\t<professorAssigned>" + cL.professorAssigned + "</professorAssigned> \n";
                    content += "\t\t<startDate>" + cL.startDate + "</startDate> \n";
                    content += "\t\t<finishDate>" + cL.finishDate + "</startDate> \n";
                    content += "\t\t<startHour>" + cL.startHour + " " + cL.startHourAmOrPm + "</startHour> \n";
                    content += "\t\t<finishHour>" + cL.finishHour + " " + cL.finishHourAmOrPm + "</finishHour> \n";
                    content += "\t</Class>\n";
                }

                content += "</Classes>";

                writeContentXml(newFileAddedToPath, content);
                JOptionPane.showMessageDialog(this, "File was generated successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "There is nothing to print!");
            }
        } else if(typeOfAction == "Load" && typeOfFile == "json" && fileOrPath != null && holder) {
            if (fileOrPath != null) {
                JSONParser jp = new JSONParser();

                try {
                    boolean securityBelt = false;
                    FileReader r = new FileReader(fileOrPath);
                    Object obj = jp.parse(r);
                    JSONArray professorInJSON = (JSONArray) obj;

                    for (Object instanceObj : professorInJSON) {
                        JSONObject course = (JSONObject) instanceObj;

                        if (course.size()== 10) {
                            
                            String courseName = String.valueOf(course.get("courseName"));
                            String section = String.valueOf(course.get("section"));
                            String professorAssigned = String.valueOf(course.get("professorAssigned"));
                            String startDate = String.valueOf(course.get("startDate"));
                            String finishDate = String.valueOf(course.get("finishDate"));
                            String startHourAmOrPm = String.valueOf(course.get("startHourAmOrPm"));
                            String finishHourAmOrPm = String.valueOf(course.get("finishHourAmOrPm"));
                            int startHour = Integer.parseInt(String.valueOf(course.get("startHour")));
                            int finishHour = Integer.parseInt(String.valueOf(course.get("finishHour")));
                            String universityCenter = String.valueOf(course.get("university_center"));
                            createCoursePanel myMethod = new createCoursePanel();
                            String ID = myMethod.generateID(courseName, createCoursePanel.threeCharList);

                            com.mycompany.sistema_de_administracion.Class newClass = new com.mycompany.sistema_de_administracion.Class(ID, courseName, section, professorAssigned, startDate, finishDate, startHourAmOrPm, finishHourAmOrPm, startHour, finishHour, universityCenter);
                            com.mycompany.sistema_de_administracion.Sistema_De_Administracion.classList.add(newClass);
                        } else {
                            securityBelt = true;
                        }
                    }
                    if (securityBelt) {
                        JOptionPane.showMessageDialog(this, "Make sure the file format is the correct one");
                    } else {
                        JOptionPane.showMessageDialog(this, "The file has been uploaded successfully!");
                    }
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        } else if (typeOfAction == "Generate" && typeOfFile == "json") {
            if (!com.mycompany.sistema_de_administracion.Sistema_De_Administracion.classList.isEmpty()) {
                String fileName = JOptionPane.showInputDialog("Enter the file name");
                String newFileAddedToPath = fileOrPath + "/" + fileName + ".json";

                JSONArray jsonFile = new JSONArray();

                for (com.mycompany.sistema_de_administracion.Class cL : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.classList) {
                    JSONObject Class = new JSONObject();
                    Class.put("courseID", cL.ID);
                    Class.put("courseName", cL.courseName);
                    Class.put("section", cL.section);
                    Class.put("professorAssigned", cL.professorAssigned);
                    Class.put("startDate", cL.startDate);
                    Class.put("finishDate", cL.finishDate);
                    Class.put("startHour", cL.startHour + " " + cL.startHourAmOrPm);
                    Class.put("finishHour", cL.finishHour + " " + cL.finishHourAmOrPm);
                    
                    jsonFile.add(Class);
                }
                
                System.out.println(jsonFile);

                try {
                    FileWriter fileW = new FileWriter(newFileAddedToPath);
                    fileW.write(jsonFile.toJSONString());
                    fileW.flush();
                } catch (Exception e) {

                }
                JOptionPane.showMessageDialog(this, "File was generated successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "There is no information to print");
            }
        } else if(typeOfAction == "Assignment" && holder) {
            if (!com.mycompany.sistema_de_administracion.Sistema_De_Administracion.classList.isEmpty() && !com.mycompany.sistema_de_administracion.Sistema_De_Administracion.studentList.isEmpty()) {
                readFileAssignment(fileOrPath);
            } else {
                JOptionPane.showMessageDialog(this, "No students or courses to assign to");
            }
        }
    }//GEN-LAST:event_performActionBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel actionLabel;
    javax.swing.JPanel basement;
    javax.swing.JFileChooser fileChooser;
    javax.swing.JButton performActionBtn;
    javax.swing.JLabel professorLabel;
    javax.swing.JComboBox<String> typeOfActionCombo;
    javax.swing.JComboBox<String> typeOfFileCombo;
    javax.swing.JLabel typeOfFileLabel;
    // End of variables declaration//GEN-END:variables

    private boolean readCSVFile(String path) {
        
        boolean holder = false;
        int itemsAdded = 0;
        
        try {
            File currentFile = new File(path);
            FileReader newFileReader = new FileReader(currentFile);
            BufferedReader br = new BufferedReader(newFileReader);
            
            String line;
            while((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 10) {
                    
                    createCoursePanel myMethod = new createCoursePanel();
                    String ID = myMethod.generateID(data[0], createCoursePanel.threeCharList);
                    
                    com.mycompany.sistema_de_administracion.Class newClass = new com.mycompany.sistema_de_administracion.Class(ID, data[0], data[1], data[2], data[3], data[4], data[5], data[6], Integer.parseInt(data[7]), Integer.parseInt(data[8]), data[9]);
                    com.mycompany.sistema_de_administracion.Sistema_De_Administracion.classList.add(newClass);
                    itemsAdded++;
                } else {
                    JOptionPane.showMessageDialog(this, "Make sure the file you are trying to upload has the correct format!");
                    break;
                }
            }
            
            if (line == null && itemsAdded != 0) holder = true;
            
            newFileReader.close();
            br.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Make sure the file you are trying to upload is the correct format!");
        }
        
        return holder;
    }
    
    private void readFileAssignment(String path) {
        
        ArrayList<String> studentsIDsNotFound = new ArrayList<>(); 
        ArrayList<String> classesIDsNotFound = new ArrayList<>();
        int assignmentsMadeSuccessfully = 0;
        int assignMentsNotMade = 0;
        int fileLinesCounter = 0;
        
        try {
            File currentFile = new File(path);
            FileReader newFileReader = new FileReader(currentFile);
            BufferedReader br = new BufferedReader(newFileReader);
            
            String line;
            while((line = br.readLine()) != null) {
                fileLinesCounter++;
                
                int indexOfHashTag = line.indexOf("#");
                
                String studentID = line.substring(0, indexOfHashTag);
                String courseID = line.substring((indexOfHashTag + 1), line.length());
                
                com.mycompany.sistema_de_administracion.student studentFound = null;
                com.mycompany.sistema_de_administracion.Class classFound = null;
                
                for (com.mycompany.sistema_de_administracion.student sT : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.studentList) {
                    if (sT.getStudentID().equals(studentID)) {
                        studentFound = sT;
                    }
                }
                
                for (com.mycompany.sistema_de_administracion.Class cL : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.classList) {
                    if (cL.ID.equals(courseID)) {
                        classFound = cL;
                    }
                }
                
                int[] negatives = {0, 0};
                
                if (studentFound != null && classFound != null) {
                    if (studentFound.coursesAssigned.size() <= 5 && classFound.studentAssignedList.size() <= 10) {
                        studentFound.coursesAssigned.add(classFound);
                        studentFound.coursesFinalNote.add(-1);
                        classFound.studentAssignedList.add(studentFound);
                        assignmentsMadeSuccessfully++;
                    } else {
                        assignMentsNotMade++;
                    }
                } else if(studentFound == null) {
                    studentsIDsNotFound.add(studentID);
                    negatives[0] = 1;
                } else if(classFound == null) {
                    classesIDsNotFound.add(courseID);
                    negatives[1] = 1;
                }
                
                if (negatives[0] == 1 || negatives[1] == 1) assignMentsNotMade++;
                
            }
            
            if (assignmentsMadeSuccessfully == fileLinesCounter) {
                JOptionPane.showMessageDialog(this, "All assignments were made successfull");
            } else {
                JOptionPane.showMessageDialog(this, assignmentsMadeSuccessfully + " were made successfully and " + assignMentsNotMade + " were not made succesfully");
            }
            
        } catch (Exception e) {
            
        }
    }
    
    private void readXMLFile(File path) {
        try {
            DocumentBuilderFactory dBF = DocumentBuilderFactory.newInstance();
            DocumentBuilder dB = dBF.newDocumentBuilder();
            Document doc = dB.parse(path);
            
            doc.getDocumentElement().normalize();
            NodeList nodes = doc.getElementsByTagName("Class");
            boolean passOrNot = nodes.getLength() == 0;
            
            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);
                
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) node;
                    
                    String courseName = e.getElementsByTagName("courseName").item(0).getTextContent();
                    String section = e.getElementsByTagName("section").item(0).getTextContent();
                    String professorAssigned = e.getElementsByTagName("professorAssigned").item(0).getTextContent();
                    String startDate = e.getElementsByTagName("startDate").item(0).getTextContent();
                    String finishDate = e.getElementsByTagName("finishDate").item(0).getTextContent();
                    String startHourAmOrPm = e.getElementsByTagName("startHourAmOrPm").item(0).getTextContent();
                    String finishHourAmOrPm = e.getElementsByTagName("finishHourAmOrPm").item(0).getTextContent();
                    int startHour = Integer.parseInt(e.getElementsByTagName("startHour").item(0).getTextContent());
                    int finishHour = Integer.parseInt(e.getElementsByTagName("finishHour").item(0).getTextContent());
                    String universityCenter = String.valueOf(e.getElementsByTagName("universityCenter").item(0).getTextContent());
                    
                    createCoursePanel myMethod = new createCoursePanel();
                    String ID = myMethod.generateID(courseName, createCoursePanel.threeCharList);
                    

                    com.mycompany.sistema_de_administracion.Class cL = new com.mycompany.sistema_de_administracion.Class(ID, courseName, section, professorAssigned, startDate, finishDate, startHourAmOrPm, finishHourAmOrPm, startHour, finishHour, universityCenter);
                    com.mycompany.sistema_de_administracion.Sistema_De_Administracion.classList.add(cL);
                }
            }
            
            if (!passOrNot) {
                JOptionPane.showMessageDialog(this, "xml load has been succesfull!");
            } else {
                JOptionPane.showMessageDialog(this, "An error has ocurred, please try with a different file format");
            }
        } catch (Exception e) {
            
        } 
   }
    
    public String fileNameViceVersa(String name) {
        String viceVersaName = "";
        String[] tempArray = name.split("");
        for (int i = tempArray.length - 1; i >= 0 ; i--) {
            viceVersaName += tempArray[i];
        }
        
        String finalFormOfFormat = "";
        int indexOfDot = viceVersaName.indexOf(".");
        tempArray = viceVersaName.split("");
        
        for (int e = indexOfDot; e >= 0; e--) {
            finalFormOfFormat += tempArray[e];
        }
        
        return finalFormOfFormat;
    }
 
    public void writeContentXml(String fileName, String content) {
        try {
            FileWriter fw = new FileWriter(fileName);
            PrintWriter pw = new PrintWriter(fw);
            pw.write(content);
            pw.close();
            fw.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "An error has ocurred");
        }
    }
   

}