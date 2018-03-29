package MAP.Atividades.Atividade4;

class Incremental { 
	private static Incremental instancia;
	private static int count = 0; 
	private int numero; 

	private Incremental() { 
		numero = ++count; 
	} 
	
	public static Incremental getInstance(){
		if(instancia == null){
			instancia = new Incremental();
		}
		return instancia;
	}

	public String toString() { 
		return "Incremental: " + numero; 
	} 
} 

