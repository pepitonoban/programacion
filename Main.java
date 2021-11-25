
public class Main {

	public static void main(String[] args) {

//		int[][] matriz = {
//				{Integer.MAX_VALUE,10,Integer.MAX_VALUE,30,100},
//				{Integer.MAX_VALUE,Integer.MAX_VALUE,50,Integer.MAX_VALUE,Integer.MAX_VALUE},
//				{Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,10},
//				{Integer.MAX_VALUE,Integer.MAX_VALUE,20,Integer.MAX_VALUE,60},
//				{Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
//		};
//		
		/*int [][] matriz2 = {
                {Integer.MAX_VALUE,4,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,8},
                {4,Integer.MAX_VALUE,8,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,11},
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,2,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,6,7},
                {Integer.MAX_VALUE,8,2,Integer.MAX_VALUE,7,Integer.MAX_VALUE,4,Integer.MAX_VALUE,Integer.MAX_VALUE},
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,7,Integer.MAX_VALUE,9,Integer.MAX_VALUE,14,Integer.MAX_VALUE},
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,9,Integer.MAX_VALUE,10,Integer.MAX_VALUE,Integer.MAX_VALUE},
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,4,14,10,Integer.MAX_VALUE,2,Integer.MAX_VALUE},
                {Integer.MAX_VALUE,Integer.MAX_VALUE,6,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,2,Integer.MAX_VALUE,1},
                {8,11,7,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,1,Integer.MAX_VALUE},
        };*/
		
//		MatrizDeAdyacencia mat = new MatrizDeAdyacencia(matriz);
//		Dijkstra dijkstra = new Dijkstra(mat, 1);
//		dijkstra.dijkstra();
//		System.out.println(dijkstra.obtenerCamino(4));
//		
		/*MatrizDeAdyacencia mat2 = new MatrizDeAdyacencia(matriz2);
		Prim prim = new Prim(mat2);
		prim.prim().mostrarMatriz();*/
//
//		Kruskal kruskal = LectorDeGrafo.leerAristas("entrada00.txt");
//		
//		kruskal.kruskal();
		

//		int[][] matrizFloyd = { { Integer.MAX_VALUE, 8, 5 }, { 3, Integer.MAX_VALUE, Integer.MAX_VALUE },
//				{ Integer.MAX_VALUE, 2, Integer.MAX_VALUE } };
//		
//		MatrizDeAdyacencia mat = new MatrizDeAdyacencia(matrizFloyd);
//		
//		Floyd floyd = new Floyd(mat);
//		
//		floyd.floyd();
//		
//		int[][] matrizWarshall = { { Integer.MAX_VALUE, 8, 5 }, { 3, Integer.MAX_VALUE, Integer.MAX_VALUE },
//				{ Integer.MAX_VALUE, 2, Integer.MAX_VALUE } };
//		
//		MatrizDeAdyacencia mat = new MatrizDeAdyacencia(matrizWarshall);
//		
//		Warshall warshall = new Warshall(mat);
//		
//		warshall.warshall();
		
//		int m = Integer.MAX_VALUE;

//        int[][] matrizColoreo = {
//                { m, 1, m, m, m, 1, m, m, m ,m },
//                { 1, m, m, m, 1, m, m, m, m ,m },
//                { m, m, m, m, m, 1, 1, m, m ,m },
//                { m, m, m, m, 1, m, m, 1, m ,m },
//                { m, 1, m, 1, m, m, m, m, 1 ,m },
//                { 1, m, 1, m, m, m, 1, m, 1 ,1 },
//                { m, m, 1, m, m, 1, m, m, m ,1 },
//                { m, m, m, 1, m, m, m, m, 1 ,m },
//                { m, m, m, m, 1, m, m, 1, m ,1 },
//                { m, m, m, m, m, 1, 1, m, 1 ,m },
//        };
        
//        int[][] matrizColoreo = {
//                { m, 1, 1, m, m, m, m, m, m },
//                { 1, m, m, 1, m, m, m, m, m },
//                { 1, m, m, 1, m, m, m, m, m },
//                { m, 1, 1, m, 1, 1, m, m, m },
//                { m, m, m, 1, m, 1, 1, m, m },
//                { m, m, m, 1, m, m, m, 1, m },
//                { m, m, m, m, 1, m, m, 1, 1 },
//                { m, m, m, m, m, 1, 1, m, 1 },
//                { m, m, m, m, m, m, 1, 1, m }
//        };
//        
//        MatrizDeAdyacencia matriz = new MatrizDeAdyacencia(matrizColoreo);
//
//        Coloreo coloreo = new Coloreo(matriz);
//        coloreo.coloreoWelshPowell();
//		
//		int[][] matrizColoreo = {
//                { m, 1, m, m, m, m, m, m, 1, m, m, m, m },
//                { 1, m, 1, m, m, 1, m, m, m, m, m, m, m },
//                { m, m, m, 1, m, m, m, m, m, m, m, m, m },
//                { m, m, 1, m, m, m, m, m, m, m, m, m, m },
//                { m, m, m, m, m, 1, m, m, 1, m, m, m, m },
//                { m, 1, m, m, 1, m, 1, m, m, 1, m, m, m },
//                { m, m, m, m, m, 1, m, 1, m, m, m, m, m },
//                { m, m, m, m, m, m, 1, m, m, m, m, m, m },
//                { 1, m, m, m, 1, m, m, m, m, 1, m, m, m },
//                { m, m, m, m, m, 1, m, m, 1, m, 1, m, m },
//                { m, m, m, m, m, m, m, m, m, 1, m, m, m },
//                { m, m, m, m, m, m, m, m, m, m, m, m, 1 },
//                { m, m, m, m, m, m, m, m, m, m, m, 1, m },
//        };
//		
//		MatrizDeAdyacencia matriz = new MatrizDeAdyacencia(matrizColoreo);
//		
//		RecorridoBFS recorrido = new RecorridoBFS(matriz);
//		
//		recorrido.recorrerGrafo();
		
		int m = Integer.MAX_VALUE;
		
      int[][] matrizVialidad = {
      { m, 5, 10, 80, 90},
      { 5, m, 70, 60, 50},
      { 10, 70, m, 8, 20},
      { 80, 60, 8, m, 10},
      { 90, 50, 20, 10, m},
      };
      
      MatrizDeAdyacencia matriz = new MatrizDeAdyacencia(matrizVialidad);
      Prim prim = new Prim(matriz);
      prim.prim().mostrarMatriz();
	}
}
