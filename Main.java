import GLOOP.*;

public class Main
{
    GLKamera cam;
    GLLicht light;
    GLTastatur keyboard;

    public static GLQuader createCuboid(double posX, double posY, double posZ, double length, double height, double width) {
        GLQuader cuboid = new GLQuader(posX, posY, posZ, length, height, width);
        cuboid.setzeSelbstleuchten(255, 255, 255);
        return cuboid;
    }

    public static GLKugel createSphere(double posX, double posY, double posZ, double radius) {
        GLKugel sphere = new GLKugel(posX, posY, posZ, radius);
        sphere.setzeSelbstleuchten(255, 255, 255);
        return sphere;
    }

    public Main() {
        // Initializing of the Objects
        cam = new GLEntwicklerkamera(500, 500);
        keyboard = new GLTastatur();
        light = new GLLicht();

        while(true) {
            if(keyboard.istGedrueckt()) {
                char input = keyboard.gibZeichen();
                switch(input) {
                    case 'c':
                        createCuboid(0, 0, 0, 10, 10, 10);
                        break;
                    case 'k':
                        createSphere(0, 0, 0, 15);
                        break;
                    case 'o':
                        new CreateMenu();
                        break;
                    case 'q':
                        return;
                }
            }
        }
    }
}
