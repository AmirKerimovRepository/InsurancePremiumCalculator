package com.example.InsurancePremiumCalculator.validation;

import com.example.InsurancePremiumCalculator.domain.Policy;

import java.math.BigDecimal;

public interface PolicyRisk {

    BigDecimal apply(Policy policy);

}
