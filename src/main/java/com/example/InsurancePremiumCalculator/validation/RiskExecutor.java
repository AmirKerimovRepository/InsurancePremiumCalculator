package com.example.InsurancePremiumCalculator.validation;

import com.example.InsurancePremiumCalculator.domain.Policy;

public class RiskExecutor {
    public void execute(PolicyRisk[] riskTypes, Policy policy) {
        for (PolicyRisk riskType : riskTypes) {
            System.out.println(riskType.apply(policy));

        }
    }
}
