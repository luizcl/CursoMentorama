
public class ClassMain {
	
	
	public static void main(String[] args) {
		
		Carro carro = new Carro(4,4,Carro.motor14);
		carro.setColor(Carro.VERMELHO);
		
		carro.imprimeValores();
		
		carro.setArCondicionado(true);
		carro.setFarolNeblina(true);
		carro.setVidroEletrico(true);
		
		System.out.println();
		
		carro.imprimeValores();
		
	}
	
}
