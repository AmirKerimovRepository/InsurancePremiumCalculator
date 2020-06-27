package com.example.InsurancePremiumCalculator.validation;

import com.example.InsurancePremiumCalculator.exception.IncorrectlyEnteredDataException;

import java.math.BigDecimal;

public class RiskTypeTheft implements RiskType {

    private final Long ID = 2L;
    private BigDecimal coefficientTheft;
    private InsuranceRiskType insuranceRiskType;
    private BigDecimal value;

    private final BigDecimal PREMIUM_DEFAULT_VALUE = new BigDecimal(15);


    public RiskTypeTheft(BigDecimal value) {
        this.value = value;
    }

    public RiskTypeTheft() {
    }

    @Override
    public BigDecimal apply() {
        if (value.compareTo(BigDecimal.ZERO) < 0) {
            throw new IncorrectlyEnteredDataException("Value cannot be negative!");
        } else if (value.compareTo(PREMIUM_DEFAULT_VALUE) >= 0) {
            setCoefficientTheft(BigDecimal.valueOf(0.11));
        } else if (value.compareTo(PREMIUM_DEFAULT_VALUE) < 0) {
            setCoefficientTheft(BigDecimal.valueOf(0.05));
        }
        return value.multiply(getCoefficientTheft());
    }

    public InsuranceRiskType getInsuranceRiskType() {
        return insuranceRiskType;
    }

    public void setInsuranceRiskType(InsuranceRiskType insuranceRiskType) {
        this.insuranceRiskType = insuranceRiskType;
    }


    public Long getID() {
        return ID;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getCoefficientTheft() {
        return coefficientTheft;
    }

    public void setCoefficientTheft(BigDecimal coefficientTheft) {
        this.coefficientTheft = coefficientTheft;
    }


}
