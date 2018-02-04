/**
 * 
 */

/**
 * @author kirsley
 *
 */
import java.io.*;
public class UsaGatRenat {

	public static void main(String[] args) throws IOException {
		System.out.println("Inicialment el nombre d'instàncies és: " +
		GatRenat.getNumGats());
		// crea uns quants GatRenat per demostrar l'ús de membres estàtics
		GatRenat[] gats = new GatRenat[10];
		for (int i=0; i < gats.length; i++) {
		gats[i] = new GatRenat();
		gats[i].setVides(i);
		// canviem les vides només per distingir-los
		System.out.println("Tenim: " + gats[i] + " amb " +
		GatRenat.getNumGats() + " germanets");
		}
		// tornem a demanar a cadascun quants germans té
		System.out.println("I si tornem a demanar-los quants germans tenen, ens diuen:");
		for (int i=0; i < gats.length; i++) {
		System.out.println("Gat amb id " + gats[i].getIdGat() + " amb " +
		GatRenat.getNumGats() + " germanets");
		}
		gats[5].posaPicarol(new Picarol());
		
	/**
	 * @param args
	 */
/*
		GatRenat renat = new GatRenat();
		System.out.println("Nou GatRenat Creat");
		System.out.println("[Renat:] ");
		String comanda = new BufferedReader(new InputStreamReader(System.in)).readLine();
		/**Comandes disponibles:
		 * com estas?
		 * aixeca’t
		 * seu
		 * estira’t
		 * miola
		 * calla
		 * parla
		 * adeu
		 */
	/*	
		while(!comanda.equals("adeu")){
			if (comanda.equals( "com estas?")){
				if (renat.potParlar()){
				    System.out.println("Estic " + renat.getEstat());
				} else {
					System.out.println("...");
				}
			} else if (comanda.equals("aixecat")){
				renat.aixecat();
			} else if (comanda.equals("seu")){
				renat.seu();
			} else if (comanda.equals("estirat")){
				renat.estirat();
			} else if (comanda.equals("miola")){
				renat.miola();
			} else if (comanda.equals("calla")){
				renat.calla();
			} else if (comanda.equals("parla")){
				renat.parla();
		    } else {
		    	System.out.println("De moment sols l'hem ensinistrat per aquestes ordres: ");
		    	System.out.println("'com estas?' 'aixecat' 'seu' 'estirat' 'miola' 'calla''parla'");
		    }
			System.out.println("[Prompt:] ");
			comanda = new BufferedReader(new InputStreamReader(System.in)).readLine();
		}*/
		/*
		System.out.println("El Gat Renat esta " + renat.getEstatString());
		renat.estirat();
		System.out.println("El Gat Renat esta " + renat.getEstatString());
		renat.seu();
		System.out.println("El Gat Renat esta " + renat.getEstatString());
		renat.estirat();
		renat.parla();
		renat.miola();
		System.out.println("El Gat Renat esta " + renat.getEstatString());
		renat.estirat();
		System.out.println("El Gat Renat esta " + renat.getEstatString());
		renat.seu();
		System.out.println("El Gat Renat esta " + renat.getEstatString());
		renat.seu();
		System.out.println("El Gat Renat esta " + renat.getEstatString());
		renat.aixecat();
		System.out.println("El Gat Renat diu que esta " + renat.getEstatString());
		renat.aixecat();
*/
	}

}
