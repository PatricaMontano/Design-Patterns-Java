package factory;

import buttons.Button;
import buttons.WindowsButton;

/**
 *
 * @author joha
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
