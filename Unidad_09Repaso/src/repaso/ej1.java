package repaso;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class ej1 {


	public static void main(String[] args) {
		ArrayList<String> lista1=new ArrayList <String>();
		lista1.add("a");
		lista1.add("b");
		lista1.add("Q");
		lista1.add("N");
		lista1.add("A");
		lista1.add("N");
		lista1.add("c");
		lista1.add("x");
		lista1.add("Q");
		lista1.add("b");
		lista1.add("A");
		lista1.add("X");
		lista1.add("A");
		lista1.add("X");
		lista1.add("A");
		lista1.add("a");
		lista1.add("W");
		lista1.add("b");
		/*
		HashSet<String> listaPrueba=new HashSet<String>();
		listaPrueba.addAll(lista1);
		listaPrueba=deja_may_hash(listaPrueba);
		System.out.println(listaPrueba);*/
		ArrayList<String> lista2=new ArrayList <String>();
		lista2.addAll(lista1);
		
		ArrayList<String> lista3=new ArrayList <String>();
		lista3.addAll(lista1);
		
		lista2=deja_may(lista2);
		lista2=quita_duplicados(lista2);
		System.out.println(lista2);
		lista3=deja_min(lista3);
		lista3=quita_duplicados(lista3);
		System.out.println(lista3);
		int totales=cuenta(lista2,lista3);
		//int totales2=listaPrueba.size();
		System.out.println(totales);
	}
	
/*	
private static HashSet<String> deja_may_hash(HashSet<String> listaPrueba) {
	HashSet<String> listamay=new HashSet<String>();
	String[]may={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	Iterator <String>it=listaPrueba.iterator();
	
	while(it.hasNext()){
		String c=it.next();
		
		for(int i=0;i<may.length;i++){
			if(c.equals(may[i])){
				listamay.add(may[i]);
			}
		}
	}
	
	return listamay;
	}*/


public static int cuenta(ArrayList<String> l2,ArrayList<String> l3){
		
			return l2.size()+l3.size();

	}

public static ArrayList<String> deja_may(ArrayList<String> l2){
	
	ArrayList<String>listamay=new ArrayList<String>();
	String[]may={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	Iterator <String>it=l2.iterator();
	
	while(it.hasNext()){
		String c=it.next();
		
		for(int i=0;i<may.length;i++){
			if(c.equals(may[i])){
				listamay.add(may[i]);
			}
		}
	}
	
	return listamay;
	
}


	public static ArrayList<String> deja_min(ArrayList<String> l3){
		
		ArrayList<String>listamin=new ArrayList<String>();
		String[]min={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		Iterator <String>it=l3.iterator();
		
		while(it.hasNext()){
			String c=it.next();
			for(int i=0;i<min.length;i++){
				if(c.equals(min[i])){
					listamin.add(min[i]);
				}
			}
		}
		
		return listamin;
		
	}
	public static ArrayList<String> quita_duplicados(ArrayList<String> lista){
		int repetidos=0;

		for(int i = 0; i<lista.size(); i++){
			
			for(int j=0; j<lista.size(); j++){
				if(lista.get(i).equals(lista.get(j)))
					repetidos++;
				if(repetidos>1){
					
					lista.remove(j);
					repetidos--;
					j--;
				}
			}
			
			repetidos=0;
		}
		return lista;
	}
	
	

		
}


