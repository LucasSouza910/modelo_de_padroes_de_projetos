package factories;

import button.Button; // Importa a classe "Button" do pacote "button"
import button.MacOSButton;// Importa a classe "MacOSButton" do pacote "button"
import checkbox.Checkbox;// Importa a classe "Checkbox" do pacote "checkbox"
import checkbox.MacOSCheckbox;// Importa a classe "MacOSCheckbox" do pacote "checkbox"

public class MacOSFactory implements GUIFactory{// Classe "MacOSFactory" implementa a interface "GUIFactory"

	@Override
	public Button createButton() {// Indica que a classe "MacOSFactory" implementa o método "createButton" definido na interface "GUIFactory" e retorna um objeto do tipo "Button"
		return new MacOSButton(); // Cria e retorna um novo objeto do tipo "MacOSButton"
	}
	
	@Override
	public Checkbox createCheckbox() { // Indica que a classe "MacOSFactory" implementa o método "createCheckbox" definido na interface "GUIFactory" e retorna um objeto do tipo "Checkbox"
		return new MacOSCheckbox(); // Cria e retorna um novo objeto do tipo "MacOSCheckbox"
	}
}
