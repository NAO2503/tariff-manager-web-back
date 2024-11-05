package com.tariff.manager.back.application.ports.driving;

import com.tariff.manager.back.domain.Price;

public interface PriceServicePort {

    Price findByBrandProductBetweenDate(String brandId, String productId, String dateBetween);
}
