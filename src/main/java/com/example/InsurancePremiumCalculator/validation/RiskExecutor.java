package com.example.InsurancePremiumCalculator.validation;

import com.example.InsurancePremiumCalculator.domain.Policy;

import java.util.List;

public class RiskExecutor {
    public void execute(List<RiskType> riskTypes, Policy policy) {
        for (RiskType riskType : riskTypes) {
            riskType.apply(policy);

        }
    }
}
