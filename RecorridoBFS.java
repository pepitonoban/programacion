import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RecorridoBFS {

	private MatrizDeAdyacencia grafo;
	private MatrizDeAdyacencia arbol;
	private List<Integer> distanciaNodos = new ArrayList<Integer>();
	private Queue<Integer> colaDeNodos = new LinkedList<Integer>();

	public RecorridoBFS(MatrizDeAdyacencia grafo) {
		this.grafo = grafo;
		this.arbol = new MatrizDeAdyacencia(grafo.getTamanio());
	}

	public void recorrerGrafo() {

		for (int i = 0; i < grafo.getTamanio(); i++)
			distanciaNodos.add(Integer.MAX_VALUE);

		while (distanciaNodos.contains(Integer.MAX_VALUE)) {

			while (!colaDeNodos.isEmpty()) {

				int nodoActual = colaDeNodos.poll();
				int[] adyacentes = grafo.obtenerAdyacentes(nodoActual);

				for (int i = 0; i < grafo.getTamanio(); i++) {

					if (adyacentes[i] != Integer.MAX_VALUE) {
						if (distanciaNodos.get(i) == Integer.MAX_VALUE) {
							distanciaNodos.set(i, distanciaNodos.get(nodoActual) + 1);
							colaDeNodos.add(i);
							arbol.conectarNodos(nodoActual, i, adyacentes[i], false);
						}
					}
				}
			}
			
			for(int i = 0; i<grafo.getTamanio(); i++) {
				if (distanciaNodos.get(i) == Integer.MAX_VALUE) {
					colaDeNodos.add(i);
					distanciaNodos.set(i, 0);
					break;
				}
			}

		}
		
		arbol.mostrarMatriz();
		
		System.out.println(distanciaNodos);
	}
}
