package no.uib.fragmentation_analyzer.gui;

import javax.swing.JOptionPane;

/**
 * A dialog that lets the user set the preferences of FragmentationAnalyzer.
 *
 * @author Harald Barsnes
 */
public class Preferences extends javax.swing.JDialog {

    private FragmentationAnalyzer fragmentationAnalyzer;

    /**
     * Creates a new Preferences dialog and makes it visible.
     *
     * @param fragmentationAnalyzer a reference to the parent frame
     * @param modal
     */
    public Preferences(FragmentationAnalyzer fragmentationAnalyzer, boolean modal) {
        super(fragmentationAnalyzer, modal);
        initComponents();

        this.fragmentationAnalyzer = fragmentationAnalyzer;

        defaultBubbleScalingJTextField.setText("" + fragmentationAnalyzer.getUserProperties().getDefaultBubbleScaling());
        ppmBubbleScalingJTextField.setText("" + fragmentationAnalyzer.getUserProperties().getPpmBubbleScaling());

        notSignificantNotUsedJCheckBox.setSelected(fragmentationAnalyzer.getUserProperties().isNotSignificantNotScoringFragmentIon());
        significantNotUsedJCheckBox.setSelected(fragmentationAnalyzer.getUserProperties().isSignificantNotScoringFragmentIon());
        significantAndUsedJCheckBox.setSelected(fragmentationAnalyzer.getUserProperties().isSignificantScoringFragmentIon());

        if(fragmentationAnalyzer.getUserProperties().normalizeIntensites()){
            totalIntensityNormalizationJRadioButton.setSelected(true);
            unnormalizedJRadioButton.setSelected(false);
        } else {
            totalIntensityNormalizationJRadioButton.setSelected(false);
            unnormalizedJRadioButton.setSelected(true);
        }

        plotsPerRowJSpinner.setValue(fragmentationAnalyzer.getUserProperties().getNumberOfPlotsPerRow());
        plotsPerColumnJSpinner.setValue(fragmentationAnalyzer.getUserProperties().getNumberOfPlotsPerColumn());
        
        setLocationRelativeTo(fragmentationAnalyzer);
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

        normalizationButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        defaultBubbleScalingJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ppmBubbleScalingJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        plotsPerRowJSpinner = new javax.swing.JSpinner();
        plotsPerColumnJSpinner = new javax.swing.JSpinner();
        okJButton = new javax.swing.JButton();
        cancelJButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        notSignificantNotUsedJCheckBox = new javax.swing.JCheckBox();
        significantNotUsedJCheckBox = new javax.swing.JCheckBox();
        significantAndUsedJCheckBox = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        totalIntensityNormalizationJRadioButton = new javax.swing.JRadioButton();
        unnormalizedJRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Preferences");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Plotting Properties", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setText("Default Bubble Scaling Size:");
        jLabel1.setToolTipText("<html>\nThe scale used when determining the size<br>\nof the bubbles in a bubble plot using the<br>\nabsolute distance measurment, i.e. Da.\n<html> ");

        defaultBubbleScalingJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defaultBubbleScalingJTextField.setToolTipText("<html>\nThe scale used when determining the size<br>\nof the bubbles in a bubble plot using the<br>\nabsolute distance measurment, i.e. Da.\n<html> ");

        jLabel2.setText("PPM Bubble Scaling Size:");
        jLabel2.setToolTipText("<html>\nThe scale used when determining the size<br>\nof the bubbles in a bubble plot using the<br>\nrelative distance measurment, i.e. ppm.\n<html> ");

        ppmBubbleScalingJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ppmBubbleScalingJTextField.setToolTipText("<html>\nThe scale used when determining the size<br>\nof the bubbles in a bubble plot using the<br>\nrelative distance measurment, i.e. ppm.\n<html> ");

        jLabel3.setText("Number of Plots Per Row:");
        jLabel3.setToolTipText("<html>\nThe number of plots shown per row in the Plots/Analyses panel.\n<html> ");

        jLabel4.setText("Number of Plots Per Column:");
        jLabel4.setToolTipText("<html>\nThe number of plots shown per column in the Plots/Analysis panel.\n<html> ");

        plotsPerRowJSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(2), Integer.valueOf(1), null, Integer.valueOf(1)));
        plotsPerRowJSpinner.setToolTipText("<html>\nThe number of plots shown per row in the Plots/Analyses panel.\n<html> ");

        plotsPerColumnJSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(2), Integer.valueOf(1), null, Integer.valueOf(1)));
        plotsPerColumnJSpinner.setToolTipText("<html>\nThe number of plots shown per column in the Plots/Analysis panel.\n<html> ");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(jLabel2)
                    .add(jLabel4)
                    .add(jLabel3))
                .add(9, 9, 9)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(plotsPerColumnJSpinner, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .add(defaultBubbleScalingJTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .add(ppmBubbleScalingJTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, plotsPerRowJSpinner, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(defaultBubbleScalingJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(ppmBubbleScalingJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(plotsPerRowJSpinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(plotsPerColumnJSpinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        okJButton.setText("OK");
        okJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okJButtonActionPerformed(evt);
            }
        });

        cancelJButton.setText("Cancel");
        cancelJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelJButtonActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fragment Ion Scoring Types - ms_lims", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        notSignificantNotUsedJCheckBox.setText("Not Significant, Not Used For Scoring");
        notSignificantNotUsedJCheckBox.setIconTextGap(15);

        significantNotUsedJCheckBox.setText("Significant, Not Used For Scoring");
        significantNotUsedJCheckBox.setIconTextGap(15);

        significantAndUsedJCheckBox.setText("Significant, Used For Scoring");
        significantAndUsedJCheckBox.setIconTextGap(15);

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(notSignificantNotUsedJCheckBox)
                    .add(significantNotUsedJCheckBox)
                    .add(significantAndUsedJCheckBox))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(notSignificantNotUsedJCheckBox)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(significantNotUsedJCheckBox)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(significantAndUsedJCheckBox)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Intensity Normalization", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        normalizationButtonGroup.add(totalIntensityNormalizationJRadioButton);
        totalIntensityNormalizationJRadioButton.setText("Total Intensity Normalization");
        totalIntensityNormalizationJRadioButton.setToolTipText("<html>Divide the intensity values by the total intensity of the spectrum</html>");
        totalIntensityNormalizationJRadioButton.setIconTextGap(15);

        normalizationButtonGroup.add(unnormalizedJRadioButton);
        unnormalizedJRadioButton.setText("Unnormalized");
        unnormalizedJRadioButton.setToolTipText("<html>No normalization, use the unnormalized intensity values</html>");
        unnormalizedJRadioButton.setIconTextGap(15);

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(totalIntensityNormalizationJRadioButton)
                    .add(unnormalizedJRadioButton))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(totalIntensityNormalizationJRadioButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(unnormalizedJRadioButton)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(okJButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cancelJButton)))
                .addContainerGap())
        );

        layout.linkSize(new java.awt.Component[] {cancelJButton, okJButton}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cancelJButton)
                    .add(okJButton))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog.
     *
     * @param evt
     */
    private void cancelJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelJButtonActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelJButtonActionPerformed

    /**
     * Verifies that the inserted values are valid, then closes the dialog.
     *
     * @param evt
     */
    private void okJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okJButtonActionPerformed

        boolean error = false;

        try {
            fragmentationAnalyzer.getUserProperties().setDefaultBubbleScaling(new Integer(defaultBubbleScalingJTextField.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Bubble scaling value has to be an integer.",
                    "Bubble Scaling", JOptionPane.INFORMATION_MESSAGE);
            defaultBubbleScalingJTextField.requestFocus();
            error = true;
        }

        if (!error) {
            try {
                fragmentationAnalyzer.getUserProperties().setPpmBubbleScaling(new Integer(ppmBubbleScalingJTextField.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this,
                        "Bubble scaling value has to be an integer.",
                        "Bubble Scaling", JOptionPane.INFORMATION_MESSAGE);
                ppmBubbleScalingJTextField.requestFocus();
                error = true;
            }
        }

        if(!error){
            if(!notSignificantNotUsedJCheckBox.isSelected() &&
                    !significantNotUsedJCheckBox.isSelected() &&
                    !significantAndUsedJCheckBox.isSelected()){
                JOptionPane.showMessageDialog(this,
                        "Please select at least one fragment ion scoring type.",
                        "Fragment Ion Scoring", JOptionPane.INFORMATION_MESSAGE);
                error = true;
            } else{
                fragmentationAnalyzer.getUserProperties().setNotSignificantNotScoringFragmentIon(notSignificantNotUsedJCheckBox.isSelected());
                fragmentationAnalyzer.getUserProperties().setSignificantNotScoringFragmentIon(significantNotUsedJCheckBox.isSelected());
                fragmentationAnalyzer.getUserProperties().setSignificantScoringFragmentIon(significantAndUsedJCheckBox.isSelected());
            }
        }
        
        if(!error){
            fragmentationAnalyzer.getUserProperties().setNormalizeIntensites(totalIntensityNormalizationJRadioButton.isSelected());
        }
        
        if(!error){
            try{
                fragmentationAnalyzer.getUserProperties().setNumberOfPlotsPerRow(
                        ((Integer) plotsPerRowJSpinner.getValue()).intValue());
            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this,
                        "Number of plots per row has to be an integer.",
                        "Plots Per Row", JOptionPane.INFORMATION_MESSAGE);
                plotsPerRowJSpinner.requestFocus();
                error = true;
            }
        }

        if(!error){
            try{
                fragmentationAnalyzer.getUserProperties().setNumberOfPlotsPerColumn(
                        ((Integer) plotsPerColumnJSpinner.getValue()).intValue());
            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this,
                        "Number of plots per column has to be an integer.",
                        "Plots Per Column", JOptionPane.INFORMATION_MESSAGE);
                plotsPerRowJSpinner.requestFocus();
                error = true;
            }
        }

        // update the order and size of the internal frames
        fragmentationAnalyzer.orderInternalFrames();
        
        fragmentationAnalyzer.getUserProperties().saveUserPropertiesToFile();

        if (!error) {
            cancelJButtonActionPerformed(null);
        }
    }//GEN-LAST:event_okJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelJButton;
    private javax.swing.JTextField defaultBubbleScalingJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.ButtonGroup normalizationButtonGroup;
    private javax.swing.JCheckBox notSignificantNotUsedJCheckBox;
    private javax.swing.JButton okJButton;
    private javax.swing.JSpinner plotsPerColumnJSpinner;
    private javax.swing.JSpinner plotsPerRowJSpinner;
    private javax.swing.JTextField ppmBubbleScalingJTextField;
    private javax.swing.JCheckBox significantAndUsedJCheckBox;
    private javax.swing.JCheckBox significantNotUsedJCheckBox;
    private javax.swing.JRadioButton totalIntensityNormalizationJRadioButton;
    private javax.swing.JRadioButton unnormalizedJRadioButton;
    // End of variables declaration//GEN-END:variables
}
