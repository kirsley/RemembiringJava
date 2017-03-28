
public class Hora {
	private int hora;
	private int min;
	private int sec;
	
	public Hora(int hora,int min,int sec){
		this.setHora(hora);
		this.setMin(min);
		this.setSec(sec);
	}
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	
}
