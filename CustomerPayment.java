package ProjectPhaze1;

public abstract class CustomerPayment implements Comparable<CustomerPayment> {

	protected  String customerName;
	protected int customerId;
	protected double amount;
	
	public CustomerPayment() {
		  }

	public CustomerPayment(String customerName, int customerId, double amount) {
		this.customerName = customerName;
		this.customerId = customerId;
		this.amount = amount;
	}
	
	
	
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	

	@Override
	public String toString() {
		return "CustomerPayment [customerName=" + customerName + ", customerId=" + customerId + ", amount=" + amount
				+ "]";
	}
//abstract methods 
	protected abstract double claculatePayment();
	// claculatePayment() depends on the class
	//printPaymentInfo() calling both the toString() as well as the calculatePayment()

	
	/*c-	class CustomerPayment is Comparable based
	 *  on the value returned by the method calculatePayment().*/
	
	@Override
    public int compareTo(CustomerPayment other) {
		

	    if (this.claculatePayment()-other.claculatePayment()>0) {
	        return -1;
	    } else if (this.claculatePayment()- other.claculatePayment()<0) {
	        return 1;
	    } 
	        return 0;
	    
    }

	public void printPaymentInfo() {
		// TODO Auto-generated method stub
		System.out.println(toString()+" Payment "/*+ claculatePayment()+"  "*/);
		
	}
	
	


	
	

}
	

