package factories;

import button.Button; // Importa a classe "Button" do pacote "button"
import checkbox.Checkbox; // Importa a classe "Checkbox" do pacote "checkbox"

public interface GUIFactory { // Declara a interface p�blica "GUIFactory"

	Button createButton(); // Define um m�todo abstrato chamado "createButton" que deve retornar uma inst�ncia da interface "Button"
	Checkbox createCheckbox(); // Define um m�todo abstrato chamado "createCheckbox" que deve retornar uma inst�ncia da interface "Checkbox"

}
