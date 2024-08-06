package com.factory.factory;

import com.factory.buttons.Button;
import com.factory.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
