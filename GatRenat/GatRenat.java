/**
 * 
 */

/**
 * @author kirsley
 *
 */
public class GatRenat {
	private int vides = 1;
	private GatEstat estat = GatEstat.dret;
	private boolean parla = true;
	
	public int getVides(){
		return this.vides;
	}
	public void setVides(int vides){
		if (vides >= 0){
			this.vides=vides;
		} else {
			System.out.println("Num de vides erroni");
		}
	}

	public String getEstatString() {
		return this.estat.toString();
	}

	public GatEstat getEstat() {
		return this.estat;
	}
	
	public void setEstat(String estat) {
		if (GatEstat.conte(estat)){
			this.estat = GatEstat.valueOf(estat);
		}
	}
	
	public void setEstat(GatEstat estat){
		this.estat = estat;
	}
	
	public boolean potParlar(){
		return this.parla;
	}
	
	public void setParla(boolean parla){
		this.parla = parla;
	}
	
	public void parla(){
		if (!this.potParlar()){
			setParla(true);
		}
	}
	public void calla(){
		if (this.potParlar()){
			setParla(false);
		}
	}
	public void miola(){
		if (this.potParlar()){
			System.out.println("MEWWW");
		}else{
			System.out.println("...");
		}
	}
	public boolean estaViu(){
		return this.vides > 0;
	}
	
	public boolean estaDret(){
		return this.getEstatString() == "dret";
	}
	boolean estaAssegut(){
		return this.getEstatString() == "assegut";
	}
	boolean estaEstirat(){
		return this.getEstatString() == "estirat";
	}
	
	public void aixecat(){
		if (this.potParlar()){
			if ( ! this.estaDret()){
				System.out.println("M'aixeco");
				this.setEstat("dret");
			} else {
				System.out.println("Ja ho estava!");
			}
		}else{
			System.out.println("...");
		}
	}
	
	public void seu(){
		if (this.potParlar()){
			if ( !this.estaAssegut()){
				System.out.println("M'assec");
				this.setEstat(GatEstat.assegut);
			} else {
				System.out.println("Ja ho estava!");
			}
		}else{
			System.out.println("...");
		}
	}
	
	public void estirat(){
		if (this.potParlar()){
			if(!this.estaEstirat()){
				System.out.println("M'estiro");
				this.setEstat("estirat");
			} else {
				System.out.println("Ja ho estava!");
			}
		}else{
			System.out.println("...");
		}
	}
}
