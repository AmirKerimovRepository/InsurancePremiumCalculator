package com.example.InsurancePremiumCalculator.validation;

import com.example.InsurancePremiumCalculator.exception.IncorrectlyEnteredDataException;

import java.math.BigDecimal;

public class RiskTypeTheft implements RiskType {

    private final Long ID =2L;
    private double coefficientTheft;
    private InsuranceRiskType insuranceRiskType;

    private final BigDecimal SUM_INSURED_THEFT = new BigDecimal(15);

    @Override
    public BigDecimal apply(BigDecimal value) {
        if (value.compareTo(BigDecimal.ZERO) < 0) {
            throw new IncorrectlyEnteredDataException("Value cannot be negative!");
        } else if (value.compareTo(SUM_INSURED_THEFT) >= 0) {
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

    public Long getID() {
        return ID;
    }





}
