
public class UsePedalera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sesion pedal = new Sesion(100,46,2333, 236.5);
		System.out.println(pedal.getSegundos());
		System.out.println(pedal.toTime());
	}

}
