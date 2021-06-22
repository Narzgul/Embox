import GLOOP.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    GLKamera cam;
    GLLicht light;
    GLTastatur keyboard;
    public static List<GLObjekt> objectList = new ArrayList<>();
    public static List<String> objectname = new ArrayList<>();

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
                        new CreateMenu();
                        break;
                    case 'l':
                        new ListMenu();
                        break;
                    case 'q':
                        System.exit(0);
                }
            }
        }
    }
}
