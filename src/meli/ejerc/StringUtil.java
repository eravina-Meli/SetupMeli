package meli.ejerc;

public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c,int n)
	{
		String res ="";
		for (int i =0; i<n; i++){
			res = res + c;
		}
		return res;
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c)
	{
		String cadena = "";
		int cantidadC = Character.getNumericValue(c);
		int cant = n-cantidadC;
		for (int i = 1; i < cant; i++){
			cadena += c;
		}
		cadena +=s;
		return cadena;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{
		String[] arrayStrings = new String[arr.length];
		for (int i =0; i < arr.length; i++){
			arrayStrings[i] = Integer.toString(arr[i]);
		}

		return arrayStrings;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{
		int[] arrayInt = new int[arr.length];
		for (int i =0; i < arr.length; i++){
			arrayInt[i] = Integer.parseInt(arr[i]);
		}

		return arrayInt;
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int maximo=0;
		for (int i =0; i < arr.length; i++){
			if(arr[i].length() > maximo)
				maximo = arr[i].length();
		}

		return maximo;
	}

	/*public static void main(String[] args) {
		String[] arg = {"ferreira","pedrobustamante","fndacurti"};
		int l = maxLength(arg);
		System.out.println(l);
	}*/

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)
	{
		int longitud = maxLength(arr);//12
		int max = 0;
		int longitudTotal =0;
		for (int i=0; i < arr.length; i++){
			if(arr[i].length() < longitud){
				max = arr[i].length();
				longitudTotal = longitud - max;
				if(longitud > max)
					arr[i] = lpad((arr[i].toString()), longitudTotal+1, c);
			}
	}
	}

	public static void main(String[] args) {
		String[] array = {"cacho","asdfasdfsadfas","ferre"};
		lNormalize(array,'0');
		for (int i=0; i< array.length; i++){
			System.out.println(array[i]);
		}
	}
}
