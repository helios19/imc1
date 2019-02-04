package com.imc.visitor.shapes;

/**
 * Shape visitor interface declaring the supported overloaded methods per {@link Shape} instance.
 *
 * @See Circle
 * @See Triangle
 * @See Rectangle
 */
public interface ShapeVisitor<T> {

    T visit(Circle circle);

    T visit(Triangle triangle);

    T visit(Rectangle rectangle);
}
