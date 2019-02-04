package com.imc.visitor.area

import com.imc.visitor.shapes.Circle
import com.imc.visitor.shapes.Rectangle
import com.imc.visitor.shapes.Triangle
import spock.lang.Specification
import spock.lang.Unroll

class AreaVisitorTest extends Specification {

    def areaVisitor = new AreaVisitor()

    def static circle = new Circle(5)
    def static rectangle = new Rectangle(8, 9)
    def static triangle = new Triangle(6, 7)

    @Unroll
    def "should calculate area of shapes"() {

        given:

        when: "invoking area visitor given a shape"
        def areaCalculated = areaVisitor.visit(shape)

        then:
        area == areaCalculated

        where:
        shape     | area
        circle    | 78.53981633974483
        rectangle | 72.0
        triangle  | 21.0

    }

}




