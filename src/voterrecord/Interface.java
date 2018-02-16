/*
 * Interface.java
 *
 * Created on January 28, 2008, 6:34 PM
 */

package voterrecord;

/**
 *
 * @author  salamsm
 */
public class Interface extends javax.swing.JFrame {
    
    /** Creates new form Interface */
    public Interface() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileMenu_changePassword = new javax.swing.JMenuItem();
        fileMenu_exit = new javax.swing.JMenuItem();
        searchMenu = new javax.swing.JMenu();
        searchMenu_searchVoterRecord = new javax.swing.JMenuItem();
        searchMenu_advanceSearch = new javax.swing.JMenuItem();
        searchMenu_searchAggregateRecords = new javax.swing.JMenuItem();
        menuBatchProcessing = new javax.swing.JMenu();
        dataTransfer = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        helpMenu_help = new javax.swing.JMenuItem();
        helpMenu_about = new javax.swing.JMenuItem();
        helpMenu_license_agreement = new javax.swing.JMenuItem();
        helpMenu_environmentSettings = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.white);
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 100));
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("VRMS");

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12));
        jLabel2.setText("A Comprehensive Solution for Maintaining & Handling Voters Record");

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12));
        jLabel3.setText("Copyright ( C ) - 2007-2008  ISS: Intelligent Softwares Solutions");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12));
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("DEVELOPED FOR : PAKISTAN PEOPLES PARTY PS-96");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\vrms\\images\\FLAG2.jpg"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(706, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(393, 393, 393)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(424, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        fileMenu.setText("File");
        fileMenu.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11));
        fileMenu_changePassword.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11));
        fileMenu_changePassword.setText("Change Password");
        fileMenu.add(fileMenu_changePassword);

        fileMenu_exit.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11));
        fileMenu_exit.setText("Exit");
        fileMenu.add(fileMenu_exit);

        jMenuBar1.add(fileMenu);

        searchMenu.setText("Search");
        searchMenu.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11));
        searchMenu_searchVoterRecord.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11));
        searchMenu_searchVoterRecord.setText("Search Voter");
        searchMenu_searchVoterRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMenu_searchVoterRecordActionPerformed(evt);
            }
        });

        searchMenu.add(searchMenu_searchVoterRecord);

        searchMenu_advanceSearch.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11));
        searchMenu_advanceSearch.setText("Advance Search");
        searchMenu_advanceSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMenu_advanceSearchActionPerformed(evt);
            }
        });

        searchMenu.add(searchMenu_advanceSearch);

        searchMenu_searchAggregateRecords.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11));
        searchMenu_searchAggregateRecords.setText("Aggregate Search");
        searchMenu_searchAggregateRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMenu_searchAggregateRecordsActionPerformed(evt);
            }
        });

        searchMenu.add(searchMenu_searchAggregateRecords);

        jMenuBar1.add(searchMenu);

        menuBatchProcessing.setText("Batch Processing");
        menuBatchProcessing.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11));
        dataTransfer.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11));
        dataTransfer.setText("Data Transfer");
        dataTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataTransferActionPerformed(evt);
            }
        });

        menuBatchProcessing.add(dataTransfer);

        jMenuBar1.add(menuBatchProcessing);

        helpMenu.setText("Help");
        helpMenu.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11));
        helpMenu_help.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11));
        helpMenu_help.setText("Help");
        helpMenu.add(helpMenu_help);

        helpMenu_about.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11));
        helpMenu_about.setText("About This Program");
        helpMenu.add(helpMenu_about);

        helpMenu_license_agreement.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11));
        helpMenu_license_agreement.setText("License Agreement");
        helpMenu.add(helpMenu_license_agreement);

        helpMenu_environmentSettings.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11));
        helpMenu_environmentSettings.setText("Environment Settings");
        helpMenu.add(helpMenu_environmentSettings);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1024)/2, (screenSize.height-750)/2, 1024, 750);
    }// </editor-fold>//GEN-END:initComponents

    private void searchMenu_advanceSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMenu_advanceSearchActionPerformed
// TODO add your handling code here:
        AdvanceSearch av = new AdvanceSearch();
        av.setVisible(true);
    }//GEN-LAST:event_searchMenu_advanceSearchActionPerformed

    private void dataTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataTransferActionPerformed
// TODO add your handling code here:
        BatchUpload bu = new BatchUpload();
        bu.setVisible(true);
    }//GEN-LAST:event_dataTransferActionPerformed

    private void searchMenu_searchAggregateRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMenu_searchAggregateRecordsActionPerformed
// TODO add your handling code here:
        AggregateSearch as = new AggregateSearch();
        as.setVisible(true);
    }//GEN-LAST:event_searchMenu_searchAggregateRecordsActionPerformed

    private void searchMenu_searchVoterRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMenu_searchVoterRecordActionPerformed
// TODO add your handling code here:
        SearchOperation so = new SearchOperation();
        so.setVisible(true);
    }//GEN-LAST:event_searchMenu_searchVoterRecordActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem dataTransfer;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem fileMenu_changePassword;
    private javax.swing.JMenuItem fileMenu_exit;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem helpMenu_about;
    private javax.swing.JMenuItem helpMenu_environmentSettings;
    private javax.swing.JMenuItem helpMenu_help;
    private javax.swing.JMenuItem helpMenu_license_agreement;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu menuBatchProcessing;
    private javax.swing.JMenu searchMenu;
    private javax.swing.JMenuItem searchMenu_advanceSearch;
    private javax.swing.JMenuItem searchMenu_searchAggregateRecords;
    private javax.swing.JMenuItem searchMenu_searchVoterRecord;
    // End of variables declaration//GEN-END:variables
    
}
