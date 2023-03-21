package app;

import button.Button; // Importa��o da interface "Button" junto ao pacote "button"
import checkbox.Checkbox; // Importa��o da interface "Checkbox" junto ao pacote "checkbox"
import factories.GUIFactory; // Importa��o da interface "GUIFactory" junto ao pacote "factories"

public class Application { // Cria��o da classe "Application"
	
	private Button button; // Declara uma vari�vel de inst�ncia privada chamada "button" do tipo "Button"
	private Checkbox checkbox; // Declara uma vari�vel de inst�ncia privada chamada "checkbox" do tipo "Checkbox"
	
	public Application(GUIFactory factory) { // Define o construtor da classe "Application" que recebe uma inst�ncia de uma interface "GUIFactory" como par�metro
		
		button = factory.createButton(); // Chamada do m�todo "createButton" da interface "GUIFactory" para criar um bot�o espec�fico e atribuir � vari�vel "button"
		checkbox = factory.createCheckbox(); // Chamada do m�todo "createCheckbox" para criar um checkbox espec�fico e atribuir � vari�vel "checkbox"
		
	}
	
	public void paint() { // Define o m�todo "paint" que n�o recebe par�metros e n�o retorna valor
		
		button.paint(); // Chamada do m�todo "paint" do "button" 
		checkbox.paint(); // Chamada do m�todo "paint" do "checkbox"
	}

}
