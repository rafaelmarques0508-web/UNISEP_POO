package funcionariosalario;

public class main {

	public static void main(String [] args) {
	funcionarioCLT rafael = new funcionarioCLT("rafael",5465.55);
	rafael.calcularsalario();
	rafael.exibirsalario();
	
	
	funcionarioEstagiario marcos = new funcionarioEstagiario("marcos",1258.55);
	marcos.calcularsalario();
	marcos.exibirsalario();
	}
	
	funcionarioPJ matheus = new funcionarioPJ("matheus",45248.55);
	matheus.calcularsalario();
	matheus.exibirsalario();
}
}



