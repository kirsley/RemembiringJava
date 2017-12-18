
public class UsaDataHora {
	public static void print(int algo){
		System.out.println(algo);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hora h = new Hora(23,59,59);
		System.out.println(h);
		int temps = h.toSecs();
		System.out.println(temps);
		Hora novah = Hora.toHora(temps);
		System.out.println(novah);
		novah.incrementa(0);
		System.out.println(novah);
		novah.decrementa(87000);
		System.out.println(novah);
		temps = novah.toSecs();
		System.out.println(temps);
		int comparacion = h.compareTo(novah);
		if (comparacion > 0){
			System.out.println(h + " Es Mayor que " + novah);
		} else if (comparacion < 0){
			System.out.println(h + " Es Menor que " + novah);
		} else {
			System.out.println(h + " Es Igual que " + novah);
		}
	}

}
