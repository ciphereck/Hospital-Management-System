
import javax.swing.JOptionPane;
import java.sql.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SearchPATIENT.java
 *
 * Created on Nov 9, 2013, 3:01:31 PM
 */

/**
 *
 * @author sonal
 */
public class SearchPATIENT extends javax.swing.JFrame {

    /** Creates new form SearchPATIENT */
    public SearchPATIENT() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        TF6 = new javax.swing.JTextField();
        TF5 = new javax.swing.JTextField();
        TF3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        TF2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TF8 = new javax.swing.JTextField();
        TF7 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TF4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TF9 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        TF1 = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(TF6, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 298, 155, -1));

        TF5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF5ActionPerformed(evt);
            }
        });
        getContentPane().add(TF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 267, 155, -1));
        getContentPane().add(TF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 215, 155, -1));

        jLabel4.setText("Address:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 250, -1, -1));

        jButton4.setFont(new java.awt.Font("Traditional Arabic", 3, 18)); // NOI18N
        jButton4.setText("Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 434, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 44, 141, 13));

        jButton1.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 142, -1, 24));

        jButton3.setFont(new java.awt.Font("Traditional Arabic", 3, 18)); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 434, -1, -1));
        getContentPane().add(TF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 184, 155, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft Himalaya", 1, 36)); // NOI18N
        jLabel1.setText("Search Patient");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 11, -1, 27));

        jLabel10.setText("Cabin Number:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 387, -1, -1));
        getContentPane().add(TF8, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 355, 155, -1));
        getContentPane().add(TF7, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 324, 155, -1));

        jLabel3.setText("ID Number:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 223, -1, -1));

        jLabel8.setText("Fee (in Rupees):");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 333, -1, -1));

        jLabel7.setText("Department:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 307, -1, -1));

        jLabel5.setText("Phone Number:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 275, -1, -1));
        getContentPane().add(TF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 241, 155, -1));

        jLabel11.setText("Date of Joining (YYYY-MM-DD):");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 358, -1, -1));
        getContentPane().add(TF9, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 381, 155, -1));

        jLabel6.setText("Name:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 198, -1, -1));

        jLabel2.setFont(new java.awt.Font("HGHangle", 1, 14)); // NOI18N
        jLabel2.setText("Search by:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 64, -1, -1));

        jButton2.setFont(new java.awt.Font("Traditional Arabic", 3, 18)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 434, -1, -1));

        TF1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        TF1.setForeground(new java.awt.Color(51, 0, 51));
        TF1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TF1CaretUpdate(evt);
            }
        });
        getContentPane().add(TF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 142, 206, 24));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Name");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 101, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("ID Number");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 101, -1, -1));

        jButton5.setFont(new java.awt.Font("Traditional Arabic", 3, 18)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 434, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search patient 1.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF5ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_TF5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
            Class.forName("java.sql.DriverManager");
            Connection c=DriverManager.getConnection("jdbc:mysql://"
                    + "localhost:3306/op","root","1");
           String s=TF1.getText();
           String q = null;
            if(jRadioButton1.isSelected()){
            q="select * from patient where id="+s;}
            if(jRadioButton2.isSelected()){
             q="select * from patient where name='"+s+"'";}
           Statement st=c.createStatement();
            ResultSet rs=st.executeQuery(q);
            if(!rs.next())
             JOptionPane.showMessageDialog(null,"Such Record Not Available");
            else {
            TF2.setText(rs.getString("name"));
            TF3.setText(rs.getString("id"));
            TF4.setText(rs.getString("address"));
            TF5.setText(rs.getString("phno"));
            TF6.setText(rs.getString("doa"));
            TF7.setText(rs.getString("dod"));
            TF8.setText(rs.getString("amt"));
                        TF9.setText(rs.getString("disease"));
            }}
        catch(Exception e)
        {JOptionPane.showMessageDialog(null,"ERROR:  "+e.getMessage());
        }
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       System.exit(0);
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
TF1.setText(null);
        TF2.setText(null);
        TF5.setText(null);
        TF6.setText(null);
        TF7.setText(null);
        TF3.setText(null);
        TF8.setText(null);
        TF9.setText(null);
        TF4.setText(null);
        
}//GEN-LAST:event_jButton2ActionPerformed

    private void TF1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TF1CaretUpdate
        // TODO add your handling code here:
}//GEN-LAST:event_TF1CaretUpdate

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
this.setVisible(false);
new Main().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
this.setVisible(false);
new Search().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchPATIENT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TF1;
    private javax.swing.JTextField TF2;
    private javax.swing.JTextField TF3;
    private javax.swing.JTextField TF4;
    private javax.swing.JTextField TF5;
    private javax.swing.JTextField TF6;
    private javax.swing.JTextField TF7;
    private javax.swing.JTextField TF8;
    private javax.swing.JTextField TF9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}