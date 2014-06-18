package repaso;

import java.util.ArrayList;
import java.util.Collections;

public class Quita_Duplicados_S {

	public static ArrayList<String>quitarDuplicados(ArrayList<String> n){
		Collections.sort(n);
		for(int i=1;i<n.size();i++){
			if(n.get(i).equals(n.get(i-1))){
				n.remove(n.get(i-1));
				i--;
			}
		}
		return n;	
	}
	public static void main(String[] args) {
		ArrayList<String>n=new ArrayList<String>();
		n.add("ana");
		n.add("pepe");
		n.add("ana");
		n.add("pepe");
		n.add("elisa");
		n.add("maria");
		n.add("juan");
		
		System.out.println(quitarDuplicados(n));

	}

}
