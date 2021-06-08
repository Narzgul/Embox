import GLOOP.*;

public interface Util {
    static void createObject(GLObjekt object) {
        object.setzeSelbstleuchten(255, 255, 255);
        Main.objectList.add(object);
    }
}