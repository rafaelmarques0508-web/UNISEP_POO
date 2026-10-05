package trabalho;

public class Time {
	/// Atributos

	int numero_jogador;
	String nome_time;
	String federacao;
	String competicao;
	int titulo;
	int quantidade_torcida;
	String nome_estadio;
	String tecnico;
	String idolo_time;
	String mascote;

	/// construtor

	Time(int numero_jogador, String nome_time, String competicao, int quantidade_torcida, String mascote) {
		this.numero_jogador = numero_jogador;
		this.nome_time = nome_time;
		this.competicao = competicao;
		this.quantidade_torcida = quantidade_torcida;
		this.mascote = mascote;
	}

	/// metodos

	public void listaTime() {
		System.out.println("quantidade de jogador: " + this.numero_jogador);

		System.out.println("nome time: " + this.nome_time);

		System.out.println("competicao: " + this.competicao);

		System.out.println("quantidade torcida: " + this.quantidade_torcida);

		System.out.println("mascote: " + this.mascote);

	}

	public String getcompeticao() {
		return this.competicao;

	}

	public void setcompeticao(String competicao) {
		this.competicao = competicao;
	}
	


}
