package com.example.InsurancePremiumCalculator.domain;

import com.example.InsurancePremiumCalculator.validation.InsuranceRiskType;

public class SubInsuredObject {

    private String TV;
    private double sumInsured;
    private InsuranceRiskType insuranceRiskType;

    public double getSumInsured() {
        return sumInsured;
    }

    public void setSumInsured(double sumInsured) {
        this.sumInsured = sumInsured;
    }

    public InsuranceRiskType getInsuranceRiskEnum() {
        return insuranceRiskType;
    }

    public void setInsuranceRiskEnum(InsuranceRiskType insuranceRiskType) {
        this.insuranceRiskType = insuranceRiskType;
    }

    public String getTV() {
        return TV;
    }

    public void setTV(String TV) {
        this.TV = TV;
    }



}
