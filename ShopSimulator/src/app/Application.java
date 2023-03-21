package app;

import button.Button; // Importação da interface "Button" junto ao pacote "button"
import checkbox.Checkbox; // Importação da interface "Checkbox" junto ao pacote "checkbox"
import factories.GUIFactory; // Importação da interface "GUIFactory" junto ao pacote "factories"

public class Application { // Criação da classe "Application"
	
	private Button button; // Declara uma variável de instância privada chamada "button" do tipo "Button"
	private Checkbox checkbox; // Declara uma variável de instância privada chamada "checkbox" do tipo "Checkbox"
	
	public Application(GUIFactory factory) { // Define o construtor da classe "Application" que recebe uma instância de uma interface "GUIFactory" como parâmetro
		
		button = factory.createButton(); // Chamada do método "createButton" da interface "GUIFactory" para criar um botão específico e atribuir à variável "button"
		checkbox = factory.createCheckbox(); // Chamada do método "createCheckbox" para criar um checkbox específico e atribuir à variável "checkbox"
		
	}
	
	public void paint() { // Define o método "paint" que não recebe parâmetros e não retorna valor
		
		button.paint(); // Chamada do método "paint" do "button" 
		checkbox.paint(); // Chamada do método "paint" do "checkbox"
	}

}
