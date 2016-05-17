package hms;

import java.awt.Color;
import org.apache.log4j.*;
/**
 *
 * @author HP
 */
public class AddRecordsGUI extends javax.swing.JPanel {
    
    private static final Logger logger = Logger.getLogger(AddRecordsGUI.class.getName());
    
    private static boolean select;
    private String docId;
    private String docName;
    
    public AddRecordsGUI(String docName , String docId) {
        initComponents();
        
        if (logger.isInfoEnabled()){
            logger.info("AddRecordsGUI created.");
        }
        
        this.docId = docId;
        this.docName = docName;
        docNicText.setText(docId);
        docNameLbl.setText(docName);
        ConnectionHandler.updateConnection(wifiButton);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addtBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        wifiButton = new javax.swing.JButton();
        paNameLbl = new javax.swing.JLabel();
        docIdLbl = new javax.swing.JLabel();
        paIdLbl = new javax.swing.JLabel();
        medLabel = new javax.swing.JLabel();
        desLbl = new javax.swing.JLabel();
        dateLbl = new javax.swing.JLabel();
        docNicText = new javax.swing.JTextField();
        paNicText = new javax.swing.JTextField();
        paNameText = new javax.swing.JTextField();
        DateChooser = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        desText = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        medText = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        docNameLbl = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 141, 243));

        jLabel1.setFont(new java.awt.Font("Buxton Sketch", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 39, 97));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD PATIENT");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Buxton Sketch", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 39, 97));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RECORDS");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/record.png"))); // NOI18N

        addtBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/reg1.png"))); // NOI18N
        addtBtn.setBorder(null);
        addtBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addtBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addtBtnMouseExited(evt);
            }
        });
        addtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(addtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(addtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/backButton.png"))); // NOI18N
        backBtn.setBorder(null);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        wifiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/Wifi-Error.png"))); // NOI18N
        wifiButton.setBorder(null);

        paNameLbl.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        paNameLbl.setText("NAME OF PATIENT");

        docIdLbl.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        docIdLbl.setText("NIC OF DOCTOR");

        paIdLbl.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        paIdLbl.setText("NIC OF PATIENT");

        medLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        medLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        medLabel.setText(" MEDICINE");

        desLbl.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        desLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desLbl.setText("DESCRIPTION");

        dateLbl.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        dateLbl.setText("DATE");

        docNicText.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        docNicText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                docNicTextMouseEntered(evt);
            }
        });

        paNicText.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        paNicText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paNicTextMouseEntered(evt);
            }
        });

        paNameText.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        paNameText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paNameTextMouseEntered(evt);
            }
        });

        desText.setColumns(20);
        desText.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        desText.setRows(5);
        desText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                desTextMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(desText);

        medText.setColumns(20);
        medText.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        medText.setRows(5);
        medText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                medTextMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(medText);

        jPanel5.setBackground(new java.awt.Color(102, 141, 243));

        jPanel6.setBackground(new java.awt.Color(102, 97, 225));

        docNameLbl.setFont(new java.awt.Font("Buxton Sketch", 0, 30)); // NOI18N
        docNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        docNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addComponent(docNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(docNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(dateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                            .addComponent(paNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(paNameText)
                                            .addComponent(DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(medLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(docIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(paIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(docNicText)
                                            .addComponent(paNicText, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))
                                    .addComponent(desLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1))
                                .addGap(68, 68, 68))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(wifiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(56, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wifiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paNicText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(docNicText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(docIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(desLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(82, 82, 82)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(57, 57, 57))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        if(evt.getSource()== backBtn){
            HospitalManagementSystem.update(this,new DoctorInterface(docName,docId));
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void addtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtBtnActionPerformed
        boolean isok = true;
        AddRecords addObj = new AddRecords();
        if (evt.getSource() == addtBtn) {
            select = true;
            ConnectionHandler.updateConnection(wifiButton);
            if (docNicText.getText().equals("")) {
                docNicText.setBackground(Color.LIGHT_GRAY);
                isok = false;
            }
            if (paNicText.getText().equals("")) {
                paNicText.setBackground(Color.LIGHT_GRAY);
                isok = false;
            }
            if (paNameText.getText().equals("")) {
                paNameText.setBackground(Color.LIGHT_GRAY);
                isok = false;
            }
            if (desText.getText().equals("")) {
                desText.setBackground(Color.LIGHT_GRAY);
                isok = false;
            }
            if (medText.getText().equals("")) {
                medText.setBackground(Color.LIGHT_GRAY);
                isok = false;
            }
            if (DateChooser.getDate() == null) {
                isok = false;
            }
            if(!addObj.validateID(docNicText, docNicText.getText())|| !addObj.validateID(paNicText, paNicText.getText())){
                isok = false;
            }
            if (isok) {
                addObj.addRecords(
                        paNameText.getText(),
                        paNicText.getText().toLowerCase(),
                        docNicText.getText().toLowerCase(),
                        DateChooser.getDate(),
                        medText.getText(),
                        desText.getText()
                );
            }
        }
    }//GEN-LAST:event_addtBtnActionPerformed

    private void addtBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addtBtnMouseExited
        if(evt.getSource()== addtBtn){
            addtBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/register2.png")));
        }
    }//GEN-LAST:event_addtBtnMouseExited

    private void addtBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addtBtnMouseEntered
        if(evt.getSource()== addtBtn){
            addtBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/register1.png")));
        }
    }//GEN-LAST:event_addtBtnMouseEntered

    private void desTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desTextMouseEntered
        if(evt.getSource()== desText){
            desText.setBackground(Color.white);
        }
    }//GEN-LAST:event_desTextMouseEntered

    private void medTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medTextMouseEntered
        if(evt.getSource()== medText){
            medText.setBackground(Color.white);
        }
    }//GEN-LAST:event_medTextMouseEntered

    private void paNameTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paNameTextMouseEntered
       if(evt.getSource()== paNameText){
            paNameText.setBackground(Color.white);
        }
    }//GEN-LAST:event_paNameTextMouseEntered

    private void paNicTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paNicTextMouseEntered
        if(evt.getSource()== paNicText && select){
            if(paNicText.getForeground().equals(Color.red)){
                paNicText.setText("");
                paNicText.setForeground(Color.BLACK);
            }else{
                paNicText.setBackground(Color.white);
            }
        }
    }//GEN-LAST:event_paNicTextMouseEntered

    private void docNicTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docNicTextMouseEntered
        if(evt.getSource()== docNicText && select){
            if(docNicText.getForeground().equals(Color.red)){
                docNicText.setText("");
                docNicText.setForeground(Color.BLACK);
            }else{
                docNicText.setBackground(Color.white);
            }
        }
    }//GEN-LAST:event_docNicTextMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JButton addtBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JLabel desLbl;
    private javax.swing.JTextArea desText;
    private javax.swing.JLabel docIdLbl;
    private javax.swing.JLabel docNameLbl;
    private javax.swing.JTextField docNicText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel medLabel;
    private javax.swing.JTextArea medText;
    private javax.swing.JLabel paIdLbl;
    private javax.swing.JLabel paNameLbl;
    private javax.swing.JTextField paNameText;
    private javax.swing.JTextField paNicText;
    private javax.swing.JButton wifiButton;
    // End of variables declaration//GEN-END:variables
}
