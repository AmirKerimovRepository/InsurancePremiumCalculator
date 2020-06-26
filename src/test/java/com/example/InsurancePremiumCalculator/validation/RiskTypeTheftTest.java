package com.example.InsurancePremiumCalculator.validation;

import com.example.InsurancePremiumCalculator.exception.IncorrectlyEnteredDataException;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RiskTypeTheftTest {

    private final double delta = 0.1;

    //set_coefficient need to be 0.05 , actual = 10 * 0.05 = 0.5
    @Test
    public void shouldCalculatePremiumTheftWithDefaultValue() {
        RiskTypeTheft riskTypeTheft = new RiskTypeTheft(BigDecimal.valueOf(10));
        double actual = riskTypeTheft.apply().doubleValue();
        assertEquals(0.5, actual, delta);
    }

    //set_coefficient need to be 0.11 , actual = 20 * 0.11 = 2.2
    @Test
    public void shouldCalculatePremiumFireWithBiggerValue() {
        RiskTypeTheft riskTypeTheft = new RiskTypeTheft(BigDecimal.valueOf(20));
        double actual = riskTypeTheft.apply().doubleValue();
        assertEquals(2.2, actual, delta);
    }

    @Test
    public void negativeValueShouldThrowException() {
        Throwable exception = assertThrows(IncorrectlyEnteredDataException.class, () -> {
            RiskTypeTheft riskTypeTheft = new RiskTypeTheft(BigDecimal.valueOf(-10));
            riskTypeTheft.apply();
        });
        assertEquals("Value cannot be negative!", exception.getMessage());

    }

}
