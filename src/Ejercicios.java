public class Ejercicios
{
	//deveulve true si "numero" es par y false de lo contrario
	static boolean esPar(int numero)
	{//comparamos si el numero para ver si es par o impar
		if(numero%2==0) 
			return true; 
		else
			return false; 
	}
	
	//devuelve "paquetillo" si lempiras es menor que 50
	//devuelve "paquetin" si lempiras es menor que 100
	//devuelve "paquetote" si lempiras es menor que 200
	//de lo contrario devuelve paqueton
	//nota: solo aceptan minusculas
	static String churches(int lempiras)
	{
		if(lempiras<50)//usamos if para obtener la respuesta que nos pide
		{
			return "paquetillo";
		}
		else 
		if(lempiras<100)
		{
			return "paquetin";
		}
		else 
		if(lempiras<200)
		{
			return "paquetote";
		}
		return "paqueton";
	
	}
	
	//devuelve el factorial de "num"
	static int factorial(int num)
	{// usamos if para sacar el factorial de "num"
		if(num==0) 
					
			return 1;
		else//si el numero es distinto a cero se va a calcular el factorial
			return num * factorial(num-1); 
	}
	
	//devuelve el elemento de "arr" en la posicion "pos"
	static int getElemento(int arr[],int pos)
	{ //colocamos la variable "pos" adentro del arreglo
		return arr[pos];
	}
	
	//devuelve el elemento de "arr" en la posicion ["col"] ["fila"]
	static int getElemento(int arr[][],int col,int fila)
	{//las variables"col" y "fila" las usamos para dar una posicion en el arreglo bidimencional
		return arr[col][fila];
	}
	
	//devuelve el atributo "x" de "MiClase"
	static int getX(MiClase mi_clase)
	{
		return mi_clase.x;//devolvemos el atributo "x"
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	static int implementarGetXPor2(MiClase mi_clase)
	{
		return mi_clase.getXPor2();//no modificamos la funcion
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	static int implementarGetXMasY(MiClase mi_clase, int y)
	{
		return mi_clase.getXMasY(y);//no modificamos la funcion
	}
	
	//devuelve la funcion fibonacci de "num"
	//nota: puedes consultar la funcion en http://es.wikipedia.org/wiki/Sucesi%C3%B3n_de_Fibonacci
	static int fibonacci(int num)
	{
		if(num==0)
		{//usamos if y si el numero es cero nos devuelve cero
			return 0;
		}//si el numero es uno nos devuelve uno,			 
		if(num==1)	
		{
			return 1;
		}
		else// y cualquier otro numero se hace la funcion fibonacci
			return fibonacci(num-1) + fibonacci(num-2);
	}
	
	//realizar la siguiente funcion recursiva:
	//funcionRecursiva(n) = funcionRecursiva(n-1)*2+1
	//donde: funcionRecursiva(0) = 0 y funcionRecursiva(1) = 2
	static int funcionRecursiva(int num)
	{
		if(num==0)//si el numero es cero nos devuelve cero
		{			
			return 0;
		}//si el numero es uno nos devuelve dos
		if(num==1)
		{
			return 2;
		}//cualquier otro numero se realiza la funcion recursiva
		return funcionRecursiva(num-1)*2+1;
	}
	
	
	public static void main(String[] args)
	{

	}

}
