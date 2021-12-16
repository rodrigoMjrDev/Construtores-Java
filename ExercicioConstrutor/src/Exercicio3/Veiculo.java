package Exercicio3;

public class Veiculo {
	
	private String tipo;
	private int nroRodas;
	private String cor;
	private int ano;
	private String nomeDono;
	

	public Veiculo(String tipo, int nroRodas, String cor, int ano, String nomeDono) {
		super();
		this.tipo = tipo;
		this.nroRodas = nroRodas;
		this.cor = cor;
		this.ano = ano;
		this.nomeDono = nomeDono;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNroRodas() {
		return nroRodas;
	}

	public void setNroRodas(int nroRodas) {
		this.nroRodas = nroRodas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}
	
	

}
