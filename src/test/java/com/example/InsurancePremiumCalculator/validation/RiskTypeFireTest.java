package com.example.InsurancePremiumCalculator.validation;

import com.example.InsurancePremiumCalculator.exception.IncorrectlyEnteredDataException;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RiskTypeFireTest {

    @Test
    public void shouldCalculatePremiumFire() {
        RiskTypeFire riskTypeFire = new RiskTypeFire(BigDecimal.valueOf(10));
        BigDecimal actual = riskTypeFire.apply();
        assertEquals(BigDecimal.valueOf(0.14), actual);
    }

    @Test
    public void negativeValueShouldThrowException() {
        Throwable exception = assertThrows(IncorrectlyEnteredDataException.class, () -> {
            RiskTypeFire riskTypeFire = new RiskTypeFire(BigDecimal.valueOf(-10));
            riskTypeFire.apply();
        });
        assertEquals("Value cannot be negative!", exception.getMessage());

    }

}
