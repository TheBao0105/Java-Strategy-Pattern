package Main;

import Pay.CreditCardPayment;
import Pay.PayPalPayMent;
import Pay.EWalletPayment;
import Pay.BankTransferPayment;

import paymentService.PaymentService;
import paymentStrategy.PaymentStrategy;

public class Main {

	public static void main(String[] args) {

		// 1. Thanh toán bằng thẻ tín dụng
		PaymentService service = new PaymentService(new CreditCardPayment());

		service.pay(1_000_000);

		// 2. Chuyển sang thanh toán bằng PayPal
		service.setStrategy(new PayPalPayMent());
		service.pay(500_000);

		// 3. Chuyển sang thanh toán bằng ví điện tử
		service.setStrategy(new EWalletPayment());
		service.pay(200_000);

		// 4. Chuyển sang chuyển khoản ngân hàng
		service.setStrategy(new BankTransferPayment());
		service.pay(800_000);

		// 5. Minh họa chức năng hoàn tiền của thẻ tín dụng
		CreditCardPayment creditCard = new CreditCardPayment();

		creditCard.refund(100_000);

		// 6. Minh họa chức năng quét QR của ví điện tử
		EWalletPayment eWallet = new EWalletPayment();

		eWallet.scanQRCode();
	}
}