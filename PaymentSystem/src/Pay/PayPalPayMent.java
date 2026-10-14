package Pay;

import paymentStrategy.PaymentStrategy;
import payment.isp.Refundable;

public class PayPalPayMent implements PaymentStrategy, Refundable {

	@Override
	public void pay(double amount) {
		System.out.println("Thanh toán bằng PayPal: " + amount);
	}

	@Override
	public void refund(double amount) {
		System.out.println("Hoàn tiền qua PayPal: " + amount);
	}
}