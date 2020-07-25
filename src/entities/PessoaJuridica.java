package entities;

public class PessoaJuridica extends RendaAnual {
	
	private int numerodef;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double rendaanual, int numerodef) {
		super(name, rendaanual);
		this.numerodef = numerodef;
	}
	



	public int getNumerodef() {
		return numerodef;
	}

	public void setNumerodef(int numerodef) {
		this.numerodef = numerodef;
	}

	@Override
	public double tax() {
		if(numerodef < 11) {
			return rendaanual*0.16;
			
		}
		else
		{
			return rendaanual*0.14;
		}
	}

}
