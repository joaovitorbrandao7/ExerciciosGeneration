package Familia28;

public class Animal2 extends Animal{

private int TamFerradura;
	
	
	public Animal2(String Nome, int Idade, String Especie, String Nincho, String Dono, String Cor, String Porte, String tamFerradura) {
		super(Nome,Idade,Especie,Nincho,Dono,Cor,Porte);
		
		this.TamFerradura = TamFerradura;
		
	}


	
	
	public void imprimirInfo() {
		System.out.println("\nNome: " +getNome() + " \nIdade: " + getIdade() + " \nEspecie: " + getEspecie() + " \nNincho: " + getNincho() + " \nDono: " + getDono() + " \nCor: " + getCor() + " \nPorte: " + getPorte() + " \nTipo de Ferradura" + getTamFerradura());
	}




	public int getTamFerradura() {
		return TamFerradura;
	}




	public void setTamFerradura(int tamFerradura) {
		TamFerradura = tamFerradura;
	}




	@Override
	public void emitirSom() {

		System.out.println(getNome()+ " diz: Rinheennheennn");
	}




	@Override
	public void Correr() {
		System.out.println(getNome()+ " est� correndo!");
		
	}




	@Override
	public void subirArvore() {
		// TODO Auto-generated method stub
		
	}
	
	
}
