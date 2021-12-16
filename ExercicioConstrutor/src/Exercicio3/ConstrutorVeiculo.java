package Exercicio3;

public class ConstrutorVeiculo {
	
	public static void main(String[] args) {
		
		Veiculo carro1 = new Veiculo("BMW", 4, "Branco", 2016, "Jose");
		Veiculo carro2 = new Veiculo("Mercedes", 4, "Cinza", 2014, "Ricardo");
						
		System.out.println("Ano do carro: " + carro1.getAno() + "\nCor do carro: " + carro1.getCor());
		System.out.println("Tipo do carro: " + carro2.getTipo() + "\nNome do dono: " + carro2.getNomeDono());
		
	}

}
