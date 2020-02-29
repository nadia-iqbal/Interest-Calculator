/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interest;

//import java.awt.Color;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DELL PC
 */
public class Calculator {
    Calculator(){
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 400);
        frame.setLayout(null);
        
        JLabel label= new JLabel("Principal Value");
        label.setBounds(10, 10, 100, 20);
        frame.add(label);
        
        JLabel label2= new JLabel("Time");
        label2.setBounds(10, 40, 100, 20);
        frame.add(label2);
        
        JLabel label3= new JLabel("Annual Interest Rate");
        label3.setBounds(10, 70, 500, 20);
        frame.add(label3);
        
        JLabel label4= new JLabel("Number Of Compound Periods Per Year");
        label4.setBounds(10, 100, 500, 20);
        frame.add(label4);
      
        final JTextField tf1= new JTextField();
        tf1.setBounds(250, 10, 200, 20);
        tf1.setFont(null);
        frame.add(tf1);
        
        final JTextField tf2= new JTextField();
        tf2.setFont(null);
        tf2.setBounds(250,40,200,20);
        frame.add(tf2);
        
        final JTextField tf3= new JTextField();
        tf3.setBounds(250, 70, 200, 20);
        tf3.setFont(null);
        frame.add(tf3);
        
        final JTextField tf4= new JTextField();
        tf4.setFont(null);
        tf4.setBounds(250,100,200,20);
        frame.add(tf4);
 
        
        JButton jbb=new JButton("FUTURE VALUE");
     
        jbb.setBounds(10, 150, 200, 20);
        frame.add(jbb);
        
        final JLabel result= new JLabel();
        result.setBounds(10, 200, 200, 20);
        result.setForeground(Color.blue);
        frame.add(result);
        
        final JLabel result1= new JLabel();
        result1.setBounds(10, 230, 200, 20);
        result1.setForeground(Color.blue);
     
        frame.add(result1);
        
       
        jbb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                
                 int p=Integer.parseInt(tf1.getText());
                
                 int t=Integer.parseInt(tf2.getText());
                 double r=Double.parseDouble(tf3.getText());
 
                 int m=Integer.parseInt(tf4.getText());
                 double nn;
                 double rr=r/100;
                 nn = Math.pow((p*(1+(rr/m))),(m*t));
                 double ii = nn-p;
                 result.setText("Future value is: "+nn);
                 
                 result1.setText("INTEREST: "+ii);
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

           
        });

        
    }
    
}
