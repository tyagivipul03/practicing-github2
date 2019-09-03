
import java.awt.Color;
import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Frame14 extends javax.swing.JFrame {

    /**
     * Creates new form Frame14
     */
    public Frame14() {
        initComponents();
         setLocation(500,200);
         getContentPane().setBackground(new Color(20,100,220));
        
    }
    void f1(KeyEvent evt){
     char c=evt.getKeyChar();
      String s =t1.getText();
     
     try{ if(c=='\u0008'){
         if(s.equals(""))
             l1.setText("");
         
        if((cb1.getSelectedItem()=="Binary")){
         if(cb2.getSelectedItem()=="Binary"){
             l1.setText(s);
         }
         if(cb2.getSelectedItem()=="Decimal"){
          
          int n=Integer.parseInt(s,2);
          
          l1.setText(""+n);
          
          }
         if(cb2.getSelectedItem()=="Hexadecimal"){
           
          int n=Integer.parseInt(s,2);
          String s2=Integer.toHexString(n);
          
          l1.setText(s2);
            
         }
         if(cb2.getSelectedItem()=="Octal"){
            
          int n=Integer.parseInt(s,2);
          String s2=Integer.toOctalString(n);
          
          l1.setText(s2);
             
         }
     }
     if((cb1.getSelectedItem()=="Decimal")){
         
         
       if(cb2.getSelectedItem()=="Binary"){
           
          int n=Integer.parseInt(s);
          String s2=Integer.toBinaryString(n);
          
          l1.setText(s2);
              
         }  
        if(cb2.getSelectedItem()=="Decimal"){
           int n=Integer.parseInt(s,10);
           l1.setText(""+n);
          }
         if(cb2.getSelectedItem()=="Hexadecimal"){
            
          int n=Integer.parseInt(s);
          String s2=Integer.toHexString(n);
          
          l1.setText(s2);
              
         } 
          if(cb2.getSelectedItem()=="Octal"){
           
          int n=Integer.parseInt(s);
          String s2=Integer.toOctalString(n);
         
          l1.setText(s2);
              
         }}  
            if((cb1.getSelectedItem()=="Hexadecimal")){
         
       if(cb2.getSelectedItem()=="Binary"){
            
          int n=Integer.parseInt(s,16);
          String s2=Integer.toBinaryString(n);
         
          l1.setText(s2);
               
         }  
        if(cb2.getSelectedItem()=="Decimal"){
            
           int n=Integer.parseInt(s,16);
           
           l1.setText(""+n);
         
             
         }
         if(cb2.getSelectedItem()=="Hexadecimal"){
           
          int n=Integer.parseInt(s,16);
          String s2=Integer.toHexString(n);
          
          l1.setText(s2);
              
         } 
          if(cb2.getSelectedItem()=="Octal"){
          
          int n=Integer.parseInt(s,16);
          String s2=Integer.toOctalString(n);
         
          l1.setText(s2);
              
          }
     }
        if((cb1.getSelectedItem()=="Octal")){
        
       if(cb2.getSelectedItem()=="Binary"){
           
          int n=Integer.parseInt(s,8);
          String s2=Integer.toBinaryString(n);
          
          l1.setText(s2);
              
         }  
        if(cb2.getSelectedItem()=="Decimal"){
          
           int n=Integer.parseInt(s,8);
           
           l1.setText(""+n);
         
             
         }
         if(cb2.getSelectedItem()=="Hexadecimal"){
            
          int n=Integer.parseInt(s,8);
          String s2=Integer.toHexString(n);
         
          l1.setText(s2);
              
         } 
          if(cb2.getSelectedItem()=="Octal"){
           
          int n=Integer.parseInt(s,8);
          String s2=Integer.toOctalString(n);
       
          l1.setText(s2);
             
          }
     }        
      }}
     catch(Exception ee){}
     if((cb1.getSelectedItem()=="Binary")){
         if((c!='0'&&c!='1')||s.length()>=10){
            evt.consume();
         }
         if(cb2.getSelectedItem()=="Binary"){
             if((c=='0'||c=='1')&&s.length()<10){
             l1.setText(s+c);}
         }
         if(cb2.getSelectedItem()=="Decimal"){
           try{String s1=(s+c); 
          int n=Integer.parseInt(s1,2);
          if(s.length()<10){
          l1.setText(""+n);}}
           catch(Exception ee){}
          }
         if(cb2.getSelectedItem()=="Hexadecimal"){
            try{String s1=(s+c); 
          int n=Integer.parseInt(s1,2);
          String s2=Integer.toHexString(n);
          if(s.length()<10){
          l1.setText(s2);}}
           catch(Exception ee){}  
         }
         if(cb2.getSelectedItem()=="Octal"){
            try{String s1=(s+c); 
          int n=Integer.parseInt(s1,2);
          String s2=Integer.toOctalString(n);
          if(s.length()<10){
          l1.setText(s2);}}
           catch(Exception ee){}  
         }
     }
     if((cb1.getSelectedItem()=="Decimal")){
         if((c!='0'&&c!='1'&&c!='2'&&c!='3'&&c!='4'&&c!='5'&&c!='6'&&c!='7'&&c!='8'&&c!='9')||s.length()>=10){
             evt.consume();
         }
       if(cb2.getSelectedItem()=="Binary"){
           try{String s1=(s+c); 
          int n=Integer.parseInt(s1);
          String s2=Integer.toBinaryString(n);
          if(s.length()<10){
          l1.setText(s2);}}
           catch(Exception ee){}    
         }  
        if(cb2.getSelectedItem()=="Decimal"){
           try{String s1=(s+c); 
           int n=Integer.parseInt(s1,10);
          
           if(s.length()<10){
           l1.setText(""+n);}
         }
           catch(Exception ee){}    
         }
         if(cb2.getSelectedItem()=="Hexadecimal"){
           try{String s1=(s+c); 
          int n=Integer.parseInt(s1);
          String s2=Integer.toHexString(n);
          if(s.length()<10){
          l1.setText(s2);}}
           catch(Exception ee){}    
         } 
          if(cb2.getSelectedItem()=="Octal"){
           try{String s1=(s+c); 
          int n=Integer.parseInt(s1);
          String s2=Integer.toOctalString(n);
          if(s.length()<10){
          l1.setText(s2);}}
           catch(Exception ee){}    
         }}  
            if((cb1.getSelectedItem()=="Hexadecimal")){
         if((c!='0'&&c!='1'&&c!='2'&&c!='3'&&c!='4'&&c!='5'&&c!='6'&&c!='7'&&c!='8'&&c!='9'&&c!='a'&&c!='b'&&c!='c'&&c!='d'&&c!='e'&&c!='f'&&c!='A'&&c!='B'&&c!='C'&&c!='D'&&c!='E'&&c!='F')||s.length()>=10){
             evt.consume();
         }
       if(cb2.getSelectedItem()=="Binary"){
           try{String s1=(s+c); 
          int n=Integer.parseInt(s1,16);
          String s2=Integer.toBinaryString(n);
          if(s.length()<10){
          l1.setText(s2);}}
           catch(Exception ee){}    
         }  
        if(cb2.getSelectedItem()=="Decimal"){
           try{String s1=(s+c); 
           int n=Integer.parseInt(s1,16);
           if(s.length()<10){
           l1.setText(""+n);}
         }
           catch(Exception ee){}    
         }
         if(cb2.getSelectedItem()=="Hexadecimal"){
           try{String s1=(s+c); 
          int n=Integer.parseInt(s1,16);
          String s2=Integer.toHexString(n);
          if(s.length()<10){
          l1.setText(s2);}}
           catch(Exception ee){}    
         } 
          if(cb2.getSelectedItem()=="Octal"){
           try{String s1=(s+c); 
          int n=Integer.parseInt(s1,16);
          String s2=Integer.toOctalString(n);
          if(s.length()<10){
          l1.setText(s2);}}
           catch(Exception ee){}    
          }
     }
        if((cb1.getSelectedItem()=="Octal")){
         if(s.length()>=10||(c!='0'&&c!='1'&&c!='2'&&c!='3'&&c!='4'&&c!='5'&&c!='6'&&c!='7')){
             evt.consume();
         }
       if(cb2.getSelectedItem()=="Binary"){
           try{String s1=(s+c); 
          int n=Integer.parseInt(s1,8);
          String s2=Integer.toBinaryString(n);
          if(s.length()<10){
          l1.setText(s2);}}
           catch(Exception ee){}    
         }  
        if(cb2.getSelectedItem()=="Decimal"){
           try{String s1=(s+c); 
           int n=Integer.parseInt(s1,8);
           if(s.length()<10){
           l1.setText(""+n);}
         }
           catch(Exception ee){}    
         }
         if(cb2.getSelectedItem()=="Hexadecimal"){
           try{String s1=(s+c); 
          int n=Integer.parseInt(s1,8);
          String s2=Integer.toHexString(n);
          if(s.length()<10){
          l1.setText(s2);}}
           catch(Exception ee){}    
         } 
          if(cb2.getSelectedItem()=="Octal"){
           try{String s1=(s+c); 
          int n=Integer.parseInt(s1,8);
          String s2=Integer.toOctalString(n);
          if(s.length()<10){
          l1.setText(s2);}}
           catch(Exception ee){}    
          }
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

        jSeparator1 = new javax.swing.JSeparator();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        cb1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cb2 = new javax.swing.JComboBox();
        l1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BASE CONVERTER");
        setResizable(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Main Menu");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Select the type of unit you want to convert");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("From");

        t1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        t1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 0, 153), new java.awt.Color(51, 0, 102)));
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t1KeyTyped(evt);
            }
        });

        cb1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Binary", "Decimal", "Hexadecimal", "Octal" }));
        cb1.setBorder(null);
        cb1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb1ItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("To");

        cb2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cb2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Binary", "Decimal", "Hexadecimal", "Octal" }));
        cb2.setBorder(null);
        cb2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb2ItemStateChanged(evt);
            }
        });

        l1.setBackground(new java.awt.Color(255, 255, 255));
        l1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Bodoni MT Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Base Converter");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(t1)
                    .addComponent(cb1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 57, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(t1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cb1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cb2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
       new Frame2().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cb1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb1ItemStateChanged
     t1.setText("");
     l1.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ItemStateChanged

    private void cb2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb2ItemStateChanged
      t1.setText("");
      l1.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ItemStateChanged

    private void t1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyTyped
        f1(evt);
// TODO add your handling code here:
    }//GEN-LAST:event_t1KeyTyped

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
            java.util.logging.Logger.getLogger(Frame14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame14().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb1;
    private javax.swing.JComboBox cb2;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.Label l1;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
