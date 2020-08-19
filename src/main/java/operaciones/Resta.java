package operaciones;

public class Resta extends Calculadora_Abstracta{
    
    //Sobre escritura de metodo operaciones
    @Override
    public void operaciones(){
        System.out.println("Resta: "+(numero1 - numero2));
    }
}
