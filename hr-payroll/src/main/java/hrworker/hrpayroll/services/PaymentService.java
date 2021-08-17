package hrworker.hrpayroll.services;

import org.springframework.stereotype.Service;

import hrworker.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 100.0, days);
	}
}
