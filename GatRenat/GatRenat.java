/**
 * 
 */

/**
 * @author kirsley
 *
 */
public class GatRenat {
	private int vides = 1;
	private enum Estat {
		dret,assegut,estirat
	}
	Estat estat = Estat.dret;
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

	public String getEstat() {
		return this.estat.toString();
	}
	public void setEstat(String estat) {
		this.estat = Estat.valueOf(estat);
	}
	public boolean estaViu(){
		return this.vides > 0;
	}
	
	public boolean estaDret(){
		return this.getEstat().toString() == "dret";
	}
	boolean estaAssegut(){
		return this.getEstat().toString() == "assegut";
	}
	boolean estaEstirat(){
		return this.getEstat().toString() == "estirat";
	}
	
	public void aixecat(){
		if ( ! this.estaDret()){
			System.out.println("M'aixeco");
			this.setEstat("dret");
		} else {
			System.out.println("Ja ho estava!");
		}
	}
	
	public void seu(){
		if ( !this.estaAssegut()){
			System.out.println("M'assec");
			this.setEstat("assegut");
		} else {
			System.out.println("Ja ho estava!");
		}
	}
	
	public void estirat(){
		if(!this.estaEstirat()){
			System.out.println("M'estiro");
			this.setEstat("estirat");
		} else {
			System.out.println("Ja ho estava!");
		}
	}
}
