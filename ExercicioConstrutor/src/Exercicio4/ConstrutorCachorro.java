package Exercicio4;

public class ConstrutorCachorro {
	
	public static void main(String[] args) {
		
		Cachorro dog1 = new Cachorro("Thor", 8, "Rottweiler");
		
		System.out.println("Nome: " + dog1.getNome() + "\nIdade: " + dog1.getIdade() + "\nRaça: " + dog1.getRaca());
		
	}

}
