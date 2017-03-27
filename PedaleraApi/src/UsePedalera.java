
public class UsePedalera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sesion pedal = new Sesion(2,6,2333,(float) 236.5);
		System.out.println(pedal.getSegundos());
		System.out.println(pedal.toTime());
	}

}
