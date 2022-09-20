/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Customer;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author mumu2015
 */
public class PartnerFinance extends javax.swing.JFrame {
public Connection connection;
public PreparedStatement pst;


    /** Creates new form PartnerFinance */
    public PartnerFinance() {
        initComponents();
    }
    
    public void close(){
        
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextPartnerFine = new javax.swing.JTextField();
        jBtnBACK = new javax.swing.JButton();
        jBtnDELETE = new javax.swing.JButton();
        jTextPaidToPartner = new javax.swing.JTextField();
        jBtnUPDATE = new javax.swing.JButton();
        jBtnSAVE = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextPReceiveable = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextPartnerID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextPartnerDue = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextPFinSerialNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jBtnPRINT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePartnerFinance = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextPartnerFine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPartnerFineActionPerformed(evt);
            }
        });

        jBtnBACK.setBackground(new java.awt.Color(255, 153, 153));
        jBtnBACK.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnBACK.setText("BACK");
        jBtnBACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBACKActionPerformed(evt);
            }
        });

        jBtnDELETE.setBackground(new java.awt.Color(255, 153, 153));
        jBtnDELETE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnDELETE.setText("DELETE");
        jBtnDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDELETEActionPerformed(evt);
            }
        });

        jBtnUPDATE.setBackground(new java.awt.Color(255, 153, 153));
        jBtnUPDATE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnUPDATE.setText("UPDATE");
        jBtnUPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUPDATEActionPerformed(evt);
            }
        });

        jBtnSAVE.setBackground(new java.awt.Color(255, 153, 153));
        jBtnSAVE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnSAVE.setText("SAVE");
        jBtnSAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSAVEActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("FINANCE OF PARTNER");

        jTextPReceiveable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPReceiveableActionPerformed(evt);
            }
        });

        jLabel2.setText("Serial No*");

        jLabel9.setText("Partner ID*");

        jTextPartnerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPartnerIDActionPerformed(evt);
            }
        });

        jLabel5.setText("Due*");

        jLabel3.setText("Receiveable Amount*");

        jTextPartnerDue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPartnerDueActionPerformed(evt);
            }
        });

        jLabel6.setText("Paid*");

        jLabel8.setText("Fine");

        jBtnPRINT.setBackground(new java.awt.Color(255, 153, 153));
        jBtnPRINT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnPRINT.setText("PRINT");
        jBtnPRINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPRINTActionPerformed(evt);
            }
        });

        jTablePartnerFinance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial No", "Partner ID", "Receiveable Amount", "Paid", "Due", "Fine"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePartnerFinance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePartnerFinanceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePartnerFinance);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("Search Here");

        jTextFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchActionPerformed(evt);
            }
        });
        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("* Required Fields");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jBtnSAVE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnUPDATE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnDELETE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnPRINT))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextPartnerFine, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextPartnerDue, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextPaidToPartner, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPReceiveable, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPartnerID, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPFinSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                        .addGap(19, 19, 19))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jBtnBACK))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextPFinSerialNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextPartnerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextPReceiveable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextPaidToPartner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextPartnerDue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextPartnerFine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnUPDATE)
                    .addComponent(jBtnDELETE)
                    .addComponent(jBtnPRINT)
                    .addComponent(jBtnSAVE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBtnBACK)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnBACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBACKActionPerformed
        // TODO add your handling code here:

        close();
        HomePage hp = new HomePage() ;
        hp.setVisible(true);
    }//GEN-LAST:event_jBtnBACKActionPerformed

    private void jBtnPRINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPRINTActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=PickARide;selectMethod=cursor", "sa", "123456");

            //System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
            .executeQuery("SELECT * FROM PARTNER_FINANCE");

            while (resultSet.next()) {
                String PFinSerialNo = resultSet.getString("PFinSerialNo");
                String PartnerId = resultSet.getString("PartnerId");
                String P_Receiveable = resultSet.getString("P_Receiveable");
                String PaidToPartner = resultSet.getString("PaidToPartner");
                String PartnerDue = resultSet.getString("PartnerDue");
                String ParnterFine = resultSet.getString("ParnterFine");

                String tbData[]={PFinSerialNo, PartnerId,P_Receiveable,PaidToPartner,
                    PartnerDue,ParnterFine};

                DefaultTableModel tblModel = (DefaultTableModel)jTablePartnerFinance.getModel();
                tblModel.addRow(tbData);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jBtnPRINTActionPerformed

    private void jTablePartnerFinanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePartnerFinanceMouseClicked
        // TODO add your handling code here:

        DefaultTableModel tblModel = (DefaultTableModel)jTablePartnerFinance.getModel();

        //when row is selected, set data to textfield
        String PFinSerialNo = tblModel.getValueAt(jTablePartnerFinance.getSelectedRow(),0).toString();
        String PartnerId = tblModel.getValueAt(jTablePartnerFinance.getSelectedRow(),1).toString();
        String P_Receiveable = tblModel.getValueAt(jTablePartnerFinance.getSelectedRow(),2).toString();
        String PaidToPartner = tblModel.getValueAt(jTablePartnerFinance.getSelectedRow(),3).toString();
        String PartnerDue = tblModel.getValueAt(jTablePartnerFinance.getSelectedRow(),4).toString();
        String ParnterFine = tblModel.getValueAt(jTablePartnerFinance.getSelectedRow(),5).toString();
        
        //set to textfield
        jTextPFinSerialNo.setText(PFinSerialNo);
        jTextPartnerID.setText(PartnerId);
        jTextPReceiveable.setText(P_Receiveable);
        jTextPaidToPartner.setText(PaidToPartner);
        jTextPartnerDue.setText(PartnerDue);
        jTextPartnerFine.setText(ParnterFine);
    }//GEN-LAST:event_jTablePartnerFinanceMouseClicked

    private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyReleased
        // TODO add your handling code here:
        
        DefaultTableModel table = (DefaultTableModel)jTablePartnerFinance.getModel();
        String search = jTextFieldSearch.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        jTablePartnerFinance.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_jTextFieldSearchKeyReleased

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchActionPerformed

    private void jBtnDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDELETEActionPerformed
        // TODO add your handling code here:

        DefaultTableModel tblModel = (DefaultTableModel)jTablePartnerFinance.getModel();

        //delete row
        if(jTablePartnerFinance.getSelectedRowCount()==1){
            try
            {
                String query = "delete from PARTNER_FINANCE where PFinSerialNo=?";

                PreparedStatement pst = connection.prepareStatement(query);

                pst.setString(1,jTextPFinSerialNo.getText());

                pst.executeUpdate();
                tblModel.removeRow(jTablePartnerFinance.getSelectedRow());
                JOptionPane.showMessageDialog (this,"Data has been deleted");

            } catch(Exception e){
                JOptionPane.showMessageDialog (this, e.getMessage());
            }
        }
        else {

            if(jTablePartnerFinance.getRowCount()==0)
            JOptionPane.showMessageDialog (this, "Table is empty");

            else
            JOptionPane.showMessageDialog (this, "Please select single row");
        }
        jTextPFinSerialNo.setText("");
        jTextPartnerID.setText("");
        jTextPReceiveable.setText("");
        jTextPaidToPartner.setText("");
        jTextPartnerDue.setText("");
        jTextPartnerFine.setText("");
    }//GEN-LAST:event_jBtnDELETEActionPerformed

    private void jBtnUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUPDATEActionPerformed
        // TODO add your handling code here:

        DefaultTableModel tblModel = (DefaultTableModel)jTablePartnerFinance.getModel();

        if(jTablePartnerFinance.getSelectedRowCount()==1){
            String PFinSerialNo = jTextPFinSerialNo.getText();
            String PartnerID = jTextPartnerID.getText();
            String PReceiveable = jTextPReceiveable.getText();
            String PaidToPartner = jTextPaidToPartner.getText();
            String PartnerDue = jTextPartnerDue.getText();
            String PartnerFine = jTextPartnerFine.getText();

            try
            {

                String query = "update PARTNER_FINANCE set PartnerId=?,P_Receiveable=?,PaidToPartner=?,PartnerDue=?,ParnterFine=? where PFinSerialNo = ?";

                PreparedStatement pst = connection.prepareStatement(query);

                pst.setString(1,jTextPartnerID.getText());
                pst.setString(3,jTextPReceiveable.getText());
                pst.setString(4,jTextPaidToPartner.getText());
                pst.setString(5,jTextPartnerDue.getText());
                pst.setString(6,jTextPartnerFine.getText());
                pst.setString(7,jTextPFinSerialNo.getText());

                pst.executeUpdate();
                //set updated value to table row
                tblModel.setValueAt(PFinSerialNo,jTablePartnerFinance.getSelectedRow(),0);
                tblModel.setValueAt(PartnerID,jTablePartnerFinance.getSelectedRow(),1);
                tblModel.setValueAt(PReceiveable,jTablePartnerFinance.getSelectedRow(),2);
                tblModel.setValueAt(PaidToPartner,jTablePartnerFinance.getSelectedRow(),3);
                tblModel.setValueAt(PartnerDue,jTablePartnerFinance.getSelectedRow(),4);
                tblModel.setValueAt(PartnerFine,jTablePartnerFinance.getSelectedRow(),5);

                JOptionPane.showMessageDialog (this,"Update is successful");

                jTextPFinSerialNo.setText("");
                jTextPartnerID.setText("");
                jTextPReceiveable.setText("");
                jTextPaidToPartner.setText("");
                jTextPartnerDue.setText("");
                jTextPartnerFine.setText("");

            } catch(Exception e){
                JOptionPane.showMessageDialog (this, e.getMessage());
            }

            //update message
            //JOptionPane.showMessageDialog (this, "Update is successful");
        }
        else{
            if(jTablePartnerFinance.getRowCount()==0)
            JOptionPane.showMessageDialog (this, "Table is empty");
            else
            JOptionPane.showMessageDialog (this, "Please select single row");

        }
    }//GEN-LAST:event_jBtnUPDATEActionPerformed

    private void jBtnSAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSAVEActionPerformed
        // TODO add your handling code here:
        if(jTextPFinSerialNo.getText().equals("")||jTextPartnerID.getText().equals("")||
            jTextPReceiveable.getText().equals("")
            ||jTextPaidToPartner.getText().equals("")||jTextPartnerDue.getText().equals(""))
        {

            JOptionPane.showMessageDialog (this, "Please enter required fields");
        }
        else{
            try
            {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=PickARide;selectMethod=cursor", "sa", "123456");

                String query = "insert into PARTNER_FINANCE (PFinSerialNo,PartnerId,FinSerialNo,P_Receiveable,PaidToPartner,PartnerDue,ParnterFine)values (?, ?, ?, ?, ? ,? ,?)";

                PreparedStatement pst = connection.prepareStatement(query);

                pst.setString(1,jTextPFinSerialNo.getText());
                pst.setString(2,jTextPartnerID.getText());    
                pst.setString(4,jTextPReceiveable.getText());
                pst.setString(5,jTextPaidToPartner.getText());
                pst.setString(6,jTextPartnerDue.getText());
                pst.setString(7,jTextPartnerFine.getText());

                pst.executeUpdate();

                String data[]= {jTextPFinSerialNo.getText(),jTextPartnerID.getText(),
                    jTextPReceiveable.getText(),
                    jTextPaidToPartner.getText(),jTextPartnerDue.getText(),jTextPartnerFine.getText()};

                DefaultTableModel tblModel = (DefaultTableModel)jTablePartnerFinance.getModel();
                tblModel.addRow(data);// adds row

                JOptionPane.showMessageDialog (this,"Information added");

                jTextPFinSerialNo.setText("");
                jTextPartnerID.setText("");
                jTextPReceiveable.setText("");
                jTextPaidToPartner.setText("");
                jTextPartnerDue.setText("");
                jTextPartnerFine.setText("");

            } catch(Exception e){
                JOptionPane.showMessageDialog (this, e.getMessage());
            }
        }
    }//GEN-LAST:event_jBtnSAVEActionPerformed

    private void jTextPartnerDueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPartnerDueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPartnerDueActionPerformed

    private void jTextPartnerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPartnerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPartnerIDActionPerformed

    private void jTextPReceiveableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPReceiveableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPReceiveableActionPerformed

    private void jTextPartnerFineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPartnerFineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPartnerFineActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PartnerFinance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartnerFinance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartnerFinance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartnerFinance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartnerFinance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBACK;
    private javax.swing.JButton jBtnDELETE;
    private javax.swing.JButton jBtnPRINT;
    private javax.swing.JButton jBtnSAVE;
    private javax.swing.JButton jBtnUPDATE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePartnerFinance;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTextField jTextPFinSerialNo;
    private javax.swing.JTextField jTextPReceiveable;
    private javax.swing.JTextField jTextPaidToPartner;
    private javax.swing.JTextField jTextPartnerDue;
    private javax.swing.JTextField jTextPartnerFine;
    private javax.swing.JTextField jTextPartnerID;
    // End of variables declaration//GEN-END:variables

}
