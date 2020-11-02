package shapes;

import basics.Face;
import basics.Vertex;

public class Pyramid extends Model{
    private float base;
    private float height;

    public Pyramid(float base, float height){
        this.base = base;
        this.height = height;

        Face[] faces = generateFaces(base, height);
        this.setFaces(faces);
    }

    private Face[] generateFaces(float base, float height) {
        Vertex baseVertexA = new Vertex(-base/2, 0, -base/2);
        Vertex baseVertexB = new Vertex(-base/2, 0, base/2);
        Vertex baseVertexC = new Vertex(base/2, 0, -base/2);
        Vertex baseVertexD = new Vertex(base/2, 0, base/2);
        Vertex topVertex = new Vertex(0, height, 0);

        Face faceA = new Face(new Vertex[]{baseVertexA, baseVertexB, baseVertexC, baseVertexD});
        Face faceB = new Face(new Vertex[]{baseVertexA, baseVertexB, topVertex});
        Face faceC = new Face(new Vertex[]{baseVertexB, baseVertexC, topVertex});
        Face faceD = new Face(new Vertex[]{baseVertexC, baseVertexD, topVertex});
        Face faceE = new Face(new Vertex[]{baseVertexD, baseVertexA, topVertex});

        return new Face[]{faceA, faceB, faceC, faceD, faceE};
    }
}
