package com.imc.visitor.shapes;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.apache.commons.lang3.Validate;

/**
 * Triangle shape class.
 */
@Builder
@ToString
@EqualsAndHashCode
@Getter
public final class Triangle implements Shape {

    private double base;
    private double height;

    @Override
    public <T> T accept(ShapeVisitor<T> visitor) {
        return visitor.visit(this);
    }

    /**
     * Custom implementation of Lombok Triangle Builder class covering the fields validation check.
     */
    public static class TriangleBuilder {

        private double base;
        private double height;

        /**
         * Base builder method.
         *
         * @param value Base value
         * @return Triangle builder instance
         */
        public TriangleBuilder base(double value) {
            Validate.isTrue(value >= 0, "Triangle base must be a positive value");
            base = value;
            return this;
        }

        /**
         * Height builder method.
         *
         * @param value Height value
         * @return Triangle builder instance
         */
        public TriangleBuilder height(double value) {
            Validate.isTrue(value >= 0, "Triangle height must be a positive value");
            height = value;
            return this;
        }

    }
}
