package com.imc.visitor.area;

import com.imc.visitor.shapes.Circle;
import com.imc.visitor.shapes.Rectangle;
import com.imc.visitor.shapes.ShapeVisitor;
import com.imc.visitor.shapes.Triangle;

import java.math.BigDecimal;

/**
 * Visitor class declaring methods to calculate the area of each {@link com.imc.visitor.shapes.Shape}
 * implementation classes (e.g {@link Circle}, {@link Triangle}, {@link Rectangle}).
 */
public class AreaVisitor implements ShapeVisitor<Double> {

    /**
     * Calculates the area of a given circle.
     *
     * @param circle Circle instance
     * @return area = PI r^2
     */
    @Override
    public Double visit(Circle circle) {

        return BigDecimal.valueOf(Math.PI)
                .multiply(BigDecimal.valueOf(circle.getRadius()).pow(2))
                .doubleValue();
    }

    /**
     * Calculates the area of a given triangle.
     *
     * @param triangle Triangle instance
     * @return area = 1/2 x b x h
     */
    @Override
    public Double visit(Triangle triangle) {
        return BigDecimal.valueOf(triangle.getBase())
                .multiply(BigDecimal.valueOf(triangle.getHeight()))
                .divide(BigDecimal.valueOf(2))
                .doubleValue();
    }

    /**
     * Calculates the area of a given rectangle.
     *
     * @param rectangle Rectangle instance
     * @return area = h x w
     */
    @Override
    public Double visit(Rectangle rectangle) {
        return BigDecimal.valueOf(rectangle.getHeight())
                .multiply(BigDecimal.valueOf(rectangle.getBreadth()))
                .doubleValue();
    }
}
