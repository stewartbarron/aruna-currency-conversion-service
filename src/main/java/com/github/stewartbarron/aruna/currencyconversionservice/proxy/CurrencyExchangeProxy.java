package com.github.stewartbarron.aruna.currencyconversionservice.proxy;

import com.github.stewartbarron.aruna.currencyconversionservice.model.CurrencyConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange", url = "localhost:8000")
public interface CurrencyExchangeProxy {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversion retrieveCurrencyConversion
            (@PathVariable("from") String from, @PathVariable("to") String to);
}
