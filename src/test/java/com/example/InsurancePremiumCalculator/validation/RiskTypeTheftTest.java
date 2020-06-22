package com.example.InsurancePremiumCalculator.validation;

import com.example.InsurancePremiumCalculator.exception.IncorrectlyEnteredDataException;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RiskTypeTheftTest {

    @Test
    public void shouldCalculatePremiumFire() {
        RiskTypeTheft riskTypeTheft = new RiskTypeTheft(BigDecimal.valueOf(10));
        BigDecimal actual = riskTypeTheft.apply();
        assertEquals(BigDecimal.valueOf(0.14), actual);
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
