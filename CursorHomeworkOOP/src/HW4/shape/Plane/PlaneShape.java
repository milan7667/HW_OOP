package HW4.shape.Plane;

import HW4.Vertex.Vertex2D;
import HW4.interfaces.AreaMeasurable;
import HW4.interfaces.PerimeterMeasurable;
import HW4.interfaces.Shape;


public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    public PlaneShape(Vertex2D vertexA) {
        super(vertexA);
    }
}



