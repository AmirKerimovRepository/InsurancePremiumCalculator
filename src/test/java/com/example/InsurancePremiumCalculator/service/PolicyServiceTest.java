package com.example.InsurancePremiumCalculator.service;

import com.example.InsurancePremiumCalculator.domain.InsuredObject;
import com.example.InsurancePremiumCalculator.domain.Policy;
import com.example.InsurancePremiumCalculator.domain.PolicyStatus;
import com.example.InsurancePremiumCalculator.domain.SubInsuredObject;
import com.example.InsurancePremiumCalculator.validation.InsuranceRiskType;
import org.junit.jupiter.api.Test;


import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolicyServiceTest {

    private final PolicyServiceImpl policyService;

    public PolicyServiceTest(PolicyServiceImpl policyService) {
        this.policyService = policyService;
    }

    @Test
    public void shouldCalculatePremium() {

        SubInsuredObject subInsuredObject = new SubInsuredObject("TV", BigDecimal.valueOf(1000), InsuranceRiskType.FIRE);
        InsuredObject insuredObject = new InsuredObject("House", (List<SubInsuredObject>) subInsuredObject);
        Policy policy = new Policy("ENM102938311", PolicyStatus.REGISTERED, (List<InsuredObject>) insuredObject);

        BigDecimal actual = policyService.calculatePremium(policy);
        assertEquals(BigDecimal.valueOf(24), actual);
    }

}
