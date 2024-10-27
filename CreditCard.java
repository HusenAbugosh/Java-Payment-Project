package ProjectPhaze1;

import java.util.Date;

public class CreditCard extends CustomerPayment implements Payable  {
	private double chargingFee;
	private java.util.Date expiryData;
	
	
	public CreditCard() {
	}
	
	

	public CreditCard(String customerName, int customerId, double amount, double chargingFee, Date expiryData) {
		super(customerName, customerId, amount);
		this.chargingFee = chargingFee;
		this.expiryData = expiryData;
	}



	public double getChargingFee() {
		return chargingFee;
	}

	public void setChargingFee(double chargingFee) {
		this.chargingFee = chargingFee;
	}

	public java.util.Date getExpiryData() {
		return expiryData;
	}
	public void setExpiryData(java.util.Date expiryData) {
		this.expiryData = expiryData;
	}

	@Override
	public String toString() {
		return "CreditCard [chargingFee=" + chargingFee + ", expiryData=" + expiryData + ", customerName="
				+ customerName + ", customerId=" + customerId + ", amount=" + amount + "]";
	}

	@Override
	protected double claculatePayment() {
		// TODO Auto-generated method stub
		return amount+chargingFee;
	}
/*
	@Override
	public void printPaymentInfo() {
		// TODO Auto-generated method stub
		//calling both the toString() as well as the calculatePayment()
		System.out.println(toString()+ "Payment"+claculatePayment()+"  ");
		
	}
	*/

	/*expiryDate is less than or equal to the current date.*/

	@Override
	public boolean isAuthorized() {
		// TODO Auto-generated method stub
		Date currentDate=new Date();
		if(expiryData.compareTo(currentDate) >= 0)
		return true;
		
		else return false;
	}

	

}
