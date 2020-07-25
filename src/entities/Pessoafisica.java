package entities;

public class Pessoafisica extends RendaAnual{


	private double planodesaude;
	
	public Pessoafisica() {
		super();
	}
	
	
	
	
	public Pessoafisica(String name, Double rendaanual, double planodesaude) {
		super(name, rendaanual);
		this.planodesaude = planodesaude;
	}




	public double getPlanodesaude() {
		return planodesaude;
	}




	public void setPlanodesaude(double planodesaude) {
		this.planodesaude = planodesaude;
	}




	@Override
	public double tax() {
		if(rendaanual < 20000) {
			return (rendaanual*0.15) - (planodesaude*0.5);
		}
		else
		{ return  (rendaanual*0.25) - (planodesaude*0.5);
		
		}
	

	}}
