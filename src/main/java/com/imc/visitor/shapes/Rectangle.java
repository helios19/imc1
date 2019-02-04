package com.imc.visitor.shapes;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.apache.commons.lang3.Validate;

/**
 * Rectangle shape class.
 */
@Builder
@ToString
@EqualsAndHashCode
@Getter
public final class Rectangle implements Shape {

    private double breadth;
    private double height;

    @Override
    public <T> T accept(ShapeVisitor<T> visitor) {
        return visitor.visit(this);
    }


    /**
     * Custom implementation of Lombok Rectangle Builder class covering the fields validation check.
     */
    public static class RectangleBuilder {

        private double breadth;
        private double height;

        /**
         * Breadth builder method.
         *
         * @param value Breadth value
         * @return Rectangle builder instance
         */
        public RectangleBuilder breadth(double value) {
            Validate.isTrue(value >= 0, "Rectangle breadth must be a positive value");
            this.breadth = value;
            return this;
        }

        /**
         * Height builder method.
         *
         * @param value Height value
         * @return Rectangle builder instance
         */
        public RectangleBuilder height(double value) {
            Validate.isTrue(value >= 0, "Rectangle height must be a positive value");
            this.height = value;
            return this;
        }

    }

}
