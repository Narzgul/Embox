import GLOOP.*;

public interface Util {
    // A methode to set defaults for all objects that are created
    static void createObject(GLObjekt object) {
        object.setzeSelbstleuchten(255, 255, 255); // Make object shine
        Main.objectList.add(object); // Adds tho object to the list
    }
}