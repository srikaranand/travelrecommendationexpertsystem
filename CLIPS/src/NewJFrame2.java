import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;
import java.util.*;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import net.sf.clipsrules.jni.CLIPSException;
import net.sf.clipsrules.jni.CLIPSLoadException;
import net.sf.clipsrules.jni.Environment;
import net.sf.clipsrules.jni.FactAddressValue;


class NewJFrame2 extends JFrame{
	String ss;
	
	NewJFrame2(String s) throws IOException{
    	this.ss = "Places you may like to visit\n-------------------------\n"+s;
    	//this.varname = Varname;
		initComponents();
    	this.setVisible(true);
//     
    }
    /**
     * Creates new form NewJFrame
     */
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @throws IOException 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() throws IOException {
    	
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText(ss);
        jTextArea1.setAlignmentX(50);
        Color color1 = new Color(199, 212, 211);
        jTextArea1.setFont(new java.awt.Font("Ink Free", 1, 18));
        jTextArea1.setForeground(Color.DARK_GRAY);
        jTextArea1.setBackground(color1);
        jScrollPane1.setViewportView(jTextArea1);

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Transport");

        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Place Type");

        jCheckBox3.setSelected(true);
        jCheckBox3.setText("Food");
        

        jCheckBox4.setSelected(true);
        jCheckBox4.setText("Weather");

        jCheckBox5.setSelected(true);
        jCheckBox5.setText("Budget");

        jCheckBox6.setSelected(true);
        jCheckBox6.setText("Duration");

        jButton1.setText("Filter");
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        add(jTextArea1);
        jTextArea1.setFont(jTextArea1.getFont().deriveFont (20.0f));
        setLayout(null);
        jTextArea1.setBounds(0,0,300,300);
        //layout.setHorizontalGroup(
         //   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          //  .addComponent(jScrollPane1)
           // .addGroup(layout.createSequentialGroup()
             //   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    //.addComponent(jCheckBox1)
                    //.addComponent(jCheckBox4))
               // .addGap(52, 52, 52)
              //  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    //.addComponent(jCheckBox5)
                    //.addComponent(jCheckBox2)
                    ////.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
               // .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
              //  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              //      .addComponent(jCheckBox6)
             //       .addComponent(jCheckBox3))
            //    .addContainerGap())
//        );//
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addContainerGap()
//                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(45, 45, 45)
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                    .addComponent(jCheckBox1)
//                    .addComponent(jCheckBox2)
//                    .addComponent(jCheckBox3))
//                .addGap(34, 34, 34)
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                    .addComponent(jCheckBox4)
//                    .addComponent(jCheckBox5)
//                    .addComponent(jCheckBox6))
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
//                .addComponent(jButton1)
//                .addGap(39, 39, 39))
//        );
        setSize(300,300);
        //pack();
        //ExecuteClips();
    }// </editor-fold>                        

    
    
                        

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify                    
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration                  
}
