package com.example.InsurancePremiumCalculator.service;

import com.example.InsurancePremiumCalculator.domain.InsuredObject;
import com.example.InsurancePremiumCalculator.domain.Policy;
import com.example.InsurancePremiumCalculator.domain.PolicyStatus;
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

                riskContainer.put(policy.getInsuredObject(),)

                executor.execute(тип риска или его id, BigDecimal.valueOf(subInsuredObjects.getSumInsured()));
            }
        }
        policy.setPolicyStatus(PolicyStatus.REGISTERED);
        riskContainer.clear();
        return 0;
    }

    /*беру  Policy ( страховку)
    Достаю из него List<InsuredObject> // - ( e.g Дом)
    бегу по листу Object-ов
    достаю из каждого List<SubObject> ( e.g Tv, сумма риска : 1000, тип риска : Fire)
    бегу по нему
    вызываю метод execute -  (который вызовет метод apply который собственно сделает расчеты)
    складываю в аккумулятор какой-то
    возвращаю результат */

}
