
public class UsaDataHora {
	public static void print(int algo){
		System.out.println(algo);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hora h = new Hora(23,50,59);
		Hora newh = Hora.duplica(h);
		/*
		System.out.println(h);
		int temps = h.toSecs();
		System.out.println(temps);
		Hora novah = Hora.toHora(temps);
		System.out.println(novah);
		novah.sumasec(1);
		System.out.println(novah);
		novah.restasec(999999);
		System.out.println(novah);
		temps = novah.toSecs();
		System.out.println(temps);
		*/
		newh.sumasec(20);
		int comparacion = Hora.compareTo(h,newh);
		
		if (comparacion > 0){
			System.out.println(h + " Es Mayor que " + newh);
		} else if (comparacion < 0){
			System.out.println(h + " Es Menor que " + newh);
		} else {
			System.out.println(h + " Es Igual que " + newh);
		}
		if (Hora.valida(-23,-1,20)){
			System.out.println ("Hora Valida");
		} else{
			System.out.println("hora no valida");
		}
	}

}
