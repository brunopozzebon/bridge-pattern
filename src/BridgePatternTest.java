import shapes.Cube;
import shapes.Model;
import shapes.Pyramid;
import saveMethods.SaveObjModel;
import saveMethods.SaveStlModel;

public class BridgePatternTest {
    public static void main(String[] args){
        System.out.println("->Cube");

        Model cube = new Cube(10.0f, 5.0f);

        cube.setApi(new SaveObjModel());
        cube.save();

        cube.setApi(new SaveStlModel());
        cube.save();

        System.out.println("\n\n->Pyramid");

        Model pyramid = new Pyramid(20.0f, 5.0f);

        pyramid.setApi(new SaveObjModel());
        pyramid.save();

        pyramid.setApi(new SaveStlModel());
        pyramid.save();
    }
}
