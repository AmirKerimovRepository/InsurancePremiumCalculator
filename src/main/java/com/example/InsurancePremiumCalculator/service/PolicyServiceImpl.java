package com.example.InsurancePremiumCalculator.service;

import com.example.InsurancePremiumCalculator.domain.InsuredObject;
import com.example.InsurancePremiumCalculator.domain.Policy;
import com.example.InsurancePremiumCalculator.domain.PolicyStatus;
import com.example.InsurancePremiumCalculator.domain.SubInsuredObject;
import com.example.InsurancePremiumCalculator.validation.*;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PolicyServiceImpl implements PolicyService {

    @Override
    public double calculatePremium(Policy policy) {
        Map<String, List<RiskType>> riskContainer = new HashMap<>();
        RiskExecutor executor = new RiskExecutor();
        for (InsuredObject insuredObjects : policy.getInsuredObject()) {

            for (SubInsuredObject subInsuredObjects : insuredObjects.getSubInsuredObjects()) {

                if (InsuranceRiskType.FIRE.equals(subInsuredObjects.getInsuranceRiskType())) {

                    RiskTypeFire riskTypeFire = new RiskTypeFire(subInsuredObjects.getSumInsured()); // сразу создаю с полученной суммой (В конструкторе RiskTypeFire передаю value)
                    riskContainer.put(policy.getPolicyNumber(), (List<RiskType>) riskTypeFire);

                } else if (InsuranceRiskType.THEFT.equals(subInsuredObjects.getInsuranceRiskType())) {

                    RiskTypeTheft riskTypeTheft = new RiskTypeTheft(subInsuredObjects.getSumInsured()); // сразу создаю с полученной суммой
                    riskContainer.put(policy.getPolicyNumber(), (List<RiskType>) riskTypeTheft);
                }
            }
        }
        executor.execute(riskContainer);
        policy.setPolicyStatus(PolicyStatus.REGISTERED);
        riskContainer.clear();
        return 0;
    }

}
