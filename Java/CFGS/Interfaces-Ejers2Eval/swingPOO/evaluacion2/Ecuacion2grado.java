package evaluacion2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class Ecuacion2grado extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfA;
	private JTextField tfB;
	private JTextField tfC;
	private JTextField tfObservaciones;
	private JTextField tfX1;
	private JTextField tfX2;

	public Ecuacion2grado() {		
		setTitle("Ecuaciones de 2 Grado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblA = new JLabel("A");
		
		JLabel lblB = new JLabel("B");
		
		JLabel lblC = new JLabel("C");
		
		tfA = new JTextField();
		tfA.setColumns(10);
		
		tfB = new JTextField();
		tfB.setColumns(10);
		
		tfC = new JTextField();
		tfC.setColumns(10);
		
		JLabel lblObservaciones = new JLabel("Observaciones");
		
		tfObservaciones = new JTextField();
		tfObservaciones.setEditable(false);
		tfObservaciones.setColumns(10);
		
		JLabel lblX1 = new JLabel("X1");
		
		JLabel lblX2 = new JLabel("X2");
		
		tfX1 = new JTextField();
		tfX1.setColumns(10);
		
		tfX2 = new JTextField();
		tfX2.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double x1,x2,d;
				double res=-1;
				String resultado="";
				double a=Double.parseDouble(tfA.getText());
				double b=Double.parseDouble(tfB.getText());
				double c=Double.parseDouble(tfC.getText());
				d=(b*b)-4*(a*c);
				if(d>0){
					x1=(-b+(Math.sqrt(d)))/(a*2);
					x2=(-b-(Math.sqrt(d)))/(a*2);
					tfObservaciones.setText("");
					resultado=String.valueOf(x1);
					tfX1.setText(resultado);
					resultado=String.valueOf(x2);
					tfX2.setText(resultado);
				}else if(d==0){
					tfObservaciones.setText("");
					res=(-b/(2*a));
					resultado=String.valueOf(res);
					tfX1.setText(resultado);
					tfX2.setText(resultado);
				} else if(d<0){
					tfX1.setText("");
					tfX2.setText("");
					tfObservaciones.setText("Numero complejo");
				}
			}
		});
		
		JLabel lblAx = new JLabel("ax^2 + bx + c");
		lblAx.setFont(new Font("Tahoma", Font.BOLD, 24));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(9)
					.addComponent(lblObservaciones)
					.addGap(18)
					.addComponent(tfObservaciones, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(157, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(115)
					.addComponent(btnCalcular)
					.addContainerGap(224, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblC)
							.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
							.addComponent(tfC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblA)
								.addComponent(lblB, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(tfB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(99)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblX2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfX2))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblX1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfX1, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)))
					.addGap(70))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(94)
					.addComponent(lblAx, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(100, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAx, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblA)
								.addComponent(tfA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(17)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblB)
								.addComponent(tfB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblX1)
						.addComponent(tfX1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(16)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblC)
						.addComponent(lblX2)
						.addComponent(tfX2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addComponent(btnCalcular)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblObservaciones)
						.addComponent(tfObservaciones, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
