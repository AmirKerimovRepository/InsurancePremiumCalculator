package com.example.InsurancePremiumCalculator.validation;

import com.example.InsurancePremiumCalculator.exception.IncorrectlyEnteredDataException;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RiskTypeTheftTest {

    //set_coefficient need to be 0.05 , actual = 10 * 0.05 = 0.5
    @Test
    public void shouldCalculatePremiumTheftWithDefaultValue() {
        RiskTypeTheft riskTypeTheft = new RiskTypeTheft(BigDecimal.valueOf(10));
        BigDecimal actual = riskTypeTheft.apply();
        assertEquals(BigDecimal.valueOf(0.5), actual);
    }
    //set_coefficient need to be 0.11 , actual = 20 * 0.11 = 2.2
    @Test
    public void shouldCalculatePremiumFireWithBiggerValue() {
        RiskTypeTheft riskTypeTheft = new RiskTypeTheft(BigDecimal.valueOf(20));
        BigDecimal actual = riskTypeTheft.apply();
        assertEquals(BigDecimal.valueOf(2.2), actual);
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
