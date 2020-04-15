package Atividade1;

public class CarrosTestes {

	public static void main(String[] args) {
		Endereco end1 = new Endereco();
		
		Proprietario prop1 = new Proprietario("Emiliano", "12345", "67890", end1);
		
		Marca gol = new Marca();
		
		Veiculo carro1 = new Veiculo(prop1, gol, "blue", "CH123");
		Veiculo carro2 = new Veiculo(prop1, gol, "red", "CH124");
		Veiculo carro3 = new Veiculo(prop1, gol, "black", "CH125");
		
		Venda vend = new Venda();
		
		vend.adicionarVeiculo(carro1);
		vend.adicionarVeiculo(carro2);
		vend.adicionarVeiculo(carro3);
		
		System.out.println(vend.obterVeiculo("CH128"));
		System.out.println(carro1);
		
		
		
	}

}
