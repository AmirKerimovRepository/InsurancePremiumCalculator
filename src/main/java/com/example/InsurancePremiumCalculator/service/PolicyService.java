package com.example.InsurancePremiumCalculator.service;

import com.example.InsurancePremiumCalculator.domain.Policy;

public interface PolicyService {

     double calculatePremium(Policy policy);
}
