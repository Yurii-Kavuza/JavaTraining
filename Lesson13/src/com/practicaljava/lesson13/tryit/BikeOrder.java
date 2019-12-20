package com.practicaljava.lesson13.tryit;

public class BikeOrder {
	private String resultOrder="";
	
	public String getResultOrder() {
		return resultOrder;
	}	
	
	public void validateOrder(String bikeModel, int quantity) throws TooManyBikesException{
		if (bikeModel.equals("Ukraine")&&(quantity<=100)) {
			resultOrder = "Your order is valid: Model - " + bikeModel + " Quantity - " + quantity;
		}else if (bikeModel.equals("BMX for adult")&&(quantity<=100)) {
			resultOrder = "Your order is valid: Model - " + bikeModel + " Quantity - " + quantity;
		}else if (bikeModel.equals("BMX for teens")&&(quantity<=150)) {
			resultOrder = "Your order is valid: Model - " + bikeModel + " Quantity - " + quantity;
		}else if (bikeModel.equals("BMX for kids")&&(quantity<=300)) {
			resultOrder = "Your order is valid: Model - " + bikeModel + " Quantity - " + quantity;
		}else {
			throw new TooManyBikesException("Can not ship"+quantity+" bikes of the model "+bikeModel);
		}		
	}	
}
