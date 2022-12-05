package factory;

import buttons.Button;
import buttons.HtmlButton;

/**
 *
 * @author joha
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
    
}
