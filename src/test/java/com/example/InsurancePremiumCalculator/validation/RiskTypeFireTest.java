package com.example.InsurancePremiumCalculator.validation;

import com.example.InsurancePremiumCalculator.exception.IncorrectlyEnteredDataException;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RiskTypeFireTest {

    public static final BigDecimal value = BigDecimal.valueOf(10);

    @Test
    public void shouldCalculatePremiumFire(){
        RiskTypeFire riskTypeFire = new RiskTypeFire();
        BigDecimal actual = riskTypeFire.apply(value);
        assertEquals(BigDecimal.valueOf(0.14), actual);
    }

    @Test
    public void negativeValueShouldThrowException(){
        Throwable exception = assertThrows(IncorrectlyEnteredDataException.class, () -> {
            RiskTypeFire riskTypeFire = new RiskTypeFire();
            riskTypeFire.apply(BigDecimal.valueOf(-5));
        });
        assertEquals("Value cannot be negative!", exception.getMessage());

    }

}
