/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teori1;

import javax.swing.*;
import java.awt.event.*;



public abstract class Teori1 implements ActionListener {
    private static void createAndShowGUI(){
        JFrame frame = new JFrame("i am a JFrame"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20,30,600,300);
        frame.getContentPane().setLayout(null);
        
        JButton butt=new JButton("Munculkan Nama");
        JButton butt2=new JButton("Munculkan NIM");
        JButton butt3=new JButton("Munculkan Alamat");
        frame.getContentPane().add(butt);
        frame.getContentPane().add(butt2);
        frame.getContentPane().add(butt3);
        
        butt.setBounds(50,20,200,20);
        Teori1 app = new Teori1(){};
        app.label = new JLabel();
        app.label.setBounds(300,20,200,20);
        frame.getContentPane().add(app.label);
        butt.addActionListener(app);
        frame.setVisible(true);
        
        butt2.setBounds(50,60,200,20);
        app.label2 = new JLabel();
        app.label2.setBounds(300,60,200,20);
        frame.getContentPane().add(app.label2);
        butt2.addActionListener(app);
        frame.setVisible(true);
        
        butt3.setBounds(50,100,200,20); 
        app.label3 = new JLabel();
        app.label3.setBounds(300,100,200,20);
        frame.getContentPane().add(app.label3);
        butt3.addActionListener(app);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e )
    {
        label.setText("Vanny Hosal");
        label2.setText("51017020");
        label3.setText("Pa'Baeng-Baeng");
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                createAndShowGUI();
            }
        });
    }
    JLabel label,label2,label3;
    
}
