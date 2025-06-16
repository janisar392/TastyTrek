package com.janisar.TastyTrek.service;

import com.janisar.TastyTrek.io.CartRequest;
import com.janisar.TastyTrek.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);
}
