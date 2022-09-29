import java.util.Scanner;
public class pilas 
{
    public static void main(String[] args) 
    {
        pila miPila = new pila();
        int opc = 0;
        int dato = 0;
        Scanner lector = new Scanner(System.in);
        while(opc!=4)
        {
            System.out.println("Menu"
                    + "\n1.- Insertar elemento"
                    + "\n2.- Sacar elemento"
                    + "\n3.- Mostrar elementos"
                    + "\n4.- Salir");
            opc = lector.nextInt();
            switch(opc)
            {
                case 1:
                    System.out.print("Teclea el elemento a insertar: ");
                    dato = lector.nextInt();
                    miPila.push(dato);
                    break;
                case 2:
                    miPila.pop();
                    break;
                case 3:
                    miPila.mostrarElementos();
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Está opcióon no está disponible.");
                    break;
            }
        }
        lector.close();
    }
}
