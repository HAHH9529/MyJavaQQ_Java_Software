/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import bean.User;
import dao.UserDao;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author 10248
 */
public class RegisterUI extends javax.swing.JFrame {

    /**
     * Creates new form RegisterUI
     */
    public RegisterUI() {
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_Sex = new javax.swing.ButtonGroup();
        lbl_Nickname = new javax.swing.JLabel();
        text_Nickname = new javax.swing.JTextField();
        lbl_Password = new javax.swing.JLabel();
        pwd_Password = new javax.swing.JPasswordField();
        lbl_RePassword = new javax.swing.JLabel();
        pwd_RePassword = new javax.swing.JPasswordField();
        lbl_Birthday = new javax.swing.JLabel();
        text_BirthdayYear = new javax.swing.JTextField();
        lbl_BirthdayYear = new javax.swing.JLabel();
        text_BirthdayMonth = new javax.swing.JTextField();
        lbl_BirthdayMonth = new javax.swing.JLabel();
        text_BirthdayDay = new javax.swing.JTextField();
        lbl_BirthdayDay = new javax.swing.JLabel();
        lbl_Sex = new javax.swing.JLabel();
        radio_SexMale = new javax.swing.JRadioButton();
        radio_SexFemale = new javax.swing.JRadioButton();
        lbl_Address = new javax.swing.JLabel();
        text_Address = new javax.swing.JTextField();
        lbl_Phone = new javax.swing.JLabel();
        text_Phone = new javax.swing.JTextField();
        btn_Submitted = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Nickname.setText("昵称：");

        lbl_Password.setText("密码：");

        pwd_Password.setEchoChar('*');

        lbl_RePassword.setText("确认密码：");

        pwd_RePassword.setEchoChar('*');

        lbl_Birthday.setText("出生日期：");

        text_BirthdayYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_BirthdayYearActionPerformed(evt);
            }
        });

        lbl_BirthdayYear.setText("年");

        text_BirthdayMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_BirthdayMonthActionPerformed(evt);
            }
        });

        lbl_BirthdayMonth.setText("月");

        lbl_BirthdayDay.setText("日");

        lbl_Sex.setText("性别：");

        buttonGroup_Sex.add(radio_SexMale);
        radio_SexMale.setLabel("男");
        radio_SexMale.setName("male"); // NOI18N

        buttonGroup_Sex.add(radio_SexFemale);
        radio_SexFemale.setText("女");
        radio_SexFemale.setName("female"); // NOI18N

        lbl_Address.setText("所在地：");

        text_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_AddressActionPerformed(evt);
            }
        });

        lbl_Phone.setText("手机号码：");

        btn_Submitted.setText("确认无误，注册账号");
        btn_Submitted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SubmittedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Submitted, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Birthday)
                            .addComponent(lbl_Password)
                            .addComponent(lbl_Nickname)
                            .addComponent(lbl_RePassword))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pwd_RePassword, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(text_Nickname)
                                .addComponent(pwd_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(text_BirthdayYear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_BirthdayYear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_BirthdayMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radio_SexFemale)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_BirthdayMonth)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text_BirthdayDay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_BirthdayDay))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Phone)
                            .addComponent(lbl_Address)
                            .addComponent(lbl_Sex))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(radio_SexMale)
                            .addComponent(text_Phone)
                            .addComponent(text_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nickname)
                    .addComponent(text_Nickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Password)
                    .addComponent(pwd_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_RePassword)
                    .addComponent(pwd_RePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Birthday)
                    .addComponent(text_BirthdayYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_BirthdayYear)
                    .addComponent(text_BirthdayMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_BirthdayMonth)
                    .addComponent(text_BirthdayDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_BirthdayDay))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Sex)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radio_SexMale)
                        .addComponent(radio_SexFemale)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Address)
                    .addComponent(text_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Phone)
                    .addComponent(text_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_Submitted, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        radio_SexMale.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_AddressActionPerformed

    private void text_BirthdayYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_BirthdayYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_BirthdayYearActionPerformed

    private void text_BirthdayMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_BirthdayMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_BirthdayMonthActionPerformed

    private void btn_SubmittedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SubmittedActionPerformed
        // TODO add your handling code here:
        String Nickname = text_Nickname.getText();
        String Password = new String(pwd_Password.getPassword());
        if (Password.equals(new String(pwd_RePassword.getPassword())) == false) {
            JOptionPane.showMessageDialog(this, "两次输入的密码不一致，请检查密码");
            return;
        }
        int BirthdayYear = Integer.valueOf(text_BirthdayYear.getText());
        int BirthdayMonth = Integer.valueOf(text_BirthdayMonth.getText());
        int BirthdayDay = Integer.valueOf(text_BirthdayDay.getText());
        Calendar nowDate = Calendar.getInstance(Locale.CHINA);//日期检查
        String Birthday = BirthdayYear + "-" + BirthdayMonth + "-" + BirthdayDay;
        String Sex = "";
        Enumeration em = this.buttonGroup_Sex.getElements();
        while (em.hasMoreElements()) {
            JRadioButton radio = (JRadioButton) em.nextElement();
            if (radio.isSelected()) {
                Sex = radio.getName();
            }
        }
        String Address = text_Address.getText();
        String Phone = text_Phone.getText();
      
        User newUser = new User();
        newUser.setUserNickname(Nickname);
        newUser.setUserPassword(Password);
        newUser.setUserBirthday(Birthday);
        newUser.setUserSex(Sex);
        newUser.setUserAddress(Address);
        newUser.setUserPhone(Phone);
        UserDao register = new UserDao();
        try {
            register.userRegister(newUser);
        } catch (SQLException ex) {
            Logger.getLogger(RegisterUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_SubmittedActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Submitted;
    private javax.swing.ButtonGroup buttonGroup_Sex;
    private javax.swing.JLabel lbl_Address;
    private javax.swing.JLabel lbl_Birthday;
    private javax.swing.JLabel lbl_BirthdayDay;
    private javax.swing.JLabel lbl_BirthdayMonth;
    private javax.swing.JLabel lbl_BirthdayYear;
    private javax.swing.JLabel lbl_Nickname;
    private javax.swing.JLabel lbl_Password;
    private javax.swing.JLabel lbl_Phone;
    private javax.swing.JLabel lbl_RePassword;
    private javax.swing.JLabel lbl_Sex;
    private javax.swing.JPasswordField pwd_Password;
    private javax.swing.JPasswordField pwd_RePassword;
    private javax.swing.JRadioButton radio_SexFemale;
    private javax.swing.JRadioButton radio_SexMale;
    private javax.swing.JTextField text_Address;
    private javax.swing.JTextField text_BirthdayDay;
    private javax.swing.JTextField text_BirthdayMonth;
    private javax.swing.JTextField text_BirthdayYear;
    private javax.swing.JTextField text_Nickname;
    private javax.swing.JTextField text_Phone;
    // End of variables declaration//GEN-END:variables
}
