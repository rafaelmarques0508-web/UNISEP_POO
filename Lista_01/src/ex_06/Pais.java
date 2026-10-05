package ex_06;

public class Pais {

	/// atributos

	String codigoPais;
	String nome;
	int populacao;
	double dimensao;

	/// construtor = primeira função a ser executada em uma classe

	Pais(String codigoPais, double dimensao, String nome) {
		this.codigoPais = codigoPais;
		this.nome = nome;
		this.dimensao = dimensao;

	}

	// metodos

	public void listaPais() {
		System.out.println("nome: " + this.nome);

		System.out.println("dimensao = " + this.dimensao);

		System.out.println("codigo Pais = " + this.codigoPais);

		System.out.println("populacao = " + this.populacao);
	}

	public String getname() {
		return this.nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public String getcodigoPais() {
		return this.codigoPais;
	}

	public void setcodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}


	public void setdimensao(double dimensao) {
		this.dimensao = dimensao;}
	
	public int getpopulacao() {
		return this.populacao;}

	
	
	
	}
