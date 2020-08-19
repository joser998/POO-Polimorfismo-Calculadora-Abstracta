package operaciones;
import java.util.Scanner;
public abstract class Calculadora_Abstracta {
    //Clase Scanner
    Scanner sc = new Scanner(System.in);
    //Atributos
    double numero1 = 0, numero2 = 0;
    //Constructor
    public Calculadora_Abstracta(){
    }
    
    //Metodo Pedir Datos al usuario
    public void pedirDatos(){
        System.out.print("Inserta numero: ");
        numero1 = sc.nextDouble();
        System.out.print("Inserta numero: ");
        numero2 = sc.nextDouble();
    }
    
    //Signatura de Metodo Abstracto
    public abstract void operaciones();
}
