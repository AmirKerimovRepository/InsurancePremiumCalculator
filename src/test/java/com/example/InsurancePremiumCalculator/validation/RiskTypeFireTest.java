package com.example.InsurancePremiumCalculator.validation;

import com.example.InsurancePremiumCalculator.exception.IncorrectlyEnteredDataException;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RiskTypeFireTest {

    private final double delta = 0.1;

    //set_coefficient need to be 0.014 , actual = 10 * 0.014 = 0.14
    @Test
    public void shouldCalculatePremiumFireWithDefaultValue() {
        RiskTypeFire riskTypeFire = new RiskTypeFire(BigDecimal.valueOf(10));
        double actual = riskTypeFire.apply().doubleValue();
        assertEquals(0.14, actual, delta);
    }

    //set_coefficient need to be 0.024 , actual  = 120 * 0.024 = 2.88
    @Test
    public void shouldCalculatePremiumFireWithIrregularValue() {
        RiskTypeFire riskTypeFire = new RiskTypeFire(BigDecimal.valueOf(120));
        double actual = riskTypeFire.apply().doubleValue();
        assertEquals(2.88, actual, delta);
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
