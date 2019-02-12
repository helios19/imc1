package com.imc.visitor.shapes;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.apache.commons.lang3.Validate;

import java.math.BigDecimal;

/**
 * Triangle shape class.
 */
@Builder
@ToString
@EqualsAndHashCode
@Getter
public final class Triangle implements Shape {

    private BigDecimal base;
    private BigDecimal height;

    @Override
    public <T> T accept(ShapeVisitor<T> visitor) {
        return visitor.visit(this);
    }

    /**
     * Custom implementation of Lombok Triangle Builder class covering the fields validation check.
     */
    public static class TriangleBuilder {

        private BigDecimal base;
        private BigDecimal height;

        /**
         * Base builder method.
         *
         * @param value Base value
         * @return Triangle builder instance
         */
        public TriangleBuilder base(BigDecimal value) {
            Validate.isTrue(value != null && value.doubleValue() >= 0, "Triangle base must be a positive value");
            base = value;
            return this;
        }

        /**
         * Height builder method.
         *
         * @param value Height value
         * @return Triangle builder instance
         */
        public TriangleBuilder height(BigDecimal value) {
            Validate.isTrue(value != null && value.doubleValue() >= 0, "Triangle height must be a positive value");
            height = value;
            return this;
        }

    }
}
