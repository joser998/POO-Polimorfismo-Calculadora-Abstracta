package principal;
import operaciones.Calculadora_Abstracta;
import operaciones.Division;
import operaciones.Multiplicacion;
import operaciones.Resta;
import operaciones.Suma;

public class Principal {
    public static void main(String[] args) {
        
       Calculadora_Abstracta apuntoObjetoSuma = new Suma();
       apuntoObjetoSuma.pedirDatos();
       apuntoObjetoSuma.operaciones();
        
       Calculadora_Abstracta apuntoObjetoResta = new Resta();
       apuntoObjetoResta.pedirDatos();
       apuntoObjetoResta.operaciones();
       
       Calculadora_Abstracta apuntoObjetoMultiplicacion = new Multiplicacion();
       apuntoObjetoMultiplicacion.pedirDatos();
       apuntoObjetoMultiplicacion.operaciones();
       
       Calculadora_Abstracta apuntoObjetoDivision = new Division();
       apuntoObjetoDivision.pedirDatos();
       apuntoObjetoDivision.operaciones();
    }
}
