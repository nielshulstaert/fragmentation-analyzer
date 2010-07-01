package no.uib.fragmentation_analyzer.gui;

import java.awt.event.KeyEvent;

/**
 * A simple dialog that lets the user provide the name of data set.
 *
 * @author Harald Barsnes
 */
public class DataSetNameDialog extends javax.swing.JDialog {

    private DataSource dataSourceDialog;

    /** 
     * Creates a new DataSetNameDialog.
     *
     * @param dataSourceDialog
     * @param modal
     */
    public DataSetNameDialog(DataSource dataSourceDialog, boolean modal) {
        super(dataSourceDialog, modal);

        this.dataSourceDialog = dataSourceDialog;

        initComponents();

        nameJTextField.requestFocus();

        setLocationRelativeTo(dataSourceDialog);
        setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancelJButton = new javax.swing.JButton();
        okJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Data Set Name");
        setResizable(false);

        cancelJButton.setText("Cancel");
        cancelJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelJButtonActionPerformed(evt);
            }
        });

        okJButton.setText("OK");
        okJButton.setEnabled(false);
        okJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okJButtonActionPerformed(evt);
            }
        });

        nameJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameJTextFieldKeyReleased(evt);
            }
        });

        jLabel2.setText("Please provide a name for the new data set:");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(nameJTextField)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .add(okJButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cancelJButton)
                .addContainerGap())
        );

        layout.linkSize(new java.awt.Component[] {cancelJButton, okJButton}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(nameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 11, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cancelJButton)
                    .add(okJButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog.
     *
     * @param evt
     */
    private void cancelJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelJButtonActionPerformed
        dataSourceDialog.getFragmentationAnalyzer().getProperties().setCurrentDataSetName(null);
        setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelJButtonActionPerformed

    /**
     * Sends the provided name to the data source dialog, then closes the dialog.
     *
     * @param evt
     */
    private void okJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okJButtonActionPerformed
        dataSourceDialog.getFragmentationAnalyzer().getProperties().setCurrentDataSetName(nameJTextField.getText());
        setVisible(true);
        dispose();
    }//GEN-LAST:event_okJButtonActionPerformed

    /**
     * Makes sure that 'Enter' can be used to activate the 'OK' button when
     * clicked in the text field.
     *
     * @param evt
     */
    private void nameJTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameJTextFieldKeyReleased

        okJButton.setEnabled(nameJTextField.getText().length() > 0);

        if(okJButton.isEnabled()){
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                okJButtonActionPerformed(null);
            }
        }
    }//GEN-LAST:event_nameJTextFieldKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelJButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JButton okJButton;
    // End of variables declaration//GEN-END:variables
}
