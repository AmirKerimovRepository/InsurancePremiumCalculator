package com.example.InsurancePremiumCalculator.validation;

import com.example.InsurancePremiumCalculator.domain.Policy;

import java.math.BigDecimal;

public class Fire implements PolicyRisk {

    private Long id;
    private double coefficientFire;
    private InsuranceRiskType insuranceRiskType;
    private String riskName;

    public Fire(Long id, InsuranceRiskType insuranceRiskType, String riskName) {
        this.id = id;
        this.insuranceRiskType = insuranceRiskType;
        this.riskName = riskName;
    }

    @Override
    public BigDecimal apply(Policy policy) {

        if (policy.getSumInsuredFire() > 100) {
            setCoefficientFire(0.024);
        } else {
            setCoefficientFire(0.014);
        }
        double firePremiumSum = policy.getSumInsuredFire() + getCoefficientFire();

        return policy. // что то должен вернуть ;
    }

    public InsuranceRiskType getInsuranceRiskType() {
        return insuranceRiskType;
    }

    public void setInsuranceRiskType(InsuranceRiskType insuranceRiskType) {
        this.insuranceRiskType = insuranceRiskType;
    }


    public double getCoefficientFire() {
        return coefficientFire;
    }

    public void setCoefficientFire(double coefficientFire) {
        this.coefficientFire = coefficientFire;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRiskName() {
        return riskName;
    }

    public void setRiskName(String riskName) {
        this.riskName = riskName;
    }
}
