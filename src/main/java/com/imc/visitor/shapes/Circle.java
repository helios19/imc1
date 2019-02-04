package com.imc.visitor.shapes;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.apache.commons.lang3.Validate;

/**
 * Circle shape class.
 */
@Builder
@ToString
@EqualsAndHashCode
@Getter
public class Circle implements Shape {

    private double radius;

    @Override
    public <T> T accept(ShapeVisitor<T> visitor) {
        return visitor.visit(this);
    }

    /**
     * Custom implementation of Lombok Circle Builder class covering the fields validation check.
     */
    public static class CircleBuilder {
        private double radius;

        /**
         * Builder method assigning value to "radius" variable.
         *
         * @param value Radius value
         * @return Circle builder instance
         */
        public CircleBuilder radius(double value) {
            Validate.isTrue(value >= 0, "Circle radius must be a positive value");
            this.radius = value;
            return this;
        }

    }

}
