package evaluacion2;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtPantalla;
	private String num1="", num2="";
	private boolean primerNumero=true, segundoNumero=false;
	private JTextPane txtPanelPantalla;
	private String strLinea1="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 406, 469);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnArchivo.add(mntmSalir);
		
		//Colocamos una caja a la derecha y todo lo que vaya despues estara en la derecha
		menuBar.add(Box.createHorizontalGlue());
		
		JMenu mnAcercaDe = new JMenu("Acerca de...");
		menuBar.add(mnAcercaDe);
		
		JMenuItem mntmAyuda = new JMenuItem("Ayuda");
		mnAcercaDe.add(mntmAyuda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primerNumero) {
					num1 = "9";
				}else if (segundoNumero) {
					num2 += 9;
				}
				strLinea1 += num1;
				txtPanelPantalla.setText(strLinea1+"\n"+num1);
			}
		});
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primerNumero) {
					num1 = "8";
				}else if (segundoNumero) {
					num2 += 8;
				}
				strLinea1 += num1;
				txtPanelPantalla.setText(strLinea1+"\n"+num1);
			}
		});
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primerNumero) {
					num1 = "7";
				}else if (segundoNumero) {
					num2 += 7;
				}
				strLinea1 += num1;
				txtPanelPantalla.setText(strLinea1+"\n"+num1);
			}
		});
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primerNumero) {
					num1 = "6";
				}else if (segundoNumero) {
					num2 += 6;
				}
				strLinea1 += num1;
				txtPanelPantalla.setText(strLinea1+"\n"+num1);
			}
		});
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primerNumero) {
					num1 = "5";
				}else if (segundoNumero) {
					num2 += 5;
				}
				strLinea1 += num1;
				txtPanelPantalla.setText(strLinea1+"\n"+num1);
			}
		});
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primerNumero) {
					num1 = "4";
				}else if (segundoNumero) {
					num2 += 4;
				}
				strLinea1 += num1;
				txtPanelPantalla.setText(strLinea1+"\n"+num1);
			}
		});
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primerNumero) {
					num1 = "3";
				}else if (segundoNumero) {
					num2 = "3";
				}
				strLinea1 += num1;
				txtPanelPantalla.setText(strLinea1+"\n"+num1);
			}
		});
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primerNumero) {
					num1 = "2";
				}else if (segundoNumero) {
					num2 = "2";
				}
				strLinea1 += num1;
				txtPanelPantalla.setText(strLinea1+"\n"+num1);
			}
		});
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primerNumero) {
					num1 = "1";
				}else if (segundoNumero) {
					num2 = "1";
				}
				strLinea1 += num1;
				txtPanelPantalla.setText(strLinea1+"\n"+num1);
			}
		});
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primerNumero) {
					num1 = "0";
				}else if (segundoNumero) {
					num2 = "0";
				}
				strLinea1 += num1;
				txtPanelPantalla.setText(strLinea1+"\n"+num1);
			}
		});
		
		JButton btnDecimal = new JButton(",");
		
		JButton btnSumar = new JButton("+");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				primerNumero=false;
//				segundoNumero=true;
				strLinea1 += " + ";
				txtPanelPantalla.setText(strLinea1+"\n"+num1);
				
			}
		});
		
		JButton btnRestar = new JButton("-");
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				primerNumero=false;
//				segundoNumero=true;
				strLinea1 += " - ";
				txtPanelPantalla.setText(strLinea1+"\n"+num1);
				
			}
		});
		
		JButton btnMultiplicar = new JButton("*");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				primerNumero=false;
//				segundoNumero=true;
				strLinea1 += " * ";
				txtPanelPantalla.setText(strLinea1+"\n"+num1);
				
			}
		});
		
		JButton btnDividir = new JButton("/");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				primerNumero=false;
//				segundoNumero=true;
				strLinea1 += num1;
				strLinea1 += " / ";
				txtPanelPantalla.setText(strLinea1+"\n"+num1);
				
			}
		});
		
		JButton btnResultado = new JButton("=");
		
		JButton btnBorrarUno = new JButton("<-");
		btnBorrarUno.setMargin(new Insets(2, 0, 2, 0));
		btnBorrarUno.setMinimumSize(new Dimension(39, 23));
		btnBorrarUno.setMaximumSize(new Dimension(39, 23));
		
		JButton btnLimpiarUno = new JButton("CE");
		btnLimpiarUno.setMargin(new Insets(2, 0, 2, 0));
		
		txtPantalla = new JTextField();
		txtPantalla.setEditable(false);
		txtPantalla.setEnabled(false);
		txtPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPantalla.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		txtPantalla.setAlignmentX(Component.RIGHT_ALIGNMENT);
		txtPantalla.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		txtPantalla.setColumns(10);
		
		JButton btnLimpiarTodo = new JButton("C");
		
		txtPanelPantalla = new JTextPane();
		txtPanelPantalla.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		SimpleAttributeSet attribs = new SimpleAttributeSet();
		StyleConstants.setAlignment(attribs , StyleConstants.ALIGN_RIGHT);
		StyleConstants.setFontSize(attribs, 14);
		StyleConstants.setFontFamily(attribs, Font.SANS_SERIF);
		StyleConstants.setBold(attribs, true);
		txtPanelPantalla.setParagraphAttributes(attribs,true);

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(54)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtPanelPantalla, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
						.addComponent(txtPantalla, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btn4, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btn5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btn6, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnRestar, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btn1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btn2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
										.addComponent(btn0, 0, 0, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btn3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnDecimal, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnDividir, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
										.addComponent(btnMultiplicar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(btnBorrarUno, Alignment.LEADING, 0, 45, Short.MAX_VALUE)
										.addComponent(btn7, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(btnLimpiarUno, Alignment.LEADING, 0, 45, Short.MAX_VALUE)
										.addComponent(btn8, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btn9, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnSumar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
										.addComponent(btnLimpiarTodo, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnResultado, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
					.addGap(92))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(39)
					.addComponent(txtPanelPantalla, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnBorrarUno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnLimpiarUno)
								.addComponent(btnLimpiarTodo, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btn7)
								.addComponent(btn8)
								.addComponent(btn9)
								.addComponent(btnSumar))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btn4)
								.addComponent(btn6)
								.addComponent(btnRestar)
								.addComponent(btn5))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btn1)
								.addComponent(btn2)
								.addComponent(btn3)
								.addComponent(btnMultiplicar))
							.addGap(3)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btn0)
								.addComponent(btnDecimal)
								.addComponent(btnDividir)))
						.addComponent(btnResultado, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtPantalla, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(59, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
