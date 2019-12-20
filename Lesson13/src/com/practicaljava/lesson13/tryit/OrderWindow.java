package com.practicaljava.lesson13.tryit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class OrderWindow extends JFrame{
	JLabel labelBikeModels;	
	JComboBox listBikeModels;
	String[] bikeModels = {"","Ukraine","BMX for adult", "BMX for teens", "BMX for kids"};
	String selectedModel="";
	JLabel labelBikeQuantity;
	private JTextField bikeQuantity;
	private int quantity; 
	JButton buttonValidateOrder;
	private JTextField resultOrder;
	private BikeOrder bikeOrder;
	
	public OrderWindow(){
		bikeOrder= new BikeOrder();
		
		JPanel panel=new JPanel();		
		BoxLayout bl = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(bl);
		
		labelBikeModels = new JLabel("Choose your bike model");		
		listBikeModels = new JComboBox(bikeModels);
		labelBikeQuantity = new JLabel("Enter the quantity you want order");
		buttonValidateOrder = new JButton("Order");
		bikeQuantity = new JTextField(20);
		resultOrder = new JTextField("Order status");
		
		listBikeModels.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent event) {
				JComboBox comboBox= (JComboBox)event.getSource();
				selectedModel = comboBox.getSelectedItem().toString();
			}
		});
		
		buttonValidateOrder.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent event) {
				try {
					if(selectedModel.equals("")) {
						resultOrder.setText("Please choose the model");
					} else {
						quantity=Integer.parseInt(bikeQuantity.getText());
						bikeOrder.validateOrder(selectedModel, quantity);
						resultOrder.setText(bikeOrder.getResultOrder());
					}
				}catch (NumberFormatException e) {
					resultOrder.setText("You should provide quantity like integer number!");
				}catch (TooManyBikesException tooManyBikesException) {
					resultOrder.setText(tooManyBikesException.getMessage());
				}
			}
		});
		
		
		
		panel.add(labelBikeModels);
		panel.add(listBikeModels);
		panel.add(labelBikeQuantity);
		panel.add(bikeQuantity);
		panel.add(buttonValidateOrder);
		panel.add(resultOrder);
		add(panel);
		
		
		
		setTitle("Order your bikes");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setContentPane(panel);
		pack();
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new OrderWindow();
	}

}
