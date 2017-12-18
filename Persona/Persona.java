import java.util.Calendar;

public class Persona {

	private String nom;
    private String cognom;
    private int anyNaixement;
    private int anyDefuncio;
    
    public Persona(){
    	nom="";
    	cognom="";
    	anyNaixement=Calendar.getInstance().get(Calendar.YEAR);
    	anyDefuncio=-1;
    }
    
    public Persona(String nom,String cognom,int anyNaixement,int anyDefuncio){
    	this.setNom(nom);
    	this.setCognom(cognom);
    	this.setAnyNaixement(anyNaixement);
    	this.setAnyDefuncio(anyDefuncio);
    }
    
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public int getAnyNaixement() {
		return anyNaixement;
	}
    public void setAnyNaixement(){
		this.anyNaixement = Calendar.getInstance().get(Calendar.YEAR);
    }
	public void setAnyNaixement(int anyNaixement) {
		if ( anyNaixement < 0 ){
			this.anyNaixement = Calendar.getInstance().get(Calendar.YEAR);
		} else {
			this.anyNaixement = anyNaixement;			
		}
	}

	public int getAnyDefuncio() {
		return anyDefuncio;
	}


	public void setAnyDefuncio() {
		this.anyDefuncio = -1;
	}

	public void setAnyDefuncio(int anyDefuncio) {
		if (anyDefuncio < this.anyNaixement && anyDefuncio != -1){
			this.anyDefuncio = Calendar.getInstance().get(Calendar.YEAR);
		} else {
		    this.anyDefuncio = anyDefuncio;
		}
	}

	public int edat(){
		int edat = Calendar.getInstance().get(Calendar.YEAR) - this.anyNaixement;
		if (!estaViu()){
			edat = this.anyDefuncio - this.anyNaixement ; 
		}
		return edat;
	}
    
	public boolean estaViu(){
		return this.anyDefuncio == -1;
	}

}
