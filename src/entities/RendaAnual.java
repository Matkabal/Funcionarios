package entities;

public abstract class  RendaAnual {
	
	protected String name;
	protected Double rendaanual;
	
	public RendaAnual() {
		
	}

	public RendaAnual(String name, Double rendaanual) {
		this.name = name;
		this.rendaanual = rendaanual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRendaanual() {
		return rendaanual;
	}

	public void setRendaanual(Double rendaanual) {
		this.rendaanual = rendaanual;
	}

	public abstract double tax();
}
