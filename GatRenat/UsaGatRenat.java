/**
 * 
 */

/**
 * @author kirsley
 *
 */
import java.io.*;
public class UsaGatRenat {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

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
		}
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
