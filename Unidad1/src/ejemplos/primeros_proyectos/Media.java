package ejemplos.primeros_proyectos;

public class Media {
public static void main(String[] args){
	float numero1, numero2;
	float media;
	
	numero1=4;
	numero2=7.5f;//para decir que es literal float (32 bit) y no double(64 bit)
	
	media=(numero1+numero2)/2;
	System.out.println("La media es "+media);
	//fin
}
}
