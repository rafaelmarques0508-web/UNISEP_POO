package ex_01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CONTADOR OBJETO1 = new CONTADOR();
		
		OBJETO1.Incrementar();
		OBJETO1.Zerar();
		OBJETO1.Incrementar();
		OBJETO1.Incrementar();
		OBJETO1.Incrementar();
		OBJETO1.Incrementar();
		
		System.out.println("valor do contador " + OBJETO1.RetornarValorContador());
		
		
		OBJETO1.Zerar();
				
		System.out.println("valor do contador " + OBJETO1.RetornarValorContador());


	}

}
