
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
		if (hora <=23){
			this.hora = hora;
		}
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		if ( min <= 59 ){
			this.min = min;
		}
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		if ( sec <=59 ){
			this.sec = sec;
		}
	}
	public int toSecs(){
		 return (this.getSec() + (this.getMin()*60) + (this.getHora() * 60 * 60 ));
	}
	public static Hora toHora(int temps){
		int h,m,s;
		h=temps / 3600;
		m=(temps % 3600) / 60;
		s=(temps % 3600) % 60;
		Hora hora = new Hora(h,m,s);
		return hora;
	}
	public String toString(){
		String hora = "";
		if (this.getHora() <10 ){
			hora += "0";
		}
		hora += this.getHora() + ":";
		if (this.getMin() < 10 ){
			hora += "0";
		}
		hora += this.getMin() + ":";
		if (this.getSec() < 10 ){
			hora += "0";
		}
		hora += this.getSec();
		return hora;
	}
	public void incrementa(){
		int newTime=this.toSecs()+1;
		this.setNewHora(newTime);
	}
	
	public void sumasec(){
		this.sec += 1;
		if (sec == 60){
			sec = 0;
			min += 1;
		}
		if (min == 60){
			min = 0;
			hora += 1;
		}
		if (hora == 24){
			hora = 0;
		}
	}
	
	public void restasec(){
		sec -= 1;
		if (sec < 0){
			sec = 59;
			min -= 1;
		}
		if (min < 0){
			min = 59;
			hora -= 1;
		}
		if (hora < 0 ){
			hora = 23;
		}
	}
	public void sumasec(int secs){
		for (int i = 0; i < secs; i++){
			sumasec();
		}
	}
	public void restasec(int secs){
		for (int i = 0; i < secs; i++){
			restasec();
		}
	}
	public void incrementa(int secs){
		int newTime=this.toSecs() + secs;
		this.setNewHora(newTime);
	}
	
	public void setNewHora(int newTime){
		int h,m,s;
		h= newTime/ 3600 % 24;
		m=(newTime % 3600) / 60 ;
		s=(newTime % 3600) % 60;
		this.setHora(h);
		this.setMin(m);
		this.setSec(s);
	}
	public void decrementa(){
		int newTime=this.toSecs() - 1;
		if (newTime < 0){
			newTime = newTime + 86400;
		}
		this.setNewHora(newTime);
	}
	public void decrementa(int secs){
		int newTime=this.toSecs() - secs % 86400;
		if (newTime < 0){
			newTime = 86400 - (newTime * -1);
		}
		this.setNewHora(newTime);
	}
	public int compareTo(Hora h){
		int diff = 1;
		if (this.getHora() < h.getHora() || (this.getHora() == h.getHora() && this.getMin() < h.getMin()) 
				|| (this.getHora() == h.getHora() && this.getMin() == h.getMin() && this.getSec() < h.getSec()) ){
			diff = -1;
		} else if (this.getHora() == h.getHora() && this.getMin()== h.getMin() && this.getSec() == h.getSec()){
			diff = 0;
		}
		return diff;
	}
	public static int compareTo(Hora h1, Hora h2){
	 return h1.toSecs() - h2.toSecs();
	}
	public static boolean valida(int hora, int min, int sec){
		return (hora <= 23 && hora >= 0 && min <= 59 && min >= 0 && sec <= 59 && sec >= 0);
	}
	public static Hora duplica(Hora h){
		return new Hora(h.getHora(),h.getMin(),h.getSec());
	}
}
