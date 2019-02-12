package com.imc.visitor.area;

import com.imc.visitor.shapes.Circle;
import com.imc.visitor.shapes.Rectangle;
import com.imc.visitor.shapes.ShapeVisitor;
import com.imc.visitor.shapes.Triangle;
import org.apache.commons.lang3.Validate;

import java.math.BigDecimal;

/**
 * Visitor class declaring methods to calculate the area of each {@link com.imc.visitor.shapes.Shape}
 * implementation classes (e.g {@link Circle}, {@link Triangle}, {@link Rectangle}).
 */
public class AreaVisitor implements ShapeVisitor<BigDecimal> {

    /**
     * Calculates the area of a given circle.
     *
     * @param circle Circle instance
     * @return area = PI r^2
     */
    @Override
    public BigDecimal visit(Circle circle) {

        Validate.isTrue(circle != null, "Circle instance must not be null");
        Validate.isTrue(circle.getRadius() != null, "Circle radius must be a positive value");

        return BigDecimal.valueOf(Math.PI)
                .multiply(circle.getRadius().pow(2));
    }

    /**
     * Calculates the area of a given triangle.
     *
     * @param triangle Triangle instance
     * @return area = 1/2 x b x h
     */
    @Override
    public BigDecimal visit(Triangle triangle) {

        Validate.isTrue(triangle != null, "Triangle instance must not be null");
        Validate.isTrue(triangle.getBase() != null, "Triangle base must be a positive value");
        Validate.isTrue(triangle.getHeight() != null, "Triangle height must be a positive value");

        return triangle.getBase()
                .multiply(triangle.getHeight())
                .divide(BigDecimal.valueOf(2));
    }

    /**
     * Calculates the area of a given rectangle.
     *
     * @param rectangle Rectangle instance
     * @return area = h x w
     */
    @Override
    public BigDecimal visit(Rectangle rectangle) {

        Validate.isTrue(rectangle != null, "Triangle instance must not be null");
        Validate.isTrue(rectangle.getHeight() != null, "Rectangle height must be a positive value");
        Validate.isTrue(rectangle.getBreadth() != null, "Rectangle breadth must be a positive value");

        return rectangle.getHeight()
                .multiply(rectangle.getBreadth());
    }
}
