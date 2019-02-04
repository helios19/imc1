package com.imc.visitor.shapes;

/**
 * Shape interface defining {@link #accept(ShapeVisitor)} method accepting {@link ShapeVisitor} instance.
 *
 * @See ShapeVisitor
 */
public interface Shape {
    <T> T accept(ShapeVisitor<T> visitor);
}
