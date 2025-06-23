package com.janisar.TastyTrek.service;

import com.janisar.TastyTrek.io.OrderRequest;
import com.janisar.TastyTrek.io.OrderResponse;
import com.razorpay.RazorpayException;

public interface OrderService {

    OrderResponse createOrderWithPayment(OrderRequest request) throws RazorpayException;
}
