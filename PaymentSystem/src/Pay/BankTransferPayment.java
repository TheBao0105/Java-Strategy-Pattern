package Pay;

import paymentStrategy.PaymentStrategy;

public class BankTransferPayment implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		System.out.println("Thanh toán bằng chuyển khoản ngân hàng: " + amount);
	}
}