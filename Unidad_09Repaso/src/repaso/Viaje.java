package repaso;

import java.util.ArrayList;

public class Viaje implements Coste{
	private int codigo;
	private String nombre;
	private String horaSalida;
	private String horaRegreso;
	private ArrayList<Parada>lista;
	
	Viaje(){
		
	}
	Viaje(int c,String n,String hS,String hR,ArrayList<Parada>l){
		this.codigo=c;
		this.nombre=n;
		this.horaSalida=hS;
		this.horaRegreso=hR;
		this.lista=l;
	}
	
	
	public String toString(){
		String par="";
		for(int i=0;i<this.lista.size();i++){
			
			par=par+this.lista.get(i).getNombre()+
					"-hora bajada: "+lista.get(i).getHoraBajada()
					+"- hora subida: "+lista.get(i).getHoraSubida();
		}
		return "El viaje "+getNombre()+" con codigo "+getCodigo()+" empieza a las "+getHoraSalida()+
				" y finalizará a las "+getHoraRegreso()+" con las siguientes paradas: \n"+par;
			
	}
	
	public  boolean buscarParada(Parada p){
		boolean encontrada=false;
		for(int i=0;i<this.lista.size() && encontrada==false ;i++){
			if(this.lista.get(i).equals(p)){
				encontrada=true;
			}
		}
		return encontrada;
	}
	public void añadirParada(Parada p){
		if(buscarParada(p)==false){
			this.lista.add(p);
		}
	}
	
	public void quitarParada(Parada p){
		if(this.buscarParada(p)==true){
			for(int i=0;i<this.lista.size() ;i++){
				if(this.lista.get(i).equals(p)){
					this.lista.remove(i);
				}
			}
		}
	}
	//Acccesadores
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}
	public String getHoraRegreso() {
		return horaRegreso;
	}
	public void setHoraRegreso(String horaRegreso) {
		this.horaRegreso = horaRegreso;
	}
	public ArrayList<Parada> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Parada> lista) {
		this.lista = lista;
	}
	
	public static double restarHoras(String hourS,String hourR){
		 double horas = 0;
		double minutos = 0;
		 String horasS=hourS.substring(0,2);
		 String minutosS=hourS.substring(3,5);
		 String horasR=hourR.substring(0,2);
		 String minutosR=hourR.substring(3,5);
		 double hS=Double.parseDouble(horasS);
		 double hR=Double.parseDouble(horasR);
		 double mS=Double.parseDouble(minutosS);
		 double mR=Double.parseDouble(minutosR);
		 if(hS<hR){
			 horas=(hR-hS);}
		else{
			horas=(24+(hR-hS));	
			 }
		 if(mS<mR){
			 minutos=(mR-mS);
		 }
		 else{
			 minutos=(60+(mR-mS));
			 horas--;
		 }
		minutos=minutos/60;
		double tiempoHoras=horas+minutos;
		//System.out.printf("Duracion del viaje pasada a horas: %.2f \n",tiempoHoras);
		 return tiempoHoras;
	 }
	@Override
	
	public double coste() {
		double coste=0;
		//al tener la interfaz cada parada coge el metodo suyo
		for(int i=0;i<this.lista.size();i++){
			 coste+=lista.get(i).coste();
		 }
		double costeTiempo=(restarHoras(horaRegreso,horaSalida))*50;
	/*
		for(int i =0;i<lista.size();i++){
			Parada act=lista.get(i);
			ParadaGuiada p=(ParadaGuiada) act;
			if(p.getTipo().equals("actividad")){
				costeActividades+=lista.get(i).coste();
			}
		}
		*/
		return coste+costeTiempo;
	}
	
}
