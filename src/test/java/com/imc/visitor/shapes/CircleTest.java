package com.imc.visitor.shapes;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CircleTest {

    @Test
    public void shouldReturnACircleInstanceWhenRadiusIsValid() {
        // given
        BigDecimal radius = BigDecimal.valueOf(5);

        // when
        Circle circle = Circle.builder().radius(radius).build();

        // then
        assertNotNull(circle);
        assertTrue(circle.getRadius().intValue() == 5);

    }

    @Test
    public void shouldThrowAnExceptionWhenRadiusIsNotPositive() {
        // given
        BigDecimal radius = BigDecimal.valueOf(-5);

        // when
        Circle.CircleBuilder circleBuilder = Circle.builder();

        // then
        assertThrows(IllegalArgumentException.class, () -> circleBuilder.radius(radius),
                "Circle radius must be a positive value");

    }

}
