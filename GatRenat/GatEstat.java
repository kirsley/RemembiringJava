
public enum GatEstat {
	dret,assegut,estirat;
	
	public static boolean conte(String estat){
		boolean contains;
		contains=false;
		for ( GatEstat ge : GatEstat.values()){
			if (ge.name().equals(estat)){
				contains= true;
			}
		}
		return contains;
	}
}
