package shapes;

import basics.Face;
import basics.Vertex;

public class Cube extends Model{
    private float base;
    private float height;

    public Cube(float base, float height){
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

        Vertex topVertexA = new Vertex(-base/2, 0, -base/2);
        Vertex topVertexB = new Vertex(-base/2, 0, base/2);
        Vertex topVertexC = new Vertex(base/2, 0, -base/2);
        Vertex topVertexD = new Vertex(base/2, 0, base/2);

        Face faceSideA = new Face(new Vertex[]{baseVertexA, baseVertexB, topVertexA, topVertexB});
        Face faceSideB = new Face(new Vertex[]{baseVertexB, baseVertexC, topVertexB, topVertexC});
        Face faceSideC = new Face(new Vertex[]{baseVertexC, baseVertexD, topVertexC, topVertexD});
        Face faceSideD = new Face(new Vertex[]{baseVertexD, baseVertexA, topVertexD, topVertexA});

        Face faceBottom = new Face(new Vertex[]{baseVertexA, baseVertexB, baseVertexC, baseVertexD});
        Face faceTop = new Face(new Vertex[]{topVertexA, topVertexB, topVertexC, topVertexD});

        return new Face[]{faceSideA,faceSideB, faceSideC, faceSideD, faceBottom, faceTop};
    }
}
