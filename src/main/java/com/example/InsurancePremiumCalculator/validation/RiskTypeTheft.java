package com.example.InsurancePremiumCalculator.validation;

import com.example.InsurancePremiumCalculator.exception.IncorrectlyEnteredDataException;

import java.math.BigDecimal;

public class RiskTypeTheft implements RiskType {

    private final Long ID = 2L;
    private double coefficientTheft;
    private InsuranceRiskType insuranceRiskType;
    private BigDecimal value;

    private final BigDecimal PREMIUM_DEFAULT_VALUE = new BigDecimal(15);

    // через конструктор приходит value (значение)
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
            setCoefficientTheft(0.05);
        } else {
            setCoefficientTheft(0.11);
        }
        return value.multiply(BigDecimal.valueOf(getCoefficientTheft()));
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

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }


}
