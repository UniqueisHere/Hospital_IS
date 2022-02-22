/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital_is;

import com.dialogs.MessageDialogBox;
import com.dialogs.UserConfirmationDialogBox;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abc
 */
public class FormPage extends javax.swing.JFrame {
    private HospitalInfo hospitalInfo;
    
    /**
     * Creates new form Form
     */
    public FormPage(HospitalInfo hospitalInfo) {
        initComponents();
        this.hospitalInfo = hospitalInfo;
        ImageIcon applicationIcon = new ImageIcon("src/com/icons/application_hospital_icon.png");
        this.setIconImage(applicationIcon.getImage()); 
    }
    
    public void changeFormPageBackgroundColorLight() {
        mainPanel.setBackground(new Color(255, 255, 255));
        hospitalNameField.setBackground(new Color(240, 240, 240));
        addressField.setBackground(new Color(240, 240, 240));
        telephoneNumberField.setBackground(new Color(240, 240, 240));
        hospitalCategoryComboBox.setBackground(new Color(240, 240, 240));
        admittedPriceField.setBackground(new Color(240, 240, 240));
    }
    
    public void changeFormPageBackgroundColorDark() {
        mainPanel.setBackground(new Color(32,26,49)); 
        hospitalNameField.setBackground(new Color(56,48,76));
        addressField.setBackground(new Color(56,48,76));
        telephoneNumberField.setBackground(new Color(56,48,76));
        hospitalCategoryComboBox.setBackground(new Color(56,48,76));
        admittedPriceField.setBackground(new Color(56,48,76));
    }
    
    public void changeFormPageForegroundColorDark() {
        formHeadingLabel.setForeground(Color.black);
        backgroundChangerLabel.setForeground(Color.black); 
        hospitalNameLabel.setForeground(Color.black); 
        addressLabel.setForeground(Color.black);
        telephoneNumberLabel.setForeground(Color.black);
        hospitalCategoryLabel.setForeground(Color.black);
        admittedPriceLabel.setForeground(Color.black);
        healthInsuranceLabel.setForeground(Color.black); 
        healthInsuranceAvailableRadioButton.setForeground(Color.black);
        healthInsuranceNotAvailableRadioButton.setForeground(Color.black); 
        hospitalNameField.setForeground(Color.black); 
        addressField.setForeground(Color.black);
        telephoneNumberField.setForeground(Color.black);
        admittedPriceField.setForeground(Color.black);
        
    }
    
    public void changeFormPageForegroundColorLight() {
        formHeadingLabel.setForeground(Color.white);
        backgroundChangerLabel.setForeground(Color.white); 
        hospitalNameLabel.setForeground(Color.white); 
        addressLabel.setForeground(Color.white);
        telephoneNumberLabel.setForeground(Color.white);
        hospitalCategoryLabel.setForeground(Color.white);
        admittedPriceLabel.setForeground(Color.white);
        healthInsuranceLabel.setForeground(Color.white); 
        healthInsuranceAvailableRadioButton.setForeground(Color.white);
        healthInsuranceNotAvailableRadioButton.setForeground(Color.white);
        hospitalNameField.setForeground(Color.white); 
        addressField.setForeground(Color.white);
        telephoneNumberField.setForeground(Color.white);
        admittedPriceField.setForeground(Color.white);
    }
    
    public void changeLightAndDarkMode() {
        ImageIcon darkIcon = new ImageIcon("src/com/icons/dark.png");
        ImageIcon lightIcon = new ImageIcon("src/com/icons/light.png"); 
        
        if (backgroundChangerLabel.getText().equals("Dark")) {    
            backgroundChangerLabel.setIcon(lightIcon);
            backgroundChangerLabel.setText("Light"); 
            changeFormPageBackgroundColorLight();
            changeFormPageForegroundColorDark();
        }else {   
            backgroundChangerLabel.setIcon(darkIcon); 
            backgroundChangerLabel.setText("Dark");
            changeFormPageBackgroundColorDark();
            changeFormPageForegroundColorLight();
        }
    }
    
    public void clearAllFormFields() {
        hospitalNameField.setText("");
            addressField.setText("");
            telephoneNumberField.setText("");
            hospitalCategoryComboBox.setSelectedIndex(0); 
            admittedPriceField.setText(""); 
    }
    
