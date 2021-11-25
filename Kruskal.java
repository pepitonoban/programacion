import java.util.ArrayList;
import java.util.PriorityQueue;

public class Kruskal {
	
	private MatrizDeAdyacencia matrizResultado;
	private ArrayList<Arista> aristas;
	private UnionFind unionfind;
	private int cantNodos;
	private int costoMinimo=0;

	
	public Kruskal(ArrayList<Arista> aristas, int cantNodos) {
		this.aristas = aristas;
		this.cantNodos = cantNodos;
		this.matrizResultado = new MatrizDeAdyacencia(cantNodos);
	}

	public MatrizDeAdyacencia kruskal() {
		
		PriorityQueue<Arista> aristas = new PriorityQueue<Arista>(this.aristas.size());

		for (Arista arista : this.aristas) {
			aristas.add(arista);
		}
		
		this.unionfind = new UnionFind(cantNodos);
		
		int i = 0;
		
		while (i < cantNodos-1) {

			Arista arista = aristas.remove();
			
			int representanteOrigen = unionfind.find(arista.getOrigen());
			int representanteDestino = unionfind.find(arista.getDestino());

			if (representanteOrigen != representanteDestino) {
				i++;				
				unionfind.union(representanteOrigen, representanteDestino);
				matrizResultado.conectarNodos(arista.getOrigen(), arista.getDestino(), arista.getCosto(), false);
				costoMinimo += arista.getCosto();
			}
		}
		
		matrizResultado.setCostoMinimo(costoMinimo);

		return matrizResultado;		
	}
}
