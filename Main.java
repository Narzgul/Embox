import GLOOP.*;

public class Main {
    GLKamera cam;
    GLLicht light;
    GLTastatur keyboard;

    public Main() {
        // Initializing of the Objects
        cam = new GLEntwicklerkamera(500, 500);
        keyboard = new GLTastatur();
        light = new GLLicht();

        while(true) {
            if(keyboard.istGedrueckt()) {
                char input = keyboard.gibZeichen();
                switch(input) {
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
