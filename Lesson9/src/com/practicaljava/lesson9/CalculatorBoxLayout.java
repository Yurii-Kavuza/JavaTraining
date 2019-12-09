package com.practicaljava.lesson9;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorBoxLayout {
	JPanel windowsContent;
	
	private JTextField displayField;

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

	public void setDisplayValue(String val){
        displayField.setText(val);
    }

    public String getDisplayValue() {
        return displayField.getText();
    }
    
    public CalculatorBoxLayout() {
    	windowsContent = new JPanel();
    	
    	BoxLayout bl=new BoxLayout(windowsContent, BoxLayout.X_AXIS);
    	windowsContent.setLayout(bl);
    	
    	button0 = new JButton("0");
    	button1 = new JButton("1");
    	button2 = new JButton("2");
    	button3 = new JButton("3");
    	button4 = new JButton("4");
    	button5 = new JButton("5");
    	button6 = new JButton("6");
    	button7 = new JButton("7");
    	button8 = new JButton("8");
    	button9 = new JButton("9");
    	buttonPoint = new JButton(".");
    	buttonEqual = new JButton("=");
    	buttonDivide = new JButton("/");
    	buttonMultiply = new JButton("*");
    	buttonMinus = new JButton("-");
    	buttonPlus = new JButton("+");
    	displayField=new JTextField();
		displayField.setHorizontalAlignment(JTextField.RIGHT);
    	
    	windowsContent.add(displayField);
    	windowsContent.add(button0);
    	windowsContent.add(button1);
    	windowsContent.add(button2);
    	windowsContent.add(button3);
    	windowsContent.add(button4);
    	windowsContent.add(button5);
    	windowsContent.add(button6);
    	windowsContent.add(button7);
    	windowsContent.add(button8);
    	windowsContent.add(button9);
    	windowsContent.add(buttonPoint);    	
    	windowsContent.add(buttonDivide);
    	windowsContent.add(buttonMultiply);
    	windowsContent.add(buttonMinus);
    	windowsContent.add(buttonPlus);
    	windowsContent.add(buttonEqual);
    	
    	CalculatorEngineBL calcEngine = new CalculatorEngineBL(this);
		  button0.addActionListener(calcEngine);
		  button1.addActionListener(calcEngine);
		  button2.addActionListener(calcEngine);
		  button3.addActionListener(calcEngine);
		  button4.addActionListener(calcEngine);
		  button5.addActionListener(calcEngine);
		  button6.addActionListener(calcEngine);
		  button7.addActionListener(calcEngine);
		  button8.addActionListener(calcEngine);
		  button9.addActionListener(calcEngine);
		  buttonPoint.addActionListener(calcEngine);
		  buttonPlus.addActionListener(calcEngine);
		  buttonMinus.addActionListener(calcEngine);
		  buttonEqual.addActionListener(calcEngine);
		  buttonMultiply.addActionListener(calcEngine);
		  buttonDivide.addActionListener(calcEngine);
		  
    	
    	JFrame frame = new JFrame ("Calculator Box Layout");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setContentPane(windowsContent);
    	frame.pack();
    	frame.setVisible(true);
    	
    }
    
    public static void main (String[]args) {
    	new CalculatorBoxLayout();
    }

}
