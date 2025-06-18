package com.janisar.TastyTrek.service;

import com.janisar.TastyTrek.io.CartRequest;
import com.janisar.TastyTrek.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}
