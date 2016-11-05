import java.util.Scanner;
public class calculadora {
    public static void main(String []agrs)
    {

        int op=0;
       double s,r,m,d;
       String [] dato= new String[30];
       		String n1;
       		String n2;
       		String n3;
       		String registrar;
       		int cont=0;
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
                      n1=String.valueOf(a);
	                    n2=String.valueOf(b);
	                    n3=String.valueOf(s);
	                       registrar=a+"+"+b+"="+s;
	                        dato[cont]=registrar;
	                         cont++;
                    break;
                case 2:
                    System.out.println("ingrese un numero");
                    a=entrada.nextDouble();
	                   System.out.println("ingrese un numero");
	    b=entrada.nextDouble();
                    r=a-b;
                    System.out.println("La resta es:"+r);
                    n1=String.valueOf(a);
                    n2=String.valueOf(b);
                    n3=String.valueOf(r);
                       registrar=a+"-"+b+"="+r;
                        dato[cont]=registrar;
                         cont++;
                    break;
                case 3:
                    System.out.println("ingrese un numero");
                    a=entrada.nextDouble();
	                  System.out.println("ingrese un numero");
	                  b=entrada.nextDouble();
                    m=a*b;
                      System.out.println("La multiplicacion es:"+m);
                      n1=String.valueOf(a);
	                    n2=String.valueOf(b);
	                    n3=String.valueOf(m);
	                       registrar=a+"*"+b+"="+m;
	                        dato[cont]=registrar;
	                         cont++;
                    break;
                case 4:

                   System.out.println("ingrese un numero");
                    a=entrada.nextDouble();
	System.out.println("ingrese un numero");
	    b=entrada.nextDouble();
	    if (b!=0){
                    d=a/b;
                      System.out.println("La division es:"+d);
                      n1=String.valueOf(a);
                      n2=String.valueOf(b);
                      n3=String.valueOf(d);
                         registrar=a+"+"+b+"="+d;
                          dato[cont]=registrar;
                           cont++;
                      }
	     else{
		System.out.println("No se puede dividir dentro de cero");
    }

                    break;
              case 5:

                    System.out.println("BITACORA DE OPERACIONES");

                    int z=0;
                    while(z!=cont){
                    System.out.println(z+"->"+dato[z]);
                    z++;
                        }

                    break;
                    case 6:
      System.out.println("Desea borrar los datos"+
                        "\n1.-si" +
                        "\n2.-no");
      int p=0;
      p=entrada.nextInt();
      switch  (p){
      case 1:
      int x=0;
      while(x!=p){
      dato[x]="";
      }
      System.out.println("Datos borrados");
      	break;
      case 2:
      System.out.println  ("continúe ");
      break;
      }
      	break;
            }
        }while(op!=7);
    }

}
