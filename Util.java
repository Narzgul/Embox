import GLOOP.*;

public interface Util {
    
    static GLObjekt createObject(GLObjekt object) {
        object.setzeSelbstleuchten(255, 255, 255);
        Main.objectList.add(object);
        return object;
    }
    
    static GLQuader createCuboid(double posX, double posY, double posZ, double length, double height, double width) {
        GLQuader cuboid = new GLQuader(posX, posY, posZ, length, height, width);
        cuboid.setzeSelbstleuchten(255, 255, 255);
        Main.objectList.add(cuboid);
        return cuboid;
    }

    static GLKugel createSphere(double posX, double posY, double posZ, double radius) {
        GLKugel sphere = new GLKugel(posX, posY, posZ, radius);
        sphere.setzeSelbstleuchten(255, 255, 255);
        Main.objectList.add(sphere);
        return sphere;
    }

    static GLTorus createTorus(double posX, double posY, double posZ, double radius, double thickness) {
        GLTorus torus = new GLTorus(posX, posY, posZ, radius, thickness);
        torus.setzeSelbstleuchten(255, 255, 255);
        Main.objectList.add(torus);
        return torus;
    }

    static GLZylinder createCylinder(double posX, double posY, double posZ, double radius, double height) {
        GLZylinder cylinder = new GLZylinder(posX, posY, posZ, radius, height);
        cylinder.setzeSelbstleuchten(255, 255, 255);
        Main.objectList.add(cylinder);
        return cylinder;
    }

    static GLKegelstumpf createTruncatedCone(double posX, double posY, double posZ, double radius1, double radius2, double height) {
        GLKegelstumpf truncatedCone = new GLKegelstumpf(posX, posY, posZ, radius1, radius2, height);
        truncatedCone.setzeSelbstleuchten(255, 255, 255);
        Main.objectList.add(truncatedCone);
        return truncatedCone;
    }

    static GLKegel createCone(double posX, double posY, double posZ, double radius, double height) {
        GLKegel cone = new GLKegel(posX, posY, posZ, radius, height);
        cone.setzeSelbstleuchten(255, 255, 255);
        Main.objectList.add(cone);
        return cone;
    }
}
