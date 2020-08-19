package operaciones;

public class Multiplicacion extends Calculadora_Abstracta{
    
    //Sobre escritura de metodo operaciones
    @Override
    public void operaciones(){
        System.out.println("Multiplicacion: "+(numero1 * numero2));
    }
}
