package shapes;

import basics.Face;
import saveMethods.SaveApi;
import saveMethods.SaveObjModel;

public abstract class Model {

    private Face[] faces;
    private SaveApi saveApi;

    public Model(){
        // Set a default saveApi to avoid nullpointer exception
        this.saveApi = new SaveObjModel();
    }

    public Model(SaveApi saveApi){
        this.saveApi = saveApi;
    }

    public void save(){
        saveApi.save(faces);
    }

    public void setApi(SaveApi api){
        this.saveApi = api;
    }

    public void setFaces(Face[] faces) {
        this.faces = faces;
    }
}
