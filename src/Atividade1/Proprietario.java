package Atividade1;

import java.util.Date;

public class Proprietario {
	
	private String nome;
	private String CPF;
	private String RG;
	private Date bornDate;
	private Endereco endereco;
	
	public Proprietario(String newNome, String newCPF, String newRG, Endereco newEndereco) {		
		this.nome = newNome;
		this.CPF = newCPF;
		this.RG = newRG;
		this.endereco = newEndereco;
		}
		
}
