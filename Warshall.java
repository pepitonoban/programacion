
public class Warshall {
	
	private MatrizDeAdyacencia matrizInicial;
	private MatrizDeAdyacencia matrizResultado;
	
	public Warshall(MatrizDeAdyacencia matrizInicial) {
		this.matrizInicial = matrizInicial;
	}

	public MatrizDeAdyacencia warshall() {
			
		this.matrizResultado = matrizInicial.clone();
		
		matrizResultado.matrizConexiones();
		
		this.matrizResultado.mostrarMatriz();


		for (int k = 0; k < matrizResultado.getTamanio(); k++) {
			
			for (int i = 0; i < matrizResultado.getTamanio(); i++) {
				
				for (int j = 0; j < matrizResultado.getTamanio(); j++) {
					
					if (k != i && k != j && i != j) {
						
						if (matrizResultado.obtenerCosto(i, j) == 1 || (matrizResultado.obtenerCosto(i, k) == 1 && matrizResultado.obtenerCosto(k, j) == 1))
								this.matrizResultado.conectarNodos(i, j, 1, true);
					}
				}
			}
		}
		
		this.matrizResultado.mostrarMatriz();
		return this.matrizResultado;		
		
	}
	

}
