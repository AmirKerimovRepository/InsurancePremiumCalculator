package com.example.InsurancePremiumCalculator.validation;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class RiskExecutor {

    public BigDecimal execute(Map<String, List<RiskType>> riskTypes) {

        for (Map.Entry<String, List<RiskType>> riskType : riskTypes.entrySet()) {
          riskType.getValue().forEach(RiskType::apply);
        }
        BigDecimal totalPremium = riskType.values()
                .stream()
                .reduce((riskTypeFire, riskTypeTheft) -> riskTypeFire.add(RiskTypeTheft);
        return totalPremium;


    }
}
