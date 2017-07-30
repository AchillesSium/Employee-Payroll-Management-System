package employee.payroll.management.system;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Deduction extends javax.swing.JFrame {
    
    
    Connection myConn=null;
    PreparedStatement pst=null;
    ResultSet rs = null;

   
    public Deduction() {
        initComponents();
          myConn=Database.java_db();
        Toolkit toolkit=getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_surname = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_salary = new javax.swing.JTextField();
        txt_department1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_dob = new javax.swing.JTextField();
        lbl_percentage1 = new javax.swing.JLabel();
        r_percentage = new javax.swing.JRadioButton();
        r_amount = new javax.swing.JRadioButton();
        txt_amount = new javax.swing.JTextField();
        lbl_percentage2 = new javax.swing.JLabel();
        txt_percentage = new javax.swing.JTextField();
        lbl_percentage = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lbl_emp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_reason = new javax.swing.JLabel();
        txt_reason = new javax.swing.JTextField();
        btn_calculate = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        lbl_percentage3 = new javax.swing.JLabel();
        lbl_percentage4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_designation = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_status = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_hired = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_job = new javax.swing.JTextField();
        lbl_deduction = new javax.swing.JLabel();
        lbl_salary_deduction = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        txt_id.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txt_firstname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstnameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("First Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Surname:");

        txt_surname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Basic Salary : ");

        txt_salary.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txt_department1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Department");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Date of birth: ");

        txt_dob.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        lbl_percentage1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_percentage1.setText("Update Salary by : ");

        r_percentage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        r_percentage.setText("Percentage (%)");
        r_percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_percentageActionPerformed(evt);
            }
        });

        r_amount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        r_amount.setText("Amount");
        r_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_amountActionPerformed(evt);
            }
        });

        txt_amount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_amountActionPerformed(evt);
            }
        });

        lbl_percentage2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_percentage2.setText("Amount : ");

        txt_percentage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_percentageActionPerformed(evt);
            }
        });

        lbl_percentage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_percentage.setText("Percentage  : ");

        btn_save.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        jLabel5.setText("Logged In As ");

        lbl_emp.setText("emp");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Employee ID: ");

        lbl_reason.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_reason.setText("Reason");

        txt_reason.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        btn_calculate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_calculate.setText("Calculate");
        btn_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calculateActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        lbl_percentage3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_percentage3.setText("Total Deduction: ");

        lbl_percentage4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_percentage4.setText("Salary After Deduction :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Designation");

        txt_designation.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Status : ");

        txt_status.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_statusActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Date Hired : ");

        txt_hired.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Job Title : ");

        txt_job.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        lbl_deduction.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        lbl_salary_deduction.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_department1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(txt_dob)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_percentage1)
                        .addGap(18, 18, 18)
                        .addComponent(r_percentage)
                        .addGap(37, 37, 37)
                        .addComponent(r_amount))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(53, 53, 53)
                                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(35, 35, 35)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(14, 14, 14)
                                                    .addComponent(jLabel7)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txt_designation, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(303, 303, 303)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel9))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt_job, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_hired, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addGap(18, 18, 18)
                                            .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbl_reason)
                                                .addGap(7, 7, 7)
                                                .addComponent(txt_reason, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_emp)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_percentage)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_percentage2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbl_percentage4)
                                            .addComponent(lbl_percentage3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbl_deduction, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                            .addComponent(lbl_salary_deduction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
                .addGap(31, 31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txt_hired, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txt_department1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_job, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txt_designation, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(r_percentage)
                            .addComponent(lbl_percentage1)
                            .addComponent(r_amount))
                        .addGap(6, 6, 6)
                        .addComponent(lbl_percentage3))
                    .addComponent(lbl_deduction, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_percentage)
                            .addComponent(txt_percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_percentage2)
                            .addComponent(lbl_percentage4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(lbl_reason))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_reason, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbl_salary_deduction, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_emp)
                    .addComponent(jLabel5)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased

        try {

            String sql = "select * from staff_information where id= ? ";

            // System.out.println("sadid");

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
                txt_dob.setText(dateValue);

                String dept=rs.getString("department");
                txt_department1.setText(dept);
                
                
                String designation=rs.getString("designation");
                txt_designation.setText(designation);
                
                String status=rs.getString("status");
                txt_status.setText(status);
                
                String hired=rs.getString("hired_date");
                txt_hired.setText(hired);
                
                String job=rs.getString("job_title");
                txt_job.setText(dept);

                String s = rs.getString("salary");
                txt_salary.setText(s);

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

    private void txt_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstnameActionPerformed

    private void r_percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_percentageActionPerformed
        // TODO add your handling code here:

        r_amount.setSelected(false);
        r_percentage.setSelected(true);
        txt_percentage.setEnabled(true);
        txt_amount.setEnabled(false);
        
        
       // String percentage = txt_percentage.getText().toString();
        //lbl_deduction.setText(percentage);

    }//GEN-LAST:event_r_percentageActionPerformed

    private void r_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_amountActionPerformed

        r_amount.setSelected(true);
        r_percentage.setSelected(false);
        txt_percentage.setEnabled(false);
        txt_amount.setEnabled(true);

    }//GEN-LAST:event_r_amountActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

        int x=JOptionPane.showConfirmDialog(null,"Are you sure?","Salary Deducted",JOptionPane.YES_NO_OPTION);

        try {

            int salary = Integer.parseInt(txt_salary.getText());

           

            if(r_percentage.isSelected()){

                int get_percentage = Integer.parseInt(txt_percentage.getText());
               int percentage_amount = salary/100*get_percentage;
                int calc_percentage = salary-salary/100*get_percentage;
                String a = String.valueOf(calc_percentage);
                txt_salary.setText(a);
                
                
                
                
                 String percentage = txt_percentage.getText().toString();
                lbl_deduction.setText(String.valueOf(percentage_amount));
                //System.out.println(percentage);
                lbl_salary_deduction.setText(txt_salary.getText().toString());
                
                

            }

            else if (r_amount.isSelected()){
                //int salary = Integer.parseInt(txt_salary.getText());
                int get_amount = Integer.parseInt(txt_amount.getText());
                int calAmount = salary-get_amount;
                String b = String.valueOf(calAmount);
                txt_salary.setText(b);
                
                String amount = txt_amount.getText().toString();
                lbl_deduction.setText(amount);
              //  System.out.println(amount);
              lbl_salary_deduction.setText(txt_salary.getText().toString());

            }
        }

        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        try {
            String id = txt_id.getText();

            String salary = txt_salary.getText();
            String sql="update staff_information set id ='"+id+"',salary='"+salary+"'  where id='"+id+"'  ";
            

            pst = myConn.prepareStatement(sql);
            pst.execute();
           
            
            JOptionPane.showMessageDialog(null, "Record Updated");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
        
      
        

        ///for insert reason into database  
        try {
            String id = txt_id.getText();
            String reason=txt_reason.getText();
            
            String sql="insert into deduction (id,reason) values (?,?)";
            
             pst = myConn.prepareStatement(sql);
            
           pst.setString(1,txt_id.getText());
            
            pst.setString(2, txt_reason.getText());
            
            pst.execute();
        } catch (Exception e) {
        }

        finally{

            try {

            } catch (Exception e) {

            }

        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calculateActionPerformed
         int salary = Integer.parseInt(txt_salary.getText());
        
        if(r_percentage.isSelected()){
            int get_percentage = Integer.parseInt(txt_percentage.getText());
                
            int percentage_amount = salary/100*get_percentage;
            int calc_percentage = salary-salary/100*get_percentage;
                
            lbl_deduction.setText(String.valueOf(percentage_amount));
                
                
            String a = String.valueOf(calc_percentage);
            lbl_salary_deduction.setText(a);
        }
        
        else if(r_amount.isSelected()){
             int get_amount = Integer.parseInt(txt_amount.getText());
             
             lbl_deduction.setText(String.valueOf(get_amount));
                int calAmount = salary-get_amount;
                String b = String.valueOf(calAmount);
                lbl_salary_deduction.setText(b);
        
        
        
        }
        
        
    }//GEN-LAST:event_btn_calculateActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        txt_amount.setText(null);
        txt_department1.setText(null);
        txt_designation.setText(null);
        txt_firstname.setText(null);
        txt_dob.setText(null);
        txt_hired.setText(null);
        txt_id.setText(null);
        txt_job.setText(null);
        txt_percentage.setText(null);
        txt_salary.setText(null);
        txt_reason.setText(null);
        txt_search.setText(null);
        txt_status.setText(null);
        txt_surname.setText(null);
        r_amount.setSelected(false);
        r_percentage.setSelected(false);
        lbl_salary_deduction.setText(null);
        lbl_deduction.setText(null);
        
        
        
        
    }//GEN-LAST:event_btn_clearActionPerformed

    private void txt_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_statusActionPerformed

    private void txt_percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_percentageActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txt_percentageActionPerformed

    private void txt_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_amountActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txt_amountActionPerformed

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
            java.util.logging.Logger.getLogger(Deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deduction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calculate;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_deduction;
    private javax.swing.JLabel lbl_emp;
    private javax.swing.JLabel lbl_percentage;
    private javax.swing.JLabel lbl_percentage1;
    private javax.swing.JLabel lbl_percentage2;
    private javax.swing.JLabel lbl_percentage3;
    private javax.swing.JLabel lbl_percentage4;
    private javax.swing.JLabel lbl_reason;
    private javax.swing.JLabel lbl_salary_deduction;
    private javax.swing.JRadioButton r_amount;
    private javax.swing.JRadioButton r_percentage;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextField txt_department1;
    private javax.swing.JTextField txt_designation;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_hired;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_job;
    private javax.swing.JTextField txt_percentage;
    private javax.swing.JTextField txt_reason;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_surname;
    // End of variables declaration//GEN-END:variables
}
