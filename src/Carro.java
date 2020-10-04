
public class Carro {

	public static final String VERMELHO = "vermelho";
	public static final String PRETA = "preta";
	
	public static final Double motor20 = 2.0;
	public static final Double motor18 = 1.8;
	public static final Double motor14 = 1.4;
	public static final Double motor10 = 1.0;
	
	private Integer quantidadePneus;
	private Integer quantidadeCalotas;
	private Integer quantidadeParafusos;
	private String cor;
	private Integer portas;
	private Boolean arCondicionado;
	private Boolean farolNeblina;
	private Double motor;
	private Boolean vidroEletrico;
	private Boolean isofix;
	
	public Carro(Integer quantidadePneus, Integer portas, Double motor) {
		this.setQuantidadePneus(quantidadePneus);
		this.portas = portas;
		this.motor = motor;
		
		setOptionals();
		
	}
	
	private void setOptionals() {
		
		this.arCondicionado = false;
		this.farolNeblina = false;
		this.vidroEletrico = false;
		this.isofix = false;
		
	}
	
	public Integer getPortas() {
		return portas;
	}

	public void setPortas(Integer portas) {
		this.portas = portas;
	}

	public Boolean getArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(Boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public Boolean getFarolNeblina() {
		return farolNeblina;
	}

	public void setFarolNeblina(Boolean farolNeblina) {
		this.farolNeblina = farolNeblina;
	}

	public Double getMotor() {
		return motor;
	}

	public void setMotor(Double motor) {
		this.motor = motor;
	}

	public Boolean getVidroEletrico() {
		return vidroEletrico;
	}

	public void setVidroEletrico(Boolean vidroEletrico) {
		this.vidroEletrico = vidroEletrico;
	}

	public Boolean getIsofix() {
		return isofix;
	}

	public void setIsofix(Boolean isofix) {
		this.isofix = isofix;
	}

	public void setQuantidadeCalotas(Integer qtd) {
		this.quantidadeCalotas = qtd;
	}
	
	public Integer getQuantidadePneus() {
		return this.quantidadePneus + 2;
	}
	
	public void setColor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public Integer getQuantidadeCalotas() {
		return quantidadeCalotas;
	}
	
	public Integer getQuantidadeParafusos() {
		return quantidadeParafusos;
	}

	public void setQuantidadePneus(Integer qtd) {
		
		this.quantidadePneus = qtd;
		this.setQuantidadeParafusos(qtd * 4);
		this.setQuantidadeCalotas(qtd);
		
	}

	public void setQuantidadeParafusos(Integer quantidadeParafusos) {
		this.quantidadeParafusos = quantidadeParafusos;
	}

	public void imprimeValores() {
		System.out.println("Quantidade Pneus: " + getQuantidadePneus());
		System.out.println("Quantidade Calotas: " + getQuantidadeCalotas());
		System.out.println("Quantidade Parafusos: " + getQuantidadeParafusos());
		System.out.println("Cor: " + getCor());
		System.out.println("Portas: " + getPortas());
		System.out.println("Ar Condicionado: " + getArCondicionado());
		System.out.println("Farol de Neblina: " + getFarolNeblina());
		System.out.println("Motor: " + getMotor());
		System.out.println("Vidro Eletrico: " + getVidroEletrico());
		System.out.println("Isofix: " + getIsofix());
	}
	
}
