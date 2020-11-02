package saveMethods;

import basics.Face;
import basics.Vertex;

public class SaveObjModel implements SaveApi {

    @Override
    public void save(Face[] faces) {
        /*
            I just write on console instead of save in a real file,
            the purpose here, is just understanding the pattern, not I/O operation
         */

        System.out.println("\n-- Saving OBJ -- \n");

        for (Face point: faces){
            for (Vertex vertex : point.getVertices()){
                System.out.println("v "+vertex.getX()+" "+vertex.getY()+" "+vertex.getZ());
            }
            // OBJ envolves more than just save the vertex, i just simplify it where
        }
    }
}
