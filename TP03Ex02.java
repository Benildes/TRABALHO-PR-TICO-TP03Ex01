import static java.lang.System.out;

public class TP03Ex02 {
    public static void main(String[] args) {
        Hora hora = new Hora();
        
        out.println(hora.getHora1());        
        out.println(hora.getHora2());
        out.println(hora.getSegundos() + " Segundos");
    }    
}
