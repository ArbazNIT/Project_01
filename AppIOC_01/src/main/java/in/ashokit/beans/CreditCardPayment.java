package in.ashokit.beans;

public class CreditCardPayment  implements IPayment{

	public CreditCardPayment()
	{
		System.out.println("CreditCardPayment::CreditCardPayment()");
	}
	
	@Override
	public boolean payBill(Double amt) {
		
		System.out.println("creditCard Payment processing....");
		return true;
	}

}
