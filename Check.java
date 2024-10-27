package ProjectPhaze1;
/*For type: CASHIER=1
 * CERTIFIED=2
 * PERSONAL=3
 */


public class Check extends CustomerPayment implements Payable{
	
	
    public static final int CASHIER = 1;
    public static final int CERTIFIED = 2;
    public static final int PERSONAL = 3;


	private int accountNum; 
	private double accountBalance;
	private int type;
	
	

public Check() {
	}



public Check(String customerName, int customerId, double amount, int accountNum, double accountBalance, int type) {
	super(customerName, customerId, amount);
	this.accountNum = accountNum;
	this.accountBalance = accountBalance;
	this.type = type;
}




public int getAccountNum() {
	return accountNum;
}




public void setAccountNum(int accountNum) {
	this.accountNum = accountNum;
}




public double getAccountBalance() {
	return accountBalance;
}




public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}





public int getType() {
	return type;
}




public void setType(int type) {
	if( type ==CASHIER)
    this.type =1 ;
	else if( type ==CERTIFIED)
	    this.type = 2;
	else 	
		 this.type = 3;
	
}




@Override
protected double claculatePayment() {
	// TODO Auto-generated method stub
	return amount;
	

}


@Override
public String toString() {
    return "Check [accountNumber=" + accountNum + ", accountBalance=" + accountBalance +
            ", type=" + type + ", customerName=" + customerName +
            ", customerId=" + customerId + ", amount=" + amount + "]";
}



/*
@Override
public void printPaymentInfo() {
	// TODO Auto-generated method stub
	System.out.println(toString()+" Payment = "+claculatePayment()+" ");		
}
*/

/*either the type of the check is CASHIER or if the 
 * amount of the payment is less than or equal to the accountBalance
 */



@Override
public boolean isAuthorized() {
    if (type == CASHIER || amount <= accountBalance) {
        deductAmountFromBalance();
        return true;
    }
    return false;
}

/* calls the deductAmountFromBalance() function inside the Check class isAuthorized() function */
public void deductAmountFromBalance() {
    if (type == CERTIFIED || type == PERSONAL) {
        accountBalance -= amount; // subtract the amount from accountBalance
    }
}

/*
@Override
public int compareTo(CustomerPayment other) {
    // Reverse the order by multiplying by -1
    return -Double.compare(this.claculatePayment(), other.claculatePayment());
}


*/




}


