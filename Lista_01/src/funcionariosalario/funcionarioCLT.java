package funcionariosalario;


public class funcionarioCLT extends funcionario{
	
	double salariofinal;

		public funcionarioCLT (String nome, double salariobase) {
			super(nome, salariobase);
		}

		    public void calcularSalario() {
		        salariofinal = salariobase - (salariobase * 0.08);
		    }
		    @Override
		    public void exibirsalario() {
		    	super.exibirsalario();
		    	
		    System.out.println("salario final: + " + salariofinal);
		}
}
		

