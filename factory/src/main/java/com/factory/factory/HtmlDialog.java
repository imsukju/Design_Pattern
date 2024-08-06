package com.factory.factory;

import com.factory.buttons.Button;
import com.factory.buttons.HtmlButton;

public class HtmlDialog extends Dialog{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
        return new HtmlButton();
	}

}
