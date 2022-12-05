
import app.Aplication;
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

/**
 *
 * @author joha
 */
public class Demo {
    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Aplication configureApplication() {
        Aplication app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Aplication(factory);
        return app;
    }
    
    public static void main(String[] args) {
        Aplication app = configureApplication();
        app.paint();
    }
}
