import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ep = new Scanner(System.in);
        ArrayList<Jugador> seleccion = new ArrayList<Jugador>();

        int op = 0;

        do{
        System.out.println("Ingrese el id del jugador: ");
        int iding = ep.nextInt();
        ep.nextLine();
        System.out.println("Ingrese el nombre del jugador: ");
        String nombreing = ep.nextLine();
        System.out.println("Ingrese el apellido del jugador: ");
        String apellidoing = ep.nextLine();
        System.out.println("Ingrese la edad del jugador: ");
        int edading = ep.nextInt();
        ep.nextLine();
        System.out.println("Ingrese el Dorsal del jugador");
        int Dorsaling = ep.nextInt();
        ep.nextLine();
        System.out.println("Ingrese el Demarcacion del jugador");
        String Demarcacioning = ep.nextLine();
        System.out.println("Desea ingresar otro jugador? 1.Si 2.No");
        op = ep.nextInt();
        seleccion.add(new Jugador(iding , nombreing, apellidoing, edading, Dorsaling, Demarcacioning));
        } while (op != 1);

        for (Jugador jugador : seleccion) {
            System.out.println(jugador);
        }
    }
}
