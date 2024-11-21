public class ExpresionesJava {
    public static void main(String[] args) {
        
        var num1 = 10;
        System.out.println(num1);
        var num2 = -5;
        var num3 = num1 + num2;
        var num4  = 40 + num3;

        System.out.println(num4);

        var num6 = 7 / 2;
        var num7 = 7 % 2 ;
        System.out.printf("La division entre 7 y 2 es %d y su residuo es %d%n", num6, num7);

        num6++; // num6 = num6 + 1
        num6--; // num6 = num6 - 1
        ++num6; // num6 = num6 + 1
        --num6; // num6 = num6 - 1
    

        var num8 = 10;
        var num9 = 5;
        var num10 = num8++ - --num9;
        //          10     -    4
        //          6

        System.out.println("El total es: " + num10);
        System.out.printf("el resultado de la variable num8 es %d y el resultado de num9 es %d%n",num8,num9);
        System.out.println("Cuando la asignacion va antes de la variable se opera antes ");

        var num11 = 10;
        var num12 = 5;
        var num13 = num11++ - num12--;
        System.out.println("el total es: "+ num13);
        System.out.printf("el resultado de la variable num11 es %d y el resultado de num12 es %d%n",num11,num12);
        System.out.println("cuanto el ++ va despues de la operacion se operan las variables despues de la operacion");
        
        var num14 = 40;
        num14 *= 7;
        System.out.printf("El resultado temporal de 14 con 7 es : %d%n ", num14);

        num14 %= 2;
        System.out.printf( "El resultado total ahora es: %d%n", num14);

    }
    
}