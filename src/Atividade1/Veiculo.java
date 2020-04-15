package Atividade1;

public class Veiculo {
	
	private String modelo; 
	private String cor;
	private Integer ano;
	private Marca marca;
	private String chassi;
	private Proprietario dono;
	private Integer velMax;
	private Integer velAtual;
	private Integer numPortas;
	private Boolean temTetoSolar;
	private Integer numMarchas;
	private Boolean temCambioAuto;
	private Integer volCombustivel;
	private Integer marchaAtual;
	private Double consumoMedio;

	
	
	

	public Veiculo(Proprietario newProprietario , Marca newMarca, String cor, String chassi) {
		this.dono = newProprietario;
		this.marca = newMarca;
		this.cor = cor;
		this.chassi = chassi;
	}
	
	public String getChassi() {
		return this.chassi;
	}

	public void Acelerar() {
		this.velAtual = this.velAtual + 1;
	}
	
	public void Frear() {
		this.velAtual = 0;
	}
	
	public void AumentaMarcha() {
		this.marchaAtual = this.marchaAtual + 1;
	}

	public void DiminuiMarcha() {
		this.marchaAtual = this.marchaAtual - 1;
	}
	public void MarchaRe() {
		if(velAtual != 0) {
			System.out.println("Proibido dar ré");
		} else {
			this.marchaAtual = -1;
		}
	}
	public Double ConsumoMedio(Double newConsumoMedio) {	
		this.consumoMedio = newConsumoMedio;
		System.out.println("Consumo medio por km rodado: " + this.consumoMedio);
		return(newConsumoMedio);
	}
	public Integer CombustivelnoTanque(Integer newVolCombustivel) {
		this.volCombustivel = newVolCombustivel;
		System.out.println("Volume de combustivel: " + this.volCombustivel);
		return(newVolCombustivel);
	}
	
	
}
