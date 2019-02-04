package com.imc.visitor;

import com.google.common.collect.ImmutableSet;
import com.imc.visitor.area.AreaVisitor;
import com.imc.visitor.shapes.Circle;
import com.imc.visitor.shapes.Rectangle;
import com.imc.visitor.shapes.Shape;
import com.imc.visitor.shapes.Triangle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


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
                        Triangle.builder().base(5).height(6).build(),
                        Triangle.builder().base(7).height(8).build(),
                        Rectangle.builder().breadth(9).height(10).build(),
                        Rectangle.builder().breadth(11).height(12).build(),
                        Circle.builder().radius(20).build(),
                        Circle.builder().radius(30).build()
                );

        displayAreas(shapes);
    }

    private static void displayAreas(ImmutableSet<Shape> shapes) {
        for (Shape shape : shapes) {
            LOG.info(String.format("Area of %s: %s", shape, area(shape)));
        }
    }

    private static double area(Shape shape) {
        return shape.accept(new AreaVisitor());
    }

}
