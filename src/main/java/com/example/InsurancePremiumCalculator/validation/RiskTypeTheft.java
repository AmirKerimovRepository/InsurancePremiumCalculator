package com.example.InsurancePremiumCalculator.validation;

import java.math.BigDecimal;

public class RiskTypeTheft implements RiskType {

    private Long id;
    private double coefficientTheft;
    private InsuranceRiskType insuranceRiskType;
    private String riskName;

    public RiskTypeTheft(Long id, InsuranceRiskType insuranceRiskType, String riskName) {
        this.id = id;
        this.insuranceRiskType = insuranceRiskType;
        this.riskName = riskName;
    }

    @Override
    public BigDecimal apply(BigDecimal value) {

        if (value.signum() >= 15) {
            setCoefficientTheft(0.05);
        } else {
            setCoefficientTheft(0.11);
        }
        return value.add(BigDecimal.valueOf(getCoefficientTheft()));
    }


    public InsuranceRiskType getInsuranceRiskType() {
        return insuranceRiskType;
    }

    public void setInsuranceRiskType(InsuranceRiskType insuranceRiskType) {
        this.insuranceRiskType = insuranceRiskType;
    }

    public double getCoefficientTheft() {
        return coefficientTheft;
    }

    public void setCoefficientTheft(double coefficientTheft) {
        this.coefficientTheft = coefficientTheft;
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
