
public class Sesion {
	private int segundos;
	private int count;
	private double calorias;
	
	public Sesion(int min,int sec,int count,double calorias){
		this.segundos = (min * 60) + sec;
		this.count = count;
		this.calorias = calorias;
	}

	public int getSegundos() {
		return segundos;
	}
	public String toTime(){
		int mins = this.getSegundos() / 60;
		int secs = this.getSegundos() % 60;
		String mins1;
		String secs1;
		if (mins <10){
			mins1="0" + String.valueOf(mins);
		} else {
			mins1=String.valueOf(mins);
		}
		
		if (secs <10){
            secs1="0" + String.valueOf(secs);
		} else {
			secs1=String.valueOf(secs);
		}
		
		return mins1 + ":" + secs1;
	}
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}
}
