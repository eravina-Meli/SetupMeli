package meli.ejerc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RadixSortEjerc
{
	public static void radixSort(int []arr)
	{
		HashMap<Character, ArrayList<String>> mapa = new HashMap<>();

		//Llenar mapa con listas
		for (int i = 0; i < 10; i++) {
			mapa.put(Integer.toString(i).charAt(0) ,new ArrayList<String>());
		}


		String[] arrStr = StringUtil.toStringArray(arr);

		StringUtil.lNormalize(arrStr, '0');

		for (int i = 0; i < arrStr[1].length(); i++) {
			for (String s: arrStr) {
				char c = s.charAt(arrStr[1].length() - 1 - i);
				mapa.get(c).add(s);

			}

			//Recorrer listas
			ArrayList<String> arrStrAux = new ArrayList<>();
			for (Map.Entry<Character,ArrayList<String>> entry:  mapa.entrySet()) {
				for (String n:entry.getValue()) {
					arrStrAux.add(n);
				}
				entry.getValue().clear();
			}

			arrStr = arrStrAux.toArray(new String[arrStr.length]);
		}

		arr = StringUtil.toIntArray(arrStr);

		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+(i<arr.length-1?",":""));
		}
	}

	public static void main(String[] args)
	{
		int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
		radixSort(arr);
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+(i<arr.length-1?",":""));
		}
	}
}
