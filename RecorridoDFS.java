import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RecorridoDFS {

	private MatrizDeAdyacencia grafo;
	private MatrizDeAdyacencia arbol;
	private List<Boolean> nodosVisitados = new ArrayList<Boolean>();
	private Stack<Integer> pilaDeNodos = new Stack<Integer>();

	public RecorridoDFS(MatrizDeAdyacencia grafo) {
		this.grafo = grafo;
		this.arbol = new MatrizDeAdyacencia(grafo.getTamanio());
	}

	public void recorrerGrafo() {

		for (int i = 0; i < grafo.getTamanio(); i++)
			nodosVisitados.add(false);

		while (nodosVisitados.contains(false)) {

			while (!pilaDeNodos.isEmpty()) {

				int nodoActual = pilaDeNodos.pop();
				int[] adyacentes = grafo.obtenerAdyacentes(nodoActual);

				for (int i = 0; i < grafo.getTamanio(); i++) {

					if (adyacentes[i] != Integer.MAX_VALUE) {
						if (nodosVisitados.get(i) == false) {
							nodosVisitados.set(i, true);
							pilaDeNodos.push(i);
							arbol.conectarNodos(nodoActual, i, adyacentes[i], false);
							
						}
					}
				}
			}
			
			for(int i = 0; i<grafo.getTamanio(); i++) {
				if (nodosVisitados.get(i) == false) {
					pilaDeNodos.push(i);
					nodosVisitados.set(i, true);
					break;
				}
			}

		}
		
		arbol.mostrarMatriz();
	}
}
