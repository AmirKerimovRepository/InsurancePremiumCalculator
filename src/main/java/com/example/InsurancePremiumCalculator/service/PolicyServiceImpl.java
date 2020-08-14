package com.example.InsurancePremiumCalculator.service;

import com.example.InsurancePremiumCalculator.domain.InsuredObject;
import com.example.InsurancePremiumCalculator.domain.Policy;
import com.example.InsurancePremiumCalculator.domain.SubInsuredObject;
import com.example.InsurancePremiumCalculator.validation.*;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

@Service
public class PolicyServiceImpl implements PolicyService {

    @Override
    public BigDecimal calculatePremium(Policy policy) {
        List<RiskType> riskContainer = new LinkedList<>();
        RiskExecutor executor = new RiskExecutor();
        for (InsuredObject insuredObjects : policy.getInsuredObject()) {

            for (SubInsuredObject subInsuredObjects : insuredObjects.getSubInsuredObjects()) {

                if (InsuranceRiskType.FIRE.equals(subInsuredObjects.getInsuranceRiskType())) {

                    RiskTypeFire riskTypeFire = new RiskTypeFire(subInsuredObjects.getSumInsured());
                    riskContainer.add(riskTypeFire);

                } else if (InsuranceRiskType.THEFT.equals(subInsuredObjects.getInsuranceRiskType())) {

                    RiskTypeTheft riskTypeTheft = new RiskTypeTheft(subInsuredObjects.getSumInsured());
                    riskContainer.add(riskTypeTheft);
                }
            }
        }
        BigDecimal policyTotalCost = executor.execute(riskContainer);
        return policyTotalCost;

    }

}
