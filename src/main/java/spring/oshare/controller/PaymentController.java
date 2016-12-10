package spring.oshare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaymentController {
	
	@RequestMapping("payment/goodsPayment")
	public String paymentForm(){
		return "payment/goodsPayment";
	}
	
	
}
