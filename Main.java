import GLOOP.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    GLKamera cam;
    GLTastatur keyboard;
    public static List<GLObjekt> objectList = new ArrayList<>();
    public static List<String> objectName = new ArrayList<>();

    public Main() {
        // Initializing of the Objects
        cam = new GLEntwicklerkamera(500, 500);
        keyboard = new GLTastatur();

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
                        System.exit(0); // Quits
                }
            }
        }
    }
}
