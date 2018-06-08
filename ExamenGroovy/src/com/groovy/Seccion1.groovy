package com.groovy



class Seccion1 {

	static main(args) {
		
		println "¡Hola Mundo!"
		
		
		Integer[]  arreglo= [ 8,6,7,2,1,8,6,8,7,1,9,7,7,10]
		ordena(arreglo);

	}
   
	static void ordena(Integer[] arreglo)
	{
		int auxiliar;
		Integer[] arregloOrdenado;
		for(int i = 2; i < arreglo.size(); i++)
		{
		  for(int j = 0;j < arreglo.size()-i;j++)
		  {
			if(arreglo[j] > arreglo[j+1])
			{
			  auxiliar = arreglo[j];
			  arreglo[j] = arreglo[j+1];
			  arreglo[j+1] = auxiliar;
			}
		  }
		}
		arregloOrdenado = arreglo;
		println arregloOrdenado;
				
	}
	
}
