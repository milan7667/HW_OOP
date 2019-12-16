package hw4.shape.Space;

import hw4.Vertex.Vertex3D;
import hw4.interfaces.AreaMeasurable;
import hw4.interfaces.Shape;
import hw4.interfaces.VolumeMeasurable;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    public SpaceShape(Vertex3D vertexA) {
        super(vertexA);

    }
}