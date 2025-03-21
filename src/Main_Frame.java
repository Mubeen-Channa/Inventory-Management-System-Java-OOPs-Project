import java.sql.*;
import java.awt.*;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Khushkuro
 */



public class Main_Frame extends javax.swing.JFrame {
           
    
    DefaultTableModel model;
    
    public Main_Frame() {
        initComponents();        
        
      
        text_S_No_catogary.setVisible(false);
        lbl_S_No_catogary.setVisible(false);

        // Other Panels Off 
        Panel_Sell.setVisible(false);
        Panel_Customer.setVisible(false);
        Panel_Catogary.setVisible(false);
        Panel_Purchase.setVisible(false);
        Panel_Stock.setVisible(false);
        Panel_Suppliers.setVisible(false);
        
        
        //Date
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = today.format(formatter);
        text_date_purchase.setText(formattedDate);
        text_date_sell.setText(formattedDate);
        
        
        
        // For Update JTables and Comboboxes
        combobox_update();
        
        stock_JTable();
        update_purshase_JTable();
        update_supplier_JTable();
        update_customer_JTable();
        update_sell_JTable();
        update_catogary_JTable();   
        
        
        // Dashboard
        lbl_show_total_quantity.setText(Integer.toString(stock_JTable2()));
        lbl_show_total_stock.setText(Integer.toString(stock_JTable()));
        lbl_show_total_sell.setText(Integer.toString(update_sell_JTable()));
        lbl_show_total_puchase.setText(Integer.toString(update_purshase_JTable()));
        lbl_show_total_profit.setText(Integer.toString(update_sell_JTable2()));
      
    }
    
    
    
    
    // SQL URL Username and Password
    String db_url = "jdbc:mysql://localhost:3306/mc_ims_db";
    String db_username = "root";
    String db_password = "1234";
    
    
        
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_option = new javax.swing.JPanel();
        lbl_Dashboard = new javax.swing.JLabel();
        lbl_Sell = new javax.swing.JLabel();
        lbl_Purchase = new javax.swing.JLabel();
        lbl_Catogary = new javax.swing.JLabel();
        lbl_Customer = new javax.swing.JLabel();
        lbl_Suppliers = new javax.swing.JLabel();
        lbl_Stock = new javax.swing.JLabel();
        lbl_MC_icon = new javax.swing.JLabel();
        Panel_Dashboard = new javax.swing.JPanel();
        lbl_dashboard = new javax.swing.JLabel();
        lbl_line = new javax.swing.JLabel();
        lbl_show_username = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        lbl_Signout = new javax.swing.JLabel();
        icon_Signout = new javax.swing.JLabel();
        lbl_signout_box = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_show_total_quantity = new javax.swing.JLabel();
        lbl_show_total_stock = new javax.swing.JLabel();
        lbl_show_total_sell = new javax.swing.JLabel();
        lbl_show_total_puchase = new javax.swing.JLabel();
        lbl_show_total_profit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        lbl_image = new javax.swing.JLabel();
        Panel_Sell = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        combo_select_item_sell = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btn_sell_sell = new javax.swing.JButton();
        btn_delete_sell = new javax.swing.JButton();
        btn_clear_sell = new javax.swing.JButton();
        text_available_quantity_sell = new javax.swing.JTextField();
        text_sell_quantity_sell = new javax.swing.JTextField();
        text_date_sell = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        text_purchase_price_sell = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        text_sell_price_sell = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        combo_customer_name_sell = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTable_sell = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        lbl_image1 = new javax.swing.JLabel();
        Panel_Purchase = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        combo_supplire_purchase = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btn_delete__purchase = new javax.swing.JButton();
        btn_clear_purchase = new javax.swing.JButton();
        btn_purchase__purchase = new javax.swing.JButton();
        text_quantity_purchase = new javax.swing.JTextField();
        text_price_purchase = new javax.swing.JTextField();
        text_name_purchase = new javax.swing.JTextField();
        combo_catagory_purchase = new javax.swing.JComboBox<>();
        text_date_purchase = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_purchase = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        lbl_image2 = new javax.swing.JLabel();
        Panel_Customer = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTable_customer = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        btn_add_customer = new javax.swing.JButton();
        btn_delete_customer = new javax.swing.JButton();
        text_customer_name_customer = new javax.swing.JTextField();
        text_location_customer = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        text_contact_customer = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        text_company_name_customer = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        lbl_image4 = new javax.swing.JLabel();
        Panel_Stock = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        JTable_stock = new javax.swing.JTable();
        lbl_image7 = new javax.swing.JLabel();
        Panel_Suppliers = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        btn_add_supplier = new javax.swing.JButton();
        btn_delete_supplier = new javax.swing.JButton();
        text_supplier_name_supplier = new javax.swing.JTextField();
        text_location_supplier = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        text_contact_supplier = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        text_company_name_supplier = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        JTable_supplier = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        lbl_image5 = new javax.swing.JLabel();
        Panel_Catogary = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        JTable_catogary = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        lbl_S_No_catogary = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        btn_delete_catogary = new javax.swing.JButton();
        btn_add_catogary = new javax.swing.JButton();
        text_catogary_name_catogary = new javax.swing.JTextField();
        text_S_No_catogary = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        lbl_S_No_message_catogary = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        lbl_image3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_option.setBackground(new java.awt.Color(102, 102, 102));

