package HW4.shape.Space;

import HW4.Vertex.Vertex3D;
import HW4.interfaces.AreaMeasurable;
import HW4.interfaces.Shape;
import HW4.interfaces.VolumeMeasurable;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    public SpaceShape(Vertex3D vertexA) {
        super(vertexA);

    }
}