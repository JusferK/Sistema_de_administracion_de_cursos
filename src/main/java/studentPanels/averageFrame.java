package studentPanels;
public class averageFrame extends javax.swing.JFrame {

    
    public averageFrame(com.mycompany.sistema_de_administracion.student info) {
        
        initComponents();
        
        notesComplete(info);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basement2 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        averageOutput = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        informativeLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basement2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setBackground(new java.awt.Color(3, 27, 59));
        exitBtn.setFont(new java.awt.Font("Assistant", 0, 11)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("Exit");
        exitBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        basement2.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 100, 50));

        averageOutput.setBackground(new java.awt.Color(71, 108, 166));
        averageOutput.setFont(new java.awt.Font("Assistant", 0, 11)); // NOI18N
        averageOutput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        averageOutput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                averageOutputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                averageOutputFocusLost(evt);
            }
        });
        averageOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                averageOutputActionPerformed(evt);
            }
        });
        basement2.add(averageOutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 330, 50));

        title.setFont(new java.awt.Font("Assistant ExtraBold", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Average Query");
        basement2.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 250, 40));

        informativeLabel.setForeground(new java.awt.Color(255, 255, 255));
        informativeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        basement2.add(informativeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 530, 30));

        backgroundLabel.setBackground(new java.awt.Color(0, 0, 0));
        backgroundLabel.setIcon(new javax.swing.ImageIcon("/home/justine/NetBeansProjects/Sistema_De_Administracion/src/main/java/images/background-login.jpg")); // NOI18N
        basement2.add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basement2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBtnMouseClicked

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void averageOutputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_averageOutputFocusGained

    }//GEN-LAST:event_averageOutputFocusGained

    private void averageOutputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_averageOutputFocusLost

    }//GEN-LAST:event_averageOutputFocusLost

    private void averageOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_averageOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_averageOutputActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTextField averageOutput;
    javax.swing.JLabel backgroundLabel;
    javax.swing.JPanel basement2;
    javax.swing.JButton exitBtn;
    javax.swing.JLabel informativeLabel;
    javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    public void notesComplete(com.mycompany.sistema_de_administracion.student info) {
        
        averageOutput.setEnabled(false);
        
        int sum = 0;
        int enteredNoteCounter = 0;
        
        for (int i = 0; i < info.coursesFinalNote.size(); i++) {
            if (info.coursesFinalNote.get(i) == -1) {
            } else if(info.coursesFinalNote.get(i) > -1) {
                sum += info.coursesFinalNote.get(i);
                enteredNoteCounter++;
            }
        }
        
        if (enteredNoteCounter != 0 && enteredNoteCounter < 5) {
            informativeLabel.setText("NOTE: There is still " + (5 - enteredNoteCounter) + " notes left to be entered.");
        } else if(enteredNoteCounter == 0) {
            informativeLabel.setText("NOTE: You should expect your professors to entered you notes soon.");
        } else if(enteredNoteCounter == 5) {
            informativeLabel.setText("NOTE: All notes were entered, this is your final note.");
        }
        
        double average = sum / 5;
        averageOutput.setText(String.valueOf(String.format("%." + 2 + "f", average)));
    }
    
}
