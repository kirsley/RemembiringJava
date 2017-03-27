/**
 * 
 */

/**
 * @author kirsley
 *
 */
public class UsaGatRenat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GatRenat renat_I;
		renat_I = new GatRenat();
		GatRenat renat_II = new GatRenat();
		System.out.println("El gat Renat I té " + renat_I.getVides() + " vides.");
		System.out.println("El gat Renat II té " + renat_II.getVides() + " vides");
		renat_I.setVides(renat_I.getVides()-1);
		System.out.println("El gat Renat I té " + renat_I.getVides() + " videss");
		System.out.println("El gat Renat II té " + renat_II.getVides() + " vides");
		renat_II = renat_I; // atenció: la instància de Renat II es perd!
		System.out.println("El gat Renat I té " + renat_I.getVides() + " vides");
		System.out.println("El gat Renat II té " + renat_II.getVides() + " vides");
		renat_I.setVides(renat_I.getVides()-1);
		System.out.println("El gat Renat I té " + renat_I.getVides() + " vides");
		System.out.println("El gat Renat II té " + renat_II.getVides() + " vides");
	}

}
