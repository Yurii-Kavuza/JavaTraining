import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorTryIt {

	//Declare all calculator's components.
	JPanel windowsContent;
	JTextField displayField;
	JButton buttonDisabled;
	JButton buttonBackSpace;
	JButton buttonCE;
	JButton buttonC;
	JButton buttonMC;
	JButton buttonMH;
	JButton buttonMS;
	JButton buttonMPlus;
	JButton buttonPlusInvertMinus;
	JButton button0;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton buttonPoint;
	JButton buttonEqual;
	JButton buttonDivide;
	JButton buttonMultiply;
	JButton buttonMinus;
	JButton buttonPlus;
	JButton buttonSqrt;
	JButton buttonPercent;
	JButton buttonReciproc;
	
	//Constructor creates the components
	//and adds the to the frame using GridBagLayout
	
	public CalculatorTryIt() {
		windowsContent=new JPanel();
		
		// Set the layout manager for this panel
		GridBagLayout gbl=new GridBagLayout();
		windowsContent.setLayout(gbl);
		
		//Creating an instance of GribBasConstraints
		GridBagConstraints constraints=new GridBagConstraints();
		
		//setting constraints for the Calculator's displayField:
		constraints.gridx=0;
		constraints.gridy=0;
		
		constraints.gridheight=1;
		constraints.gridwidth=6;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		constraints.insets=new Insets(4,4,4,4);
		
		displayField=new JTextField();
		displayField.setHorizontalAlignment(JTextField.RIGHT);
		gbl.setConstraints(displayField, constraints);		
		windowsContent.add(displayField);
		
		//setting constraints for the Calculator's disabled button:
		constraints.gridx=0;
		constraints.gridy=1;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		constraints.insets=new Insets(2,4,6,6);
		
		
		buttonDisabled =new JButton();
		buttonDisabled.setEnabled(false);
		gbl.setConstraints(buttonDisabled, constraints);		
		windowsContent.add(buttonDisabled);
		
		//setting constraints for the Calculator's BackSpace button:
		constraints.gridx=1;
		constraints.gridy=1;
		
		constraints.gridheight=1;
		constraints.gridwidth=2;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		constraints.insets=new Insets(2,2,6,2);
		
		
		buttonBackSpace =new JButton("BackSpace");
		gbl.setConstraints(buttonBackSpace, constraints);		
		windowsContent.add(buttonBackSpace);
		
		//setting constraints for the Calculator's CE button:
		constraints.gridx=3;
		constraints.gridy=1;
		
		constraints.gridheight=1;
		constraints.gridwidth=2;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		constraints.insets=new Insets(2,2,6,2);
		
		
		buttonCE =new JButton("CE");
		gbl.setConstraints(buttonCE, constraints);		
		windowsContent.add(buttonCE);
		
		//setting constraints for the Calculator's C button:
		constraints.gridx=5;
		constraints.gridy=1;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		constraints.insets=new Insets(2,2,6,4);
		
		
		buttonC =new JButton("C");
		gbl.setConstraints(buttonC, constraints);		
		windowsContent.add(buttonC);
		
		//setting constraints for the Calculator's MC button:
		constraints.gridx=0;
		constraints.gridy=2;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		constraints.insets=new Insets(2,4,2,6);
		
		buttonMC =new JButton("MC");
		gbl.setConstraints(buttonMC, constraints);		
		windowsContent.add(buttonMC);
		
		//setting constraints for the Calculator's 7 button:
		constraints.gridx=1;
		constraints.gridy=2;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		constraints.insets=new Insets(2,2,2,2);
		
		button7 =new JButton("7");
		gbl.setConstraints(button7, constraints);
		windowsContent.add(button7);		
		
		//setting constraints for the Calculator's 8 button:
		constraints.gridx=2;
		constraints.gridy=2;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		
		
		button8 =new JButton("8");
		gbl.setConstraints(button8, constraints);		
		windowsContent.add(button8);
		
		//setting constraints for the Calculator's 9 button:
		constraints.gridx=3;
		constraints.gridy=2;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		
		
		button9 =new JButton("9");
		gbl.setConstraints(button9, constraints);		
		windowsContent.add(button9);
		
		//setting constraints for the Calculator's divide button:
		constraints.gridx=4;
		constraints.gridy=2;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		
		buttonDivide =new JButton("/");
		gbl.setConstraints(buttonDivide, constraints);		
		windowsContent.add(buttonDivide);
		
		//setting constraints for the Calculator's sqrt button:
		constraints.gridx=5;
		constraints.gridy=2;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		constraints.insets=new Insets(2,2,2,4);
		
		buttonSqrt =new JButton("sqrt");
		gbl.setConstraints(buttonSqrt, constraints);		
		windowsContent.add(buttonSqrt);
		
		//setting constraints for the Calculator's MH button:
		constraints.gridx=0;
		constraints.gridy=3;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		constraints.insets=new Insets(2,4,2,6);
		
		buttonMH =new JButton("MH");
		gbl.setConstraints(buttonMH, constraints);		
		windowsContent.add(buttonMH);
		
		//setting constraints for the Calculator's 4 button:
		constraints.gridx=1;
		constraints.gridy=3;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		constraints.insets=new Insets(2,2,2,2);
		
		button4 =new JButton("4");
		gbl.setConstraints(button4, constraints);
		windowsContent.add(button4);		
		
		//setting constraints for the Calculator's 5 button:
		constraints.gridx=2;
		constraints.gridy=3;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		
		button5 =new JButton("5");
		gbl.setConstraints(button5, constraints);		
		windowsContent.add(button5);
		
		//setting constraints for the Calculator's 6 button:
		constraints.gridx=3;
		constraints.gridy=3;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		
		button6 =new JButton("6");
		gbl.setConstraints(button6, constraints);		
		windowsContent.add(button6);
		
		//setting constraints for the Calculator's multiply button:
		constraints.gridx=4;
		constraints.gridy=3;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		
		buttonMultiply =new JButton("*");
		gbl.setConstraints(buttonMultiply, constraints);		
		windowsContent.add(buttonMultiply);
		
		//setting constraints for the Calculator's percent button:
		constraints.gridx=5;
		constraints.gridy=3;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		constraints.insets=new Insets(2,2,2,4);
		
		buttonPercent =new JButton("%");
		gbl.setConstraints(buttonPercent, constraints);		
		windowsContent.add(buttonPercent);
		
		//setting constraints for the Calculator's MS button:
		constraints.gridx=0;
		constraints.gridy=4;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		constraints.insets=new Insets(2,4,2,6);
		
		buttonMS =new JButton("MS");
		gbl.setConstraints(buttonMS, constraints);		
		windowsContent.add(buttonMS);
		
		//setting constraints for the Calculator's 1 button:
		constraints.gridx=1;
		constraints.gridy=4;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		constraints.insets=new Insets(2,2,2,2);
		
		button1 =new JButton("1");
		gbl.setConstraints(button1, constraints);
		windowsContent.add(button1);		
		
		//setting constraints for the Calculator's 2 button:
		constraints.gridx=2;
		constraints.gridy=4;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		
		button2 =new JButton("2");
		gbl.setConstraints(button2, constraints);		
		windowsContent.add(button2);
		
		//setting constraints for the Calculator's 3 button:
		constraints.gridx=3;
		constraints.gridy=4;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		
		button3 =new JButton("3");
		gbl.setConstraints(button3, constraints);		
		windowsContent.add(button3);
		
		//setting constraints for the Calculator's minus button:
		constraints.gridx=4;
		constraints.gridy=4;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		
		buttonMinus =new JButton("-");
		gbl.setConstraints(buttonMinus, constraints);		
		windowsContent.add(buttonMinus);
		
		//setting constraints for the Calculator's reciproc value  1/x button:
		constraints.gridx=5;
		constraints.gridy=4;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		constraints.insets=new Insets(2,2,2,4);
		
		buttonReciproc =new JButton("1/x");
		gbl.setConstraints(buttonReciproc, constraints);		
		windowsContent.add(buttonReciproc);
		
		//setting constraints for the Calculator's M+ button:
		constraints.gridx=0;
		constraints.gridy=5;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		constraints.insets=new Insets(2,4,4,6);
		
		buttonMPlus =new JButton("M+");
		gbl.setConstraints(buttonMPlus, constraints);		
		windowsContent.add(buttonMPlus);
		
		//setting constraints for the Calculator's 0 button:
		constraints.gridx=1;
		constraints.gridy=5;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		constraints.insets=new Insets(2,2,4,2);
		
		button0 =new JButton("0");
		gbl.setConstraints(button0, constraints);
		windowsContent.add(button0);		
		
		//setting constraints for the Calculator's plus invert to minus button:
		constraints.gridx=2;
		constraints.gridy=5;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		
		buttonPlusInvertMinus =new JButton("+/-");
		gbl.setConstraints(buttonPlusInvertMinus, constraints);		
		windowsContent.add(buttonPlusInvertMinus);
		
		//setting constraints for the Calculator's point button:
		constraints.gridx=3;
		constraints.gridy=5;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		
		buttonPoint =new JButton(".");
		gbl.setConstraints(buttonPoint, constraints);		
		windowsContent.add(buttonPoint);		
		
		//setting constraints for the Calculator's plus button:
		constraints.gridx=4;
		constraints.gridy=5;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		
		buttonPlus =new JButton("+");
		gbl.setConstraints(buttonPlus, constraints);		
		windowsContent.add(buttonPlus);
		
		//setting constraints for the Calculator's equal button:
		constraints.gridx=5;
		constraints.gridy=5;
		
		constraints.gridheight=1;
		constraints.gridwidth=1;
		
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		constraints.anchor=GridBagConstraints.CENTER;
		constraints.insets=new Insets(2,2,4,4);
		
		buttonEqual =new JButton("=");
		gbl.setConstraints(buttonEqual, constraints);		
		windowsContent.add(buttonEqual);
		
		//Create the frame and set its content pane
		JFrame frame=new JFrame("Calculator");
		frame.setContentPane(windowsContent);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new CalculatorTryIt();

	}

}
