package Familia28;

public class Animal3 extends Animal {
	
private String Grupo;
	
	
	public Animal3(String Nome, int Idade, String Especie, String Nincho, String Cor, String Porte, String Grupo) {
		super(Nome,Idade,Especie,Nincho,Cor,Porte);
		
		this.Grupo = Grupo;
		
	}


	public String getGrupo() {
		return Grupo;
	}


	public void setGrupo(String Grupo) {
		this.Grupo = Grupo;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome: " +getNome() + " \nIdade: " + getIdade() + " \nEspecie: " + getEspecie() + " \nNincho: " + getNincho() + " \nCor: " + getCor() + " \nPorte: " + getPorte() + " \nGrupo: " + getGrupo());
	}


	@Override
	public void emitirSom() {
     
		System.out.println(getNome() + " diz: Miiiiiiiiiiii");
	}


	@Override
	public void Correr() {
		
	}


	@Override
	public void subirArvore() {
		System.out.println(getNome()+ " est� subindo nas arvores!");
		
	}
	

}
