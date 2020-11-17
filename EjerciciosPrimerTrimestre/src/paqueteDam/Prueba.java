package paqueteDam;
public class Prueba {

    public static boolean esPar(int x) {

        if (x%2==0)

            return true;

        else

            return false;

    }

 

    public static void main(String[] args) {

        for (int i=8; i <= -5; i--)

            System.out.println(i + " es par: " + esPar(i));

    }

}