    public void enableTypingNumberKeyOnly(KeyEvent event) {
        char userTypedCharacter = event.getKeyChar();
        if(!(Character.isDigit(userTypedCharacter)) || (userTypedCharacter == KeyEvent.VK_BACK_SPACE)
                || (userTypedCharacter == KeyEvent.VK_DELETE)) {
            event.consume();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        healthInsuranceButtonGroup = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        formHeadingLabel = new javax.swing.JLabel();
        hospitalNameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        telephoneNumberLabel = new javax.swing.JLabel();
        hospitalCategoryLabel = new javax.swing.JLabel();
        admittedPriceLabel = new javax.swing.JLabel();
        admittedPriceField = new javax.swing.JTextField();
        hospitalCategoryComboBox = new javax.swing.JComboBox<>();
        healthInsuranceLabel = new javax.swing.JLabel();
        healthInsuranceAvailableRadioButton = new javax.swing.JRadioButton();
        healthInsuranceNotAvailableRadioButton = new javax.swing.JRadioButton();
        homePageBackLabel = new javax.swing.JLabel();
        addLabel = new javax.swing.JLabel();
        clearLabel = new javax.swing.JLabel();
        hospitalNameField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        telephoneNumberField = new javax.swing.JTextField();
        backgroundChangerLabel = new javax.swing.JLabel();
        firstSeperator = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(32, 26, 49));

        formHeadingLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 36)); // NOI18N
        formHeadingLabel.setForeground(new java.awt.Color(255, 255, 255));
        formHeadingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formHeadingLabel.setText("Hospital Information Form");

        hospitalNameLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        hospitalNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        hospitalNameLabel.setText("Hospital Name");

        addressLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(255, 255, 255));
        addressLabel.setText("Address");

        telephoneNumberLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        telephoneNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        telephoneNumberLabel.setText("Telephone Number");

        hospitalCategoryLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        hospitalCategoryLabel.setForeground(new java.awt.Color(255, 255, 255));
        hospitalCategoryLabel.setText("Hospital Category");

        admittedPriceLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        admittedPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        admittedPriceLabel.setText("Admitted Price");

        admittedPriceField.setBackground(new java.awt.Color(56, 48, 76));
        admittedPriceField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        admittedPriceField.setForeground(new java.awt.Color(255, 255, 255));
        admittedPriceField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        admittedPriceField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                admittedPriceFieldKeyTyped(evt);
            }
        });

        hospitalCategoryComboBox.setBackground(new java.awt.Color(56, 48, 76));
        hospitalCategoryComboBox.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        hospitalCategoryComboBox.setForeground(new java.awt.Color(255, 255, 255));
        hospitalCategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Government", "Private" }));
        hospitalCategoryComboBox.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        hospitalCategoryComboBox.setOpaque(false);

        healthInsuranceLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        healthInsuranceLabel.setForeground(new java.awt.Color(255, 255, 255));
        healthInsuranceLabel.setText("Health Insurance");

        healthInsuranceButtonGroup.add(healthInsuranceAvailableRadioButton);
        healthInsuranceAvailableRadioButton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        healthInsuranceAvailableRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        healthInsuranceAvailableRadioButton.setText(" Available");

        healthInsuranceButtonGroup.add(healthInsuranceNotAvailableRadioButton);
        healthInsuranceNotAvailableRadioButton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        healthInsuranceNotAvailableRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        healthInsuranceNotAvailableRadioButton.setSelected(true);
        healthInsuranceNotAvailableRadioButton.setText(" Not Available");

        homePageBackLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icons/home_back.png"))); // NOI18N
        homePageBackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePageBackLabelMouseClicked(evt);
            }
        });

        addLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icons/add.png"))); // NOI18N
        addLabel.setToolTipText("Add New Data");
        addLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addLabelMouseClicked(evt);
            }
        });

        clearLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icons/clear.png"))); // NOI18N
        clearLabel.setToolTipText("Clear All Fields");
        clearLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearLabelMouseClicked(evt);
            }
        });

        hospitalNameField.setBackground(new java.awt.Color(56, 48, 76));
        hospitalNameField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        hospitalNameField.setForeground(new java.awt.Color(255, 255, 255));
        hospitalNameField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        addressField.setBackground(new java.awt.Color(56, 48, 76));
        addressField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        addressField.setForeground(new java.awt.Color(255, 255, 255));
        addressField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        telephoneNumberField.setBackground(new java.awt.Color(56, 48, 76));
        telephoneNumberField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        telephoneNumberField.setForeground(new java.awt.Color(255, 255, 255));
        telephoneNumberField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        telephoneNumberField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telephoneNumberFieldKeyTyped(evt);
            }
        });

        backgroundChangerLabel.setFont(new java.awt.Font("Imprint MT Shadow", 0, 18)); // NOI18N
        backgroundChangerLabel.setForeground(new java.awt.Color(255, 255, 255));
        backgroundChangerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icons/dark.png"))); // NOI18N
        backgroundChangerLabel.setText("Dark");
        backgroundChangerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backgroundChangerLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telephoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalCategoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admittedPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(healthInsuranceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addLabel)
                        .addGap(59, 59, 59))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telephoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hospitalCategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(healthInsuranceAvailableRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(healthInsuranceNotAvailableRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(admittedPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(hospitalNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(homePageBackLabel)
                        .addGap(237, 237, 237)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstSeperator)
                            .addComponent(formHeadingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
                        .addGap(93, 93, 93)
                        .addComponent(backgroundChangerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(clearLabel)
                        .addGap(50, 50, 50))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formHeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(homePageBackLabel))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backgroundChangerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hospitalNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(addLabel))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telephoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telephoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hospitalCategoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalCategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(admittedPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admittedPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(healthInsuranceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(healthInsuranceAvailableRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(healthInsuranceNotAvailableRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homePageBackLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePageBackLabelMouseClicked
        this.setVisible(false); 
        hospitalInfo.setVisible(true);
    }//GEN-LAST:event_homePageBackLabelMouseClicked

    private void addLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLabelMouseClicked
        // Getting all the data from the form
        String hospitalName = hospitalNameField.getText();
        String address = addressField.getText();
        String telephoneNumber = telephoneNumberField.getText(); 
        String hospitalCategory = hospitalCategoryComboBox.getSelectedItem().toString();
        String admittedPrice = admittedPriceField.getText(); 
        String healthInsurance = "";
        if (healthInsuranceAvailableRadioButton.isSelected())
            healthInsurance = "Available";
        else if (healthInsuranceNotAvailableRadioButton.isSelected())
            healthInsurance = "Not Available";
        
        // Validating form and inserting the data ino table, arrayList as well as .csv file
        try {
            Long.parseLong(telephoneNumber); 
            Double.parseDouble(admittedPrice);
            if (hospitalName.isEmpty() || address.isEmpty() || telephoneNumber.isEmpty() 
                || hospitalCategory.isEmpty() || admittedPrice.isEmpty() || healthInsurance.isEmpty()) {
            new MessageDialogBox(this, "Please fill all the data", true).setVisible(true); 
            }else {
                UserConfirmationDialogBox userConfirmationDialogBox = new UserConfirmationDialogBox(this, "Are you sure you want to add data", true);
                userConfirmationDialogBox.setVisible(true); 
                if(userConfirmationDialogBox.isConfirm()) {
                    HospitalData hospitalData = new HospitalData(hospitalName, address, telephoneNumber,
                            hospitalCategory, admittedPrice, healthInsurance);
                    hospitalInfo.getTablePage().getHospitalDatas().add(hospitalData);

                    String[] hospitalInformationArray = {hospitalName, address, telephoneNumber, 
                            hospitalCategory, admittedPrice, healthInsurance};
                    DefaultTableModel tableModel = (DefaultTableModel) hospitalInfo.getTablePage().getHospitalInfoTable().getModel();
                    tableModel.addRow(hospitalInformationArray);
                    hospitalInfo.getTablePage().saveDataToCsvFile();
                    clearAllFormFields();
                    new MessageDialogBox(this, "Data added sucessfully", true).setVisible(true);
                    this.setVisible(false); 
                    hospitalInfo.getTablePage().setVisible(true);
                }
            }
        }catch(NumberFormatException numberFormatException) {
            new MessageDialogBox(this, "Please enter numeric data", true).setVisible(true);
        }
        
    }//GEN-LAST:event_addLabelMouseClicked

    private void clearLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearLabelMouseClicked
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to clear all text fields");
        if (option == JOptionPane.YES_OPTION) {
            clearAllFormFields();
        }
    }//GEN-LAST:event_clearLabelMouseClicked

    private void backgroundChangerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundChangerLabelMouseClicked
        changeLightAndDarkMode();
    }//GEN-LAST:event_backgroundChangerLabelMouseClicked

    private void telephoneNumberFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telephoneNumberFieldKeyTyped
        enableTypingNumberKeyOnly(evt); 
    }//GEN-LAST:event_telephoneNumberFieldKeyTyped

    private void admittedPriceFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_admittedPriceFieldKeyTyped
        enableTypingNumberKeyOnly(evt); 
    }//GEN-LAST:event_admittedPriceFieldKeyTyped

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
            java.util.logging.Logger.getLogger(FormPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPage(new HospitalInfo()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addLabel;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField admittedPriceField;
    private javax.swing.JLabel admittedPriceLabel;
    private javax.swing.JLabel backgroundChangerLabel;
    private javax.swing.JLabel clearLabel;
    private javax.swing.JSeparator firstSeperator;
    private javax.swing.JLabel formHeadingLabel;
    private javax.swing.JRadioButton healthInsuranceAvailableRadioButton;
    private javax.swing.ButtonGroup healthInsuranceButtonGroup;
    private javax.swing.JLabel healthInsuranceLabel;
    private javax.swing.JRadioButton healthInsuranceNotAvailableRadioButton;
    private javax.swing.JLabel homePageBackLabel;
    private javax.swing.JComboBox<String> hospitalCategoryComboBox;
    private javax.swing.JLabel hospitalCategoryLabel;
    private javax.swing.JTextField hospitalNameField;
    private javax.swing.JLabel hospitalNameLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField telephoneNumberField;
    private javax.swing.JLabel telephoneNumberLabel;
    // End of variables declaration//GEN-END:variables
}
