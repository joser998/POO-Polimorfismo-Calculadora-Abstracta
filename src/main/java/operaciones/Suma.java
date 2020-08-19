package operaciones;

public class Suma extends Calculadora_Abstracta{
    
    //Sobre escritura de metodo operaciones
    @Override
    public void operaciones(){
        System.out.println("Suma: "+(numero1 + numero2));
    }
}
