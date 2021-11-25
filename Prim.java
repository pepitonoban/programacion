import java.util.ArrayList;
import java.util.List;

public class Prim {
	
	private MatrizDeAdyacencia matriz;
	private MatrizDeAdyacencia matrizResultado;
	private List<Integer> conjuntoG = new ArrayList<Integer>();
	private List<Integer> conjuntoMST = new ArrayList<Integer>();
	int costoTotal=0;

	public Prim(MatrizDeAdyacencia matriz) {
		this.matriz = matriz;
		this.matrizResultado = new MatrizDeAdyacencia(matriz.getTamanio());
		
		for(int i=0; i<matriz.getTamanio(); i++) 
			conjuntoG.add(i);
	}
	
	
	public MatrizDeAdyacencia prim() {
		
		int[] adyacentes;
		
		int nodoConectadoMin = 0;
		
		conjuntoMST.add(nodoConectadoMin);
		conjuntoG.remove(conjuntoG.indexOf(nodoConectadoMin));
		
		int[][] matResultado = matrizResultado.getMatriz();
		
		while(!conjuntoG.isEmpty()) {
			
			int min = Integer.MAX_VALUE;
			int nodoInicio = 0;
			
			for (Integer nodoMST : conjuntoMST) {
				
				adyacentes = matriz.obtenerAdyacentes(nodoMST);
				for (Integer nodoG : conjuntoG) {
					if(adyacentes[nodoG] < min) {
						min = adyacentes[nodoG];
						nodoConectadoMin = nodoG;
						nodoInicio = nodoMST;
					}
				}
			}
			
			if (min != Integer.MAX_VALUE) {
				costoTotal += min;
				matResultado[nodoInicio][nodoConectadoMin] = min;
				matResultado[nodoConectadoMin][nodoInicio] = min;
			}
			
			conjuntoMST.add(nodoConectadoMin);
			conjuntoG.remove(conjuntoG.indexOf(nodoConectadoMin));
		}
		
		matrizResultado.setCostoMinimo(costoTotal);
		
		return matrizResultado;
	}
	
}
