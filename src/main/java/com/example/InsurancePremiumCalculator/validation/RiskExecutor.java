package com.example.InsurancePremiumCalculator.validation;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class RiskExecutor {
    public void execute(Map<String, List<RiskType>> riskTypes, BigDecimal value) {
        for (RiskType riskType : riskTypes.get(value)) {
            riskType.apply(value);
        }
    }
}
