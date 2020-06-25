package com.example.InsurancePremiumCalculator.validation;


import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class RiskExecutor {

    public BigDecimal execute(Map<String, List<RiskType>> riskTypes) {

        return riskTypes.values().stream()
                .flatMap(List::stream)
                .map(RiskType::apply)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
    }

}
