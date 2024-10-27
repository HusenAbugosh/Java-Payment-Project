package ProjectPhaze1;

public class Cash extends CustomerPayment {
private double dicountRate;

public Cash() {
}


public Cash(String customerName, int customerId, double amount, double dicountRate) {
	super(customerName, customerId, amount);
	this.dicountRate = dicountRate;
}


public double getDicountRate() {
	return dicountRate;
}

public void setDicountRate(double dicountRate) {
	this.dicountRate = dicountRate;
}

@Override
public String toString() {
    return "Cash [discountRate=" + dicountRate + ", customerName=" + customerName +
            ", customerId=" + customerId + ", amount=" + amount + "]";
}


@Override
protected double claculatePayment() {
    return amount - (amount * (getDicountRate() / 100));
}

/*
@Override
public void printPaymentInfo() {
	// TODO Auto-generated method stub
    System.out.println(toString()+" Payment = "+ claculatePayment()+"  ");
	
}

*/




}
