package com.example.InsurancePremiumCalculator.domain;

import com.example.InsurancePremiumCalculator.validation.InsuranceRiskType;

import java.math.BigDecimal;
import java.util.Objects;

public class SubInsuredObject {

    private String appliance;
    private BigDecimal sumInsured;
    private InsuranceRiskType insuranceRiskType;

    public SubInsuredObject(String appliance, BigDecimal sumInsured, InsuranceRiskType insuranceRiskType) {
        this.appliance = appliance;
        this.sumInsured = sumInsured;
        this.insuranceRiskType = insuranceRiskType;
    }

    public SubInsuredObject() {
    }


    public BigDecimal getSumInsured() {
        return sumInsured;
    }

    public void setSumInsured(BigDecimal sumInsured) {
        this.sumInsured = sumInsured;
    }

    public InsuranceRiskType getInsuranceRiskType() {
        return insuranceRiskType;
    }

    public void setInsuranceRiskType(InsuranceRiskType insuranceRiskType) {
        this.insuranceRiskType = insuranceRiskType;
    }

    public String getTV() {
        return appliance;
    }

    public void setTV(String TV) {
        this.appliance = TV;
    }


    @Override
    public String toString() {
        return "SubInsuredObject{" +
                "TV='" + appliance + '\'' +
                ", sumInsured=" + sumInsured +
                ", insuranceRiskType=" + insuranceRiskType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubInsuredObject that = (SubInsuredObject) o;
        return Objects.equals(appliance, that.appliance) &&
                Objects.equals(sumInsured, that.sumInsured) &&
                insuranceRiskType == that.insuranceRiskType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(appliance, sumInsured, insuranceRiskType);
    }

}
