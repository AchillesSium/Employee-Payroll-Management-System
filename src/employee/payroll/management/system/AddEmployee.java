package employee.payroll.management.system;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.imageio.ImageIO;
import javax.swing.*;

public class AddEmployee extends javax.swing.JFrame {

    
    Connection myConn=null;
    PreparedStatement pst=null;
    ResultSet rs = null;

    public AddEmployee() {
        initComponents();
        myConn=Database.java_db();
        Toolkit toolkit=getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_id = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        txt_surname = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_contact = new javax.swing.JTextField();
        txt_address1 = new javax.swing.JTextField();
        txt_address2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        txt_dob = new org.netbeans.modules.form.InvalidComponent();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        txt_status = new javax.swing.JTextField();
        txt_job = new javax.swing.JTextField();
        txt_hired = new javax.swing.JTextField();
        txt_salary = new javax.swing.JTextField();
        txt_designation = new javax.swing.JTextField();
        txt_post = new javax.swing.JTextField();
        txt_house = new javax.swing.JTextField();
        txt_department1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        r_male = new javax.swing.JRadioButton();
        r_female = new javax.swing.JRadioButton();
        btn_clr = new javax.swing.JButton();
        btn_attach_image = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        img = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        lbl_emp = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txt_id.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        txt_firstname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstnameActionPerformed(evt);
            }
        });

        txt_surname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txt_mail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txt_contact.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txt_address1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txt_address2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Employee ID: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("First Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Surname:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Date of birth: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Address 2:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Address 1:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Contact:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Email:");

        btn_add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_add.setText("Add Record");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("APT/House No.");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Post_Code");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Department");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Designation");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Basic Salary");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Date Hired");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Job title ");

        Status.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Status.setText("Status");

        txt_status.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txt_job.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txt_hired.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txt_salary.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txt_designation.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txt_post.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_post.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_postActionPerformed(evt);
            }
        });

        txt_house.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txt_department1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Gender: ");

        r_male.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        r_male.setText("Male");
        r_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_maleActionPerformed(evt);
            }
        });

        r_female.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        r_female.setText("Female");
        r_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_femaleActionPerformed(evt);
            }
        });

        btn_clr.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_clr.setText("Clear All");
        btn_clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clrActionPerformed(evt);
            }
        });

        btn_attach_image.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_attach_image.setText("Attach an Image");
        btn_attach_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_attach_imageActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Search Employee: ");

        txt_search.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        lbl_emp.setText("emp");

        jLabel18.setText("Logged In As ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_add)
                                .addGap(188, 188, 188)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel13)
                                    .addComponent(Status)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel11))
                                    .addComponent(jLabel15))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_hired, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_designation, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_post, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_house, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_department1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_job, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(61, 61, 61)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_attach_image, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(btn_clr, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(r_male)
                                            .addGap(18, 18, 18)
                                            .addComponent(r_female))
                                        .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_address2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_address1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)
                                .addComponent(jLabel14))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18)
                        .addGap(14, 14, 14)
                        .addComponent(lbl_emp)))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(r_male)
                            .addComponent(r_female))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_address1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_address2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_clr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_house, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_post, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(txt_department1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_designation, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_hired, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addGap(40, 40, 40)
                        .addComponent(Status))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(275, 275, 275)
                                .addComponent(txt_job, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDesktopPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_attach_image, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(lbl_emp))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstnameActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
       
        int x = JOptionPane.showConfirmDialog(null,"Are you sure you want to Add Record?","Add Record",JOptionPane.YES_NO_OPTION);
        
        if(x==0){
        
        try {
            
            
           
            String sql="insert into staff_information (first_name,surname,Dob,Email,Contact_no,address1,address2,house_no,post_code,department,designation,hired_date,salary,job_title,status,Gender,image) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
           
            
           // pst.executeUpdate(sql);
            pst = myConn.prepareStatement(sql);
            
           // pst.setString(1,txt_id.getText());
            pst.setString(1,txt_firstname.getText());
            pst.setString(2, txt_surname.getText());
            pst.setString(3,((JTextField)txt_dob.getDateEditor().getUiComponent()).getText());
            pst.setString(16, gender);
            pst.setString(4, txt_mail.getText());
            pst.setString(5, txt_contact.getText());
            pst.setString(6, txt_address1.getText());
            pst.setString(7, txt_address2.getText());
            pst.setString(8, txt_house.getText());
            pst.setString(9, txt_post.getText());
            pst.setString(10, txt_department1.getText());
            pst.setString(11, txt_designation.getText());
            pst.setString(12,txt_hired.getText());
            pst.setString(13, txt_salary.getText());
            pst.setString(14, txt_job.getText());
            pst.setString(15, txt_status.getText());
            pst.setBytes(17, person_image);
            
         
            pst.execute();
            JOptionPane.showMessageDialog(null,"data is saved Successfully");
            
            AutoClear();
            
            
         
            
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
       
        finally{
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
                
            }
        }
        
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void txt_postActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_postActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_postActionPerformed

    private void r_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_maleActionPerformed
        
        gender="Male";
        r_male.setSelected(true);
        r_female.setSelected(false);
        
    }//GEN-LAST:event_r_maleActionPerformed

    private void r_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_femaleActionPerformed
       
        gender="Female";
        r_female.setSelected(true);
        r_male.setSelected(false);
    }//GEN-LAST:event_r_femaleActionPerformed

    private void btn_clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clrActionPerformed
         txt_address1.setText(null);
         txt_address2.setText(null);
         txt_contact.setText(null);
         txt_department1.setText(null);
         txt_designation.setText(null);
         txt_dob.setCalendar(null);
         txt_firstname.setText(null);
         txt_hired.setText(null);
         txt_house.setText(null);
         txt_id.setText(null);
         txt_job.setText(null);
         txt_mail.setText(null);
         txt_post.setText(null);
         txt_salary.setText(null);
         txt_status.setText(null);
         txt_surname.setText(null);
         r_female.setSelected(false);
         r_male.setSelected(false);
         img.setIcon(null);
         txt_search.setText(null);
    }//GEN-LAST:event_btn_clrActionPerformed

    private void btn_attach_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_attach_imageActionPerformed
      
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        
        File f = chooser.getSelectedFile();
        
        filename= f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_DEFAULT));
        img.setIcon(imageIcon);
        
        try {
            File image = new File(filename);
            FileInputStream fix=new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            
            for(int number;(number= fix.read(buf)) != -1;){
            bos.write(buf,0,number);
            
            }
            
            person_image = bos.toByteArray();
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
        
        
    }//GEN-LAST:event_btn_attach_imageActionPerformed
       
    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
       
        try {
            
            
           String sql = "select * from staff_information where id= ? ";
            
            pst = myConn.prepareStatement(sql);
            pst.setString(1, txt_search.getText());
            rs=pst.executeQuery();
            
             if(rs.next()){
            String id=rs.getString("id");
           txt_id.setText(id);
           
            String fName=rs.getString("first_name");
            txt_firstname.setText(fName);
            
            String sName=rs.getString("surname");
            txt_surname.setText(sName);
            
            
           String dateValue=rs.getString("Dob");
           java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateValue);
           txt_dob.setDate(date);
          
            
            
            String eMail=rs.getString("Email");
            txt_mail.setText(eMail);
            
            String contact=rs.getString("Contact_no");
            txt_contact.setText(contact);
            
            String add1=rs.getString("address1");
            txt_address1.setText(add1);
            
            String add2=rs.getString("address2");
            txt_address2.setText(add2);
            
            String house=rs.getString("house_no");
            txt_house.setText(house);
            
            String post=rs.getString("post_code");
            txt_post.setText(post);
            
            String dept=rs.getString("department");
            txt_department1.setText(dept);
            
            String desig=rs.getString("designation");
            txt_designation.setText(desig);
            
            String hired=rs.getString("hired_date");
            txt_hired.setText(hired);
            
            String salary=rs.getString("salary");
            txt_salary.setText(salary);
            
            String job=rs.getString("job_title");
            txt_job.setText(job);
            
            String status=rs.getString("status");
            txt_status.setText(status);
            
            String gender=rs.getString("Gender");
            
            if(gender.equals("Male")){
                r_male.setSelected(true);
                r_female.setSelected(false);
               
           
           }
            else if(gender.equals("Female")){
                
                r_female.setSelected(true);
                r_male.setSelected(false);
           }
            
            
            byte[] image = rs.getBytes("Image");
            ImageIcon imageIcon=new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(img.getWidth(), img.getHeight(),Image.SCALE_DEFAULT));
            img.setIcon(imageIcon);
          
            
            
            }
            
        } catch (Exception e) {
            
            
            
        }
        finally{
        
            try {
                rs.close();
                pst.close();
                
            } catch (Exception e) {
                
            }
        
        }
        
        
        
        
        
    }//GEN-LAST:event_txt_searchKeyReleased

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

        int x = JOptionPane.showConfirmDialog(null,"Are you sure you want to Delete Record?","Record Deleted",JOptionPane.YES_NO_OPTION);
       if(x==0){
        try{
        String sql = " delete from staff_information where id=? ";
        pst=myConn.prepareStatement(sql);
        pst.setString(1, txt_id.getText());
        pst.execute();
        
        JOptionPane.showMessageDialog(null,"Record deleted successfully");
        
        AutoClear();
        
        }
        
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        
        }
        finally{
            try {
                 rs.close();
                 pst.close();
                
            } catch (Exception e) {
                
                
            }
           
        
        
        }
        
        
       }
    }//GEN-LAST:event_btn_deleteActionPerformed

    
   // public static DateTimeFormatter oflocalizedDateTimeFormatter(FormatStyle dateStyle);
    
    
    
    
    
        
        
    
    
    
    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
       int x = JOptionPane.showConfirmDialog(null,"Are you sure you want to Update Record?","Record Updated",JOptionPane.YES_NO_OPTION);
       if(x==0){
        try {
            String id = txt_id.getText();
            String fname = txt_firstname.getText();
            String sName = txt_surname.getText();
            
           
            //LocalDate dateValue = LocalDate.now();
           // String text = dateValue.format(DateTimeFormatter.ofLocalizedDate(FormatStyle daStyle));
            
            
            
           // String dateValue= txt_dob.getDateEditor().getUiComponent()).getText())
            
           
           Date today = Calendar.getInstance().getTime();
           
           SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
           
           String dateValue = formatter.format(today);
           
           
           
           
           
           // String dateValue = String.valueOf(txt_dob.getDate());
           // java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateValue);
            
         
           
          //txt_dob.setDate(date);
            
            String mail = txt_mail.getText();
            String contact = txt_contact.getText();
            String add1 = txt_address1.getText();
            String add2 = txt_address2.getText();
            String house = txt_house.getText();
            String post = txt_post.getText();
            String dept = txt_department1.getText();
            String desig = txt_designation.getText();
            String hired = txt_hired.getText();
            String salary = txt_salary.getText();
            String job = txt_job.getText();
            String status = txt_status.getText();
           // String gender = txt_surname.getText();
            
            
           
           String sql="update staff_information set id ='"+id+"',first_name='"+fname+"',surname='"+sName+"',Dob='"+dateValue+"',Email='"+mail+"',Contact_no='"+contact+"',address1='"+add1+"',address2='"+add2+"',house_no='"+house+"',post_code='"+post+"',department='"+dept+"',designation='"+desig+"',hired_date='"+hired+"',salary='"+salary+"',job_title='"+job+"',status='"+status+"' where id='"+id+"'  ";
           
           pst = myConn.prepareStatement(sql);
           pst.execute();
           
           
            
             
            
            JOptionPane.showMessageDialog(null, "Record Updated");
            AutoClear();
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        }
        
        finally{
        
            try {
                
            } catch (Exception e) {
               //AutoClear();
                
                
            }
        
        
        
        
        }
        
        
        
        
        
       }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Status;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_attach_image;
    private javax.swing.JButton btn_clr;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel img;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_emp;
    private javax.swing.JRadioButton r_female;
    private javax.swing.JRadioButton r_male;
    private javax.swing.JTextField txt_address1;
    private javax.swing.JTextField txt_address2;
    private javax.swing.JTextField txt_contact;
    private javax.swing.JTextField txt_department1;
    private javax.swing.JTextField txt_designation;
    private org.netbeans.modules.form.InvalidComponent txt_dob;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_hired;
    private javax.swing.JTextField txt_house;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_job;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_post;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_surname;
    // End of variables declaration//GEN-END:variables
    
    private ImageIcon format =null;
    String filename=null;
    byte[] person_image=null;
    private String gender;
    
    
    
    private void AutoClear(){
         txt_address1.setText(null);
         txt_address2.setText(null);
         txt_contact.setText(null);
         txt_department1.setText(null);
         txt_designation.setText(null);
         txt_dob.setCalendar(null);
         txt_firstname.setText(null);
         txt_hired.setText(null);
         txt_house.setText(null);
         txt_id.setText(null);
         txt_job.setText(null);
         txt_mail.setText(null);
         txt_post.setText(null);
         txt_salary.setText(null);
         txt_status.setText(null);
         txt_surname.setText(null);
         r_female.setSelected(false);
         r_male.setSelected(false);
         img.setIcon(null);
         txt_search.setText(null);
    
    
    }
    
    


}
