package adminPanels;

import com.opencsv.CSVWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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

public class massiveLoadsStudentP extends javax.swing.JPanel {
    
    int counter = 0;
    public massiveLoadsStudentP() {
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
        professorLabel.setText("Massive student load/generate");
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

        typeOfActionCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Load", "Generate"}));
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
            .addComponent(basement, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
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
            } case "Generate" -> {
                performActionBtn.setText(answer);
                typeOfFileLabel.setText("What type of file you want to " + answer + "?");
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                if (counter == 1) JOptionPane.showMessageDialog(this, "Please now select where you want to save it from your files directories");
                if(counter == 2) counter = 0;
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
        String[] formats = {".csv", ".xml", ".json"};
        boolean holder = false;

        try {
            fileOrPath = fileChooser.getSelectedFile().toString();

            if (typeOfAction.equalsIgnoreCase("load")) {

                String formatFromFileChoseen = fileNameViceVersa(fileOrPath);

                for (int i = 0; i < formats.length; i++) {
                    if (fileOrPath.contains(formats[i]) && formatFromFileChoseen.equals(cloneOfTypeOfFile)) {
                        holder = true;
                    }
                }

                if (!holder) JOptionPane.showMessageDialog(this, "The format you choose is " + cloneOfTypeOfFile + " and you are trying to upload a " + formatFromFileChoseen);
            }

        } catch(Exception e) {
            if (typeOfAction.equals("Load")) JOptionPane.showMessageDialog(this, "Please, select a file");
            if (typeOfAction.equals("Generate")) JOptionPane.showMessageDialog(this, "Please, select a path");
        }

        if (typeOfAction == "Load" && typeOfFile == "csv" && fileOrPath != null && holder) {
            boolean mySecurityBelt = readCSVFile(fileOrPath);
            if (mySecurityBelt) JOptionPane.showMessageDialog(this, "Load has been succesfull!");
        } else if(typeOfAction == "Generate" && typeOfFile == "csv" && fileOrPath != null) {
            if (!com.mycompany.sistema_de_administracion.Sistema_De_Administracion.studentList.isEmpty()) {
                String inputName = JOptionPane.showInputDialog("Enter the file name");
                String fileName = fileOrPath + "/" + inputName + ".csv";

                try{
                    CSVWriter writer = new CSVWriter(new FileWriter(fileName));
                    String[] header = {"student name", "student last name", "student ID", "password"};
                    writer.writeNext(header);
                    for (com.mycompany.sistema_de_administracion.student sT : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.studentList) {
                        String[] studentInfo = {sT.getStudentName(), sT.getStudentLastName(), sT.getStudentID(), sT.password};
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
            if (!com.mycompany.sistema_de_administracion.Sistema_De_Administracion.studentList.isEmpty()) {
                String fileName = JOptionPane.showInputDialog("Enter the file name");
                String newFileAddedToPath = fileOrPath + "/" + fileName + ".xml";

                String content = "<students> \n";

                for (com.mycompany.sistema_de_administracion.student sT : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.studentList) {
                    content += "\t<student>\n";
                    content += "\t\t<studentName>" + sT.getStudentName() + "</studentName> \n";
                    content += "\t\t<studentLastName>" + sT.getStudentLastName() + "</studentLastName> \n";
                    content += "\t\t<studentID>" + sT.getStudentID() + "</studentID> \n";
                    content += "\t\t<password>" + sT.password + "</password> \n";
                    content += "\t</student>\n";
                }

                content += "</students>";

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
                        JSONObject student = (JSONObject) instanceObj;

                        if (student.size() == 4) {
                            String studentName = (String) student.get("studentName");
                            String studentLastName = (String) student.get("studentLastName");
                            String studentID = (String) student.get("studentID");
                            String studentPassword = (String) student.get("password");

                            com.mycompany.sistema_de_administracion.student newStudent = new com.mycompany.sistema_de_administracion.student(studentName, studentLastName, studentID, studentPassword);
                            com.mycompany.sistema_de_administracion.Sistema_De_Administracion.studentList.add(newStudent);
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

                }
            }
        } else if (typeOfAction == "Generate" && typeOfFile == "json") {
            if (!com.mycompany.sistema_de_administracion.Sistema_De_Administracion.studentList.isEmpty()) {
                String fileName = JOptionPane.showInputDialog("Enter the file name");
                String newFileAddedToPath = fileOrPath + "/" + fileName + ".json";

                JSONArray jsonFile = new JSONArray();

                for (com.mycompany.sistema_de_administracion.student sT : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.studentList) {
                    JSONObject student = new JSONObject();
                    student.put("studentName", sT.getStudentName());
                    student.put("studentLastName", sT.getStudentLastName());
                    student.put("studentID", sT.getStudentID());
                    student.put("password", sT.password);
                    jsonFile.add(student);
                }

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
                if (data.length == 4) {
                    com.mycompany.sistema_de_administracion.student newStudent = new com.mycompany.sistema_de_administracion.student(data[0], data[1], data[2], data[3]);
                    com.mycompany.sistema_de_administracion.Sistema_De_Administracion.studentList.add(newStudent);
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
    
    private void readXMLFile(File path) {
        try {
            DocumentBuilderFactory dBF = DocumentBuilderFactory.newInstance();
            DocumentBuilder dB = dBF.newDocumentBuilder();
            Document doc = dB.parse(path);
            
            doc.getDocumentElement().normalize();
            NodeList nodes = doc.getElementsByTagName("student");
            boolean passOrNot = nodes.getLength() == 0;
            
            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);
                
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) node;
                    String name = e.getElementsByTagName("studentName").item(0).getTextContent();
                    String lastName = e.getElementsByTagName("studentLastName").item(0).getTextContent();
                    String user = e.getElementsByTagName("studentID").item(0).getTextContent();
                    String password = e.getElementsByTagName("password").item(0).getTextContent();

                    com.mycompany.sistema_de_administracion.student sT = new com.mycompany.sistema_de_administracion.student(name, lastName, user, password);
                    com.mycompany.sistema_de_administracion.Sistema_De_Administracion.studentList.add(sT);
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