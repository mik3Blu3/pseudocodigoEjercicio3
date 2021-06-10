import java.util.Scanner;
public class ejercicio3
{
    static Scanner entrada = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Ingreso un numero N a hallar el factorial ");
        int num = entrada.nextInt();
        if(num < 0 )
        {
            System.out.println("Al numero no se le puede obtener el factorial ");

        }else if( num == 0){
            System.out.println("El factorial del numero es: 0 ");

        }else{
            int aux = 1;
            int fact = 1;
            while(aux <= num){
                fact = fact*aux;
                aux = aux+1;
            }
            System.out.println("El factorial del numero "+num+" es "+fact);
        }       
    }

}