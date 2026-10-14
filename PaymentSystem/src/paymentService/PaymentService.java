package paymentService;

import paymentStrategy.PaymentStrategy;

public class PaymentService {

	private PaymentStrategy strategy;

	public PaymentService(PaymentStrategy strategy) {
		setStrategy(strategy);
	}

	public void pay(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("So tien thanh toan phai lon hon 0");
		}

		strategy.pay(amount);
	}

	public void setStrategy(PaymentStrategy strategy) {
		if (strategy == null) {
			throw new IllegalArgumentException("Chien luoc thanh toan khong duoc null");
		}

		this.strategy = strategy;
	}
}