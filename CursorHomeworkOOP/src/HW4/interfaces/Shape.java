package HW4.interfaces;


import HW4.Vertex.Vertex;

public abstract class Shape {
    private Vertex vertexA;

    public Shape(Vertex vertexA) {
        this.vertexA = vertexA;
    }

    public void setVertexA(Vertex vertexA) {
        this.vertexA = vertexA;
    }

    public Vertex getVertexA() {
        return vertexA;
    }
}