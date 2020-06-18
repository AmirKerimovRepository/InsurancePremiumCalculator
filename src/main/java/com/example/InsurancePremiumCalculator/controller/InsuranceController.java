package com.example.InsurancePremiumCalculator.controller;

import com.example.InsurancePremiumCalculator.validation.InsuranceRiskType;
import com.example.InsurancePremiumCalculator.service.PolicyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class InsuranceController {

    private final PolicyServiceImpl policyService;

    @Autowired
    public InsuranceController(PolicyServiceImpl policyService) {
        this.policyService = policyService;
    }

    @GetMapping
    public String getPolicy(Model model) {
        Map <Long, InsuranceRiskType>
        policyService.calculatePremium()
    }


}
