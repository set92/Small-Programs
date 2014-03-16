package evaluacion2;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class ConversorEurosDolares {
	JFrame frame;
	JPanel panelEuros, panelEuroDolar, panelDolar;
	JLabel lblEuros, lblDolar, lblEuroDolar;
	JTextField txtEuros, txtEuroDolar, txtDolar;
	JSlider sliderEuros, sliderDolar;
	private static final int MIN=0, MAX=1000, INIT=0;
	
	public ConversorEurosDolares() {
		frame = new JFrame("Conversor Euros - Dolares");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		panelEuros = new JPanel(new GridLayout(0, 1));
		lblEuros = new JLabel("Euros: ");
		txtEuros = new JTextField("0");
		txtEuros.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cambioTexto(e);
			}
		});
		sliderEuros = new JSlider(JSlider.HORIZONTAL,MIN,MAX,INIT);
		customizarSlider(sliderEuros);
		panelEuros.add(lblEuros);
		panelEuros.add(txtEuros);
		panelEuros.add(sliderEuros);
		
		panelEuroDolar = new JPanel(new GridLayout(0, 1));
		lblEuroDolar = new JLabel("1 Euro son en dolares: ");
		txtEuroDolar = new JTextField("1.36");
		panelEuroDolar.add(lblEuroDolar);
		panelEuroDolar.add(txtEuroDolar);
		
		panelDolar = new JPanel(new GridLayout(0, 1));
		lblDolar = new JLabel("Dolares: ");
		txtDolar = new JTextField("0");
		txtDolar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cambioTexto(e);
			}
		});
		sliderDolar = new JSlider(JSlider.HORIZONTAL, MIN, MAX, INIT);
		customizarSlider(sliderDolar);
		panelDolar.add(lblDolar);
		panelDolar.add(txtDolar);
		panelDolar.add(sliderDolar);
		
		frame.add(panelEuros);
		frame.add(panelEuroDolar);
		frame.add(panelDolar);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	protected void cambioTexto(ActionEvent e) {
		if (e.getSource() == txtEuros) {
			float cambio= Float.parseFloat(txtEuros.getText());
			cambio = 100*cambio*Float.parseFloat(txtEuroDolar.getText());
			cambio = Math.round(cambio);
			cambio = cambio/100;
			txtDolar.setText(String.valueOf(cambio));
//			Cambiar los sliders
			sliderEuros.setValue(Math.round(Float.parseFloat(txtEuros.getText())));
			sliderDolar.setValue(Math.round(Float.parseFloat(txtEuros.getText())));
		}
		if (e.getSource() == txtDolar) {
			float cambio= Float.parseFloat(txtDolar.getText());
			cambio = 100*cambio/Float.parseFloat(txtEuroDolar.getText());
			cambio = Math.round(cambio);
			cambio = cambio/100;
			txtDolar.setText(String.valueOf(cambio));
		}
	}

	private void customizarSlider(JSlider slider) {
		slider.setMajorTickSpacing(200);
		slider.setMinorTickSpacing(100);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.disable();
	}
	public static void main(String[] args) {
		ConversorEurosDolares obj1 = new ConversorEurosDolares();
	}

}
