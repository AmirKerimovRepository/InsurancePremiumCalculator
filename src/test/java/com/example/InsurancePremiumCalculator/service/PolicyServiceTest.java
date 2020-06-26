package com.example.InsurancePremiumCalculator.service;

import com.example.InsurancePremiumCalculator.domain.InsuredObject;
import com.example.InsurancePremiumCalculator.domain.Policy;
import com.example.InsurancePremiumCalculator.domain.PolicyStatus;
import com.example.InsurancePremiumCalculator.domain.SubInsuredObject;
import com.example.InsurancePremiumCalculator.validation.InsuranceRiskType;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolicyServiceTest {

    public final double TEST_VALUE = 24;
    private final double delta = 0.1;


    @Test
    public void shouldCalculatePremium() {

        PolicyServiceImpl policyService = new PolicyServiceImpl();

        SubInsuredObject subInsuredObject = new SubInsuredObject("TV", BigDecimal.valueOf(1000), InsuranceRiskType.FIRE);
        InsuredObject insuredObject = new InsuredObject("House", Collections.singletonList(subInsuredObject));
        Policy policyTest = new Policy("ENM102938311", PolicyStatus.REGISTERED, Collections.singletonList(insuredObject));
        double actual = policyService.calculatePremium(policyTest).doubleValue();
        assertEquals(TEST_VALUE, actual , delta);


    }
}
