package app;

import factories.GUIFactory; // Importa a classe "GUIFactory" do pacote "factories"
import factories.MacOSFactory; // Importa a classe "MacOSFactory" do pacote "factories"
import factories.WindowsFactory; // Importa a classe "WindowsFactory" do pacote "factories"

public class Demo { // Declara a classe p�blica "Demo"
	
	public static Application configureApplication() { // Define o m�todo est�tico "configureApplication" que n�o recebe par�metros e retorna uma inst�ncia da classe "Application"
		
		Application app; //  Defini��o da vari�vel "app" do tipo "Application"
		GUIFactory factory; // Defini��o da vari�vel "factory" do tipo "GUIFactory"
		String osName = System.getProperty("os.name").toLowerCase(); // M�todo chamado para obter o nome do sistema operacional e armazen�-lo na vari�vel "osName"
		
		if (osName.contains("mac")) { // verifica se o nome do sistema operacional cont�m a palavra "mac"
			
			factory = new MacOSFactory(); //  vari�vel "factory" � inicializada com uma nova inst�ncia da classe "MacOSFactory", que implementa a interface "GUIFactory"
		
		} else { // Se n�o
			
			factory = new WindowsFactory(); // vari�vel "factory" � inicializada com uma nova inst�ncia da classe "WindowsFactory", que tamb�m implementa a interface "GUIFactory"
		}
		
		app = new Application(factory); // Cria��o de uma nova inst�ncia da classe "Application", passando a inst�ncia de "factory" como par�metro, e atribu�da � vari�vel "app"
		return app; // Retorno da inst�ncia de "app" pelo m�todo
		
	}
	
	public static void main(String[] args) { // Defini��o do m�todo est�tico "main"
		
		Application app = configureApplication(); // Inicializa��o da Vari�vel "app" com o valor retornado pelo m�todo "configureApplication"
		app.paint(); // Chamada do m�todo "paint" na inst�ncia "app"
	}

}
