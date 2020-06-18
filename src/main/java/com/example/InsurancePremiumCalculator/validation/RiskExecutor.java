package com.example.InsurancePremiumCalculator.validation;

import com.example.InsurancePremiumCalculator.domain.Policy;

import java.util.List;

public class RiskExecutor {
    public void execute(List<PolicyRisk> riskTypes, Policy policy) {
        for (PolicyRisk riskType : riskTypes) {
            riskType.apply(policy);

        }
    }
}
