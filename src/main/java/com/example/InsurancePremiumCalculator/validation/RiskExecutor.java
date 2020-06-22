package com.example.InsurancePremiumCalculator.validation;

import java.util.List;
import java.util.Map;

public class RiskExecutor {
    public double execute(Map<String, List<RiskType>> riskTypes) {
        for (Map.Entry<String, List<RiskType>> riskType : riskTypes.entrySet()) {
            riskType.getValue().forEach(s -> s.apply());
        }
        double policyTotalCost = 
        return policyTotalCost;
    }
}
