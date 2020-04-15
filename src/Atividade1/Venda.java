package Atividade1;


import java.util.ArrayList;
import java.util.List;

public class Venda {
		
	private List<Veiculo> veiculo = new ArrayList<>();
	
	public Venda() {}
	
	public void adicionarVeiculo(Veiculo veiculo){
		this.veiculo.add(veiculo);
		
	}
	
	public Veiculo obterVeiculo(String chassi){
		for(int i = 0; i < veiculo.size(); i++) {
			if(veiculo.get(i).getChassi().equals(chassi)){
                return veiculo.get(i);
			}else {
				return null;
			}
		}
		return null;
	}
	
	
	public void Buscar() {
		
	}

}
