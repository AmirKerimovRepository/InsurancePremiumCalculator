package com.example.InsurancePremiumCalculator.service;

import com.example.InsurancePremiumCalculator.domain.Policy;

import java.math.BigDecimal;

public interface PolicyService {

     BigDecimal calculatePremium(Policy policy);
}
