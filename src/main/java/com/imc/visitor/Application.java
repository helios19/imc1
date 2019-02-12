package com.imc.visitor;

import com.google.common.collect.ImmutableSet;
import com.imc.visitor.area.AreaVisitor;
import com.imc.visitor.shapes.Circle;
import com.imc.visitor.shapes.Rectangle;
import com.imc.visitor.shapes.Shape;
import com.imc.visitor.shapes.Triangle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;


/**
 * Application class creating random shapes and calculating their areas.
 */
public class Application {
    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    /**
     * Main method.
     *
     * @param args Input arguments
     */
    public static void main(String[] args) {
        ImmutableSet<Shape> shapes =
                ImmutableSet.of(
                        Triangle.builder().base(BigDecimal.valueOf(5)).height(BigDecimal.valueOf(6)).build(),
                        Triangle.builder().base(BigDecimal.valueOf(7)).height(BigDecimal.valueOf(8)).build(),
                        Rectangle.builder().breadth(BigDecimal.valueOf(9)).height(BigDecimal.valueOf(10)).build(),
                        Rectangle.builder().breadth(BigDecimal.valueOf(11)).height(BigDecimal.valueOf(12)).build(),
                        Circle.builder().radius(BigDecimal.valueOf(20)).build(),
                        Circle.builder().radius(BigDecimal.valueOf(30)).build()
                );

        displayAreas(shapes);
    }

    private static void displayAreas(ImmutableSet<Shape> shapes) {
        shapes.stream()
                .forEach(
                        (Shape shape) -> LOG.info(String.format("Area of %s: %s", shape, area(shape))));
    }

    private static BigDecimal area(Shape shape) {
        return shape.accept(new AreaVisitor());
    }

}
