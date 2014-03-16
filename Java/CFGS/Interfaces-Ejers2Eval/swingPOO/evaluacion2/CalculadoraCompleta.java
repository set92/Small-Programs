package evaluacion2;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

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

public class CalculadoraCompleta extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtPantalla;
	private JTextPane textPane;
	private String linea;
    Stack<String> stack= new Stack<String>();
    char operator;
    boolean finished=false;

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
					CalculadoraCompleta frame = new CalculadoraCompleta();
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
	public CalculadoraCompleta() {
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
		btn9.addActionListener(this);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(this);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(this);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(this);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(this);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(this);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(this);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(this);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(this);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(this);
		
		JButton btnDecimal = new JButton(",");
		btnDecimal.addActionListener(this);
		
		JButton btnSumar = new JButton("+");
		btnSumar.addActionListener(this);
		
		JButton btnRestar = new JButton("-");
		btnRestar.addActionListener(this);
		
		JButton btnMultiplicar = new JButton("*");
		btnMultiplicar.addActionListener(this);
		
		JButton btnDividir = new JButton("/");
		btnDividir.addActionListener(this);

		JButton btnResultado = new JButton("=");
		btnResultado.addActionListener(this);
		
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
		btnLimpiarTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		textPane = new JTextPane();
		textPane.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		SimpleAttributeSet attribs = new SimpleAttributeSet();
		StyleConstants.setAlignment(attribs , StyleConstants.ALIGN_RIGHT);
		StyleConstants.setFontSize(attribs, 14);
		StyleConstants.setFontFamily(attribs, Font.SANS_SERIF);
		StyleConstants.setBold(attribs, true);
		textPane.setParagraphAttributes(attribs,true);

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(54)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(textPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
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
									.addComponent(btn7, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
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
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
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
	
    public void actionPerformed(ActionEvent e) {
        char botonPulsado = ((JButton) e.getSource()).getText().charAt(0);
        
        if (finished) {
            textPane.setText("");
            finished = false;
        }
        if (botonPulsado >= '0' & botonPulsado <= '9') {
            textPane.setText(textPane.getText() + botonPulsado);
        } else if (botonPulsado == ',') {
            if (!textPane.getText().contains(".") & !textPane.getText().equals("")) {
                textPane.setText(textPane.getText() + ".");
            }
        } else if (botonPulsado == 'C') {
            textPane.setText("");
            stack.removeAllElements();
        } else if (botonPulsado == '=') {
            calcular();
        } else {
            operator = botonPulsado;
            if (!textPane.getText().equals("")) {
                stack.push(textPane.getText());
            }
            textPane.setText("");
        }
    }

    private void calcular() {
        if (!textPane.getText().equals("") && !stack.isEmpty()) {
        	linea = stack.pop();
            double a = Double.parseDouble(stack.pop());
            double b = Double.parseDouble(textPane.getText());
            double r = 0;
            if (operator == '+') {
                r = a + b;
            } else if (operator == '-') {
                r = a - b;
            } else if (operator == '*') {
                r = a * b;
            } else if (operator == '/') {
                r = a / (b != 0 ? b : 1);
            }
            textPane.setText(Double.toString(r));
        }
        finished = true;
    }
}
