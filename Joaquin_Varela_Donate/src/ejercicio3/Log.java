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
	
	public  void add(String l){
		LineaLog linea;
		boolean parar = false;
		linea=new LineaLog(l);//siestuviera dentro del bucle empezaria con id a cero siempre y simepre seria 1 su id
		do{
		linea.id++;
		if(!milog.contains(linea)){
			milog.add(linea);
			parar=true;
		}
		/*
		Iterator<LineaLog>ite=milog.iterator();
		while(ite.hasNext()){
			LineaLog id=ite.next();
			if(id.equals(linea)){
				linea.id++;
			}
		}*/
		/*
		for(int i=0;i<milog.size();i++){
			if(milog.get(i).equals(linea)){
				linea.id++;
			}
		}*/
		}while(parar==false);
		
	}

	public ArrayList<LineaLog> getMilog() {
		return milog;
	}

	public  void setMilog(ArrayList<LineaLog> milog) {
		this.milog = milog;
	}
	
	
}
