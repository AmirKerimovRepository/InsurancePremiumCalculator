package com.example.InsurancePremiumCalculator.validation;

import com.example.InsurancePremiumCalculator.exception.IncorrectlyEnteredDataException;

import java.math.BigDecimal;

public class RiskTypeFire implements RiskType {

    private Long id;
    private double coefficientFire;
    private InsuranceRiskType insuranceRiskType;
    private String riskName;

    public RiskTypeFire(Long id, InsuranceRiskType insuranceRiskType, String riskName) {
        this.id = id;
        this.insuranceRiskType = insuranceRiskType;
        this.riskName = riskName;
    }

    @Override
    public BigDecimal apply(BigDecimal value) {
        if (value.signum() < 0) {
            throw new IncorrectlyEnteredDataException("value cannot be negative!");
        } else if (value.signum() > 15) {
            setCoefficientFire(0.024);
        } else {
            setCoefficientFire(0.014);
        }

        return value.add(BigDecimal.valueOf(getCoefficientFire()));
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
