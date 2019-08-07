package algoritmos;

    import java.util.Scanner;

public class Calculador01 {

    
    public static void main(String[] args) {
     int nro1,nro2,resu1 = 0;
     String ope;
        ope = "";
     System.out.println("Ingrese el 1er. valor");
     Scanner ingreso = new Scanner(System.in);
     nro1= ingreso.nextInt();
     System.out.println("Ingresa el 2do. valor");
     nro2= ingreso.nextInt();
     System.out.println("Ingresar el operador");
     ope= ingreso.next();
     if (null != ope)switch (ope) {
            case "+":
                resu1 = nro1 + nro2;
                break;
            case "-":
                resu1 = nro1 - nro2;
                break;
            case "*":
                resu1 = nro1 * nro2;
                break;
            case "/":
                if (nro2==0){
                    while (nro2==0){
                        System.out.println("Ingresa correctamente el digito");
                        nro2 = ingreso.nextInt();
                    }
                }      resu1 = nro1 / nro2;
                break;
            default:
                break;
        }
        System.out.println("El resultado es : "+ resu1);
    }
    
}
