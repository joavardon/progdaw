package ejercicio3;

import java.util.ArrayList;


public class Log {
	ArrayList<LineaLog>milog=new ArrayList<LineaLog>();

	Log(){
		
	}
	
	public String toString(){
		String cadena="";
		for (int i=0;i<milog.size();i++){
			cadena=cadena+milog.get(i)+"\n";
		}
		return cadena;
	}
	
	public  void add(LineaLog l){
		if(!milog.contains(l))
		milog.add(l);
		else
		System.out.println("Ya hay uno con ese ID");
	}

	public ArrayList<LineaLog> getMilog() {
		return milog;
	}

	public  void setMilog(ArrayList<LineaLog> milog) {
		this.milog = milog;
	}
	
	
}
