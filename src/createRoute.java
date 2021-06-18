import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class createRoute extends javax.swing.JFrame {    
    private static Route.createRte rte;
    
    public createRoute() {
        initComponents();
        showCustomers();
    }    
    
    public ArrayList<User> userList(){
        ArrayList<User> usersList = new ArrayList<>();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/routeoptimization", "root", "1234");
            
            String query1 = "SELECT * FROM customers";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query1);
            
            User user;
            while(rs.next()){
                user = new User(rs.getString("name"),rs.getString("address"), rs.getDouble("latitude"), rs.getDouble("longitude"), rs.getInt("mobile"), rs.getInt("weight"));
                usersList.add(user);                
            }
        }
        catch(ClassNotFoundException ex){
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);            
        }
        catch(SQLException ex){
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return usersList;        
    }
    
    public final void showCustomers(){
        ArrayList<User> list = userList();
        DefaultTableModel model = (DefaultTableModel) jTable_Customers.getModel();
        //DefaultTableModel model = new DefaultTableModel();
        
        Object[] row = new Object[6];       
        
        
        for(int i = 0; i < list.size(); i++){            
            row[0] = list.get(i).getName();            
            row[1] = list.get(i).getAddress();
            row[2] = list.get(i).getLatitude();
            row[3] = list.get(i).getLongitude();
            row[4] = list.get(i).getMobile();
            row[5] = list.get(i).getWeight();
            //row[6] = list.get(i).getDate();
            model.addRow(row);
        } 
    }    
       
    Connection conn;
    PreparedStatement insert;
       
    public static void main(String args[]) {        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createRoute().setVisible(true);
            }
        });
        
        rte = new Route.createRte(29, 10, 50); 
        
    }      
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtLatitude = new javax.swing.JTextField();
        txtLongitude = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        jButton_AddOrder = new javax.swing.JButton();
        txtAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser_Date = new com.toedter.calendar.JDateChooser();
        jLabel_Close = new javax.swing.JLabel();
        jLabel_Minimize = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton_ShowCustomers = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser_ShowDate = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Customers = new javax.swing.JTable();
        jButton_CreateRoute = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(950, 600));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Order", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(102, 153, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(153, 204, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(411, 435));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Client Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Latitude:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Longitude:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Client Mobile:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Item Weight:");

        txtName.setBackground(new java.awt.Color(204, 204, 204));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtLatitude.setBackground(new java.awt.Color(204, 204, 204));

        txtLongitude.setBackground(new java.awt.Color(204, 204, 204));

        txtMobile.setBackground(new java.awt.Color(204, 204, 204));

        txtWeight.setBackground(new java.awt.Color(204, 204, 204));

        jButton_AddOrder.setBackground(new java.awt.Color(153, 204, 0));
        jButton_AddOrder.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_AddOrder.setForeground(new java.awt.Color(51, 51, 51));
        jButton_AddOrder.setText("Add Order");
        jButton_AddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddOrderActionPerformed(evt);
            }
        });

        txtAddress.setBackground(new java.awt.Color(204, 204, 204));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Client Address:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date");

        jDateChooser_Date.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_AddOrder)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3)
                                .addComponent(jLabel8))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtLatitude)
                                .addComponent(txtAddress)
                                .addComponent(txtLongitude)
                                .addComponent(txtMobile)
                                .addComponent(txtWeight)
                                .addComponent(jDateChooser_Date, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLatitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLongitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jDateChooser_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jButton_AddOrder)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jLabel_Close.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Close.setForeground(new java.awt.Color(153, 204, 0));
        jLabel_Close.setText("x");
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseExited(evt);
            }
        });

        jLabel_Minimize.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Minimize.setForeground(new java.awt.Color(153, 204, 0));
        jLabel_Minimize.setText("_");
        jLabel_Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseExited(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Create Routes");

        jButton_ShowCustomers.setBackground(new java.awt.Color(153, 204, 0));
        jButton_ShowCustomers.setText("Go");
        jButton_ShowCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ShowCustomersActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Show Customers for date:");

        jTable_Customers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Address", "Latitude", "Longitude", "Mobilel", "Weight"
            }
        ));
        jScrollPane2.setViewportView(jTable_Customers);

        jButton_CreateRoute.setBackground(new java.awt.Color(153, 204, 0));
        jButton_CreateRoute.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_CreateRoute.setForeground(new java.awt.Color(51, 51, 51));
        jButton_CreateRoute.setText("Create Routes");
        jButton_CreateRoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CreateRouteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(jLabel7)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)))
                .addComponent(jDateChooser_ShowDate, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton_ShowCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_CreateRoute)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_ShowCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser_ShowDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_CreateRoute)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(904, 904, 904)
                        .addComponent(jLabel_Close))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(873, 873, 873)
                        .addComponent(jLabel_Minimize))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel_Close))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel_Minimize)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddOrderActionPerformed
         // TODO add your handling code here:
        String name = txtName.getText();
        String address = txtAddress.getText();
        String latitude = txtLatitude.getText();
        String longitude = txtLongitude.getText(); 
        String mobile = txtMobile.getText();
        String weight = txtWeight.getText();
        
        if(name .equals("")){
            JOptionPane.showMessageDialog(null, "Add name");
        }else if(address.equals("")){
            JOptionPane.showMessageDialog(null, "Add address");
        }else if(latitude.equals("")){
            JOptionPane.showMessageDialog(null, "Add latitude");
        }else if(longitude.equals("")){
            JOptionPane.showMessageDialog(null, "Add longitude");
        }else if(mobile.equals("")){
            JOptionPane.showMessageDialog(null, "Add mobile");
        }
        else if(weight.equals("")){
            JOptionPane.showMessageDialog(null, "Add weight");
        }

        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/routeoptimization", "root", "1234");            
            
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-mm-dd");
            String date = dateformat.format(jDateChooser_Date.getDate());
            
            if(jDateChooser_Date.getDate() == null){
                JOptionPane.showMessageDialog(null, "Add a date");
            }
            
            Date myDate = dateformat.parse(date);
            java.sql.Date sqlDate = new java.sql.Date(myDate.getTime()); 
            
            insert = conn.prepareStatement("insert into customers(name, address, latitude, longitude, mobile, weight, date)values(?,?,?,?,?,?,?)");
            insert.setString(1, name);
            insert.setString(2, address);
            insert.setString(3, latitude);
            insert.setString(4, longitude);
            insert.setString(5, mobile);
            insert.setString(6, weight);
            insert.setDate(7, sqlDate);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Order Added");
            //table_update();
            
            txtName.setText("");
            txtAddress.setText("");
            txtLatitude.setText("");
            txtLongitude.setText(""); 
            txtMobile.setText(""); 
            txtWeight.setText(""); 
            txtName.requestFocus();         

        }
        catch(ClassNotFoundException ex){
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);            
        }
        catch(SQLException ex){
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton_AddOrderActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void jButton_CreateRouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CreateRouteActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == jButton_CreateRoute) {
            Route.createRte route = new Route.createRte(29, 10, 50);
            route.createRoutes();
        }
        
        
        this.dispose();
    }//GEN-LAST:event_jButton_CreateRouteActionPerformed

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jLabel_CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseEntered
        this.jLabel_Close.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel_CloseMouseEntered

    private void jLabel_CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseExited
        this.jLabel_Close.setForeground(new Color(153, 204, 0));
    }//GEN-LAST:event_jLabel_CloseMouseExited

    private void jLabel_MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_MinimizeMouseClicked

    private void jLabel_MinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseEntered
        this.jLabel_Minimize.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel_MinimizeMouseEntered

    private void jLabel_MinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseExited
        this.jLabel_Minimize.setForeground(new Color(153, 204, 0));
    }//GEN-LAST:event_jLabel_MinimizeMouseExited

    private void jButton_ShowCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ShowCustomersActionPerformed
        if (evt.getSource() == jButton_ShowCustomers) {
            showCustomers();
        }
    }//GEN-LAST:event_jButton_ShowCustomersActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AddOrder;
    private javax.swing.JButton jButton_CreateRoute;
    private javax.swing.JButton jButton_ShowCustomers;
    private com.toedter.calendar.JDateChooser jDateChooser_Date;
    private com.toedter.calendar.JDateChooser jDateChooser_ShowDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_Minimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Customers;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtLatitude;
    private javax.swing.JTextField txtLongitude;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
