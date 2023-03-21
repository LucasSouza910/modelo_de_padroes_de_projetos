package factories;

import button.Button; // Importa a classe "Button" do pacote "button"
import checkbox.Checkbox;// Importa a classe "Checkbox" do pacote "checkbox"
import button.WindowsButton; // Importa a classe "WindowsButton" do pacote "button"
import checkbox.WindowsCheckbox;// Importa a classe "WindowsCheckbox" do pacote "checkbox"

public class WindowsFactory implements GUIFactory { // Classe "WindowsFactory" implementa a interface "GUIFactory"

	@Override
	public Button createButton() {// Indica que a classe "WindowsFactory" implementa o método "createButton" definido na interface "GUIFactory" e retorna um objeto do tipo "Button"
		return new WindowsButton(); // Cria e retorna um novo objeto do tipo "WindowsButton"
	}
	
	@Override
	public Checkbox createCheckbox() { // Indica que a classe "WindowsFactory" implementa o método "createCheckbox" definido na interface "GUIFactory" e retorna um objeto do tipo "Checkbox"
		return new WindowsCheckbox(); // Cria e retorna um novo objeto do tipo "WindowsCheckbox"
	}
}
