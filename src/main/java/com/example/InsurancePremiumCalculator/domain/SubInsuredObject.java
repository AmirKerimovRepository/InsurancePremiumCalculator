package com.example.InsurancePremiumCalculator.domain;

import com.example.InsurancePremiumCalculator.validation.InsuranceRiskType;

import java.math.BigDecimal;
import java.util.Objects;

public class SubInsuredObject {

    private String TV;
    private BigDecimal sumInsured;
    private InsuranceRiskType insuranceRiskType;


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
        return TV;
    }

    public void setTV(String TV) {
        this.TV = TV;
    }


    @Override
    public String toString() {
        return "SubInsuredObject{" +
                "TV='" + TV + '\'' +
                ", sumInsured=" + sumInsured +
                ", insuranceRiskType=" + insuranceRiskType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubInsuredObject that = (SubInsuredObject) o;
        return Objects.equals(TV, that.TV) &&
                Objects.equals(sumInsured, that.sumInsured) &&
                insuranceRiskType == that.insuranceRiskType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(TV, sumInsured, insuranceRiskType);
    }

}
