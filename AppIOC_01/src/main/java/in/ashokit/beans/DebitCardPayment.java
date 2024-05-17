package in.ashokit.beans;

public class DebitCardPayment implements IPayment {

	
	public DebitCardPayment()
	{
		System.out.println("DebitCardPayment::DebitCardPayment()");
	}
	
	
	@Override
	public boolean payBill(Double amt) {
		System.out.println("DebitCardPayment processinng....");
		return true;
	}

}
