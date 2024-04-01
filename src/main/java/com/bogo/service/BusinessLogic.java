package com.bogo.service;

import com.bogo.Price;
import org.springframework.stereotype.Service;

@Service
public interface BusinessLogic {
    Price getPrice(Price prices);
}
