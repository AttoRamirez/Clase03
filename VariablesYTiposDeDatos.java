import java.util.Scanner;

public class VariablesYTiposDeDatos {
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);
        /* var es crear una variable, todas las variables se tienen que mencionar  */

        System.out.print("Ingrese un valor: ");
        var text = scanner.nextLine();
        /* aca pide que el texto añadido sea guardado como texto */

        System.out.printf("El valor ingersado fue: %s%n", text );
        /* print f es guardar con unos datos y se añade  informacion*/
        /* %s = Significado: Representa una cadena de texto (String).  Uso: Sirve para insertar texto dentro del formato. */
        /* %n = Significado: Inserta un salto de línea. */  
        /* %d: Representa un número entero (int, long). */
        /* %f: Representa un número de punto flotante (float, double). */
        /* %c: Representa un solo carácter (char). */
        /* %b: Representa un valor booleano (true o false). */      
        /* %%: Representa el carácter % (literal, no como marcador). */

        scanner.close();

        /*Boolean
         boolean false min  true max       1 bit*/
        /*Integer Numbers 
          byte numberByte                  4 digito 
          short numberShort                6 digitos
          int numberInt                    11 digitos
          long numberLong                  20 digitos
        */ 
        /*Float Numbers 
          float numbereFloat  4bit  32bit   6-7 digitos
          double doubleFloat  8byte 64bits  15 digitos
        */
        /*Caracteres
          char characterValue
          letter = 'A'
          \
         */

        /* si mi variable var termina en
         L long
         F float
         D double

         byte -> char -> short -> int -> float -> long -> double -> String

         si asigno una variable con un tipo de dato se convierte 
        "double price = 251l" acaconvierte el long a double

         short y byte son los unicos primitivos que recibe automaticamente
         */

         /* FORMATO ASCCI
         \n - Salto de línea    Hace que el texto siguiente aparezca en una nueva línea. 
         \t - Tabulador         Inserta un espacio grande entre palabras, equivalente a presionar "Tab".
         \b - Retroceso         Borra el último carácter antes de esta secuencia.
         \r - Retorno de carro  Mueve el cursor al principio de la línea actual y sobrescribe el texto.
         \\ - Barra invertida   Imprime una barra invertida \.
         \' - Comilla simple    Imprime una comilla simple '.
         \" - Comilla doble     Imprime una comilla doble ".
        
         */

         System.out.println("Hola\nMundo\nSolecito\nDe\nMi\nAmor\u1F602");

         //String
         
         var name = "Alejandro Ramirez";
         var last = "Ramirez Mendez";
         var full = name + " " + last;

         System.out.println(full);
    }
    
}