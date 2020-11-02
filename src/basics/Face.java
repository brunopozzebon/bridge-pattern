package basics;

public class Face {
    private Vertex[] vertices;

    public Face(Vertex[] vertices) {
        this.vertices = vertices;
    }

    public Vertex[] getVertices() {
        return vertices;
    }
}
