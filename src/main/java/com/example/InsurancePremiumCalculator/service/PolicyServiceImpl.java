package com.example.InsurancePremiumCalculator.service;

import com.example.InsurancePremiumCalculator.domain.InsuredObject;
import com.example.InsurancePremiumCalculator.domain.Policy;
import com.example.InsurancePremiumCalculator.domain.SubInsuredObject;
import com.example.InsurancePremiumCalculator.validation.RiskExecutor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PolicyServiceImpl  implements PolicyService {


    @Override
    public double calculatePremium(Policy policy) {
        Map<InsuredObject, List<SubInsuredObject>> riskContainer = new HashMap<>();
        RiskExecutor executor = new RiskExecutor();
        for (InsuredObject insuredObjects : policy.getInsuredObject()) {

            for (SubInsuredObject subInsuredObjects : insuredObjects.getSubInsuredObjects()) {
                executor.execute(тип риска или его ID, BigDecimal.valueOf(subInsuredObjects.getSumInsured()));
            }
        }
        riskContainer.clear();
        return 0;
    }

}
