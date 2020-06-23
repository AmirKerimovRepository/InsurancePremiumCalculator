package com.example.InsurancePremiumCalculator.controller;

import com.example.InsurancePremiumCalculator.domain.Policy;
import com.example.InsurancePremiumCalculator.service.PolicyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;


@RestController
public class InsuranceController {

    private final PolicyServiceImpl policyService;

    @Autowired
    public InsuranceController(PolicyServiceImpl policyService) {
        this.policyService = policyService;
    }

    @GetMapping("/api/v1/calculatePremium")
    public BigDecimal calculate(Policy policy) {
        return policyService.calculatePremium(policy);
    }

}
