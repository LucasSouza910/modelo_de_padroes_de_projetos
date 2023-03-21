package factories;

import button.Button; // Importa a classe "Button" do pacote "button"
import checkbox.Checkbox; // Importa a classe "Checkbox" do pacote "checkbox"

public interface GUIFactory { // Declara a interface pública "GUIFactory"

	Button createButton(); // Define um método abstrato chamado "createButton" que deve retornar uma instância da interface "Button"
	Checkbox createCheckbox(); // Define um método abstrato chamado "createCheckbox" que deve retornar uma instância da interface "Checkbox"

}
