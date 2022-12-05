package app;

import buttons.Button;
import checkboxes.Checkbox;
import factories.GUIFactory;

/**
 *
 * @author joha
 */
public class Aplication {
    private Button button;
    private Checkbox checkbox;
    
    public Aplication(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
    
    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
