package saveMethods;

import basics.Face;
import basics.Vertex;

public class SaveStlModel implements SaveApi {

    @Override
    public void save(Face[] faces) {
        /*
            I just write on console instead of save in a real file,
            the purpose here, is just understanding the pattern, not I/O operation
         */
        System.out.println("\n-- Saving STL -- \n");
        for (Face point: faces){
            System.out.println("facet normal 0 0 0");
            System.out.println("\touter loop");
            for (Vertex vertex : point.getVertices()){
                System.out.println("vertex  "+vertex.getX()+" "+vertex.getY()+" "+vertex.getZ());
            }
            System.out.println("\tendloop");
            System.out.println("endfacet");
        }
    }
}
