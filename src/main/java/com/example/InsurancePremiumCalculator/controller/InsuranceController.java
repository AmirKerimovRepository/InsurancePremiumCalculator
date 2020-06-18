package com.example.InsurancePremiumCalculator.controller;

import com.example.InsurancePremiumCalculator.domain.Policy;
import com.example.InsurancePremiumCalculator.service.PolicyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class InsuranceController {

    private final PolicyServiceImpl policyService;

    @Autowired
    public InsuranceController(PolicyServiceImpl policyService) {
        this.policyService = policyService;
    }

    @GetMapping(value = "/calculatePremium", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getPolicy(Policy policy) {
        policyService.calculatePremium(policy)
    }


}
