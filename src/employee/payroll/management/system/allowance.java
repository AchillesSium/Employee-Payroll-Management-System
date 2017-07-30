package employee.payroll.management.system;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author shaikat
 */
public class allowance extends javax.swing.JFrame {
    
    Connection myConn=null;
    PreparedStatement pst=null;
    ResultSet rs = null;
    
    double ovtotal;

    public allowance() {
        initComponents();
         myConn=Database.java_db();
        Toolkit toolkit=getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_search = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_surname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_dob = new javax.swing.JTextField();
        txt_department1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_salary = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_overtime = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_medical = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_bonus = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_others = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_total_overtime = new javax.swing.JTextField();
        txt_ratePerHour = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbl_total_amount = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        btn_calculate = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_display = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Search Employee: ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Employee ID: ");

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

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Date of birth: ");

        txt_dob.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txt_department1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Department");

        txt_salary.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Basic Salary : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("OverTime :");

        txt_overtime.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Medical : ");

        txt_medical.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_medical.setText("0");
        txt_medical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_medicalActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Bonus : ");

        txt_bonus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_bonus.setText("0");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Others : ");

        txt_others.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_others.setText("0");
        txt_others.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_othersActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Please enter the Amount :");

        txt_total_overtime.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txt_ratePerHour.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_ratePerHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ratePerHourActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Rate Per Hour : ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Total OverTime: ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Total Amount");

        lbl_total_amount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        btn_save.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

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

        table_display.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "overtime", "medical", "bonus", "others", "total_overtime", "rate_per_hour", "total_amount"
            }
        ));
        jScrollPane2.setViewportView(table_display);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_id))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_firstname))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_department1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addComponent(txt_dob)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(610, 610, 610)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel14))))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txt_overtime, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(jLabel8))
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_medical, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_others, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_bonus, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txt_total_overtime, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_total_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ratePerHour, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_department1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_overtime, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_medical, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10)
                                            .addComponent(txt_ratePerHour, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(txt_bonus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14)))
                                    .addComponent(lbl_total_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_others, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_total_overtime, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void txt_medicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_medicalActionPerformed
       
        
    }//GEN-LAST:event_txt_medicalActionPerformed

    private void txt_ratePerHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ratePerHourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ratePerHourActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

        int x=JOptionPane.showConfirmDialog(null,"Are you sure?","Salary Deducted",JOptionPane.YES_NO_OPTION);
            
        
        
        
        try {

            int salary = Integer.parseInt(txt_salary.getText());

            
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
            //String reason=txt_reason.getText();

            String sql="insert into allowance (id,overtime,medical,bonus,others,total_overtime,rate_per_hour,total_amount) values (?,?,?,?,?,?,?,?)";

            pst = myConn.prepareStatement(sql);

            pst.setString(1,txt_id.getText());
            pst.setString(2,txt_overtime.getText());
            pst.setString(3,txt_medical.getText());
            pst.setString(4, txt_bonus.getText());
            pst.setString(5,txt_others.getText());
            pst.setString(6, txt_total_overtime.getText());
            pst.setString(7,txt_ratePerHour.getText());
            pst.setString(8,lbl_total_amount.getText());

            //pst.setString(2, txt_reason.getText());

            pst.execute();
        }
        
        catch (Exception e) {
        }
        
        
          try {
            String id = txt_id.getText();
            String overtime = txt_overtime.getText();
            String medical = txt_medical.getText();
            String bonus = txt_bonus.getText();
            String others=txt_others.getText();
            String rate = txt_ratePerHour.getText();
             String t_overtime = String.valueOf(txt_total_overtime.getText());
             String t_amount = String.valueOf(lbl_total_amount.getText());

            String sql = "update allowance set id='"+id+"',overtime='"+overtime+"',medical='"+medical+"',bonus='"+bonus+"',others='"+others+"',total_overtime='"+t_overtime+"',rate_per_hour='"+rate+"',total_amount='"+t_amount+"'  where id='"+id+"'  ";
            
             //System.out.println(t_overtime + "ajndfjkn");
             pst = myConn.prepareStatement(sql);
             pst.execute();
            
        }

        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
         
          
        
        finally{

            try {
               // myConn.close();
               // pst.close();
               // rs.close();

            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

            }

        }
          display_table();
    }//GEN-LAST:event_btn_saveActionPerformed

    /*
    private double total_overtime() throws  SQLException{

    //try{
         String sql = "select overtime from allowance where id= ? ";
         
            pst = myConn.prepareStatement(sql);
            pst.setString(1,txt_total_overtime.getText());
            rs=pst.executeQuery();
            
             String ov=rs.getString("overtime");
             double ovtotal = Double.parseDouble(ov);
           //txt_total_overtime.setText(ov);
           return  ovtotal;
            
    //}
    //catch(Exception e){
    
    
    //}


}*/
    
    
    private void btn_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calculateActionPerformed
        int salary = Integer.parseInt(txt_salary.getText());
        
        try {
            String sql = "select total_overtime from allowance where id=? ";
            pst = myConn.prepareStatement(sql);
            pst.setString(1,txt_id.getText());
            rs=pst.executeQuery();
         
            
            if(rs.next()){
                String abc = rs.getString("total_overtime");
                System.out.println(abc);
              
               if(abc!=null && abc.length()>0 ){
               
                double ab = Double.parseDouble(abc);
               // System.out.println(ab);
               
              double ovtime = Double.parseDouble(txt_overtime.getText());
              //System.out.println(ovtime);
              
              double total = ab+ovtime;
              //System.out.println(total);
              String tt = String.valueOf(total);
              txt_total_overtime.setText(tt);
              
              double tamount = total*22.5;
              String ttamount = String.valueOf(tamount);
              lbl_total_amount.setText(ttamount);
            
               }
               
               else
               {
                   double ovtime = Double.parseDouble(txt_overtime.getText());
                   double total = ovtime;
              //System.out.println(total);
              String tt = String.valueOf(total);
              txt_total_overtime.setText(tt);
              //System.out.println(tt);
              
              double tamount = total*22.5;
              String ttamount = String.valueOf(tamount);
              lbl_total_amount.setText(ttamount);
                   //System.out.println(ttamount);
                   
               }
            }
             
            else{
            
            }
               
             
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        
       
        double rate_per_hour = 22.5;
        txt_ratePerHour.setText(String.valueOf(rate_per_hour));

    }//GEN-LAST:event_btn_calculateActionPerformed

    private void display_table(){
        try {
            String sql = "select * from allowance";
            pst =myConn.prepareStatement(sql);
            rs = pst.executeQuery();
            table_display.setModel(DbUtils.resultSetToTableModel(rs));
            
        
        
        
        
        
        
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
    
    
    
    
    }
  
    
    
    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
       
        txt_department1.setText(null);
       
        txt_firstname.setText(null);
        txt_dob.setText(null);
       
        txt_id.setText(null);
      
        
        txt_salary.setText(null);
       
        txt_search.setText(null);
       
        txt_surname.setText(null);
       txt_overtime.setText(null);
        txt_bonus.setText("0");
        txt_medical.setText("0");
        txt_total_overtime.setText(null);
        txt_ratePerHour.setText(null);
        lbl_total_amount.setText(null);
        txt_others.setText("0");
      

    }//GEN-LAST:event_btn_clearActionPerformed

    private void txt_othersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_othersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_othersActionPerformed

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
            java.util.logging.Logger.getLogger(allowance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(allowance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(allowance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(allowance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new allowance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calculate;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_total_amount;
    private javax.swing.JTable table_display;
    private javax.swing.JTextField txt_bonus;
    private javax.swing.JTextField txt_department1;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_medical;
    private javax.swing.JTextField txt_others;
    private javax.swing.JTextField txt_overtime;
    private javax.swing.JTextField txt_ratePerHour;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_surname;
    private javax.swing.JTextField txt_total_overtime;
    // End of variables declaration//GEN-END:variables
}
