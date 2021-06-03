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

    public Main()
    {
        // Innitializing of the Objects
        cam = new GLEntwicklerkamera();
        cam = new GLSchwenkkamera();
        keyboard = new GLTastatur();
        light = new GLLicht();

        while(true) {
            if(keyboard.wurdeGedrueckt()) {
                switch(keyboard.gibZeichen()) {
                    case 'C':
                    case 'c':
                        createQuader(0, 0, 0, 10, 10, 10);
                        break;
                }
            }
        }
    }
}
