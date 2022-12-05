package factories;

import buttons.Button;
import checkboxes.Checkbox;

/**
 *
 * @author joha
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
