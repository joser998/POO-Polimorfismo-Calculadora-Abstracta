package operaciones;

public class Division extends Calculadora_Abstracta{
    
    //Sobre escritura de metodo operaciones
    @Override
    public void operaciones(){
        System.out.println("Division: "+(numero1 / numero2));
    }
}
