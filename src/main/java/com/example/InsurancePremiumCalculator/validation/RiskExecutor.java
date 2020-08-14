package com.example.InsurancePremiumCalculator.validation;


import java.math.BigDecimal;
import java.util.List;

public class RiskExecutor {

    public BigDecimal execute(List<RiskType> riskTypes) {

        return riskTypes.stream()
                .map(RiskType::apply)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
    }

}
