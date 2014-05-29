package mediaMac;

import java.util.Arrays;

public class SmarthPhone extends Aparato {
	private String[]tecTrans;
	int numeroTrans;
	SmarthPhone(String numProd,String numSer,String sisOper,String nombre,double precioBase,String[]tecTr){
		super (numProd, numSer, sisOper, nombre,precioBase);
		this.numeroTrans=tecTr.length;;
		this.tecTrans=tecTr;
			
	}

	public String toString(){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<numeroTrans;i++){
			sb.append(tecTrans[i]);
			if(i<numeroTrans-1)sb.append(", ");
		}
		return super.toString()+" "+sb;
	}

	public String[] addTecnología(String tec){
	
		boolean esta=false;
		for(int i=0;i<this.numeroTrans;i++){
			if(this.tecTrans[i].toUpperCase().equals(tec.toUpperCase())){
				esta=true;
				break;
			}
		}
		
		if(!esta){
			this.numeroTrans++;//incremento valor de nuemro trans para que quepa una tecnologia mas
			String[] array=Arrays.copyOf(this.tecTrans, this.numeroTrans);//copio array pero con una tecnologia mas
			array[this.numeroTrans-1]=tec;//meto la nueva tecnologia en el ultimo
			this.tecTrans=array;
		}
		else{
			System.out.println("Esa tecnología ya está en la lista");
		}
		
		return this.tecTrans;
	}



	public String[] getTecTransm() {
		return Arrays.copyOf(tecTrans, numeroTrans);
	}

	public void setTecTransm(String[] tecTr) {
		//this.tecTrans=Arrays.copyOf(tecTr, tecTr.length+1);
		for(int i=0;i<tecTr.length;i++)
			this.tecTrans[i] = new String(tecTr[i]);
		this.numeroTrans=tecTr.length;//eso me fltaba
	}
	
	
}