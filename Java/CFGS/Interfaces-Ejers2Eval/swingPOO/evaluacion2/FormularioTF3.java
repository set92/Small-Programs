package evaluacion2;

/*Confeccionar un programa que permita ingresar el nombre de usuario y cuando se presione un bot�n 
mostrar el valor ingresado en un cuadro de di�logo "JOPtionPane".*/

import javax.swing.*;

import java.awt.event.*;

public class FormularioTF3 extends JFrame implements ActionListener{
    private JTextField textfield1, textfield2;
    private JLabel label1, label2;
    private JButton boton1;
    
    public FormularioTF3() {
        setLayout(null);
        label1=new JLabel("Usuario:");
        label1.setBounds(10,5,100,30);
        add(label1);
        textfield1=new JTextField();
        textfield1.setBounds(120,10,150,20);
        add(textfield1);
        
        label2=new JLabel("Password:");
        label2.setBounds(10,10,100,80);
        add(label2);
        textfield2=new JTextField();
        textfield2.setBounds(120,40,150,20);
        add(textfield2);
        boton1=new JButton("Entrar");
        boton1.setBounds(10,80,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
        	if (textfield1.getText().equals("juan") && textfield2.getText().equals("1234")) {
        		JOptionPane.showMessageDialog( null, "Entrada Autorizada", "Login", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog( null, "ERROR DE USUARIO", "Login", JOptionPane.ERROR_MESSAGE);
			}
            
        }
    }
    
    public static void main(String[] ar) {
        FormularioTF3 formulario1=new FormularioTF3();
        formulario1.setLocationRelativeTo(null);
        formulario1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        formulario1.setSize(350,200);
        formulario1.setVisible(true);
    }
}