package com.example.InsurancePremiumCalculator.validation;

import com.example.InsurancePremiumCalculator.exception.IncorrectlyEnteredDataException;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RiskTypeFireTest {

    //set_coefficient need to be 0.014 , actual = 10 * 0.014 = 0.14
    @Test
    public void shouldCalculatePremiumFireWithDefaultValue() {
        RiskTypeFire riskTypeFire = new RiskTypeFire(BigDecimal.valueOf(10));
        BigDecimal actual = riskTypeFire.apply();
        assertEquals(BigDecimal.valueOf(0.14), actual);
    }
    //set_coefficient need to be 0.024 , actual  = 120 * 0.024 = 2.88
    @Test
    public void shouldCalculatePremiumFireWithBiggerValue() {
        RiskTypeFire riskTypeFire = new RiskTypeFire(BigDecimal.valueOf(120));
        BigDecimal actual = riskTypeFire.apply();
        assertEquals(BigDecimal.valueOf(2.88), actual);
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
