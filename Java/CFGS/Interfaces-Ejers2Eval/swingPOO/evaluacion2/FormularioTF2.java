package evaluacion2;

/*Confeccionar un programa que permita ingresar el nombre de usuario y cuando se presione un bot�n 
mostrar el valor ingresado en un cuadro de di�logo "JOPtionPane".*/

import javax.swing.*;

import java.awt.event.*;

public class FormularioTF2 extends JFrame implements ActionListener{
    private JTextField textfield1, textfield2;
    private JLabel label1, label2;
    private JButton boton1;
    
    public FormularioTF2() {
        setLayout(null);
        label1=new JLabel("Numero 1:");
        label1.setBounds(10,5,100,30);
        add(label1);
        textfield1=new JTextField();
        textfield1.setBounds(120,10,150,20);
        add(textfield1);
        
        label2=new JLabel("Numero 2:");
        label2.setBounds(10,10,100,80);
        add(label2);
        textfield2=new JTextField();
        textfield2.setBounds(120,40,150,20);
        add(textfield2);
        boton1=new JButton("Sumar");
        boton1.setBounds(10,80,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
        	
            JOptionPane.showMessageDialog( null, "El resultado es: "+(Integer.parseInt(textfield1.getText())+Integer.parseInt(textfield2.getText())), "Resultado", JOptionPane.PLAIN_MESSAGE );
        }
    }
    
    public static void main(String[] ar) {
        FormularioTF2 formulario1=new FormularioTF2();
        formulario1.setLocationRelativeTo(null);
        formulario1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        formulario1.setSize(350,200);
        formulario1.setVisible(true);
    }
}