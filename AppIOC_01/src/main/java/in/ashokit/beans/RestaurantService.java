package in.ashokit.beans;

public class RestaurantService {
	
	private IPayment payment;
	
	public RestaurantService()
	{
		System.out.println("RestaurantService::0-param constructor");
	}
	
	public RestaurantService(IPayment payment)
	{
		this.payment=payment;
		System.out.println("RestaurantService param constructor");
	}
	
	public void setPayment(IPayment payment)
	{
		this.payment=payment;
		System.out.println("setter method called...");
	}
	public void processPayment(double amt)
	{
				boolean status = payment.payBill(amt);
				if(status)
				{
					System.out.println("payment complete..");
				}else
				{
					System.out.println("payment failed...");
				}
	}

}
