package app;

import factories.GUIFactory; // Importa a classe "GUIFactory" do pacote "factories"
import factories.MacOSFactory; // Importa a classe "MacOSFactory" do pacote "factories"
import factories.WindowsFactory; // Importa a classe "WindowsFactory" do pacote "factories"

public class Demo { // Declara a classe pública "Demo"
	
	public static Application configureApplication() { // Define o método estático "configureApplication" que não recebe parâmetros e retorna uma instância da classe "Application"
		
		Application app; //  Definição da variável "app" do tipo "Application"
		GUIFactory factory; // Definição da variável "factory" do tipo "GUIFactory"
		String osName = System.getProperty("os.name").toLowerCase(); // Método chamado para obter o nome do sistema operacional e armazená-lo na variável "osName"
		
		if (osName.contains("mac")) { // verifica se o nome do sistema operacional contém a palavra "mac"
			
			factory = new MacOSFactory(); //  variável "factory" é inicializada com uma nova instância da classe "MacOSFactory", que implementa a interface "GUIFactory"
		
		} else { // Se não
			
			factory = new WindowsFactory(); // variável "factory" é inicializada com uma nova instância da classe "WindowsFactory", que também implementa a interface "GUIFactory"
		}
		
		app = new Application(factory); // Criação de uma nova instância da classe "Application", passando a instância de "factory" como parâmetro, e atribuída à variável "app"
		return app; // Retorno da instância de "app" pelo método
		
	}
	
	public static void main(String[] args) { // Definição do método estático "main"
		
		Application app = configureApplication(); // Inicialização da Variável "app" com o valor retornado pelo método "configureApplication"
		app.paint(); // Chamada do método "paint" na instância "app"
	}

}
