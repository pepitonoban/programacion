
public class Floyd {

	private MatrizDeAdyacencia matrizInicial;
	private MatrizDeAdyacencia matrizResultado;
	private int[][] matrizPredecesores;
	
	public Floyd(MatrizDeAdyacencia matrizInicial) {
		this.matrizInicial = matrizInicial;
	}

	public MatrizDeAdyacencia floyd() {

		this.matrizResultado = matrizInicial.clone();

		matrizPredecesores = new int[matrizResultado.getTamanio()][matrizResultado.getTamanio()];

		for (int i = 0; i < matrizPredecesores.length; i++) {
			int[] adyacentes = matrizResultado.obtenerAdyacentes(i);

			for (int j = 0; j < adyacentes.length; j++) {

				if (adyacentes[j] == Integer.MAX_VALUE)
					matrizPredecesores[i][j] = Integer.MAX_VALUE;
				else
					matrizPredecesores[i][j] = i;
			}
		}

		for (int i = 0; i < matrizResultado.getTamanio(); i++)
			matrizResultado.conectarNodos(i, i, 0, true);

		for (int k = 0; k < matrizResultado.getTamanio(); k++) {

			for (int i = 0; i < matrizResultado.getTamanio(); i++) {

				for (int j = 0; j < matrizResultado.getTamanio(); j++) {

					if (k != i && k != j && matrizResultado.obtenerCosto(i, k) != Integer.MAX_VALUE
							&& matrizResultado.obtenerCosto(k, j) != Integer.MAX_VALUE) {

						int aux = matrizResultado.obtenerCosto(i, j);
						int min = Math.min(matrizResultado.obtenerCosto(i, j),
								matrizResultado.obtenerCosto(i, k) + matrizResultado.obtenerCosto(k, j));

						if (aux != matrizResultado.obtenerCosto(i, j))
							matrizPredecesores[i][j] = k;

						this.matrizResultado.conectarNodos(i, j, min, true);
					}
				}
			}
		}

		this.matrizResultado.mostrarMatriz();
		return this.matrizResultado;

	}

	public int[][] getMatrizPredecesores() {
		
		MatrizDeAdyacencia mat = new MatrizDeAdyacencia(matrizPredecesores);
		mat.mostrarMatriz();
		return matrizPredecesores;
		
	}
}
