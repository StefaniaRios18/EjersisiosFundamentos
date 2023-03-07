
package edu.ec.intsuperior.vista;


import java.util.*;
import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.parser.TokenType.CASE;
import javax.swing.JOptionPane;
public class APLICACION {
    public static void main(String[] args) throws IOException {
        menu();
    }
  
       public static void nentero ()
        throws IOException{
        Scanner leer = new Scanner(System.in);
        int n, cifras;
        char car;
        do{
            System.out.print("Introduce un número entero: ");
             n=leer. nextInt();
           cifras= 0;  
            while(n!=0){             
                    n = n/10;        
                   cifras++;          
            }
            System.out.println("El número tiene " + cifras+ " cifras"); 
            System.out.println("continuar");
            car = (char)System.in.read();
        }while(car!='n' && car != 'N');   
    }
       
     
      public static void Clavebanco (){
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        if (i != j && i != k && i != l && j != k && j != l && k != l) {
                            // Verificar si la suma de los dos dígitos intermedios es par
                            if ((j + k) % 2 == 0) {
                                System.out.println("" + i + j + k + l); // Imprimir la clave secreta
                            }
                        }
                    }
                }
            }
        }
    }
      
       public static void velocidad(){
    
double velocidad1,velocidad2;
Scanner x = new Scanner(System.in);
out.println("ingrese la velocidad en Km/h");
velocidad1 = x.nextDouble();
out.println("convirtiendo a metros.....");
velocidad2 = velocidad1*1000;
out.println(velocidad2);

}
       
       public static void validarcedula(){
 
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese su número de cédula: ");
    String cedula = sc.nextLine();

    if (cedula.length() == 10) {
      int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};
      int suma = 0;
      int digitoVerificador = Integer.parseInt(cedula.substring(9));
      for (int i = 0; i < 9; i++) {
        int digito = Integer.parseInt(cedula.substring(i, i + 1));
        int producto = digito * coeficientes[i];
        if (producto > 9) {
          producto -= 9;
        }
        suma += producto;
      }
      int resultado = suma % 10 == 0 ? 0 : 10 - (suma % 10);
      if (resultado == digitoVerificador) {
        System.out.println("La cédula es válida.");
      } else {
        System.out.println("La cédula no es válida.");
      }
    } else {
      System.out.println("El número de cédula ingresado no tiene 10 dígitos.");
    }
       }
       
       public static void diaslaborales() {
      Scanner sc = new Scanner(System.in);
      System.out.print("Introduce un día de la semana: ");
      String dia = sc.next();
      switch (dia.toLowerCase()) {
         case "lunes":
         case "martes":
         case "miércoles":
         case "jueves":
         case "viernes":
            System.out.println(dia + " es un día laboral.");
            break;
         case "sábado":
         case "domingo":
            System.out.println(dia + " no es un día laboral.");
            break;
         default:
            System.out.println("El valor introducido no es un día de la semana válido.");
      }
   }
       
        public static void supletorios() {
        double[] notas = {8.5, 6.7, 5.3, 7.8, 9.0, 4.2, 6.9, 6.1, 7.2, 8.3};
        int contadorSupletorios = 0;
        for (int i = 0; i < notas.length; i++) {
            double promedio = calcularPromedio(notas[i]);
            if (promedio < 7) {
                contadorSupletorios++;
            }
        }
        System.out.println("El número de estudiantes que se quedan a supletorios es: " + contadorSupletorios);
    }
    public static double calcularPromedio(double nota) {
        return nota;
    }
    
     public static void areaTriangulo() {

        Scanner sc = new Scanner(System.in);
        double a,b,c,p;

        System.out.print("Introduzca longitud del primer lado del triángulo: ");
        a = sc.nextDouble();

        System.out.print("Introduzca longitud del segundo lado del triángulo: ");
        b = sc.nextDouble();

        System.out.print("Introduzca longitud del tercer lado del triángulo: ");
        c = sc.nextDouble();

        p = (a+b+c)/2;
        
        System.out.println("Area -> " +  Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }

      public static void leerChar() throws IOException {

        char car1, car2;
        System.out.print("Introduzca primer carácter: ");
        car1 = (char)System.in.read(); //lee un carácter
        System.in.read();  //saltar el intro que ha quedado en el buffer                                
        System.out.print("Introduzca segundo carácter: ");
        car2 = (char)System.in.read(); //lee el segundo carácter

        if(car1 == car2){
           System.out.println("Son iguales");   
        }else{
           System.out.println("No son iguales");
        }        
    }
     
      public static void numeros() {
        Scanner sc = new Scanner(System.in);
        int num, count = 0;

        do {
            System.out.print("Introduce un número (introduce un número negativo para terminar): ");
            num = sc.nextInt();

            if (num >= 0 && num % 10 == 2) {
                count++;
            }
        } while (num >= 0);

        System.out.println("Se han leído " + count + " números acabados en 2.");
    }
      
       public static void NumerosPnc() {
 
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int pos = 0, neg = 0, cero = 0;
        int i;
                                                    
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                pos++;
            } else if (numeros[i] < 0) {
                neg++;
            } else {
                cero++;
            }
        }
 
        System.out.println("Positivos: " + pos);                                                                  
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cero);
    }
       
     public static void frase(){
      
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
         
        System.out.println("Escribe una frase");
        String frase=sn.next();
        String palabras[] = frase.split(" ");
         
        for(int i=0;i<palabras.length;i++){
            System.out.println(palabras[i]);
        }
       }
     public static void Cadena() {
        
        String texto=JOptionPane.showInputDialog(null, 
         "Introduce un texto, cadena vacia para terminar", 
        "Introducir texto",  JOptionPane.INFORMATION_MESSAGE);
        
        String cadenaResultante="";
        while(!texto.isEmpty()){       
            cadenaResultante+=texto;
            texto=JOptionPane.showInputDialog(null, 
           "Introduce un texto, cadena vacia para terminar", 
             "Introducir texto", 
       JOptionPane.INFORMATION_MESSAGE);
 
        }
         
        JOptionPane.showMessageDialog(null, 
          cadenaResultante, 
         "Resultado", 
     JOptionPane.INFORMATION_MESSAGE);
         
    }
      
     public static void Iva() {
        final double IVA = 0.21; // Constante del 21% de IVA
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el precio del producto: ");
        double precio = input.nextDouble();
        double precioFinal = precio + (precio * IVA);
        System.out.println("El precio final con IVA es: " + precioFinal);
    }
         
     public static void Multiplos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.println(num + " es múltiplo de dos.");
        } else {
            System.out.println(num + " no es múltiplo de dos.");
        }
        
        if (num % 3 == 0) {
            System.out.println(num + " es múltiplo de tres.");
        } else {
            System.out.println(num + " no es múltiplo de tres.");
        }
    }
         
     public static void NumerosP() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }
     
     public static void Enteros() {   
       Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo de dos dígitos: ");
        int num = sc.nextInt();

        if(num >= 10 && num <= 99) {
            int dig1 = num / 10;
            int dig2 = num % 10;
            int sum = dig1 + dig2;

            if(sum % 2 != 0) {
                System.out.println("La suma de los dígitos es impar.");
            } else {
                System.out.println("La suma de los dígitos es par.");
            }
        } else {
            System.out.println("El número no tiene dos dígitos.");
        }
    }

     public static void PedirFrase() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        StringBuilder builder = new StringBuilder();

        while (true) {
            System.out.println("Ingresa una frase (o cadena vacía para terminar):");
            input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            builder.append(input).append(" ");
        }

        System.out.println("Cadena resultante: " + builder.toString());
    }
              
     public static void MetrosCubicos() {
        
        Scanner entrada = new Scanner(System.in);
        
        double precioMetroCubico = 100; 
        double descuento = 0; 
        double precioTotal = 0; 
        
        
        System.out.print("Ingrese la cantidad de metros cúbicos a comprar: ");
        double cantidadMetrosCubicos = entrada.nextDouble();
        
       
        System.out.print("Ingrese el tipo de madera (A, B o C): ");
        String tipoMadera = entrada.next();
        
        double precioSinDescuento = cantidadMetrosCubicos * precioMetroCubico;
        
        if (cantidadMetrosCubicos > 30) {
            switch(tipoMadera) {
                case "A":
                    descuento = 0.04;
                    break;
                case "B":
                    descuento = 0.08;
                    break;
                case "C":
                    descuento = 0.1;
                    break;
                default:
                    System.out.println("Tipo de madera no válido.");
                    System.exit(0);
            }
            
        }
    }
    
              
    public static void nteclado() {
        Scanner sc = new Scanner(System.in);
        int n, contador = 0;
        System.out.print("Introduce un número entero (0 para acabar): ");
        n = sc.nextInt();      
        while (n != 0) {     
            contador++;                                   
            System.out.print("Introduce un número entero (0 para acabar): ");
            n = sc.nextInt(); 
        }
        System.out.println("Se han introducido " + contador + " números");
    }
    public static void menu(){
        Scanner leer=new Scanner(System.in);
        int op=0;
        do {
            System.out.println("Ingrese una opcion \n"
                    + "**********\n\n"
                    + "1.-\n"
                    + "2.-\n"
                    + "3.-\n"
                    + "4.-\n"
                    + "5.-\n"
                    + "6.-\n"
                    + "7.-\n"
                    + "8.-\n"
                    + "9.-\n"
                    + "10.-\n"
                    + "11.-\n"
                    + "12.-\n"
                    + "13.-\n"
                    + "14.-\n"
                    + "15.-\n"
                    + "16.-\n"
                    + "17.-\n"
                    + "18.-\n"
                    + "19.-\n"
                    + "20.-\n"
                    + "0.-Salir del Menu\n");
                    
        op=leer.nextInt();
        switch(op){
            case 1:
                nentero();
                break;
            case 2:
                Clavebanco();
                break;
            case 3:
                velocidad();
                break;
            case 4:
                validarcedula();
                break;
            case 5:
                diaslaborales();
                break;
            case 6:
                supletorios();
                break;
            case 7:
                calcularPromedio(0);
                break;
            case 8:
                areaTriangulo();
                break;
            case 9:
                leerChar();
                break;
            case 10:
                numeros();
                break;
            case 11:
                NumerosPnc();
                break;
            case 12:
                frase();
                break;
            case 13:
                Cadena();
                break;
            case 14:
                Iva();
                break;
            case 15:
                Multiplos();
                break;    
            case 16:
               NumerosP();
                break;
            case 17:
                Enteros();
                break;
            case 18:
                PedirFrase();
                break;
            case 19:
                MetrosCubicos();
                break;
            case 20:
                nteclado();
                break;
        }
                
                
                 } while(op!=0);
    }

    
        
}

  