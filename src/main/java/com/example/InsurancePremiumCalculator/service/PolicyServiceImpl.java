package com.example.InsurancePremiumCalculator.service;

import com.example.InsurancePremiumCalculator.domain.Policy;
import com.example.InsurancePremiumCalculator.validation.PolicyRisk;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PolicyServiceImpl  implements PolicyService {

    @Override
    public double calculatePremium(Policy policy) {
        List<PolicyRisk> riskContainer = new ArrayList<>();
        riskContainer.add(policy. тип нашего риска который мы получили из контроллера);

        riskContainer.clear(); // после очистит наш лист
        return 0;

    }

}
