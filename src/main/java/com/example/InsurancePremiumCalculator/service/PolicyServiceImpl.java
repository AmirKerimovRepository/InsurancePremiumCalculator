package com.example.InsurancePremiumCalculator.service;

import com.example.InsurancePremiumCalculator.domain.InsuredObject;
import com.example.InsurancePremiumCalculator.domain.Policy;
import com.example.InsurancePremiumCalculator.domain.SubInsuredObject;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PolicyServiceImpl  implements PolicyService {

    @Override
    public double calculatePremium(Policy policy) {
        //Красиво разложить полюс
        Map<InsuredObject, List<SubInsuredObject>> riskContainer = new HashMap<>();

        riskContainer.clear(); // после очистит наш лист
        return 0;

    }

}
