package repaso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuitaDuplicados {
			public static List<String> quita_duplicados(List<String> lista){
				int repetidos=0;
				boolean repetido;
				
				for(int i = 0; i<lista.size(); i++){
					repetido=false;
					for(int j=0; j<lista.size(); j++){
						if(lista.get(i).equals(lista.get(j)))
							repetidos++;
						if(repetidos>1){
							repetido=true;
							lista.remove(j);
							repetidos--;
							j--;
						}
					}
					if(repetido==true){
						lista.remove(i);
						i--;
						repetido=false;
					}
					repetidos=0;
				}
				return lista;
			}
			
			public static void main(String[] args) {
				ArrayList<String> lista = new ArrayList<String>();
				Collections.addAll(lista, "a","e","b","c","a","d","c");
				System.out.println(quita_duplicados(lista));

			}

}
