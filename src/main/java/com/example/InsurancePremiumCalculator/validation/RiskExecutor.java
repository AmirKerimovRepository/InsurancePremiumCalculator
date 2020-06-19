package com.example.InsurancePremiumCalculator.validation;
import java.math.BigDecimal;
import java.util.List;

public class RiskExecutor {
    public void execute(List<RiskType> riskTypes, BigDecimal value) {
        for (RiskType riskType : riskTypes) {
            riskType.apply(value);
        }
    }
}
