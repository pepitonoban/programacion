import java.util.ArrayList;
import java.util.List;

public class Dijkstra {
	
	private MatrizDeAdyacencia matriz;
	private int nodoInicial;
	private int[] distancias;
	private int[] predecesores;
	private List<Integer> conjuntoS = new ArrayList<Integer>();
	private List<Integer> conjuntoVS = new ArrayList<Integer>(); 
	
	public Dijkstra(MatrizDeAdyacencia matriz, int nodoInicial) {
		
		this.matriz = matriz;
		this.nodoInicial = nodoInicial;
		
		distancias = new int[matriz.getTamanio()];
		predecesores = new int[matriz.getTamanio()];
	}
	
	public void dijkstra() {
		
		conjuntoS.add(nodoInicial-1);
				
		for(int i = 0; i < matriz.getTamanio(); i++) {
			if (i != nodoInicial - 1)
				conjuntoVS.add(i);
		}
		
		int[] adyacentes = matriz.obtenerAdyacentes(nodoInicial-1);
		
		for(int i=0; i < adyacentes.length; i++) {
			distancias[i] = adyacentes[i];
			if(adyacentes[i] == Integer.MAX_VALUE)
				predecesores[i] = Integer.MAX_VALUE;
			else
				predecesores[i] = nodoInicial-1;
		}

		while (!conjuntoVS.isEmpty()) {
			
			int w = encontrarW();
			adyacentes = matriz.obtenerAdyacentes(w);
			conjuntoS.add(w);
			conjuntoVS.remove(conjuntoVS.indexOf(w));
			
			for (Integer nodo : conjuntoVS) {
				
				if (adyacentes[nodo] != Integer.MAX_VALUE) {
					int aux = distancias[nodo];
					distancias[nodo] = Math.min(distancias[nodo], distancias[w] + adyacentes[nodo]);
					if (aux != distancias[nodo]) 
						predecesores[nodo] = w;
				}	
			}
		}
	}
	
	public int encontrarW() {
		
		int min = conjuntoVS.get(0);
		
		for (Integer nodo : conjuntoVS) {
			if (distancias[nodo] < distancias[min])
				min = nodo;
		}
		
		return min;
	}
	
	public ArrayList<Integer> obtenerCamino(int nodo) {
		
		ArrayList<Integer> camino = new ArrayList<Integer>();
		
		camino.add(nodo);

		while (predecesores[nodo] != Integer.MAX_VALUE && predecesores[nodo] != nodoInicial-1) {
			camino.add(0, predecesores[nodo]);
			nodo = predecesores[nodo];
		}
		
		camino.add(0, nodoInicial-1);
		
		if (predecesores[nodo] == Integer.MAX_VALUE)
			return null;
		
		return camino;
	}
	
}
