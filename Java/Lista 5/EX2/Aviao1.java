package Familia28;

public class Aviao1 {

	public static void main(String[] args) {

		Aviao avi1 = new Aviao("Afro-9","C173","S�o Paulo - GRU","Foz do Igua�u - FOZ","Jo�o","19");
		Aviao avi2 = new Aviao("Airbag98","98","Rio de Janeiro","Gana","James","23");

		avi1.InformacoesPartida();
		avi1.relatorioGeral();
		avi1.decolar();
		
		avi2.InformacoesPartida();
		avi2.relatorioGeral();
		avi2.decolar();
		
		
		avi1.pousar();
		avi2.pousar();
		
	}

}
