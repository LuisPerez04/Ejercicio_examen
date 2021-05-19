package ejercicio_examen;
/**
 *
 * @author Luis Roman Perez Martinez
 */
public class EJERCICIO_EXAMEN {
//Atributos
    private static String Nombre;
    private static int Estrellas2;
    private static int Cantidad_Usuarios;
    private static Integer Tiempo;
    private static String Nivel;
    
    public EJERCICIO_EXAMEN (String Nombre,int Cantidad_Usuarios,int Tiempo,String Nivel,int Estrellas2){
        EJERCICIO_EXAMEN.Estrellas2 = Estrellas2;
        EJERCICIO_EXAMEN.Nivel = Nivel;
        EJERCICIO_EXAMEN.Nombre = Nombre;
        EJERCICIO_EXAMEN.Cantidad_Usuarios = Cantidad_Usuarios;
        EJERCICIO_EXAMEN.Tiempo = Tiempo;
    }
    
    public static int CALIDAD(){
        return Cantidad_Usuarios * Tiempo * Estrellas2;
    }
                    
    public static void main(String[] args) {
        EJERCICIO_EXAMEN mievaluacion = new EJERCICIO_EXAMEN("Meet", 2000, 5, "Libre", 1);
        System.out.println(CALIDAD());
    }
    
}