        lbl_Dashboard.setBackground(new java.awt.Color(0, 0, 0));
        lbl_Dashboard.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        lbl_Dashboard.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Dashboard.setText("Dashboard");
        lbl_Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_DashboardMouseClicked(evt);
            }
        });

        lbl_Sell.setBackground(new java.awt.Color(0, 0, 0));
        lbl_Sell.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        lbl_Sell.setForeground(java.awt.Color.darkGray);
        lbl_Sell.setText("Sell");
        lbl_Sell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_SellMouseClicked(evt);
            }
        });

        lbl_Purchase.setBackground(new java.awt.Color(0, 0, 0));
        lbl_Purchase.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        lbl_Purchase.setForeground(java.awt.Color.darkGray);
        lbl_Purchase.setText("Purchase");
        lbl_Purchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_PurchaseMouseClicked(evt);
            }
        });

        lbl_Catogary.setBackground(new java.awt.Color(0, 0, 0));
        lbl_Catogary.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        lbl_Catogary.setForeground(java.awt.Color.darkGray);
        lbl_Catogary.setText("Catogary");
        lbl_Catogary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_CatogaryMouseClicked(evt);
            }
        });

        lbl_Customer.setBackground(new java.awt.Color(0, 0, 0));
        lbl_Customer.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        lbl_Customer.setForeground(java.awt.Color.darkGray);
        lbl_Customer.setText("Customer");
        lbl_Customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_CustomerMouseClicked(evt);
            }
        });

        lbl_Suppliers.setBackground(new java.awt.Color(0, 0, 0));
        lbl_Suppliers.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        lbl_Suppliers.setForeground(java.awt.Color.darkGray);
        lbl_Suppliers.setText("Suppliers");
        lbl_Suppliers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_SuppliersMouseClicked(evt);
            }
        });

        lbl_Stock.setBackground(new java.awt.Color(0, 0, 0));
        lbl_Stock.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        lbl_Stock.setForeground(java.awt.Color.darkGray);
        lbl_Stock.setText("Stock");
        lbl_Stock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_StockMouseClicked(evt);
            }
        });

        lbl_MC_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MC Stock.png"))); // NOI18N

        javax.swing.GroupLayout Panel_optionLayout = new javax.swing.GroupLayout(Panel_option);
        Panel_option.setLayout(Panel_optionLayout);
        Panel_optionLayout.setHorizontalGroup(
            Panel_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_optionLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(Panel_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_optionLayout.createSequentialGroup()
                        .addComponent(lbl_MC_icon)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_optionLayout.createSequentialGroup()
                        .addGroup(Panel_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Sell, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbl_Dashboard)
                                .addComponent(lbl_Suppliers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_Customer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_Catogary, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_Purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))))
        );
        Panel_optionLayout.setVerticalGroup(
            Panel_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_optionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_MC_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(lbl_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Sell, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Customer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Catogary, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );

        getContentPane().add(Panel_option, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 550));

        Panel_Dashboard.setMinimumSize(new java.awt.Dimension(950, 550));
        Panel_Dashboard.setPreferredSize(new java.awt.Dimension(950, 550));
        Panel_Dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_dashboard.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        lbl_dashboard.setForeground(new java.awt.Color(255, 255, 255));
        lbl_dashboard.setText("Dashboard");
        Panel_Dashboard.add(lbl_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, 50));

        lbl_line.setForeground(new java.awt.Color(255, 255, 255));
        lbl_line.setText("______________________________________________");
        Panel_Dashboard.add(lbl_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 240, -1));

        lbl_show_username.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lbl_show_username.setForeground(new java.awt.Color(255, 255, 255));
        Panel_Dashboard.add(lbl_show_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 110, 60));

        lbl_user.setBackground(new java.awt.Color(0, 0, 0));
        lbl_user.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lbl_user.setForeground(new java.awt.Color(255, 255, 255));
        lbl_user.setText("User :");
        Panel_Dashboard.add(lbl_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 80, 60));

        lbl_Signout.setBackground(new java.awt.Color(0, 0, 0));
        lbl_Signout.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        lbl_Signout.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Signout.setText("Sign Out");
        lbl_Signout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_SignoutMouseClicked(evt);
            }
        });
        Panel_Dashboard.add(lbl_Signout, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 80, 50));

        icon_Signout.setForeground(new java.awt.Color(255, 255, 255));
        icon_Signout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_Logout.png"))); // NOI18N
        Panel_Dashboard.add(icon_Signout, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        lbl_signout_box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Neon Background 2.jpg"))); // NOI18N
        Panel_Dashboard.add(lbl_signout_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 140, 50));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Stock");
        Panel_Dashboard.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Profit");
        Panel_Dashboard.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, -1, -1));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total Purchase");
        Panel_Dashboard.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total Sell");
        Panel_Dashboard.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jLabel49.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Total Quantity");
        Panel_Dashboard.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Refresh Logo.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        Panel_Dashboard.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lbl_show_total_quantity.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        lbl_show_total_quantity.setForeground(new java.awt.Color(255, 255, 255));
        Panel_Dashboard.add(lbl_show_total_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 110, 30));

        lbl_show_total_stock.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        lbl_show_total_stock.setForeground(new java.awt.Color(255, 255, 255));
        Panel_Dashboard.add(lbl_show_total_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 110, 30));

        lbl_show_total_sell.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        lbl_show_total_sell.setForeground(new java.awt.Color(255, 255, 255));
        Panel_Dashboard.add(lbl_show_total_sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 130, 30));

        lbl_show_total_puchase.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        lbl_show_total_puchase.setForeground(new java.awt.Color(255, 255, 255));
        Panel_Dashboard.add(lbl_show_total_puchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 130, 30));

        lbl_show_total_profit.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        lbl_show_total_profit.setForeground(new java.awt.Color(255, 255, 255));
        Panel_Dashboard.add(lbl_show_total_profit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, 120, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Panel.jpg"))); // NOI18N
        Panel_Dashboard.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Panel.jpg"))); // NOI18N
        Panel_Dashboard.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Panel.jpg"))); // NOI18N
        Panel_Dashboard.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Panel.jpg"))); // NOI18N
        Panel_Dashboard.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, -1, -1));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Panel.jpg"))); // NOI18N
        Panel_Dashboard.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        lbl_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Neon Background 2.jpg"))); // NOI18N
        Panel_Dashboard.add(lbl_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 550));

        getContentPane().add(Panel_Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 950, 550));

        Panel_Sell.setMinimumSize(new java.awt.Dimension(950, 550));
        Panel_Sell.setPreferredSize(new java.awt.Dimension(950, 550));
        Panel_Sell.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("SELLS");
        Panel_Sell.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Purchase Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Sell Item");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel28.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Select Item :");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        combo_select_item_sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_select_item_sellActionPerformed(evt);
            }
        });
        jPanel2.add(combo_select_item_sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 280, -1));

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Customer Name :");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Sell Quantity :");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Date :");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        btn_sell_sell.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn_sell_sell.setText("Sell");
        btn_sell_sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sell_sellActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sell_sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 80, 30));

        btn_delete_sell.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn_delete_sell.setText("Delete");
        btn_delete_sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_sellActionPerformed(evt);
            }
        });
        jPanel2.add(btn_delete_sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 80, 30));

        btn_clear_sell.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn_clear_sell.setText("Clear");
        btn_clear_sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clear_sellActionPerformed(evt);
            }
        });
        jPanel2.add(btn_clear_sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 80, 30));

        text_available_quantity_sell.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        text_available_quantity_sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_available_quantity_sellActionPerformed(evt);
            }
        });
        jPanel2.add(text_available_quantity_sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 130, -1));

        text_sell_quantity_sell.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jPanel2.add(text_sell_quantity_sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 130, -1));

        text_date_sell.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        text_date_sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_date_sellActionPerformed(evt);
            }
        });
        jPanel2.add(text_date_sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 130, -1));

        jLabel31.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Purchase Price :");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        text_purchase_price_sell.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jPanel2.add(text_purchase_price_sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 130, -1));

        jLabel32.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Sell Price :");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        text_sell_price_sell.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jPanel2.add(text_sell_price_sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 130, -1));

        jLabel51.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Available Quantity :");
        jPanel2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jPanel2.add(combo_customer_name_sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 130, -1));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Neon Background 2.jpg"))); // NOI18N
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 410));

        Panel_Sell.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 300, 410));

        JTable_sell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S No", "Name", "Cust: Name", "Quantity", "Price", "Total", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable_sell.getTableHeader().setResizingAllowed(false);
        JTable_sell.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(JTable_sell);
        if (JTable_sell.getColumnModel().getColumnCount() > 0) {
            JTable_sell.getColumnModel().getColumn(0).setResizable(false);
            JTable_sell.getColumnModel().getColumn(1).setResizable(false);
            JTable_sell.getColumnModel().getColumn(2).setResizable(false);
            JTable_sell.getColumnModel().getColumn(3).setResizable(false);
            JTable_sell.getColumnModel().getColumn(4).setResizable(false);
            JTable_sell.getColumnModel().getColumn(5).setResizable(false);
            JTable_sell.getColumnModel().getColumn(6).setResizable(false);
        }

        Panel_Sell.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 600, 410));

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("________________________________________________________________________________________________________________________________");
        Panel_Sell.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        lbl_image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Neon Background 2.jpg"))); // NOI18N
        Panel_Sell.add(lbl_image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 550));

        getContentPane().add(Panel_Sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 950, 550));

        Panel_Purchase.setMinimumSize(new java.awt.Dimension(950, 550));
        Panel_Purchase.setPreferredSize(new java.awt.Dimension(950, 550));
        Panel_Purchase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 34)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("PURCHASE");
        Panel_Purchase.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Purchase Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Name :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Purchase Item");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        combo_supplire_purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_supplire_purchaseActionPerformed(evt);
            }
        });
        jPanel1.add(combo_supplire_purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 170, -1));

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Quantity :");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, -1, -1));

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Price Per Unit :");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Date  :");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Supplier :");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        btn_delete__purchase.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn_delete__purchase.setText("Delete");
        btn_delete__purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete__purchaseActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete__purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 100, 30));

        btn_clear_purchase.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn_clear_purchase.setText("Clear");
        btn_clear_purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clear_purchaseActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear_purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 100, 30));

        btn_purchase__purchase.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn_purchase__purchase.setText("Purchase");
        btn_purchase__purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_purchase__purchaseActionPerformed(evt);
            }
        });
        jPanel1.add(btn_purchase__purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 100, 30));

        text_quantity_purchase.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        text_quantity_purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_quantity_purchaseActionPerformed(evt);
            }
        });
        jPanel1.add(text_quantity_purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 210, -1));

        text_price_purchase.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jPanel1.add(text_price_purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 140, -1));

        text_name_purchase.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        text_name_purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_name_purchaseActionPerformed(evt);
            }
        });
        jPanel1.add(text_name_purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 210, -1));

        jPanel1.add(combo_catagory_purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 210, -1));

        text_date_purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_date_purchaseActionPerformed(evt);
            }
        });
        jPanel1.add(text_date_purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 210, -1));

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Catagory :");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, -1, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Neon Background 2.jpg"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 180));

        Panel_Purchase.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 930, 180));

        JTable_purchase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S No", "Name", "Quantity", "Supplier", "Catagory", "Price", "T Price", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable_purchase.getTableHeader().setResizingAllowed(false);
        JTable_purchase.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(JTable_purchase);

        Panel_Purchase.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 930, 230));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("________________________________________________________________________________________________________________________________");
        Panel_Purchase.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        lbl_image2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Neon Background 2.jpg"))); // NOI18N
        Panel_Purchase.add(lbl_image2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 550));

        getContentPane().add(Panel_Purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 950, 550));

        Panel_Customer.setPreferredSize(new java.awt.Dimension(950, 550));
        Panel_Customer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("________________________________________________________________________________________________________________________________");
        Panel_Customer.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 640, -1));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Customer");
        Panel_Customer.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        JTable_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S No", "Name", "Location", "Contact", "Company"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable_customer.getTableHeader().setResizingAllowed(false);
        JTable_customer.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(JTable_customer);
        if (JTable_customer.getColumnModel().getColumnCount() > 0) {
            JTable_customer.getColumnModel().getColumn(0).setResizable(false);
            JTable_customer.getColumnModel().getColumn(1).setResizable(false);
            JTable_customer.getColumnModel().getColumn(2).setResizable(false);
            JTable_customer.getColumnModel().getColumn(3).setResizable(false);
            JTable_customer.getColumnModel().getColumn(4).setResizable(false);
        }

        Panel_Customer.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 130, 590, 410));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Purchase Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Enter Customer Details");
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel36.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Customer Name :");
        jPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel37.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Location :");
        jPanel3.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        btn_add_customer.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn_add_customer.setText("Add Customer");
        btn_add_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_customerActionPerformed(evt);
            }
        });
        jPanel3.add(btn_add_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 140, 30));

        btn_delete_customer.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn_delete_customer.setText("Delete Customer");
        btn_delete_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_customerActionPerformed(evt);
            }
        });
        jPanel3.add(btn_delete_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, 30));

        text_customer_name_customer.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jPanel3.add(text_customer_name_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 140, -1));

        text_location_customer.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jPanel3.add(text_location_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 140, -1));

        jLabel39.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Contact :");
        jPanel3.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        text_contact_customer.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jPanel3.add(text_contact_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 140, -1));

        jLabel40.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Company Name :");
        jPanel3.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        text_company_name_customer.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jPanel3.add(text_company_name_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 140, -1));

        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Neon Background 2.jpg"))); // NOI18N
        jPanel3.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 410));

        Panel_Customer.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, -1, 410));

        lbl_image4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Neon Background 2.jpg"))); // NOI18N
        Panel_Customer.add(lbl_image4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 550));

        getContentPane().add(Panel_Customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 950, 550));

        Panel_Stock.setMinimumSize(new java.awt.Dimension(950, 550));
        Panel_Stock.setPreferredSize(new java.awt.Dimension(950, 550));
        Panel_Stock.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("________________________________________________________________________________________________________________________________");
        Panel_Stock.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Stock");
        Panel_Stock.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        JTable_stock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S No", "Name", "Supplier", "Catogary", "Quantity Remaining", "Unit Price", "Total Stock Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable_stock.getTableHeader().setResizingAllowed(false);
        JTable_stock.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(JTable_stock);
        if (JTable_stock.getColumnModel().getColumnCount() > 0) {
            JTable_stock.getColumnModel().getColumn(0).setResizable(false);
            JTable_stock.getColumnModel().getColumn(1).setResizable(false);
            JTable_stock.getColumnModel().getColumn(2).setResizable(false);
            JTable_stock.getColumnModel().getColumn(3).setResizable(false);
            JTable_stock.getColumnModel().getColumn(4).setResizable(false);
            JTable_stock.getColumnModel().getColumn(5).setResizable(false);
            JTable_stock.getColumnModel().getColumn(6).setResizable(false);
        }

        Panel_Stock.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 130, 890, 410));

        lbl_image7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Neon Background 2.jpg"))); // NOI18N
        Panel_Stock.add(lbl_image7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 550));

        getContentPane().add(Panel_Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 950, 550));

        Panel_Suppliers.setMinimumSize(new java.awt.Dimension(950, 550));
        Panel_Suppliers.setPreferredSize(new java.awt.Dimension(950, 550));
        Panel_Suppliers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Purchase Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Enter Supplier Details");
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel38.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Supplier Name :");
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel42.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Location :");
        jPanel4.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        btn_add_supplier.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn_add_supplier.setText("Add Supplier");
        btn_add_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_supplierActionPerformed(evt);
            }
        });
        jPanel4.add(btn_add_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 140, 30));

        btn_delete_supplier.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn_delete_supplier.setText("Delete Supplier");
        btn_delete_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_supplierActionPerformed(evt);
            }
        });
        jPanel4.add(btn_delete_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 140, 30));

        text_supplier_name_supplier.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jPanel4.add(text_supplier_name_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 110, -1));

        text_location_supplier.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jPanel4.add(text_location_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 110, -1));

        jLabel43.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Contact :");
        jPanel4.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        text_contact_supplier.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jPanel4.add(text_contact_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 110, -1));

        jLabel44.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Company Name :");
        jPanel4.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        text_company_name_supplier.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jPanel4.add(text_company_name_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 110, -1));

        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Neon Background 2.jpg"))); // NOI18N
        jPanel4.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 410));

        Panel_Suppliers.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 300, 410));

        JTable_supplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S No", "Name", "Location", "Contact", "Company"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable_supplier.getTableHeader().setResizingAllowed(false);
        JTable_supplier.getTableHeader().setReorderingAllowed(false);
        JTable_supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTable_supplierMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(JTable_supplier);
        if (JTable_supplier.getColumnModel().getColumnCount() > 0) {
            JTable_supplier.getColumnModel().getColumn(0).setResizable(false);
            JTable_supplier.getColumnModel().getColumn(1).setResizable(false);
            JTable_supplier.getColumnModel().getColumn(2).setResizable(false);
            JTable_supplier.getColumnModel().getColumn(3).setResizable(false);
            JTable_supplier.getColumnModel().getColumn(4).setResizable(false);
        }

        Panel_Suppliers.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 130, 590, 410));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Supplier");
        Panel_Suppliers.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("________________________________________________________________________________________________________________________________");
        Panel_Suppliers.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        lbl_image5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Neon Background 2.jpg"))); // NOI18N
        Panel_Suppliers.add(lbl_image5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 550));

        getContentPane().add(Panel_Suppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 950, 550));

        Panel_Catogary.setMinimumSize(new java.awt.Dimension(950, 550));
        Panel_Catogary.setPreferredSize(new java.awt.Dimension(950, 550));
        Panel_Catogary.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("________________________________________________________________________________________________________________________________");
        Panel_Catogary.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 640, -1));

        JTable_catogary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S No", "Catagory"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable_catogary.getTableHeader().setResizingAllowed(false);
        JTable_catogary.getTableHeader().setReorderingAllowed(false);
        JTable_catogary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTable_catogaryMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(JTable_catogary);
        if (JTable_catogary.getColumnModel().getColumnCount() > 0) {
            JTable_catogary.getColumnModel().getColumn(0).setResizable(false);
            JTable_catogary.getColumnModel().getColumn(1).setResizable(false);
        }

        Panel_Catogary.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 550, 410));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Purchase Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_S_No_catogary.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lbl_S_No_catogary.setForeground(new java.awt.Color(255, 255, 255));
        lbl_S_No_catogary.setText("S No :");
        jPanel5.add(lbl_S_No_catogary, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel50.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Add Catogary");
        jPanel5.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btn_delete_catogary.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn_delete_catogary.setText("Delete Catogary");
        btn_delete_catogary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_catogaryActionPerformed(evt);
            }
        });
        jPanel5.add(btn_delete_catogary, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 140, 30));

        btn_add_catogary.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn_add_catogary.setText("Add Catogary");
        btn_add_catogary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_catogaryActionPerformed(evt);
            }
        });
        jPanel5.add(btn_add_catogary, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 140, 30));

        text_catogary_name_catogary.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jPanel5.add(text_catogary_name_catogary, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 180, -1));

        text_S_No_catogary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_S_No_catogaryActionPerformed(evt);
            }
        });
        jPanel5.add(text_S_No_catogary, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 180, -1));

        jLabel52.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Catogary Name :");
        jPanel5.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        lbl_S_No_message_catogary.setFont(new java.awt.Font("Trebuchet MS", 2, 12)); // NOI18N
        lbl_S_No_message_catogary.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(lbl_S_No_message_catogary, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 180, 20));

        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Neon Background 2.jpg"))); // NOI18N
        jPanel5.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 410));

        Panel_Catogary.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 340, 410));

        jLabel57.setFont(new java.awt.Font("Trebuchet MS", 1, 34)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Catogary");
        Panel_Catogary.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        lbl_image3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Neon Background 2.jpg"))); // NOI18N
        Panel_Catogary.add(lbl_image3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 550));

        getContentPane().add(Panel_Catogary, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 950, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_SignoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SignoutMouseClicked
        int showmessage=JOptionPane.showConfirmDialog(this, "Do You want to Sign Out", "Warning", JOptionPane.YES_NO_OPTION);
        if(showmessage==JOptionPane.YES_OPTION) {
                new Login_Frame().setVisible(true);
                this.dispose(); 
            }     
    }//GEN-LAST:event_lbl_SignoutMouseClicked

    private void lbl_DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_DashboardMouseClicked
        
        Panel_Dashboard.setVisible(true);
        Panel_Sell.setVisible(false);
        Panel_Customer.setVisible(false);
        Panel_Catogary.setVisible(false);
        Panel_Purchase.setVisible(false);
        Panel_Stock.setVisible(false);
        Panel_Suppliers.setVisible(false);

        lbl_Dashboard.setForeground(Color.white);
        lbl_Sell.setForeground(Color.darkGray);
        lbl_Customer.setForeground(Color.darkGray);
        lbl_Catogary.setForeground(Color.darkGray);
        lbl_Purchase.setForeground(Color.darkGray);
        lbl_Stock.setForeground(Color.darkGray);
        lbl_Suppliers.setForeground(Color.darkGray);
        
        text_S_No_catogary.setVisible(false);
        lbl_S_No_catogary.setVisible(false);
        lbl_S_No_message_catogary.setVisible(false);
    }//GEN-LAST:event_lbl_DashboardMouseClicked

    private void lbl_SellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SellMouseClicked
        Panel_Sell.setVisible(true);
        Panel_Dashboard.setVisible(false);
        Panel_Customer.setVisible(false);
        Panel_Catogary.setVisible(false);
        Panel_Purchase.setVisible(false);
        Panel_Stock.setVisible(false);
        Panel_Suppliers.setVisible(false);

        lbl_Sell.setForeground(Color.white);
        lbl_Dashboard.setForeground(Color.darkGray);
        lbl_Customer.setForeground(Color.darkGray);
        lbl_Catogary.setForeground(Color.darkGray);
        lbl_Purchase.setForeground(Color.darkGray);
        lbl_Stock.setForeground(Color.darkGray);
        lbl_Suppliers.setForeground(Color.darkGray);
        
        text_S_No_catogary.setVisible(false);
        lbl_S_No_catogary.setVisible(false);
        lbl_S_No_message_catogary.setVisible(false);
        
    }//GEN-LAST:event_lbl_SellMouseClicked

    private void lbl_PurchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_PurchaseMouseClicked
        // TODO add your handling code here:
        Panel_Purchase.setVisible(true);
        Panel_Dashboard.setVisible(false);
        Panel_Sell.setVisible(false);
        Panel_Customer.setVisible(false);
        Panel_Catogary.setVisible(false);
        Panel_Stock.setVisible(false);
        Panel_Suppliers.setVisible(false);

        lbl_Purchase.setForeground(Color.white);
        lbl_Dashboard.setForeground(Color.darkGray);
        lbl_Sell.setForeground(Color.darkGray);
        lbl_Customer.setForeground(Color.darkGray);
        lbl_Catogary.setForeground(Color.darkGray);
        lbl_Stock.setForeground(Color.darkGray);
        lbl_Suppliers.setForeground(Color.darkGray);
        
        text_S_No_catogary.setVisible(false);
        lbl_S_No_catogary.setVisible(false);
        lbl_S_No_message_catogary.setVisible(false);
    }//GEN-LAST:event_lbl_PurchaseMouseClicked

    private void lbl_CustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CustomerMouseClicked
        // TODO add your handling code here:
        Panel_Customer.setVisible(true);
        Panel_Dashboard.setVisible(false);
        Panel_Sell.setVisible(false);
        Panel_Catogary.setVisible(false);
        Panel_Purchase.setVisible(false);
        Panel_Stock.setVisible(false);
        Panel_Suppliers.setVisible(false);

        lbl_Customer.setForeground(Color.white);
        lbl_Dashboard.setForeground(Color.darkGray);
        lbl_Sell.setForeground(Color.darkGray);
        lbl_Catogary.setForeground(Color.darkGray);
        lbl_Purchase.setForeground(Color.darkGray);
        lbl_Stock.setForeground(Color.darkGray);
        lbl_Suppliers.setForeground(Color.darkGray);
        
        text_S_No_catogary.setVisible(false);
        lbl_S_No_catogary.setVisible(false);
        lbl_S_No_message_catogary.setVisible(false);
    }//GEN-LAST:event_lbl_CustomerMouseClicked

    private void lbl_SuppliersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SuppliersMouseClicked
        // TODO add your handling code here:
        Panel_Suppliers.setVisible(true);
        Panel_Dashboard.setVisible(false);
        Panel_Sell.setVisible(false);
        Panel_Customer.setVisible(false);
        Panel_Catogary.setVisible(false);
        Panel_Purchase.setVisible(false);
        Panel_Stock.setVisible(false);

        lbl_Suppliers.setForeground(Color.white);
        lbl_Dashboard.setForeground(Color.darkGray);
        lbl_Sell.setForeground(Color.darkGray);
        lbl_Customer.setForeground(Color.darkGray);
        lbl_Catogary.setForeground(Color.darkGray);
        lbl_Purchase.setForeground(Color.darkGray);
        lbl_Stock.setForeground(Color.darkGray);
        
        text_S_No_catogary.setVisible(false);
        lbl_S_No_catogary.setVisible(false);
        lbl_S_No_message_catogary.setVisible(false);
    }//GEN-LAST:event_lbl_SuppliersMouseClicked

    private void lbl_StockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_StockMouseClicked
        // TODO add your handling code here:
        Panel_Stock.setVisible(true);
        Panel_Dashboard.setVisible(false);
        Panel_Sell.setVisible(false);
        Panel_Customer.setVisible(false);
        Panel_Catogary.setVisible(false);
        Panel_Purchase.setVisible(false);
        Panel_Suppliers.setVisible(false);

        lbl_Stock.setForeground(Color.white);
        lbl_Dashboard.setForeground(Color.darkGray);
        lbl_Sell.setForeground(Color.darkGray);
        lbl_Customer.setForeground(Color.darkGray);
        lbl_Catogary.setForeground(Color.darkGray);
        lbl_Purchase.setForeground(Color.darkGray);
        lbl_Suppliers.setForeground(Color.darkGray);
        
        text_S_No_catogary.setVisible(false);
        lbl_S_No_catogary.setVisible(false);
        lbl_S_No_message_catogary.setVisible(false);
    }//GEN-LAST:event_lbl_StockMouseClicked

    private void btn_purchase__purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_purchase__purchaseActionPerformed
        
        try{
            //
            String Name  = text_name_purchase.getText();
            int quantity = Integer.parseInt(text_quantity_purchase.getText());
            String supplier = combo_supplire_purchase.getSelectedItem().toString();
            String catagory = combo_catagory_purchase.getSelectedItem().toString();
            int price    = Integer.parseInt(text_price_purchase.getText());
            int t_price  = quantity*price;
            String date  = text_date_purchase.getText();
            
            
            //
            Connection connection = DriverManager.getConnection(db_url,db_username,db_password);
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT MAX(S_No) FROM purchase_table");
            int S_No = 0;
        
            if (rs.next()) {
                S_No = rs.getInt(1);
            }
            
            rs.close();
            stmt.close();

            PreparedStatement pstmt = connection.prepareStatement("INSERT INTO purchase_table(S_No,Name,quantity,supplier,catagory,price,t_price,date) VALUES (?,?,?,?,?,?,?,?)");
            PreparedStatement pstmt2 = connection.prepareStatement("INSERT INTO stock_table(S_No,Name,supplier,catagory,quantity,price,t_price) VALUES (?,?,?,?,?,?,?)");
            
            // store in purchase table
            pstmt.setInt(1,S_No + 1);
            pstmt.setString(2, Name);
            pstmt.setInt(3, quantity);
            pstmt.setString(4, supplier);
            pstmt.setString(5,catagory);   
            pstmt.setInt(6, price);
            pstmt.setInt(7, t_price);
            pstmt.setString(8, date);
    
            
            // store in stock table
            pstmt2.setInt(1,S_No + 1);
            pstmt2.setString(2, Name);
            pstmt2.setString(3, supplier);
            pstmt2.setString(4,catagory);
            pstmt2.setInt(5, quantity);
            pstmt2.setInt(6, price);
            pstmt2.setInt(7, t_price);

    
            pstmt2.executeUpdate();
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Item Purchased");
            
            stock_JTable();
            update_purshase_JTable();
            
            text_name_purchase.setText("");
            text_quantity_purchase.setText("");
            text_quantity_purchase.setText("");
            combo_supplire_purchase.setName("");
            combo_catagory_purchase.setName("");
            text_price_purchase.setText("");
            
        }
        
        catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Invalid inputs or some fields are empty");
        }
        
        
        catch(Exception mubeen){
            System.out.println("Error : " + mubeen.getMessage());
        }
        
    }//GEN-LAST:event_btn_purchase__purchaseActionPerformed

    private void btn_sell_sellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sell_sellActionPerformed
        try {
            // Retrive DAta
            String item = combo_select_item_sell.getSelectedItem().toString();
            String customer = combo_customer_name_sell.getSelectedItem().toString();
            int sell_quantity = Integer.parseInt(text_sell_quantity_sell.getText());
            int sell_price = Integer.parseInt(text_sell_price_sell.getText());
            int purchase_price = Integer.parseInt(text_purchase_price_sell.getText());
            int t_price = sell_quantity*sell_price;
            String date = text_date_sell.getText();
            
            // Profit 
            int t_sell     = sell_quantity*sell_price;
            int t_purchase = purchase_price*sell_price;
            int profit     = sell_price-purchase_price;
            
            // Connection
            Connection connection = DriverManager.getConnection(db_url,db_username,db_password);
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT MAX(S_No) FROM sell_table");
            
            int S_No = 0;
        
            if (rs.next()) {
                S_No = rs.getInt(1);
            }
            
            rs.close();
            stmt.close();
            
            PreparedStatement pstmt = connection.prepareStatement("INSERT INTO sell_table(S_No,Name,Customer,Quantity,Price,T_Price,Date,Profit) VALUES (?,?,?,?,?,?,?,?)");
            PreparedStatement pstmt2 = connection.prepareStatement("UPDATE stock_table SET quantity=?, t_price=? WHERE Name=?");
            
            // Store Data in Sell Table
            int available_quantity = Integer.parseInt(text_available_quantity_sell.getText());
            
            if(available_quantity>sell_quantity){
                pstmt.setInt(1, S_No + 1);
                pstmt.setString(2, item);
                pstmt.setString(3, customer);
                pstmt.setInt(4, sell_quantity);
                pstmt.setInt(5, sell_price);
                pstmt.setInt(6, t_price);
                pstmt.setString(7, date);
                pstmt.setInt(8, profit);

                
                // Update Data in Stock Table
                int quantity_remaining = (available_quantity-sell_quantity);
            
//                int purchase_price = Integer.parseInt(text_purchase_price_sell.getText());
                int t_price2 = purchase_price*quantity_remaining;

                pstmt2.setInt(1, quantity_remaining);
                pstmt2.setInt(2, t_price2);
                pstmt2.setString(3, item);

                pstmt2.executeUpdate();            
                pstmt.executeUpdate();
            
                JOptionPane.showMessageDialog(this, "Item Sold");
            
                stock_JTable();
                update_sell_JTable();

                text_sell_price_sell.setText("");
                text_sell_quantity_sell.setText("");
            }
            
            else{
                JOptionPane.showMessageDialog(this, "Entered Quantity Not Available!");
            }          
        } 
        
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_sell_sellActionPerformed
    
    private void btn_delete_sellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_sellActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) JTable_sell.getModel();
        int selected_index = JTable_sell.getSelectedRow();
         
        try {           
            int serial = Integer.parseInt(model.getValueAt(selected_index, 0).toString());
            
            Connection conn = DriverManager.getConnection(db_url, db_username, db_password);
            PreparedStatement pstmt = conn.prepareStatement("delete from sell_table where S_No=?");
            pstmt.setInt(1 , serial);
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Record Deleted");
            
            update_sell_JTable();
            combobox_update();
            
        } 
         
        catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_delete_sellActionPerformed

    private void btn_delete__purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete__purchaseActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) JTable_purchase.getModel();
        int selected_index = JTable_purchase.getSelectedRow();
         
        try {           
            int serial = Integer.parseInt(model.getValueAt(selected_index, 0).toString());
            
            Connection conn = DriverManager.getConnection(db_url, db_username, db_password);
            PreparedStatement pstmt = conn.prepareStatement("delete from purchase_table where S_No=?");
            pstmt.setInt(1 , serial);
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Record Deleted");
            
            update_purshase_JTable();
            combobox_update();
            
        } 
         
        catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_delete__purchaseActionPerformed

    private void text_date_purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_date_purchaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_date_purchaseActionPerformed

    private void text_date_sellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_date_sellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_date_sellActionPerformed

    private void btn_add_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_customerActionPerformed

        String customer_name     = text_customer_name_customer.getText();
        String customer_location = text_location_customer.getText();
        String customer_contact  = text_contact_customer.getText();
        String customer_company_name = text_company_name_customer.getText();
        
        if(text_customer_name_customer.getText().trim().isEmpty() || text_location_customer.getText().trim().isEmpty() || text_contact_customer.getText().trim().isEmpty() || text_company_name_customer.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(this, "FIll The All Fields");
        }
        
        else{
            try {
                Connection connection = DriverManager.getConnection(db_url, db_username, db_password);
                Statement statement = connection.createStatement();
                
                ResultSet rs = statement.executeQuery("SELECT MAX(S_No) FROM customer_table");
                int maxSerial = 0;
                        
                if (rs.next()) {
                    maxSerial = rs.getInt(1);
                }
                
                rs.close();
                statement.close();
                
                PreparedStatement pstmt = connection.prepareStatement("INSERT INTO customer_table(S_No, Name, Location, Contact, Company) VALUES (?,?,?,?,?)");
                pstmt.setInt(1, maxSerial + 1);
                pstmt.setString(2, customer_name);
                pstmt.setString(3, customer_location);
                pstmt.setString(4, customer_contact);
                pstmt.setString(5, customer_company_name);

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Customer Added");

                update_customer_JTable();
                combobox_update();
                
                text_customer_name_customer.setText("");
                text_location_customer.setText("");
                text_contact_customer.setText("");
                text_company_name_customer.setText("");
                
                connection.close();
            }
            
            catch(Exception e){
                System.out.println(e);
            }
        }
        
    }//GEN-LAST:event_btn_add_customerActionPerformed

    private void btn_delete_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_customerActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) JTable_customer.getModel();
        int selected_index = JTable_customer.getSelectedRow();
         
        try {           
            int serial = Integer.parseInt(model.getValueAt(selected_index, 0).toString());
            
            Connection conn = DriverManager.getConnection(db_url, db_username, db_password);
            PreparedStatement pstmt = conn.prepareStatement("delete from customer_table where S_No=?");
            pstmt.setInt(1 , serial);
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Record Deleted");
            
            update_customer_JTable();
            combobox_update();
            
        } 
         
        catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_delete_customerActionPerformed

    private void btn_add_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_supplierActionPerformed
             
        String supplier_name     = text_supplier_name_supplier.getText();
        String supplier_location = text_location_supplier.getText();
        String supplier_contact  = text_contact_supplier.getText();
        String supplier_company_name = text_company_name_supplier.getText();
        
        if(text_supplier_name_supplier.getText().trim().isEmpty() || text_location_supplier.getText().trim().isEmpty() || text_contact_supplier.getText().trim().isEmpty() || text_company_name_supplier.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(this, "FIll The All Fields");
        }
        
        else{
            try {
                Connection connection = DriverManager.getConnection(db_url, db_username, db_password);
                Statement statement = connection.createStatement();
                
                ResultSet rs = statement.executeQuery("SELECT MAX(S_No) FROM suppliers_table");
                int maxSerial = 0;
                        
                if (rs.next()) {
                    maxSerial = rs.getInt(1);
                }
                
                rs.close();
                statement.close();

                PreparedStatement pstmt = connection.prepareStatement("INSERT INTO suppliers_table(S_No, Name, Location, Contact, Company) VALUES (?, ?, ?,?,?)");
                pstmt.setInt(1, maxSerial + 1);
                pstmt.setString(2, supplier_name);
                pstmt.setString(3, supplier_location);
                pstmt.setString(4, supplier_contact);
                pstmt.setString(5, supplier_company_name);

                pstmt.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Supplier Added");

                update_supplier_JTable();
                combobox_update();
                
                text_supplier_name_supplier.setText("");
                text_location_supplier.setText("");
                text_contact_supplier.setText("");
                text_company_name_supplier.setText("");
                
                connection.close();
            } 
            
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_btn_add_supplierActionPerformed

    private void btn_delete_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_supplierActionPerformed
         
        DefaultTableModel model = (DefaultTableModel) JTable_supplier.getModel();
        int selected_index = JTable_supplier.getSelectedRow();
         
        try {  
            int serial = Integer.parseInt(model.getValueAt(selected_index, 0).toString());
            
            int showmessage=JOptionPane.showConfirmDialog(this, "Do You want to Delete the selected Row", "Warning", JOptionPane.YES_NO_OPTION);

            if(showmessage==JOptionPane.YES_OPTION){
                
                Connection conn = DriverManager.getConnection(db_url, db_username, db_password);
                PreparedStatement pstmt = conn.prepareStatement("delete from suppliers_table where S_No=?");
                pstmt.setInt(1 , serial);
                pstmt.executeUpdate();

                JOptionPane.showMessageDialog(this, "Record Deleted");

                update_supplier_JTable();
                combobox_update();    
            }
        } 
         
        catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_delete_supplierActionPerformed

    private void lbl_CatogaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CatogaryMouseClicked
        // TODO add your handling code here:
        Panel_Catogary.setVisible(true);
        Panel_Dashboard.setVisible(false);
        Panel_Sell.setVisible(false);
        Panel_Customer.setVisible(false);
        Panel_Purchase.setVisible(false);
        Panel_Stock.setVisible(false);
        Panel_Suppliers.setVisible(false);

        lbl_Catogary.setForeground(Color.white);
        lbl_Dashboard.setForeground(Color.darkGray);
        lbl_Sell.setForeground(Color.darkGray);
        lbl_Customer.setForeground(Color.darkGray);
        lbl_Purchase.setForeground(Color.darkGray);
        lbl_Stock.setForeground(Color.darkGray);
        lbl_Suppliers.setForeground(Color.darkGray);
        
        text_S_No_catogary.setVisible(false);
        lbl_S_No_catogary.setVisible(false);
        lbl_S_No_message_catogary.setVisible(false);
    }//GEN-LAST:event_lbl_CatogaryMouseClicked

    private void JTable_supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable_supplierMouseClicked
    }//GEN-LAST:event_JTable_supplierMouseClicked

    private void combo_supplire_purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_supplire_purchaseActionPerformed
    }//GEN-LAST:event_combo_supplire_purchaseActionPerformed

    private void btn_delete_catogaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_catogaryActionPerformed

            try {
                Integer S_No = Integer.parseInt(text_S_No_catogary.getText());
                
                Connection connection = DriverManager.getConnection(db_url, db_username, db_password);
                PreparedStatement pst = connection.prepareStatement("DELETE FROM catogary_table WHERE S_No=?");
                pst.setInt(1, S_No);
                pst.execute();

                JOptionPane.showMessageDialog(this, "Selected Row Deleted");

                update_catogary_JTable();
                combobox_update();
                
                lbl_S_No_catogary.setVisible(false);
                text_S_No_catogary.setVisible(false);
                lbl_S_No_message_catogary.setVisible(false);
            } 
            
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }     
    }//GEN-LAST:event_btn_delete_catogaryActionPerformed

    
    
    //
    int stock_JTable(){
            
        int total_stock=0;
        try {
            Connection connection = DriverManager.getConnection(db_url, db_username, db_password);
            Statement statement = connection.createStatement();
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM stock_table");
            ResultSet rs = pstmt.executeQuery();
 
            model = (DefaultTableModel) JTable_stock.getModel();
            model.setRowCount(0);
            
            while(rs.next()){
                total_stock = rs.getInt(1);

                model.addRow( new String []{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7)
                });
            }

            statement.close();
            connection.close(); 
            
        } 
        
        catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }

        return total_stock;
    }
    
    int stock_JTable2(){

        int total_quantity=0;                
        try {
            Connection connection = DriverManager.getConnection(db_url, db_username, db_password);
            Statement statement = connection.createStatement();
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM stock_table");
            ResultSet rs = pstmt.executeQuery();
            
            model = (DefaultTableModel) JTable_stock.getModel();

            int quantity=0;
            
            while(rs.next()){
                quantity = Integer.parseInt(rs.getString("quantity"));
                total_quantity +=quantity;
            }           
            
            statement.close();
            connection.close();            
        } 
        
        catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }

        return total_quantity;
    }
    
    void update_catogary_JTable(){
        
        try {
            Connection connection = DriverManager.getConnection(db_url, db_username, db_password);
            Statement statement = connection.createStatement();
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM catogary_table");
            ResultSet rs = pstmt.executeQuery();
            
            model = (DefaultTableModel) JTable_catogary.getModel();
            model.setRowCount(0);
            
            while(rs.next()){
                model.addRow( new String []{
                    rs.getString(1),
                    rs.getString(2)
                });
            }           
            statement.close();
            connection.close();            
        } 
        
        catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    void update_customer_JTable(){
        try {
            Connection connection = DriverManager.getConnection(db_url, db_username, db_password);
            Statement statement = connection.createStatement();
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM customer_table");
            ResultSet rs = pstmt.executeQuery();
            
            model = (DefaultTableModel) JTable_customer.getModel();
            model.setRowCount(0);
            
            while(rs.next()){
                model.addRow( new String []{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
                });
            }           
            statement.close();
            connection.close();            
        } 
        
        catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    void update_supplier_JTable(){
        
        try {
            Connection connection = DriverManager.getConnection(db_url, db_username, db_password);
            Statement statement = connection.createStatement();
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM suppliers_table");
            ResultSet rs = pstmt.executeQuery();
            
            model = (DefaultTableModel) JTable_supplier.getModel();
            model.setRowCount(0);
            
            while(rs.next()){
                model.addRow( new String []{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
                });
            }          
            
            statement.close();
            connection.close();            
        } 
        
        catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    int update_purshase_JTable(){
        
        int total_purhase=0;
         try {
            Connection connection = DriverManager.getConnection(db_url, db_username, db_password);
            Statement statement = connection.createStatement();
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM purchase_table");
            ResultSet rs = pstmt.executeQuery();
            
            model = (DefaultTableModel) JTable_purchase.getModel();
            model.setRowCount(0);
            
            int purchase=0;
            
            while(rs.next()){
                purchase = Integer.parseInt(rs.getString("t_price"));
                total_purhase += purchase;
                
                model.addRow( new String []{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                });
            }           
            statement.close();
            connection.close();            
        } 
        
        catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
         return total_purhase;
    }
        
    int update_sell_JTable(){
        
        int total_sell_amount=0;      
        try {
            Connection connection = DriverManager.getConnection(db_url, db_username, db_password);
            Statement statement = connection.createStatement();
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM sell_table");
            ResultSet rs = pstmt.executeQuery();
            
            model = (DefaultTableModel) JTable_sell.getModel();
            model.setRowCount(0);
            
            int total=0;
            
            while(rs.next()){
                total = Integer.parseInt(rs.getString("T_Price"));
                total_sell_amount+=total;
                 
                model.addRow( new String []{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7)
                });
            }           
            statement.close();
            connection.close();            
        } 
        
        catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
       
        return total_sell_amount;
    }   
    
    int update_sell_JTable2(){
        
        int total_profit=0;      
        try {
            Connection connection = DriverManager.getConnection(db_url, db_username, db_password);
            Statement statement = connection.createStatement();
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM sell_table");
            ResultSet rs = pstmt.executeQuery();
            
            model = (DefaultTableModel) JTable_sell.getModel();
            
            int profit =0;
            
            while(rs.next()){
                profit = Integer.parseInt(rs.getString("profit"));
                total_profit += profit;
            }           
            statement.close();
            connection.close();            
        } 
        
        catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }       
        return total_profit;
    }
    //
    
    
    
    private void btn_add_catogaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_catogaryActionPerformed
        
        String catogary_name = text_catogary_name_catogary.getText();
        
        if(text_catogary_name_catogary.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "FIll Catogary Field");
        }        
        
        else{
            try {
                Connection connection = DriverManager.getConnection(db_url, db_username, db_password);
                Statement statement = connection.createStatement();
                
                ResultSet rs = statement.executeQuery("SELECT MAX(S_No) FROM catogary_table");
                int maxSerial = 0;
                        
                if (rs.next()) {
                    maxSerial = rs.getInt(1);
                }
                
                rs.close();
                statement.close();

                PreparedStatement pstmt = connection.prepareStatement("INSERT INTO catogary_table(S_No, Name) VALUES (?,?)");
                pstmt.setInt(1, maxSerial + 1);
                pstmt.setString(2, catogary_name);
                
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Category Added");
                
                update_catogary_JTable();
                combobox_update();
                
                text_catogary_name_catogary.setText("");
                
                connection.close();
            } 
            
            catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btn_add_catogaryActionPerformed

    
    private void text_available_quantity_sellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_available_quantity_sellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_available_quantity_sellActionPerformed

    private void JTable_catogaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable_catogaryMouseClicked
            
            text_S_No_catogary.setVisible(true);
            lbl_S_No_catogary.setVisible(true);
            lbl_S_No_message_catogary.setVisible(true);
            lbl_S_No_message_catogary.setText("Do not fill the S No");
        
        DefaultTableModel df= (DefaultTableModel) JTable_catogary.getModel();
        int selectedindex = JTable_catogary.getSelectedRow();
        
        text_S_No_catogary.setText(df.getValueAt(selectedindex,0).toString());
    }//GEN-LAST:event_JTable_catogaryMouseClicked

    private void text_S_No_catogaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_S_No_catogaryActionPerformed
    }//GEN-LAST:event_text_S_No_catogaryActionPerformed

    private void text_name_purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_name_purchaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_name_purchaseActionPerformed

    private void text_quantity_purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_quantity_purchaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_quantity_purchaseActionPerformed

    private void combo_select_item_sellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_select_item_sellActionPerformed
        try {
            Connection connection = DriverManager.getConnection(db_url, db_username, db_password);
            PreparedStatement pstmt2 = connection.prepareStatement("SELECT quantity, price FROM stock_table where Name=?");
            String selected_item = combo_select_item_sell.getSelectedItem().toString();
            pstmt2.setString(1, selected_item);

            ResultSet rs2 = pstmt2.executeQuery();
            
            if(rs2.next())
            {
                int quantity = rs2.getInt("quantity");
                int price = rs2.getInt("price");
                
                text_available_quantity_sell.setText(Integer.toString(quantity));
                text_purchase_price_sell.setText(Integer.toString(price));
            }
            
            else{
                text_available_quantity_sell.setText(" ");
                text_sell_price_sell.setText(" ");
            }
            
            
            connection.close();
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_combo_select_item_sellActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        lbl_show_total_quantity.setText(Integer.toString(stock_JTable2()));
        lbl_show_total_stock.setText(Integer.toString(stock_JTable()));
        lbl_show_total_sell.setText(Integer.toString(update_sell_JTable()));
        lbl_show_total_puchase.setText(Integer.toString(update_purshase_JTable()));
        lbl_show_total_profit.setText(Integer.toString(update_sell_JTable2()));
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btn_clear_purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clear_purchaseActionPerformed
        text_name_purchase.setText("");
        text_quantity_purchase.setText("");
        text_price_purchase.setText("");
    }//GEN-LAST:event_btn_clear_purchaseActionPerformed

    private void btn_clear_sellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clear_sellActionPerformed
        text_sell_price_sell.setText("");
        text_sell_quantity_sell.setText("");
    }//GEN-LAST:event_btn_clear_sellActionPerformed

    
    // Combobox Suuplier, Customer, Catogary Table
    void combobox_update(){
        
        // Supplier Name Combobox
        try{
            Connection connection = DriverManager.getConnection(db_url, db_username, db_password);
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM suppliers_table");
            ResultSet rs = pstmt.executeQuery();

            combo_supplire_purchase.removeAllItems();

            while (rs.next()) {
                String supplier_name = rs.getString("Name");
                combo_supplire_purchase.addItem(supplier_name);
            }
            connection.close();
        }
        
        catch(Exception e){
            System.out.println(e);
        }
        
        // Customer Name Combobox
        try{
            Connection connection = DriverManager.getConnection(db_url, db_username, db_password);
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM customer_table");
            ResultSet rs = pstmt.executeQuery();

            combo_customer_name_sell.removeAllItems();

            while (rs.next()) {
                String customer_name = rs.getString("Name");
                combo_customer_name_sell.addItem(customer_name);
            }
            connection.close();
        }
        
        catch(Exception e){
            System.out.println(e);
        }
        
        // Catogary Name Combobox
        try {
            Connection connection = DriverManager.getConnection(db_url, db_username, db_password);
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM catogary_table");
            ResultSet rs = pstmt.executeQuery();

            combo_catagory_purchase.removeAllItems();

            while (rs.next()) {
                String catogary_name = rs.getString("Name");
                combo_catagory_purchase.addItem(catogary_name);
            }
            connection.close();
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }
        
        // Sell --> Select Item, show available quantity and purchase price Combobox
        try {                      
            Connection connection = DriverManager.getConnection(db_url, db_username, db_password);
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM purchase_table");
            ResultSet rs = pstmt.executeQuery();
            
            combo_select_item_sell.removeAllItems();
            
            while (rs.next()) {
                String select_item = rs.getString("Name");
                combo_select_item_sell.addItem(select_item);
            }
            
            connection.close();
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }
    } 
    
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
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable_catogary;
    private javax.swing.JTable JTable_customer;
    private javax.swing.JTable JTable_purchase;
    private javax.swing.JTable JTable_sell;
    private javax.swing.JTable JTable_stock;
    private javax.swing.JTable JTable_supplier;
    private javax.swing.JPanel Panel_Catogary;
    private javax.swing.JPanel Panel_Customer;
    private javax.swing.JPanel Panel_Dashboard;
    private javax.swing.JPanel Panel_Purchase;
    private javax.swing.JPanel Panel_Sell;
    private javax.swing.JPanel Panel_Stock;
    private javax.swing.JPanel Panel_Suppliers;
    private javax.swing.JPanel Panel_option;
    private javax.swing.JButton btn_add_catogary;
    private javax.swing.JButton btn_add_customer;
    private javax.swing.JButton btn_add_supplier;
    private javax.swing.JButton btn_clear_purchase;
    private javax.swing.JButton btn_clear_sell;
    private javax.swing.JButton btn_delete__purchase;
    private javax.swing.JButton btn_delete_catogary;
    private javax.swing.JButton btn_delete_customer;
    private javax.swing.JButton btn_delete_sell;
    private javax.swing.JButton btn_delete_supplier;
    private javax.swing.JButton btn_purchase__purchase;
    private javax.swing.JButton btn_sell_sell;
    private javax.swing.JComboBox<String> combo_catagory_purchase;
    private javax.swing.JComboBox<String> combo_customer_name_sell;
    private javax.swing.JComboBox<String> combo_select_item_sell;
    private javax.swing.JComboBox<String> combo_supplire_purchase;
    private javax.swing.JLabel icon_Signout;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lbl_Catogary;
    private javax.swing.JLabel lbl_Customer;
    private javax.swing.JLabel lbl_Dashboard;
    private javax.swing.JLabel lbl_MC_icon;
    private javax.swing.JLabel lbl_Purchase;
    private javax.swing.JLabel lbl_S_No_catogary;
    private javax.swing.JLabel lbl_S_No_message_catogary;
    private javax.swing.JLabel lbl_Sell;
    private javax.swing.JLabel lbl_Signout;
    private javax.swing.JLabel lbl_Stock;
    private javax.swing.JLabel lbl_Suppliers;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JLabel lbl_image1;
    private javax.swing.JLabel lbl_image2;
    private javax.swing.JLabel lbl_image3;
    private javax.swing.JLabel lbl_image4;
    private javax.swing.JLabel lbl_image5;
    private javax.swing.JLabel lbl_image7;
    private javax.swing.JLabel lbl_line;
    private javax.swing.JLabel lbl_show_total_profit;
    private javax.swing.JLabel lbl_show_total_puchase;
    private javax.swing.JLabel lbl_show_total_quantity;
    private javax.swing.JLabel lbl_show_total_sell;
    private javax.swing.JLabel lbl_show_total_stock;
    public javax.swing.JLabel lbl_show_username;
    private javax.swing.JLabel lbl_signout_box;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JTextField text_S_No_catogary;
    private javax.swing.JTextField text_available_quantity_sell;
    private javax.swing.JTextField text_catogary_name_catogary;
    private javax.swing.JTextField text_company_name_customer;
    private javax.swing.JTextField text_company_name_supplier;
    private javax.swing.JTextField text_contact_customer;
    private javax.swing.JTextField text_contact_supplier;
    private javax.swing.JTextField text_customer_name_customer;
    private javax.swing.JTextField text_date_purchase;
    private javax.swing.JTextField text_date_sell;
    private javax.swing.JTextField text_location_customer;
    private javax.swing.JTextField text_location_supplier;
    private javax.swing.JTextField text_name_purchase;
    private javax.swing.JTextField text_price_purchase;
    private javax.swing.JTextField text_purchase_price_sell;
    private javax.swing.JTextField text_quantity_purchase;
    private javax.swing.JTextField text_sell_price_sell;
    private javax.swing.JTextField text_sell_quantity_sell;
    private javax.swing.JTextField text_supplier_name_supplier;
    // End of variables declaration//GEN-END:variables
}