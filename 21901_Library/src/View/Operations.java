/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Kevin
 */
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;
import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;
import Model.Operation;
import DAO.OperationDAO;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
public class Operations extends javax.swing.JFrame {

    /**
     * Creates new form Operationss
     */
    public Operations() {
        initComponents();
        populateO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        otable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        clIdTxt = new javax.swing.JTextField();
        clNameTxt = new javax.swing.JTextField();
        pass = new javax.swing.JLabel();
        clSearchBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sIdTxt = new javax.swing.JTextField();
        SnameTxt = new javax.swing.JTextField();
        bkSearchBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bkNameTxt = new javax.swing.JTextField();
        authTxt = new javax.swing.JTextField();
        isd = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        rdt = new com.toedter.calendar.JDateChooser();
        checkInBtn = new javax.swing.JButton();
        checkOutBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        otable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Name", "Author", "Return Date", "Status"
            }
        ));
        jScrollPane1.setViewportView(otable);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("cilent search"));

        jLabel1.setText("Client Id");

        jLabel2.setText("Client name");

        pass.setBorder(javax.swing.BorderFactory.createTitledBorder("Photo"));

        clSearchBtn.setText("Find");
        clSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clSearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clSearchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clSearchBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Book Search"));

        jLabel4.setText("Book Id");

        jLabel5.setText("Book Name");

        SnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SnameTxtActionPerformed(evt);
            }
        });

        bkSearchBtn.setText("Search");
        bkSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkSearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(bkSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bkSearchBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Book Info"));

        jLabel6.setText("Book Name");

        jLabel7.setText("Author");

        jLabel8.setText("Issue Date");

        authTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authTxtActionPerformed(evt);
            }
        });

        jLabel3.setText("Return Date");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(authTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bkNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isd, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bkNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        checkInBtn.setText("Check In");
        checkInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInBtnActionPerformed(evt);
            }
        });

        checkOutBtn.setText("Check out");
        checkOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(233, 233, 233)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(checkInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(checkOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(294, 294, 294))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(checkInBtn)
                                    .addComponent(checkOutBtn)
                                    .addComponent(exitBtn))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SnameTxtActionPerformed

    private void authTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authTxtActionPerformed

    private void clSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clSearchBtnActionPerformed
        // TODO add your handling code here:
        int f=0;
        String clname = clNameTxt.getText();
        String cld= clIdTxt.getText();
        Transaction tr = null;
       Session session = NewHibernateUtil.getSessionFactory().openSession();
       tr= session.beginTransaction();
       if(clIdTxt.getText().isEmpty())
       {
       SQLQuery query = session.createSQLQuery("select FirstName from Client");
       List rs = query.list();
       for(Object cl : rs)
       {
         String cname = cl.toString();
           if(cname.equals(clname))
         {
             JOptionPane.showMessageDialog(null, "Client Found");
               f=1;
               SQLQuery queid = session.createSQLQuery("select RegNo from Client where FirstName=?");
               queid.setParameter(0, clname);
               List rg = queid.list();
                for(Object crg : rg)
       {
                       clIdTxt.setText(crg.toString());
       }
               break;
         }
       }
       if(f!=1)
       {
         JOptionPane.showMessageDialog(null, "client not Found");  
       }
       }
       else{
       SQLQuery query = session.createSQLQuery("select RegNo from Client");
       List rs = query.list();
       for(Object cl : rs)
       {
         String cname = cl.toString();
           if(cname.equals(cld))
         {
             JOptionPane.showMessageDialog(null, "Client Found");
               f=1;
                SQLQuery quen = session.createSQLQuery("select FirstName from Client where RegNo=?");
               quen.setParameter(0, cld);
               List rn = quen.list();
                for(Object crn : rn)
       {
                       clNameTxt.setText(crn.toString());
       }
               break;
         }
       }
       if(f!=1)
       {
         JOptionPane.showMessageDialog(null, "client not Found");  
       }
           
       }
       session.close();
       String path;
       Transaction n = null;
       Session s = NewHibernateUtil.getSessionFactory().openSession();
       n= s.beginTransaction();
       SQLQuery p = s.createSQLQuery("select photo from Client where RegNo=?");
       p.setParameter(0, cld);
       List pc = p.list();
       for(Object i: pc)
       {
          path=i.toString();
          ImageIcon img = new ImageIcon(path);
            Image image = img.getImage().getScaledInstance(pass.getWidth(),pass.getHeight(),Image.SCALE_DEFAULT);
            pass.setIcon(new ImageIcon(image)); 
       }
    }//GEN-LAST:event_clSearchBtnActionPerformed

    private void bkSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkSearchBtnActionPerformed
        // TODO add your handling code here:
                int c=0;
                String id=sIdTxt.getText();
              
                String nm = SnameTxt.getText();
                 Transaction t= null;
                 Session bn = NewHibernateUtil.getSessionFactory().openSession();
                 t= bn.beginTransaction();
                if(SnameTxt.getText().isEmpty())
                {
                 SQLQuery bq = bn.createSQLQuery("select id from Books");
                 List bks = bq.list();
                 for(Object boo: bks)
                 {
                   String sbid = boo.toString();
                  if(sbid.equals(id))
                   {
                       c=1;
                       JOptionPane.showMessageDialog(null, "Book Found");
                       SQLQuery bkn = bn.createSQLQuery("select Title from Books where id=?");
                       bkn.setParameter(0,Integer.parseInt(sIdTxt.getText()) );
                       List al = bkn.list();
                       for(Object sb: al)
                       {
                           bkNameTxt.setText(sb.toString()); 
                       }
                       
                      SQLQuery bka = bn.createSQLQuery("select Author from Books where id=?");
                       bka.setParameter(0, Integer.parseInt(sIdTxt.getText()));
                       List ala = bka.list();
                       for(Object bkaut: ala)
                       {
                            authTxt.setText(bkaut.toString());
                       }
                       
                       SQLQuery bkdt = bn.createSQLQuery("select PublicationDate from Books where id=?");
                       bkdt.setParameter(0, Integer.parseInt(sIdTxt.getText()));
                       List alay = bkdt.list();
                       for(Object bkaut: alay)
                       {
                            isd.setDate((Date) bkaut);
                       }
                      
                       break;
                       
                   }
                    
                 }
                 if(c!=1)
                    {
                       JOptionPane.showMessageDialog(null, "Book not Found");  
                    }
                 
                }
                if(sIdTxt.getText().isEmpty()){
                SQLQuery bookname = bn.createSQLQuery("select Title from Books");
                List bksn = bookname.list();
                 for(Object bo: bksn)
                 {
                   String sbnm = bo.toString();
                   if(sbnm.equals(nm))
                   {
                       c=1;
                       JOptionPane.showMessageDialog(null, "Book Found");
                        bkNameTxt.setText(nm);
                       SQLQuery bookID = bn.createSQLQuery("select id from Books where Title=?");
                       bookID.setParameter(0, nm);
                       List alID = bookID.list();
                       for(Object sb: alID)
                       {
                           sIdTxt.setText(sb.toString()); 
                       }
                      
                       SQLQuery bookAuth = bn.createSQLQuery("select Author from Books where Title=?");
                       bookAuth.setParameter(0, nm);
                       List alIAuth = bookAuth.list();
                       for(Object sba: alIAuth)
                       {
                           authTxt.setText(sba.toString()); 
                       }    
                       
                       SQLQuery bookDate = bn.createSQLQuery("select PublicationDate from Books where Title=?");
                       bookDate.setParameter(0, nm);
                       List aladate = bookDate.list();
                       for(Object bkau: aladate)
                       {
                            isd.setDate((Date) bkau);
                       }
                      bn.close();
                       break;
                       
                   }
                    
                 }
                 if(c!=1)
                    {
                       JOptionPane.showMessageDialog(null, "Book not Found");  
                    }
                    
                
                 
                }
                bn.close();
    }//GEN-LAST:event_bkSearchBtnActionPerformed

    private void checkInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInBtnActionPerformed
        // TODO add your handling code here:
        Operation oc = new Operation();
        oc.setClientId(Integer.parseInt(clIdTxt.getText()));
        oc.setAuthor(authTxt.getText());
        oc.setBookName(bkNameTxt.getText());
        oc.setStatus("Check in");
        oc.setReturnDate(rdt.getDate());
        OperationDAO DAO = new OperationDAO();
        DAO.saveOp(oc);
        JOptionPane.showMessageDialog(this,"Checked in");
         DefaultTableModel md = (DefaultTableModel) otable.getModel();
        md.setRowCount(0);
        populateO();
    }//GEN-LAST:event_checkInBtnActionPerformed

    private void checkOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutBtnActionPerformed
        // TODO add your handling code here:
        Operation oc = new Operation();
        oc.setClientId(Integer.parseInt(clIdTxt.getText()));
        oc.setAuthor(authTxt.getText());
        oc.setBookName(bkNameTxt.getText());
        oc.setStatus("Check out");
        oc.setReturnDate(rdt.getDate());
        OperationDAO DAO = new OperationDAO();
        DAO.saveOp(oc);
        JOptionPane.showMessageDialog(this,"Checked out");
         DefaultTableModel md = (DefaultTableModel) otable.getModel();
        md.setRowCount(0);
        populateO();
    }//GEN-LAST:event_checkOutBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        Operations ne = new Operations();
        this.setVisible(false);
    }//GEN-LAST:event_exitBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public void populateO()
    {
        
        Transaction tr = null;
       Session session = NewHibernateUtil.getSessionFactory().openSession();
       tr= session.beginTransaction();
       Criteria cr = session.createCriteria(Operation.class);
       List bcts = cr.list();
       tr.commit();
       DefaultTableModel md = (DefaultTableModel) otable.getModel();
      Object[] row =new Object [4];
    for(Iterator i=bcts.iterator();i.hasNext();)
    {
        Operation nbc= (Operation) i.next();
        
        row[0]=nbc.getBookName();
         row[1]=nbc.getAuthor();
        row[2]=nbc.getReturnDate();
        row[2]=nbc.getStatus();
        md.addRow(row);
                }
    }
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
            java.util.logging.Logger.getLogger(Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SnameTxt;
    private javax.swing.JTextField authTxt;
    private javax.swing.JTextField bkNameTxt;
    private javax.swing.JButton bkSearchBtn;
    private javax.swing.JButton checkInBtn;
    private javax.swing.JButton checkOutBtn;
    private javax.swing.JTextField clIdTxt;
    private javax.swing.JTextField clNameTxt;
    private javax.swing.JButton clSearchBtn;
    private javax.swing.JButton exitBtn;
    private com.toedter.calendar.JDateChooser isd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable otable;
    private javax.swing.JLabel pass;
    private com.toedter.calendar.JDateChooser rdt;
    private javax.swing.JTextField sIdTxt;
    // End of variables declaration//GEN-END:variables
}
