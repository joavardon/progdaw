import java.util.Scanner;


public class JavaCal {

    public static void main(String[] args) {
        //Declaramos dos variables enteras.
        int dividendo;
        int divisor;
        //Utilizamos Scanner para capturar valores desde el teclado.
        Scanner num = new Scanner(System.in);
        //Utilizamos "try" para controlar posibles errores de entrada de datos.
        try {
            //Procedemos a capturar los valores.
            System.out.print("Ingresa el dividendo: ");
            dividendo = num.nextInt();
            System.out.print("Ingresa el divisor: ");
            divisor = num.nextInt();
            //Despu�s de obtener los datos llamamos nuestra funci�n.
            calculo(dividendo, divisor);
        } catch (Exception e) {
            System.out.println("Error de datos: " + e);
        }
    }
    //Creamos nuestra funci�n sin retorno.
    //La funci�n requerir� 2 par�metros.
    static void calculo(int dividendo, int divisor){
        int resto;
        int cociente = 0;
        //Condici�n en caso que n�mero sea negativo o cero.
        if(divisor <= 0){
            System.out.println("No se puede realizar operaci�n.");
        }
        else{
            //Arreglos para mejorar el formato de impresi�n.
            int y = dividendo - divisor;
            System.out.println("(" + dividendo + "/" + divisor + ")" );
            System.out.print("(" + dividendo + "-" + divisor + "=" + y + ")" );
            resto = dividendo;
            //Un bucle para realizar los c�lculos necesarios.
            while (resto >= divisor) {
                resto -= divisor;
                int var = resto - divisor;
                ++cociente;
                //Por cada ciclo imprimimos los valores intermedios.
                if(resto > divisor){
                    System.out.print("("+ resto + "-" + divisor + "=" + var + ")");
                }
                
            }
            //Al termina el ciclo nos retorna los valores finales.
            System.out.println("\nCociente: " + cociente + " ; " + "Resto: " + resto);
        }
    }
}