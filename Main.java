import GLOOP.*;

public class Main
{
    GLKamera cam;
    GLLicht light;
    GLTastatur keyboard;

    public static GLQuader createQuader(double posX, double posY, double posZ, double lenght, double height, double width) {
        GLQuader quader = new GLQuader(posX, posY, posZ, lenght, height, width);
        quader.setzeSelbstleuchten(255, 255, 255);
        return quader;
    }

    public static GLKugel createKugel(double posX, double posY, double posZ, double radius) {
        GLKugel kugel = new GLKugel(posX, posY, posZ, radius);
        kugel.setzeSelbstleuchten(255, 255, 255);
        return kugel;
    }

    public Main() {
        // Innitializing of the Objects
        cam = new GLEntwicklerkamera(500, 500);
        keyboard = new GLTastatur();
        light = new GLLicht();

        // The main loop
        while(true) {
            if(keyboard.istGedrueckt()) {
                char input = keyboard.gibZeichen();
                switch(input) {
                    case 'c':
                        createQuader(0, 0, 0, 10, 10, 10);
                        break;
                    case 'k':
                        createKugel(0, 0, 0, 15);
                        break;
                }
            }
        }
    }
}
