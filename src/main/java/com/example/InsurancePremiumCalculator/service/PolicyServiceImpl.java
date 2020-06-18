package com.example.InsurancePremiumCalculator.service;

import com.example.InsurancePremiumCalculator.domain.InsuredObject;
import com.example.InsurancePremiumCalculator.domain.Policy;
import com.example.InsurancePremiumCalculator.domain.SubInsuredObject;
import com.example.InsurancePremiumCalculator.validation.PolicyRisk;
import com.example.InsurancePremiumCalculator.validation.RiskExecutor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PolicyServiceImpl  implements PolicyService {


    @Override
    public double calculatePremium(Policy policy) {
        Map<InsuredObject, List<SubInsuredObject>> riskContainer = new HashMap<>();
        RiskExecutor executor = new RiskExecutor();
        executor.execute((List<PolicyRisk>) riskContainer, policy);
        riskContainer.clear();
        return 0;
    }

}
