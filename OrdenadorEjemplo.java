
package ordenador.ejemplo;
import java.util.Scanner;

/**
 *
 * @author sverdecadilla
 */
public class OrdenadorEjemplo {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Tipo: ");
        String tipo = sc.nextLine();
        System.out.println("Marca: ");
        String marca = sc.nextLine();
        System.out.println("Pulgadas: ");
        float pulgadas = sc.nextFloat();
        System.out.println("Velocidad: ");
        int velocidad = sc.nextInt();
        System.out.println("Memoria: ");
        int memoria = sc.nextInt();

        OrdenadorF ejemplo = new OrdenadorF(new Mouse(tipo), new Screen(marca, pulgadas), new Cpu(velocidad, memoria));
        ejemplo.amosar();
 
    }
    }
    

