import GLOOP.*;

public class Main
{
    GLKamera cam;
    GLLicht light;
    GLTastatur keyboard;
    
    public Main()
    {
        // Innitializing of the Objects
        cam = new GLSchwenkkamera();
        keyboard = new GLTastatur();
        light = new GLLicht();
        
    }
}
