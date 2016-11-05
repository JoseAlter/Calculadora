import java.util.Scanner;
public class calculadora {
    public static void main(String []agrs)
    {

        int op=0;
       double s,r,m,d;
  
        do{
            System.out.print("\n***CALCULADORA***\n" );
	System.out.print("Elige una opcion\n" );
	System.out.print("1.- Suma\n" );
	System.out.print("2.- Resta\n" );
	System.out.print("3.- Multiplicacion\n" ) ;
	System.out.print("4.-Division\n" );
	System.out.print("5.-Ver Bitacora\n" );
	System.out.print("6.-Borrar Bitacora\n" );
	System.out.print("7.-Salir\n" );
Scanner entrada=new Scanner(System.in);
double a=0,b=0;
	op=entrada.nextInt();
            switch(op)
            {
                case 1:
	System.out.println("ingrese un numero");
                    a=entrada.nextDouble();
	System.out.println("ingrese un numero");
	    b=entrada.nextDouble();
                    s=a+b;
                      System.out.println("La suma es:"+s +"\n");
               
                    break;
                case 2:
                    System.out.println("ingrese un numero");
                    a=entrada.nextDouble();
	                   System.out.println("ingrese un numero");
	    b=entrada.nextDouble();
                    r=a-b;
                    System.out.println("La resta es:"+r);
               
                    break;
                case 3:
                    System.out.println("ingrese un numero");
                    a=entrada.nextDouble();
	                  System.out.println("ingrese un numero");
	                  b=entrada.nextDouble();
                    m=a*b;
                      System.out.println("La multiplicacion es:"+m);
                 
                    break;
                case 4:

                   System.out.println("ingrese un numero");
                    a=entrada.nextDouble();
	System.out.println("ingrese un numero");
	    b=entrada.nextDouble();
	    if (b!=0){
                    d=a/b;
                      System.out.println("La division es:"+d);
            
                      }
	     else{
		System.out.println("No se puede dividir dentro de cero");
    }

                    break;
          

            }
        }while(op!=7);
    }

}
