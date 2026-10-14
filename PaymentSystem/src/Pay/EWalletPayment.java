package Pay;

import paymentStrategy.PaymentStrategy;
import payment.isp.QRCodePayable;

public class EWalletPayment implements PaymentStrategy, QRCodePayable {

	@Override
	public void pay(double amount) {
		System.out.println("Thanh toán bằng ví điện tử: " + amount);
	}

	@Override
	public void scanQRCode() {
		System.out.println("Đang quét mã QR để thanh toán");
	}
}