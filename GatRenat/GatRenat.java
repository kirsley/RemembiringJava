/**
 * 
 */

/**
 * @author kirsley
 *
 */
public class GatRenat {
	private int vides = 1;
	//vides disponibles del gat Renat
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
	public static void main(String[] args) {
	}
}
