package com.Yash.Learning_Spring_boot;

import org.springframework.stereotype.Component;

@Component
public class Bean {
    String  PaymentService(){
    String Payment = "Payment Is Done";
    return Payment;
}
}
