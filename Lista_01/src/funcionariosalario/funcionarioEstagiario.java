package funcionariosalario;


public class funcionarioEstagiario extends funcionario {
	
		
		
		public funcionarioEstagiario(String name, double salariobase) {
			super(nome,salariobase);{
			}
		}
			public double calcularsalariobase() {
				return salariobase = ("salariobase * 0,05");
			}
			public void exibirsalario() {
				super.exibirsalario();
		
					System.out.println("salario final: + " + salariofinal);
	}

}
