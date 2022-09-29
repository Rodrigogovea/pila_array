public class pila 
{
    int[] stack = new int[10];
    int posicion = 0;
    int max = 9;
    boolean vacia = true;
    public void push(int dato)
    {
        if(posicion > max)
            System.out.println("La pila ya está llena!!!");
        else
        {
            stack[posicion] = dato;
            posicion++;
            vacia=false;
        }
        
    }
    public void pop()
    {
        if(verificarVacia())
            System.out.println("No hay elementos que sacar!");
        else
        {
            if(posicion == 0)
            {
                stack[posicion] = 0;
                System.out.println("Pila vacia!");
                vacia = true;
            }   
            else
            {
                System.out.println("El elemento a sacar es: " + stack[posicion-1]);
                stack[posicion-1] = 0;
                posicion--;
            }
            
        }
    }
    public void mostrarElementos()
    {
        if(verificarVacia())
            System.out.println("La pila está vaciá!");
        else
        {
            for(int i=(posicion-1); i>=0; i--)
            {
                System.out.println("|" + stack[i] +"|");
                System.out.println("----");
            }
        }
    }
    public boolean verificarVacia()
    {
        return this.vacia;
    }
}
