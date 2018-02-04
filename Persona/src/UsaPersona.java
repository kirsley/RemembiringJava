import java.io.*;

public class UsaPersona {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String nom,cognom;
		int naix,defunc;
		System.out.println("Introdueixi el Nom");
		nom = new BufferedReader(new InputStreamReader(System.in)).readLine();
		System.out.println("Introudeixi el Cognom");
		cognom = new BufferedReader(new InputStreamReader(System.in)).readLine();
		System.out.println("Introudeixi l'any de Naixement");
		naix = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		System.out.println("Introudeixi l'any de Defuncio");
		defunc = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		
		Persona p = new Persona(nom,cognom,naix,defunc);
		System.out.println(p.getNom()+" " + p.getCognom());
		if ( p.estaViu()){
			System.out.println("Te "+ p.edat() +" anys");
		} else {
			System.out.println("Va morir amb "+p.edat()+" anys.");
		}
	}

}
