package com.andriiv.currencyconversionservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Created by Roman Andriiv (04.07.2023 - 12:50)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyConversion {

    private Long id;
    private String from;
    private String to;
    private BigDecimal quantity;
    private BigDecimal conversionMultiple;
    private BigDecimal totalCalculatedAmount;
    private String environment;
}
