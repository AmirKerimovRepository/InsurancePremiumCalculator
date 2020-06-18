package com.example.InsurancePremiumCalculator.validation;

import com.example.InsurancePremiumCalculator.domain.Policy;

import java.util.List;

public class RiskCalculator {
    public void calculate(List<PolicyRisk> riskTypes, Policy policy) {
        for (PolicyRisk riskType : riskTypes) {
            riskType.apply(policy);

        }
    }
}
