package Java_Package;

public class PaymentInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Payment method1 = new CreditCardPayment();
    Payment method2 = new DebitCardPayment();	
    
    method1.ProcessPayment();
    method2.ProcessPayment();
	}

}

interface Payment
{
	void ProcessPayment();
}

class CreditCardPayment implements Payment

{

	@Override
	public void ProcessPayment() {
		// TODO Auto-generated method stub
		System.out.println("Use Credit Card Payment");
	}
	
}

class DebitCardPayment implements Payment

{  
	
	public void ProcessPayment() {
		// TODO Auto-generated method stub
		System.out.println("Use Debit Card Payment");
}

}