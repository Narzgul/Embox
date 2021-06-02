import GLOOP.*;

public class Main
{
    GLKamera cam;
    GLLicht light;
    GLTastatur keyboard;
    
    public Main()
    {
        // Innitializing the Objects
        cam = new GLSchwenkkamera();
        keyboard = new GLTastatur();
        light = new GLLicht();
        
    }
}
